import database.Koneksi;
import com.mycompany.caps_creedy.model.Nasabah;
import java.sql.*;

public class NasabahDAO {

    public Nasabah getNasabahByNik(String nik) throws SQLException {
        String sql = "SELECT * FROM nasabah WHERE nik = ?";
        try (Connection conn = Koneksi.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nik);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Nasabah(
                    rs.getString("nik"),
                    rs.getString("nama"),
                    rs.getString("no_rekening"),
                    rs.getDouble("saldo")
                );
            }
        }
        return null;
    }

    public boolean updateSaldo(String noRekening, double saldoBaru) throws SQLException {
        String sql = "UPDATE nasabah SET saldo = ? WHERE no_rekening = ?";
        try (Connection conn = Koneksi.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setDouble(1, saldoBaru);
            ps.setString(2, noRekening);
            return ps.executeUpdate() > 0;
        }
    }
}
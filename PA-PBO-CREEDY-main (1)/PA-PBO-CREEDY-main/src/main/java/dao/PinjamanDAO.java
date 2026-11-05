import database.Koneksi;
import java.sql.*;

public class PinjamanDAO {

    public boolean ajukanPinjaman(String nik, double jumlah, int tenorBulan) throws SQLException {
        String sql = "INSERT INTO pinjaman (nik, jumlah, tenor, status) VALUES (?, ?, ?, 'Menunggu Persetujuan')";
        try (Connection conn = Koneksi.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nik);
            ps.setDouble(2, jumlah);
            ps.setInt(3, tenorBulan);
            return ps.executeUpdate() > 0;
        }
    }

    public boolean updateStatusPinjaman(int idPinjaman, String statusBaru) throws SQLException {
        String sql = "UPDATE pinjaman SET status = ? WHERE id_pinjaman = ?";
        try (Connection conn = Koneksi.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, statusBaru);
            ps.setInt(2, idPinjaman);
            return ps.executeUpdate() > 0;
        }
    }
}
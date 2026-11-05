import database.Koneksi;
import com.mycompany.caps_creedy.model.AkunData;
import java.sql.*;

public class AutentikasiDAO {

    public AkunData autentikasi(String identifier, String password, String role) throws SQLException {
        String sql = "";
        
        // Logika query terpisah sesuai struktur tabel relasi user & pegawai/nasabah
        if ("Nasabah".equals(role)) {
            sql = "SELECT u.id_user, u.email, n.nama, 'Nasabah' AS role " +
                  "FROM users u JOIN nasabah n ON u.nik = n.nik " +
                  "WHERE (u.email = ? OR n.nik = ?) AND u.password = ?";
        } else {
            sql = "SELECT u.id_user, u.email, p.nama, p.jabatan AS role " +
                  "FROM users u JOIN pegawai p ON u.nip = p.nip " +
                  "WHERE (u.email = ? OR p.nip = ?) AND u.password = ? AND p.jabatan = ?";
        }

        try (Connection conn = Koneksi.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setString(1, identifier);
            ps.setString(2, identifier);
            ps.setString(3, password);
            
            if (!"Nasabah".equals(role)) {
                ps.setString(4, role);
            }

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new AkunData(
                    rs.getString("id_user"),
                    rs.getString("email"),
                    rs.getString("nama"),
                    rs.getString("role")
                );
            }
        }
        return null;
    }
}
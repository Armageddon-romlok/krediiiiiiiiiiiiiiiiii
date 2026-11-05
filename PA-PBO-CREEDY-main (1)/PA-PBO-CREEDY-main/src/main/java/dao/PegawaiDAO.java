import database.Koneksi;
import com.mycompany.caps_creedy.model.Pegawai;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PegawaiDAO {

    public List<Pegawai> getAllPegawai() throws SQLException {
        List<Pegawai> list = new ArrayList<>();
        String sql = "SELECT * FROM pegawai";
        try (Connection conn = Koneksi.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                list.add(new Pegawai(
                    rs.getString("nip"),
                    rs.getString("nama"),
                    rs.getString("jabatan"),
                    rs.getString("status")
                ));
            }
        }
        return list;
    }

    public boolean tambahPegawai(Pegawai p) throws SQLException {
        String sql = "INSERT INTO pegawai (nip, nama, jabatan, status) VALUES (?, ?, ?, ?)";
        try (Connection conn = Koneksi.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, p.getNip());
            ps.setString(2, p.getNama());
            ps.setString(3, p.getJabatan());
            ps.setString(4, p.getStatus());
            return ps.executeUpdate() > 0;
        }
    }

    public boolean ubahStatusPegawai(String nip, String statusBaru) throws SQLException {
        String sql = "UPDATE pegawai SET status = ? WHERE nip = ?";
        try (Connection conn = Koneksi.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, statusBaru);
            ps.setString(2, nip);
            return ps.executeUpdate() > 0;
        }
    }
}
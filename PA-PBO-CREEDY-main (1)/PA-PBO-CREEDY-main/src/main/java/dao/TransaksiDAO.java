import database.Koneksi;
import java.sql.*;

public class TransaksiDAO {

    public boolean simpanTransaksi(String noRekening, String jenisTransaksi, double jumlah, String idTeller) throws SQLException {
        String sql = "INSERT INTO transaksi (no_rekening, jenis_transaksi, jumlah, id_teller, tanggal) VALUES (?, ?, ?, ?, NOW())";
        try (Connection conn = Koneksi.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, noRekening);
            ps.setString(2, jenisTransaksi);
            ps.setDouble(3, jumlah);
            ps.setString(4, idTeller);
            return ps.executeUpdate() > 0;
        }
    }
}
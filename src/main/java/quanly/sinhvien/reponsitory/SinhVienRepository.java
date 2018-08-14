package quanly.sinhvien.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import quanly.sinhvien.model.SinhVien;

@Repository
public interface SinhVienRepository extends JpaRepository<SinhVien, Integer> {
	public SinhVien getSinhVienByTuoi(int tuoi);
}

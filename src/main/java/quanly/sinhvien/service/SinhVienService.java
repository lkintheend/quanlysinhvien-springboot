package quanly.sinhvien.service;

import java.util.List;

import quanly.sinhvien.model.SinhVien;

public interface SinhVienService {
	public SinhVien getOne(int sinhVienId);
	public List<SinhVien> findAll();
	public void save(SinhVien sinhVien);
	public void update(SinhVien sinhVien);
	public void delete(int sinhVienId);
}

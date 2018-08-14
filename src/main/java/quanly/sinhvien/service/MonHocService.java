package quanly.sinhvien.service;

import java.util.List;

import quanly.sinhvien.model.MonHoc;

public interface MonHocService {
	public MonHoc getOne(int monHocId);
	public List<MonHoc> findAll();
	public void save(MonHoc monHoc);
	public void update(MonHoc monHoc);
	public void delete(int monHocId);
}

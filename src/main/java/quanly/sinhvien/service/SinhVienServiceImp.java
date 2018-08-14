package quanly.sinhvien.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import quanly.sinhvien.model.SinhVien;
import quanly.sinhvien.reponsitory.SinhVienRepository;

public class SinhVienServiceImp implements SinhVienService{
	@Autowired
	SinhVienRepository sinhVienRepository;

	@Override
	public SinhVien getOne(int monHocId) {
		return sinhVienRepository.getOne(monHocId);
	}

	@Override
	public List<SinhVien> findAll() {
		// TODO Auto-generated method stub
		return sinhVienRepository.findAll();
	}

	@Override
	public void save(SinhVien monHoc) {
		// TODO Auto-generated method stub
		sinhVienRepository.save(monHoc);
		System.out.println("Them thanh cong");
	}

	@Override
	public void update(SinhVien sinhVien) {
		// TODO Auto-generated method stub
		SinhVien sv = sinhVienRepository.getOne(sinhVien.getSinhVienId());
		if(sinhVien.getTen()!=null) {
			sv.setTen(sinhVien.getTen());
		}
		if(sinhVien.getTuoi()!=0) {
			sv.setTuoi(sinhVien.getTuoi());
		}
		if(sinhVien.getDiaChi()!=null) {
			sv.setDiaChi(sinhVien.getDiaChi());
		}
		sinhVienRepository.save(sv);
	}

	@Override
	public void delete(int sinhVienId) {
		// TODO Auto-generated method stub
		sinhVienRepository.deleteById(sinhVienId);
	}
}

package quanly.sinhvien.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import quanly.sinhvien.model.MonHoc;
import quanly.sinhvien.reponsitory.MonHocRepository;
@Service
@Transactional
public class MonHocServiceImp implements MonHocService {
	@Autowired
	MonHocRepository monHocRepository;

	@Override
	public MonHoc getOne(int monHocId) {
		return monHocRepository.getOne(monHocId);
	}

	@Override
	public List<MonHoc> findAll() {
		// TODO Auto-generated method stub
		return monHocRepository.findAll();
	}

	@Override
	public void save(MonHoc monHoc) {
		// TODO Auto-generated method stub
		monHocRepository.save(monHoc);
		System.out.println("Them thanh cong");
	}

	@Override
	public void update(MonHoc monHoc) {
		// TODO Auto-generated method stub
		MonHoc mh = monHocRepository.getOne(monHoc.getMonHocId());
		if(monHoc.getTen()!=null) {
			mh.setTen(monHoc.getTen());
		}
		if(monHoc.getTenGiaoVien()!=null) {
			mh.setTenGiaoVien(monHoc.getTenGiaoVien());
		}
		if(monHoc.getKhoa()==0) {
			mh.setKhoa(monHoc.getKhoa());
		}
		monHocRepository.save(mh);
	}

	@Override
	public void delete(int monHocId) {
		// TODO Auto-generated method stub
		monHocRepository.deleteById(monHocId);
	}

}

package quanly.sinhvien;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import quanly.sinhvien.model.MonHoc;
import quanly.sinhvien.model.SinhVien;
import quanly.sinhvien.reponsitory.SinhVienRepository;
import quanly.sinhvien.service.MonHocServiceImp;

@SpringBootApplication
public class Quanlysinhvienspringboot1Application implements CommandLineRunner{
	@Autowired
	MonHocServiceImp monHocServiceImp;
	
	@Autowired
	SinhVienRepository sinhVienRepository;
	
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Quanlysinhvienspringboot1Application.class);
		app.run(args);
	}
	@Transactional
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

//		System.out.println(mhHocReponsitory.findAll());
//		System.out.println(sinhVienRepository.findAll());
//		System.out.println(sinhVienRepository.findById(2));
//		System.out.println(sv);
//		sinhVienRepository.deleteInBatch(null);
//		Optional<SinhVien> sv = sinhVienRepository.findById(3);
//		MonHoc mh1 = new MonHoc();
//		mh1.setKhoa(123);
//		mh1.setTen("toan");
//		mh1.setTenGiaoVien("qwe");
//		SinhVien sv= new SinhVien();
//		sv.setSinhVienId(2);
//		sv.setTen("nguyen van a");
//		sv.setTuoi(26);
//		sv.setDiaChi("thanh ha");
//		sv.setSinhVienId(1243);
//		sinhVienRepository.
//		System.out.println(sv.getSinhVienId());
//		
		MonHoc mh2 = new MonHoc();
		mh2.setMonHocId(4);
		mh2.setKhoa(234);
		mh2.setTen("van");
		mh2.setTenGiaoVien("linh1");
		monHocServiceImp.update(mh2);
//		mh2.getSinhVien().add(sinhVienRepository.getOne(6));
//		SinhVien sv = sinhVienRepository.getOne(4);
//		sv.getMonHoc().add(monHocServiceImp.getOne(6));
//		sinhVienRepository.save(sv);
		
//		System.out.println(monHocServiceImp.findAll());
//		sv.getMonHoc().add(mh1);
////		
//		sv.getMonHoc().add(mh2);
////		
//		sinhVienRepository.save(sv);
//		System.out.println(sv);
//		mhHocReponsitory.save(mh1);
//		System.out.println(mh1);
//		for (MonHoc mh : sv.get().getMonHoc()) {
//			System.out.println(mh);
//		}
//		System.out.println(sinhVienRepository.getOne(1));
	}
}

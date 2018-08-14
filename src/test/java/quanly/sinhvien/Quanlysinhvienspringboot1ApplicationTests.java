package quanly.sinhvien;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import quanly.sinhvien.model.SinhVien;
import quanly.sinhvien.reponsitory.MonHocRepository;
import quanly.sinhvien.reponsitory.SinhVienRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Quanlysinhvienspringboot1ApplicationTests {

	@Autowired
	MonHocRepository mhHocReponsitory;

	@Autowired
	SinhVienRepository sinhVienRepository;

	@Test
	public void contextLoads() {
		Optional<SinhVien> sv = sinhVienRepository.findById(3);
		System.out.println(sv);
	}

}

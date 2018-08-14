package quanly.sinhvien.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "mon_hoc")
public class MonHoc {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "mon_hoc_id")
	private int monHocId;

	@Column(name = "ten")
	private String ten;

	@Column(name = "khoa")
	private int khoa;

	@Column(name = "ten_giao_vien")
	private String tenGiaoVien;

	@ManyToMany(mappedBy = "monHoc")
	private Set<SinhVien> sinhVien = new HashSet<>();

	public MonHoc() {
		super();
	}

	public MonHoc(int monHocId, String ten, int khoa, String tenGiaoVien) {
		super();
		this.monHocId = monHocId;
		this.ten = ten;
		this.khoa = khoa;
		this.tenGiaoVien = tenGiaoVien;
	}

	public MonHoc(int monHocId, String ten, int khoa, String tenGiaoVien, Set<SinhVien> sinhVien) {
		super();
		this.monHocId = monHocId;
		this.ten = ten;
		this.khoa = khoa;
		this.tenGiaoVien = tenGiaoVien;
		this.sinhVien = sinhVien;
	}

	public int getMonHocId() {
		return monHocId;
	}

	public void setMonHocId(int monHocId) {
		this.monHocId = monHocId;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getKhoa() {
		return khoa;
	}

	public void setKhoa(int khoa) {
		this.khoa = khoa;
	}

	public String getTenGiaoVien() {
		return tenGiaoVien;
	}

	public void setTenGiaoVien(String tenGiaoVien) {
		this.tenGiaoVien = tenGiaoVien;
	}

	public Set<SinhVien> getSinhVien() {
		return sinhVien;
	}

	public void setSinhVien(Set<SinhVien> sinhVien) {
		this.sinhVien = sinhVien;
	}

//	@Override
//	public String toString() {
//		return "MonHoc [monHocId=" + monHocId + ", ten=" + ten + ", khoa=" + khoa + ", tenGiaoVien=" + tenGiaoVien
//				+ ", sinhVien=" + sinhVien + "]";
//	}

	@Override
	public String toString() {
		return "MonHoc [monHocId=" + monHocId + ", ten=" + ten + ", khoa=" + khoa + ", tenGiaoVien=" + tenGiaoVien
				+ "]";
	}
	
	

}

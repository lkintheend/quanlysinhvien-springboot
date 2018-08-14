package quanly.sinhvien.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "sinh_vien")
public class SinhVien {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sinh_vien_id")
	private int sinhVienId;

	@Column(name = "ten")
	private String ten;

	@Column(name = "dia_chi")
	private String diaChi;

	@Column(name = "tuoi")
	private int tuoi;

	@Access(AccessType.PROPERTY)
	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "ds_dang_ky_hoc", joinColumns = {
			@JoinColumn(name = "sinh_vien_id", referencedColumnName = "sinh_vien_id") }, inverseJoinColumns = {
					@JoinColumn(name = "mon_hoc_id", referencedColumnName = "mon_hoc_id") })

	private Set<MonHoc> monHoc = new HashSet<>();

	public SinhVien() {
		super();
	}

	public SinhVien(int sinhVienId, String ten, String diaChi, int tuoi) {
		super();
		this.sinhVienId = sinhVienId;
		this.ten = ten;
		this.diaChi = diaChi;
		this.tuoi = tuoi;
	}

	public SinhVien(int sinhVienId, String ten, String diaChi, int tuoi, Set<MonHoc> monHoc) {
		super();
		this.sinhVienId = sinhVienId;
		this.ten = ten;
		this.diaChi = diaChi;
		this.tuoi = tuoi;
		this.monHoc = monHoc;
	}

	public int getSinhVienId() {
		return sinhVienId;
	}

	public void setSinhVienId(int sinhVienId) {
		this.sinhVienId = sinhVienId;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public Set<MonHoc> getMonHoc() {
		return monHoc;
	}

	public void setMonHoc(Set<MonHoc> monHoc) {
		this.monHoc = monHoc;
	}

	@Override
	public String toString() {
		return "SinhVien [sinhVienId=" + sinhVienId + ", ten=" + ten + ", diaChi=" + diaChi + ", tuoi=" + tuoi
				+ ", monHoc=" + monHoc + "]";
	}

	
}

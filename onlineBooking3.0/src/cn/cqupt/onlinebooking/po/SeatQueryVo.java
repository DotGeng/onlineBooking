package cn.cqupt.onlinebooking.po;

import java.util.ArrayList;
import java.util.List;

public class SeatQueryVo {
	//批量添加座位信息
	List<SeatCustome> seatsList = new ArrayList<SeatCustome>();

	public List<SeatCustome> getSeatsList() {
		return seatsList;
	}

	public void setSeatsList(List<SeatCustome> seatsList) {
		this.seatsList = seatsList;
	}

	
	
}

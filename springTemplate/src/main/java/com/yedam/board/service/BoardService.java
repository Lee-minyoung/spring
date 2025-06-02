package com.yedam.board.service;

import java.util.List;
public interface BoardService {
	public List<BoardVO> getList();
	public BoardVO read(Long bno);
	
	public void insert(BoardVO vo);
	public int delete(Long bno);
	public int update(BoardVO board);
}

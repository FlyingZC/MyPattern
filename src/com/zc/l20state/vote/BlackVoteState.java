package com.zc.l20state.vote;

public class BlackVoteState implements VoteState{
	public void vote(String user, String voteItem, VoteManagerContext voteManager) {
		//黑名单
		//记入黑名单中，禁止登录系统了
		System.out.println("进入黑名单，将禁止登录和使用本系统");
				
	}
}

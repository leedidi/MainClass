//暗什硯儀 煽舌 貢 域至 適掘什
public class Change		//析舘,,,,,,刃失戚 勧姶焼爽檎 亜管....【【【【【【
{

	int[] money = new int[5];
			  //= {幻据,神探据,探据,神拷据,拷据}

	int[] bills = {10000, 5000, 1000, 500, 100};


	public void cInitial() //--映曽 紺 段奄鉢
	{
		money[0] = 5;	// 幻据 : 5舌
		money[1] = 2;	// 神探据 : 2舌		
		money[2] = 10;	// 探据: 10舌
		money[3] = 5;	// 神拷据: 5鯵
		money[4] = 10;	// 拷据: 10鯵
		

	}// end cInitial()


	//--暗什硯儀 域至  
	public void changeCal(int pay, int sumMoney) //閤精 儀,亜維
	{
		int total=0;
		int moneyTemp=0;
		int change = pay - sumMoney;	//閤精儀 - 亜維 = 暗什硯儀
		int[] out = new int[5];
				//={幻据,神探据,探据,神拷据,拷据}
		
		for (int i =0;i<5 ;i++ )
		{
			total += money[i]*bills[i];
		}
		       
		out[0] = change / 10000;							//幻据
		out[1] = change % 10000 / 5000;						//神探据
		out[2] = change % 10000 % 5000 / 1000;				//探据
		out[3] = change % 10000 % 5000 % 1000 / 500;		//神拷据
		out[4] = change % 10000 % 5000 % 1000 % 500 / 100;	//拷据
		
		//暗什硯儀戚 焼森 照喫
		if (total < change)
		{
			System.out.println("暗什硯儀戚 採膳杯艦陥.");
			
			//朕什賭生稽 亜澗惟 限陥 戚暗倉? 益係倉
		}

		//暗什硯儀戚 角嬢亜檎 亜管
		else
		{
			System.out.println("暗什硯儀聖 亜閃亜室推.");
			System.out.println("==================================");
			System.out.println("暗什硯儀: " + change + "据");
			System.out.println();
			for	(int i=0; i<5; i++) 
			{

				if(change/bills[i] > money[i]) 
				{
					System.out.println(bills[i]+"据 : "+ " 0鯵 ");
				}else
				{
					System.out.println(bills[i]+"据 : "+ change/bills[i]+" 鯵 ");
					change %= bills[i];
				}
			

			} 
			System.out.println("==================================");
			
			

		} //end else

		
		//儀搭拭 儀 弦精汽 接儀戚 蒸嬢推,,,,ぬばばばばばばばば 【【【【【【 勧姶焼推,,,悪紫還,,,



			//for (int i = 0;i<5 ;i++ ) --儀搭拭辞 蟹娃幻鏑 捌暗
			//	money[i] -= out[i];  

		


	}//end changeCal()


} //end Change class 
/*===================================
  ＝＝＝ 尻至切(Operator) ＝＝＝
  - 誌牌 尻至切 == 繕闇 尻至切
 ===================================*/

 // 紫遂切稽採斗 績税税 舛呪研 脊径閤焼
 // 脊径閤精 舛呪亜 丞呪昔走, 製呪昔走, 0昔走 姥歳馬形 (@室哀掘掩!)
 // 戚 衣引研 窒径馬澗 覗稽益轡聖 姥薄廃陥.
 // 舘, 脊径 汽戚斗澗 BufferedReader 税 readLine() 聖 搭背 角移閤聖 呪 赤亀系 廃陥.
 // 暁廃, 繕闇尻至切(誌牌尻至切)研 醗遂馬食 奄管聖 姥薄拝 呪 赤亀系 廃陥.

 // 叔楳 森)
 // 績税税 舛呪 脊径 : -12
 // -12 ≧ 製呪
 // 域紗馬形檎 焼巷 徹蟹 刊牽室推...

 // 績税税 舛呪 脊径 : 257
 // 257 ≧ 丞呪
 // 域紗馬形檎 焼巷 徹蟹 刊牽室推...
 
 // 績税税 舛呪 脊径 : 0
 // 0 ≧ 慎
 // 域紗馬形檎 焼巷 徹蟹 刊牽室推...
/*
[鎧亜 幻窮 坪球]

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test027
{
	public static void main(String[] args) throws IOException
	{
		// 爽推 痕呪 識情
		int n;
		String strResult;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 尻至 貢 坦軒
		System.out.print("績税税 舛呪 脊径 : ");
		n = Integer.parseInt(br.readLine());
		// 0昔走 筈呪昔走 側呪昔走拭 企廃 毒紺 尻至

		strResult = n==0 ? "慎" : ((n<0)? "製呪" : "丞呪");

		// 衣引 窒径
		System.out.printf("%d ≧ %s\n", n, strResult);
	}
}
*/
//@ 績匂闘 姥庚精 伽 適掘什 !蒋!拭 赤嬢醤 敗!
//@ 切郊醤 適掘什拭辞 戚暗 承暗艦猿 井稽亜辞 戚暗 胡煽 因採馬壱 人~!
//@ 授辞澗 雌淫 蒸陥!

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//import java.io.*; //@ 戚係惟 床澗暗 亜管精 馬走幻 蓄探馬走 省製
					//@ 1> 獣蝿骨是亜 辿斗 室鯵昔汽 切郊廃砺 因採 奪 廃映 陥馬虞壱 馬澗 暗!
					//@    切郊亜 箸紫雁敗 ばば せせ 岨希 庁箭馬惟 切郊廃砺 照鎧 背爽澗 暗. 希 反晴旋績
					//@ 2> 走榎 酔軒亜 幻窮暗 紫遂 X, 赤澗暗 亜閃陥亜 紫遂
					//@    獣娃 走蟹檎 酔軒亜 幻窮 竺域亀 紫遂拝 依
					//@      
					//@  ex)  com > test > Circle
					//@       com > test > Rent
					//@       
					//@       com > run > Circle
					//@       com > run > Rent
					//@      
					//@  
					//@      import com.test.Circle;
					//@      import com.run.rent
					//@  
					//@ 幻鉦 , import com.test.*;
					//@        import com.run.rent 彰陥檎 rent亜 砧腰! rent 紫遂拝呪X
					//@  
					//@ 3> 室腰属, 酔軒澗 input~buffered~ 戚硯 廃腰戚虞亀 希 斥備壱 
					//@	   嬢巨赤澗走 廃腰戚虞亀 希 潤坐醤 馬奄 凶庚!
					//@
					//@ *> 酔軒澗 析舘 嬢恐 奄管戚 赤姥蟹 舛亀 硝壱 赤生檎 しせしせ
					//@ 叔巷拭辞 壕匂馬澗闇 class督析. 猿左檎 嬢胸惟 坪漁鞠嬢赤澗走 硝呪蒸壱, 呪舛拝呪亀 蒸製!
					//@ java 督析 : 金嬢瑳呪 赤澗 穿切薦念. 伸嬢左檎 嬢胸惟 姥失, 竺域鞠嬢赤澗走 硝呪赤製 class督析精 伸嬢坐亀 硝呪X
					//@ 戚依坦軍 io ~~ 亀 照拭 左奄 嬢形崇. 金嬢左形檎 毘給,,,,!! 析舘精 嬢恐 奄管戚 赤姥蟹幻 硝檎 しせしせ
					//@ 朝傾戚辞 : 析舘 錘穿奄狛幻 硝檎 しせ. 蟹掻拭 刃穿 降穿背辞 壱厭朝傾戚辞亜鞠檎 託税 蝕俳淫域, 姥失 硝焼辞
					//@ 曽戚廃舌 託戚税 段 託戚研 匝戚形壱 馬奄 是背辞 託 姥繕 硝形壱 馬澗依.. 益舛亀税 傾婚績 走榎 酔軒 勧株戚拭辞澗
					//@ 錘穿叔径 狽雌獣徹澗惟 析舘 亀崇喫!


//import java.lang,*;

//[旭戚 叔楳廃 坪球]
public class Test027
{
	public static void main(String[] args) throws IOException
	{	
		// 爽推 痕呪 識情
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;				//-- 紫遂切 脊径葵聖 眼聖 痕呪
		String strResult;	//-- 製呪昔走 丞呪昔走 慎昔走 毒紺 衣引研 眼聖 痕呪
		
		// 尻至 貢 坦軒
		System.out.print("績税税 舛呪 脊径 : ");
		n = Integer.parseInt(br.readLine());
		/*
		n戚 0左陥 滴陥 ≧ true	≧ n精 丞呪
					   ≧ false ≧ n戚 0戚陥 ≧ true  ≧ n精 慎
					   						 ≧ false ≧ n精 製呪
		*/

		strResult = (n>0)? ("丞呪") : ( (n<0) ? ("製呪") : ("慎") );
		// 10
		// strResult = (10>0)? ("丞呪") : ( (n<0) ? ("製呪") : ("慎") );
		// strResult = (true)? ("丞呪") : ( (n<0) ? ("製呪") : ("慎") );
		// strResult = "丞呪"

		//-4
		// strResult = (-4>0)? ("丞呪") : ( (n<0) ? ("製呪") : ("慎") );
		// strResult = (false)? ("丞呪") : ( (n<0) ? ("製呪") : ("慎") );
		// strResult = = ( (-4<0) ? ("製呪") : ("慎") );
		// strResult = ( (true) ? ("製呪") : ("慎") );
		// strResult = : ( (true) ? ("製呪") : ("慎") );
		// strResult = ("製呪");
		// strResult = "製呪";

		//0
		// strResult = (0>0)? ("丞呪") : ( (n<0) ? ("製呪") : ("慎") );
		// strResult = (false)? ("丞呪") : ( (n<0) ? ("製呪") : ("慎") );
		// strResult = ( (0<0) ? ("製呪") : ("慎") );
		// strResult = ( false ? ("製呪") : ("慎") );
		// strResult = ( ("慎") );
		// strResult = "慎";


		// 衣引 窒径
		System.out.println(n + " ≧ " + strResult);

	}
}

//[旭戚 叔楳廃 坪球] 叔楳 衣引
/*
績税税 舛呪 脊径 : -11
-11 ≧ 製呪
域紗馬形檎 焼巷 徹蟹 刊牽淑獣神 . . .

績税税 舛呪 脊径 : 84
84 ≧ 丞呪
域紗馬形檎 焼巷 徹蟹 刊牽淑獣神 . . .

績税税 舛呪 脊径 : 0
0 ≧ 慎
域紗馬形檎 焼巷 徹蟹 刊牽淑獣神 . . .

*/


//[鎧亜 幻窮 坪球] 叔楳 衣引

/*
績税税 舛呪 脊径 : -12
-12 ≧ 製呪
域紗馬形檎 焼巷 徹蟹 刊牽淑獣神 . . .
*/

/*
績税税 舛呪 脊径 : 10
10 ≧ 丞呪
域紗馬形檎 焼巷 徹蟹 刊牽淑獣神 . . .
*/

/*
績税税 舛呪 脊径 : 0
0 ≧ 慎
域紗馬形檎 焼巷 徹蟹 刊牽淑獣神 . . .

*/
package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class MainActivity3 extends AppCompatActivity {

    TextView tv, eng_name, date, rank, time, director, actor, intro;
    VideoView videoView;
    String videoPath;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tv = (TextView) findViewById(R.id.textView10);
        eng_name = (TextView) findViewById(R.id.textView11);
        date = (TextView) findViewById(R.id.textView12);
        rank = (TextView) findViewById(R.id.textView13);
        time = (TextView) findViewById(R.id.textView14);
        director = (TextView) findViewById(R.id.textView15);
        actor = (TextView) findViewById(R.id.textView16);
        intro = (TextView) findViewById(R.id.textView17);
        videoView = (VideoView)findViewById(R.id.videoView2);
        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("name");
        tv.setText(name);

        if (name.contains("路卡")) {
            eng_name.setText("LUCA");
            date.setText("2021-07-02" + "\n" + "上映日期");
            rank.setText(" 普遍級" + "\n" + "分級");
            time.setText("01時35分" + "\n" + "片長");
            director.setText("恩里科卡薩羅薩(Enrico Casarosa)");
            actor.setText("雅各特倫布雷(Jacob Tremblay) 、 瑪亞魯道夫(Maya Rudolph)");
            intro.setText("皮克斯全新原創《路卡的夏天》，故事背景發生在美麗的義大利濱海小鎮里維埃拉，一位名叫路卡的海怪男孩的難忘夏天，他與新摯友們在夏天經歷的無數冒險，包含他們在島上參加的競賽，但最刺激的不是競賽本身，而是隱藏他們呼之欲出的海怪身份…\n" +
                    "\n" +
                    "《路卡的夏天》是一個成長的故事，海怪男孩是曾經的你我，好奇心驅使你走出舒適圈，遇見真誠的友誼，學習鼓起勇氣由衷生活，完成自以為不可能的夢想…");
            videoPath = "android.resource://"+getPackageName()+"/"+R.raw.luca;
            Uri uri = Uri.parse(videoPath);
            videoView.setVideoURI(uri);

            MediaController mc = new MediaController(this);
            videoView.setMediaController(mc);
            mc.setAnchorView(videoView);
        } else if (name.contains("老師")) {
            eng_name.setText("You're Not Normal, Either!");
            date.setText("2021-07-02" + "\n" + "上映日期");
            rank.setText("普遍級" + "\n" + "分級");
            time.setText("01時38分" + "\n" + "片長");
            director.setText("前田弘二");
            actor.setText("成田凌 、 清原果耶 、 小泉孝太郎");
            intro.setText("★ 2021金馬奇幻影展觀眾票選第六名\n" +
                    "\n" +
                    "無法融入一般人群的兩個怪咖，即將掀起一陣風暴！ \n" +
                    "\n" +
                    "補習班的數學男老師（成田凌 飾），對自己的人生振振有詞，卻是戀愛修羅場的超級白癡。眼見桃花不開，害怕孤單，決定聽從怪怪女學生（清原果耶 飾）的建議，練習追女仔。從穿著、巧遇、搭訕、攻心，原來「正常人」的戀愛是這樣！殊不知調教老師並非義不容辭，女學生微積分不行，算盤卻打得很精。如果老師發威，情敵就範，她就可以得到想愛的人了。眼看老師越來越帥，似乎還動了真情，怪女孩卻發現她更想破壞的，是老師正在進行的戀愛。\n" +
                    "\n" +
                    "超人氣女星清原果耶青春無敵再次發威，《王牌辯士》成田凌從伶牙俐齒瞬變木訥呆萌，新鮮組合魅力四射。《婚前特急》、《夫婦日記》導演前田弘二聯手《愛情，突如其來》、《陽光只在那裡燦爛》編劇高田亮，打造屬於怪咖們的新時代愛情喜劇。");
            videoPath = "android.resource://"+getPackageName()+"/"+R.raw.not_normal;
            Uri uri = Uri.parse(videoPath);
            videoView.setVideoURI(uri);

            MediaController mc = new MediaController(this);
            videoView.setMediaController(mc);
            mc.setAnchorView(videoView);
        } else if (name.contains("黑")) {
            eng_name.setText("Black Widow");
            date.setText("2021-07-09" + "\n" + "上映日期");
            rank.setText("保護級" + "\n" + "分級");
            time.setText("02時13分" + "\n" + "片長");
            director.setText("凱特蕭蘭(Cate Shortland)");
            actor.setText("史嘉蕾喬韓森(Scarlett Johansson) 、 佛蘿倫絲普伊(Florence Pugh) 、 小勞勃道尼(Robert Downey Jr.) 、 瑞秋懷茲(Rachel Weisz) 、 大衛哈伯(David Harbour) 、 威廉赫特(William Hurt) 、 雷溫斯頓(Ray Winstone)");
            intro.setText("漫威影業2020年的首部重頭戲，是粉絲請求多時，終於實現的《黑寡婦》個人電影，黑寡婦在漫威電影宇宙中舉足輕重，10多年來參與了7部電影。現在，娜塔莎羅曼諾夫，也就是大家所熟知的黑寡婦，終於踏上個人的旅程，讓粉絲看到她不為人知的一面。\n" +
                    "\n" +
                    "故事時間點設定在《美國隊長 3 : 英雄內戰》之後，娜塔莎因為幫助了美國隊長而踏上流亡之路，當她發現一個與過去有關的陰謀時，她必須全球追蹤，回頭面對她神祕的間諜生涯，同時逃過反派「模仿大師」的追殺。");
            videoPath = "android.resource://"+getPackageName()+"/"+R.raw.black;
            Uri uri = Uri.parse(videoPath);
            videoView.setVideoURI(uri);

            MediaController mc = new MediaController(this);
            videoView.setMediaController(mc);
            mc.setAnchorView(videoView);
        } else if (name.contains("陷阱")) {
            eng_name.setText("In The Trap");
            date.setText("2021-07-09" + "\n" + "上映日期");
            rank.setText("輔導12級" + "\n" + "分級");
            time.setText(" 01時34分" + "\n" + "片長");
            director.setText("艾列修李格沃里(Alessio Liguori)");
            actor.setText("傑米保羅(Jamie Paul) 、 大衛貝利(David Bailie) 、 索妮雅克林福德(Sonya Cullingford)");
            intro.setText("漫威影業2020年的首部重頭戲，是粉絲請求多時，終於實現的《黑寡婦》個人電影，黑寡婦在漫威電影宇宙中舉足輕重，10多年來參與了7部電影。現在，娜塔莎羅曼諾夫，也就是大家所熟知的黑寡婦，終於踏上個人的旅程，讓粉絲看到她不為人知的一面。\n" +
                    "\n" +
                    "故事時間點設定在《美國隊長 3 : 英雄內戰》之後，娜塔莎因為幫助了美國隊長而踏上流亡之路，當她發現一個與過去有關的陰謀時，她必須全球追蹤，回頭面對她神祕的間諜生涯，同時逃過反派「模仿大師」的追殺。★ 第44屆克里夫蘭國際影展\n" +
                    "\n" +
                    "★ 第38屆西班牙莫林斯德雷伊恐怖電影節\n" +
                    "\n" +
                    "★ 第19屆義大利第里雅斯特科幻影展\n" +
                    "\n" +
                    "★ 小心，別讓邪靈乘虛而入\n" +
                    "\n" +
                    "★ “驚恐宛如《陰兒房》和《厲陰宅》” -KILLERHORRORCRITIC.COM\n" +
                    "\n" +
                    "菲利浦是個孤獨的校稿員，遭到一股神祕未知的邪惡力量糾纏而心生恐懼的他，將自己關在公寓裡長達兩年之久，不敢踏出家門一步。在門外虎視眈眈的邪靈，也將以各種方式誘惑菲利浦，試圖佔據他的身體……");
            videoPath = "android.resource://"+getPackageName()+"/"+R.raw.trap;
            Uri uri = Uri.parse(videoPath);
            videoView.setVideoURI(uri);

            MediaController mc = new MediaController(this);
            videoView.setMediaController(mc);
            mc.setAnchorView(videoView);
        } else if (name.contains("怪物")) {
            eng_name.setText("Space Jam: A New Legacy");
            date.setText("2021-07-15" + "\n" + "上映日期");
            rank.setText("普遍級" + "\n" + "分級");
            time.setText("2 時" + "\n" + "片長");
            director.setText("馬爾科姆李(Malcolm D. Lee)");
            actor.setText("雷霸龍詹姆斯(LeBron James) 、 唐奇鐸(Don Cheadle) 、 艾瑞克鮑薩(Eric Bauza) 、 傑夫伯格曼(Jeff Bergman) 、 桑庫馬汀格林(Sonequa Martin-Green)");
            intro.setText("詹皇和他年幼的兒子小唐被一個抓狂的人工智慧困在一個數位空間，他必須登上球場，帶領兔寶寶、蘿拉兔及一幫調皮的「樂一通」（Looney Tunes）角色，打敗人工智慧設計出的冠軍球隊，才能讓他和他兒子安全返家。然而，這支數位球隊是集結NBA和WNBA球星的超級強隊，絕對是空前未見。這場硬戰是詹皇人生中玩最大的挑戰，也會重新定他與他兒子的緊密關係，並發揮他重新看見自己的力量。準備放手一搏的「樂一通」角色將打破慣例，讓他們的各種奇招衝到破表，打出一場他們專屬的球賽，連詹皇都會大吃一驚。");
            videoPath = "android.resource://"+getPackageName()+"/"+R.raw.spacejam;
            Uri uri = Uri.parse(videoPath);
            videoView.setVideoURI(uri);

            MediaController mc = new MediaController(this);
            videoView.setMediaController(mc);
            mc.setAnchorView(videoView);
        } else if (name.contains("2")) {
            eng_name.setText("Escape Room: Tournament of Champions");
            date.setText("2021-07-15" + "\n" + "上映日期");
            rank.setText("輔導15級" + "\n" + "分級");
            time.setText("未提供" + "\n" + "片長");
            director.setText("亞當羅勃提爾(Adam Robitel)");
            actor.setText("泰勒羅素(Taylor Russell) 、 羅根米勒(Logan Miller) 、 荷蓮蘿丹(Holland Roden)");
            intro.setText("為了將害人致死的「世界頂尖密室逃脫」主辦方繩之以法，兩位遊戲生存者柔伊（泰勒羅素飾）和班（羅根米勒 飾）決定聯手到紐約找出背後兇手。但兩人卻與其他四位陌生人在紐約地鐵上遇到大災難，並意外發現他們不僅捲入更危險致命的密室遊戲，且所有人之前都是「世界頂尖密室逃脫」遊戲的生存者。在不解迷就等死的情況下，這六人將如何協力找生路，避免成為下一批遊戲犧牲者？");
            videoPath = "android.resource://"+getPackageName()+"/"+R.raw.escape_room;
            Uri uri = Uri.parse(videoPath);
            videoView.setVideoURI(uri);

            MediaController mc = new MediaController(this);
            videoView.setMediaController(mc);
            mc.setAnchorView(videoView);
        }
    }
    public void click(View v) {
        Intent intent = new Intent(this, MainActivity4.class);
        Bundle bundle = new Bundle();
        bundle.putString("movie", tv.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
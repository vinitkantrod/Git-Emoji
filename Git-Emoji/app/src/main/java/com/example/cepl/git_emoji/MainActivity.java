package com.example.cepl.git_emoji;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<CardData> cards = new ArrayList<CardData>();
        cards.add(new CardData(":art:","Improving structure / format of the code.", R.mipmap.art, R.color.art));
        cards.add(new CardData(":zap:","Improving performance.", R.mipmap.zap, R.color.zap));
        cards.add(new CardData(":fire:","Removing code or files.", R.mipmap.fire, R.color.fire));
        cards.add(new CardData(":bug:","Fixing a bug.", R.mipmap.bug, R.color.bug));

        cards.add(new CardData(":ambulance:","Critical hotfix.", R.mipmap.ambulance, R.color.ambulance));
        cards.add(new CardData(":sparkles:","Introducing new features.", R.mipmap.sparkles, R.color.sparkles));
        cards.add(new CardData(":memo:","Writing docs.", R.mipmap.memo, R.color.memo));
        cards.add(new CardData(":rocket:","Deploying stuff.", R.mipmap.rocket, R.color.rocket));

        cards.add(new CardData(":lipstick:","Updating the UI and style files.", R.mipmap.lipstick, R.color.lipstick));
        cards.add(new CardData(":tada:","Initial commit.", R.mipmap.tada, R.color.tada));
        cards.add(new CardData(":white_check_mark:","Adding tests.", R.mipmap.white_check_mark, R.color.white_check_mark));
        cards.add(new CardData(":lock:","Fixing security issues.", R.mipmap.lock, R.color.lock));

        cards.add(new CardData(":apple:","Fixing something on macOS.", R.mipmap.apple, R.color.apple));
        cards.add(new CardData(":penguin:","Fixing something on Linux.", R.mipmap.penguin, R.color.penguin));
        cards.add(new CardData(":checkered_flag:","Fixing something on Windows.", R.mipmap.checkered_flag, R.color.checkered_flag));
        cards.add(new CardData(":robot:","Fixing something on Android.", R.mipmap.robot, R.color.robot));

        cards.add(new CardData(":green_apple:","Fixing something on iOS.", R.mipmap.green_apple, R.color.green_apple));
        cards.add(new CardData(":bookmark:","Releasing / Version tags.", R.mipmap.bookmark, R.color.bookmark));
        cards.add(new CardData(":rotating_light:","Removing linter warnings.", R.mipmap.rotating_light, R.color.rotating_light));
        cards.add(new CardData(":construction:","Work in progress.", R.mipmap.construction, R.color.construction));

        cards.add(new CardData(":green_heart:","Fixing CI Build.", R.mipmap.green_heart, R.color.green_heart));
        cards.add(new CardData(":arrow_down:","Downgrading dependencies.", R.mipmap.arrow_down, R.color.arrow_down));
        cards.add(new CardData(":arrow_up:","Upgrading dependencies.", R.mipmap.arrow_up, R.color.arrow_up));
        cards.add(new CardData(":pushpin:","Pinning dependencies to specific versions.", R.mipmap.pushpin, R.color.pushpin));

        cards.add(new CardData(":construction_worker:","Adding CI build system.", R.mipmap.construction_worker, R.color.construction_worker));
        cards.add(new CardData(":chart_with_upwards_trend:","Adding analytics or tracking code.", R.mipmap.chart_with_upwards_trend, R.color.chart_with_upwards_trend));
        cards.add(new CardData(":recycle:","Refactoring code.", R.mipmap.recycle, R.color.recycle));
        cards.add(new CardData(":heavy_minus_sign:","Removing a dependency.", R.mipmap.heavy_minus_sign, R.color.heavy_minus_sign));

        cards.add(new CardData(":whale:","Work about Docker.", R.mipmap.whale, R.color.whale));
        cards.add(new CardData(":heavy_plus_sign:","Adding a dependency.", R.mipmap.heavy_plus_sign, R.color.heavy_plus_sign));
        cards.add(new CardData(":wrench:","Changing configuration files.", R.mipmap.wrench, R.color.wrench));
        cards.add(new CardData(":globe_with_meridians:","Internationalization and localization.", R.mipmap.globe_with_meridians, R.color.globe_with_meridians));

        cards.add(new CardData(":pencil2:","Fixing typos.", R.mipmap.pencil2, R.color.pencil2));
        cards.add(new CardData(":henkey:","Writing bad code that needs to be improved.", R.mipmap.hankey, R.color.hankey));
        cards.add(new CardData(":rewind:","Reverting changes.", R.mipmap.rewind, R.color.rewind));
        cards.add(new CardData(":twisted_rightwards_arrows:","Merging branches.", R.mipmap.twisted_rightwards_arrows, R.color.twisted_rightwards_arrows));

        cards.add(new CardData(":package:","Updating compiled files or packages.", R.mipmap.package_logo, R.color.package_logo));
        cards.add(new CardData(":aline:","Updating code due to external API changes.", R.mipmap.alien, R.color.alien));
        cards.add(new CardData(":truck:","Adding or updating license.", R.mipmap.truck, R.color.truck));
        cards.add(new CardData(":page_facing_up:","Adding or updating license.", R.mipmap.page_facing_up, R.color.page_facing_up));

        cards.add(new CardData(":boom:","Introducing breaking changes.", R.mipmap.boom, R.color.boom));
        cards.add(new CardData(":bento:","Adding or updating assets.", R.mipmap.bento, R.color.bento));
        cards.add(new CardData(":ok_hand:","Updating code due to code review changes.", R.mipmap.ok_hand, R.color.ok_hand));
        cards.add(new CardData(":wheelchair:","Improving accessibility.", R.mipmap.wheelchair, R.color.wheelchair));

        cards.add(new CardData(":bulb:","Documenting source code.", R.mipmap.bulb, R.color.bulb));
        cards.add(new CardData(":beers:","Writing code drunkenly.", R.mipmap.beers, R.color.beers));
        cards.add(new CardData(":speech_balloon:","Updating text and literals.", R.mipmap.speech_balloon, R.color.speech_balloon));
        cards.add(new CardData(":card_file_box:","Performing database related changes.", R.mipmap.card_file_box, R.color.card_file_box));

        cards.add(new CardData(":loud_sound:","Adding logs.", R.mipmap.loud_sound, R.color.loud_sound));
        cards.add(new CardData(":mute:","Removing logs.", R.mipmap.mute, R.color.mute));
        cards.add(new CardData(":busts_in_silhouette:","Add contributor(s).", R.mipmap.busts_in_silhouette, R.color.busts_in_silhouette));
        cards.add(new CardData(":children_crossing:","Improving user experience / usability.", R.mipmap.children_crossing, R.color.children_crossing));

        cards.add(new CardData(":building_construction:","Making architectural changes.", R.mipmap.building_construction, R.color.building_construction));

        ListView listView = (ListView) findViewById(R.id.list);
        CardAdapter adapter = new CardAdapter(this, cards);

        listView.setAdapter(adapter);
    }
}

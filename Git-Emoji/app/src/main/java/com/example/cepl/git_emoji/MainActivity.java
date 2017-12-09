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
        cards.add(new CardData(":art:","Improving structure / format of the code.", R.mipmap.artist_palette));
        cards.add(new CardData(":zap:","Improving performance.", R.mipmap.high_voltage));
        cards.add(new CardData(":fire:","Removing code or files.", R.mipmap.fire));
        cards.add(new CardData(":bug:","Fixing a bug.", R.mipmap.bug));

        cards.add(new CardData(":ambulance:","Critical hotfix.", R.mipmap.ambulance));
        cards.add(new CardData(":sparkles:","Introducing new features.", R.mipmap.sparkles));
        cards.add(new CardData(":memo:","Writing docs.", R.mipmap.memo));
        cards.add(new CardData(":rocket:","Deploying stuff.", R.mipmap.rocket));

        cards.add(new CardData(":lipstick:","Updating the UI and style files.", R.mipmap.lipstick));
        cards.add(new CardData(":tada:","Initial commit.", R.mipmap.party_popper));
        cards.add(new CardData(":white_check_mark:","Adding tests.", R.mipmap.white_heavy_check_mark));
        cards.add(new CardData(":lock:","Fixing security issues.", R.mipmap.locked));

        cards.add(new CardData(":apple:","Fixing something on macOS.", R.mipmap.red_apple));
        cards.add(new CardData(":penguin:","Fixing something on Linux.", R.mipmap.penguin));
        cards.add(new CardData(":checkered_flag:","Fixing something on Windows.", R.mipmap.chequered_flag));
        cards.add(new CardData(":robot:","Fixing something on Android.", R.mipmap.robot));

        cards.add(new CardData(":green_apple:","Fixing something on iOS.", R.mipmap.green_apple));
        cards.add(new CardData(":bookmark:","Releasing / Version tags.", R.mipmap.bookmark));
        cards.add(new CardData(":rotating_light:","Removing linter warnings.", R.mipmap.police_car_light));
        cards.add(new CardData(":construction:","Work in progress.", R.mipmap.construction));

        cards.add(new CardData(":green_heart:","Fixing CI Build.", R.mipmap.green_heart));
        cards.add(new CardData(":arrow_down:","Downgrading dependencies.", R.mipmap.down_arrow));
        cards.add(new CardData(":arrow_up:","Upgrading dependencies.", R.mipmap.up_arrow));
        cards.add(new CardData(":pushpin:","Pinning dependencies to specific versions.", R.mipmap.pushpin));

        cards.add(new CardData(":construction_worker:","Adding CI build system.", R.mipmap.man_construction_worker_light_skin_tone));
        cards.add(new CardData(":chart_with_upwards_trend:","Adding analytics or tracking code.", R.mipmap.chart_increasing));
        cards.add(new CardData(":recycle:","Refactoring code.", R.mipmap.recycling_symbol));
        cards.add(new CardData(":heavy_minus_sign:","Removing a dependency.", R.mipmap.heavy_minus_sign));

        cards.add(new CardData(":whale:","Work about Docker.", R.mipmap.whale));
        cards.add(new CardData(":heavy_plus_sign:","Adding a dependency.", R.mipmap.heavy_plus_sign));
        cards.add(new CardData(":wrench:","Changing configuration files.", R.mipmap.wrench));
        cards.add(new CardData(":globe_with_meridians:","Internationalization and localization.", R.mipmap.globe_with_meridians));

        cards.add(new CardData(":pencil2:","Fixing typos.", R.mipmap.pencil));
        cards.add(new CardData(":henkey:","Writing bad code that needs to be improved.", R.mipmap.henkey));
        cards.add(new CardData(":rewind:","Reverting changes.", R.mipmap.fast_reverse_button));
        cards.add(new CardData(":twisted_rightwards_arrows:","Merging branches.", R.mipmap.shuffle_tracks_button));

        cards.add(new CardData(":package:","Updating compiled files or packages.", R.mipmap.package_logo));
        cards.add(new CardData(":aline:","Updating code due to external API changes.", R.mipmap.alien));
        cards.add(new CardData(":truck:","Adding or updating license.", R.mipmap.delivery_truck));
        cards.add(new CardData(":page_facing_up:","Adding or updating license.", R.mipmap.page_facing_up));

        cards.add(new CardData(":boom:","Introducing breaking changes.", R.mipmap.boom));
        cards.add(new CardData(":bento:","Adding or updating assets.", R.mipmap.bento_box));
        cards.add(new CardData(":ok_hand:","Updating code due to code review changes.", R.mipmap.ok_hand));
        cards.add(new CardData(":wheelchair:","Improving accessibility.", R.mipmap.wheelchair_symbol));

        cards.add(new CardData(":bulb:","Documenting source code.", R.mipmap.light_bulb));
        cards.add(new CardData(":beers:","Writing code drunkenly.", R.mipmap.clinking_beer_mugs));
        cards.add(new CardData(":speech_balloon:","Updating text and literals.", R.mipmap.speech_balloon));
        cards.add(new CardData(":card_file_box:","Performing database related changes.", R.mipmap.card_file_box));

        cards.add(new CardData(":loud_sound:","Adding logs.", R.mipmap.speaker_high_volume));
        cards.add(new CardData(":mute:","Removing logs.", R.mipmap.muted_speaker));
        cards.add(new CardData(":busts_in_silhouette:","Add contributor(s).", R.mipmap.busts_in_silhouette));
        cards.add(new CardData(":children_crossing:","Improving user experience / usability.", R.mipmap.children_crossing));








        ListView listView = (ListView) findViewById(R.id.list);
        CardAdapter adapter = new CardAdapter(this, cards);

        listView.setAdapter(adapter);
    }
}

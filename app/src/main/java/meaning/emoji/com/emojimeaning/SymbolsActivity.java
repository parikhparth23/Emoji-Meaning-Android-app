package meaning.emoji.com.emojimeaning;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class SymbolsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Eye in Speech Bubble", R.drawable.eye_in_speech_bubble));
        words.add(new Word("Heart With Arrow",R.drawable.heart_with_arrow));
        words.add(new Word("Red Heart",R.drawable.heavy_black_heart));
        words.add(new Word("Beating Heart",R.drawable.beating_heart));
        words.add(new Word("Broken Heart",R.drawable.broken_heart));
        words.add(new Word("Two Hearts",R.drawable.two_hearts));
        words.add(new Word("Sparkling Heart",R.drawable.sparkling_heart));
        words.add(new Word("Growing Heart",R.drawable.growing_heart));
        words.add(new Word("Blue Heart",R.drawable.blue_heart));
        words.add(new Word("Green Heart",R.drawable.green_heart));
        words.add(new Word("Yellow Heart",R.drawable.yellow_heart));
        words.add(new Word("Purple Heart",R.drawable.purple_heart));
        words.add(new Word("Black Heart",R.drawable.black_heart));
        words.add(new Word("Heart With Ribbon",R.drawable.heart_with_ribbon));
        words.add(new Word("Revolving Hearts",R.drawable.revolving_hearts));
        words.add(new Word("Heart Decoration",R.drawable.heart_decoration));
        words.add(new Word("Heavy Heart Exclamation",R.drawable.heavy_heart_exclamation_mark_ornament));
        words.add(new Word("Zzz",R.drawable.sleeping_symbol));
        words.add(new Word("Anger Symbol",R.drawable.anger_symbol));
        words.add(new Word("Speech Balloon",R.drawable.speech_balloon));
        words.add(new Word("Right Anger Bubble",R.drawable.right_anger_bubble));
        words.add(new Word("Thought Balloon",R.drawable.thought_balloon));
        words.add(new Word("White Flower",R.drawable.white_flower));
        words.add(new Word("Hot Springs",R.drawable.hot_springs));
        words.add(new Word("Barber Pole",R.drawable.barber_pole));
        words.add(new Word("Stop Sign",R.drawable.octagonal_sign));
        words.add(new Word("Twelve O’clock",R.drawable.clock_face_twelve_oclock));
        words.add(new Word("Twelve-Thirty",R.drawable.clock_face_twelve_thirty));
        words.add(new Word("One O’clock",R.drawable.clock_face_one_oclock));
        words.add(new Word("One-Thirty",R.drawable.clock_face_one_thirty));
        words.add(new Word("Two O’clock",R.drawable.clock_face_two_oclock));
        words.add(new Word("Two-Thirty",R.drawable.clock_face_two_thirty));
        words.add(new Word("Three O’clock",R.drawable.clock_face_three_oclock));
        words.add(new Word("Three-Thirty",R.drawable.clock_face_three_thirty));
        words.add(new Word("Four O’clock",R.drawable.clock_face_four_oclock));
        words.add(new Word("Four-Thirty",R.drawable.clock_face_four_thirty));
        words.add(new Word("Five O’clock",R.drawable.clock_face_five_oclock));
        words.add(new Word("Five-Thirty",R.drawable.clock_face_five_thirty));
        words.add(new Word("Six O’clock",R.drawable.clock_face_six_oclock));
        words.add(new Word("Six-Thirty",R.drawable.clock_face_six_thirty));
        words.add(new Word("Seven O’clock",R.drawable.clock_face_seven_oclock));
        words.add(new Word("Seven-Thirty",R.drawable.clock_face_seven_thirty));
        words.add(new Word("Eight O’clock",R.drawable.clock_face_eight_oclock));
        words.add(new Word("Eight-Thirty",R.drawable.clock_face_eight_thirty));
        words.add(new Word("Nine O’clock",R.drawable.clock_face_nine_oclock));
        words.add(new Word("Nine-Thirty",R.drawable.clock_face_nine_thirty));
        words.add(new Word("Ten O’clock",R.drawable.clock_face_ten_oclock));
        words.add(new Word("Ten-Thirty",R.drawable.clock_face_ten_thirty));
        words.add(new Word("Eleven O’clock",R.drawable.clock_face_eleven_oclock));
        words.add(new Word("Eleven-Thirty",R.drawable.clock_face_eleven_thirty));
        words.add(new Word("Cyclone",R.drawable.cyclone));
        words.add(new Word("Spade Suit",R.drawable.black_spade_suit));
        words.add(new Word("Heart Suit",R.drawable.black_heart_suit));
        words.add(new Word("Diamond Suit",R.drawable.black_diamond_suit));
        words.add(new Word("Club Suit",R.drawable.black_club_suit));
        words.add(new Word("Joker",R.drawable.playing_card_black_joker));
        words.add(new Word("Mahjong Red Dragon",R.drawable.mahjong_tile_red_dragon));
        words.add(new Word("Flower Playing Cards",R.drawable.flower_playing_cards));
        words.add(new Word("Muted Speaker",R.drawable.speaker_with_cancellation_stroke));
        words.add(new Word("Speaker Low Volume",R.drawable.speaker));
        words.add(new Word("Speaker Medium Volume",R.drawable.speaker_with_one_sound_wave));
        words.add(new Word("Speaker High Volume",R.drawable.speaker_with_three_sound_waves));
        words.add(new Word("Loudspeaker",R.drawable.public_address_loudspeaker));
        words.add(new Word("Megaphone",R.drawable.cheering_megaphone));
        words.add(new Word("Postal Horn",R.drawable.postal_horn));
        words.add(new Word("Bell",R.drawable.bell));
        words.add(new Word("Bell With Slash",R.drawable.bell_with_cancellation_stroke));
        words.add(new Word("Musical Note",R.drawable.musical_note));
        words.add(new Word("Musical Notes",R.drawable.multiple_musical_notes));
        words.add(new Word("Atm Sign",R.drawable.automated_teller_machine));
        words.add(new Word("Litter in Bin Sign",R.drawable.put_litter_in_its_place_symbol));
        words.add(new Word("Potable Water",R.drawable.potable_water_symbol));
        words.add(new Word("Wheelchair Symbol",R.drawable.wheelchair_symbol));
        words.add(new Word("Men’s Room",R.drawable.mens_symbol));
        words.add(new Word("Women’s Room",R.drawable.womens_symbol));
        words.add(new Word("Restroom",R.drawable.restroom));
        words.add(new Word("Baby Symbol",R.drawable.baby_symbol));
        words.add(new Word("Water Closet",R.drawable.water_closet));
        words.add(new Word("Warning",R.drawable.warning_sign));
        words.add(new Word("Children Crossing",R.drawable.children_crossing));
        words.add(new Word("No Entry",R.drawable.no_entry));
        words.add(new Word("Prohibited",R.drawable.no_entry_sign));
        words.add(new Word("No Bicycles",R.drawable.no_bicycles));
        words.add(new Word("No Smoking",R.drawable.no_smoking_symbol));
        words.add(new Word("No Littering",R.drawable.do_not_litter_symbol));
        words.add(new Word("Non-Potable Water",R.drawable.non_potable_water_symbol));
        words.add(new Word("No Pedestrians",R.drawable.no_pedestrians));
        words.add(new Word("No One Under Eighteen",R.drawable.no_one_under_eighteen_symbol));
        words.add(new Word("Radioactive",R.drawable.radioactive_sign));
        words.add(new Word("Biohazards",R.drawable.biohazard_sign));
        words.add(new Word("Up Arrow",R.drawable.upwards_black_arrow));
        words.add(new Word("Up-Right Arrow",R.drawable.north_east_arrow));
        words.add(new Word("Right Arrow",R.drawable.black_rightwards_arrow));
        words.add(new Word("Down-Right Arrow",R.drawable.south_east_arrow));
        words.add(new Word("Down Arrow",R.drawable.downwards_black_arrow));
        words.add(new Word("Down-Left Arrow",R.drawable.south_west_arrow));
        words.add(new Word("Pound Banknote",R.drawable.banknote_with_pound_sign));
        words.add(new Word("Left Arrow",R.drawable.leftwards_black_arrow));
        words.add(new Word("Up-Left Arrow",R.drawable.north_west_arrow));
        words.add(new Word("Up-Down Arrow",R.drawable.up_down_arrow));
        words.add(new Word("Left-Right Arrow",R.drawable.left_right_arrow));
        words.add(new Word("Right Arrow Curving Left",R.drawable.leftwards_arrow_with_hook));
        words.add(new Word("Left Arrow Curving Right",R.drawable.rightwards_arrow_with_hook));
        words.add(new Word("Right Arrow Curving Up",R.drawable.arrow_pointing_rightwards_then_curving_upwards));
        words.add(new Word("Right Arrow Curving Down",R.drawable.arrow_pointing_rightwards_then_curving_downwards));
        words.add(new Word("Clockwise Vertical Arrows",R.drawable.clockwise_downwards_and_upwards_open_circle_arrows));
        words.add(new Word("Anticlockwise Arrows Buttong",R.drawable.anticlockwise_downwards_and_upwards_open_circle_arrows));
        words.add(new Word("Back Arrow",R.drawable.back_with_leftwards_arrow_above));
        words.add(new Word("End Arrow",R.drawable.end_with_leftwards_arrow_above));
        words.add(new Word("On! Arrow",R.drawable.on_with_exclamation_mark_with_left_right_arrow_above));
        words.add(new Word("Postbox",R.drawable.postbox));
        words.add(new Word("Soon Arrow",R.drawable.soon_with_rightwards_arrow_above));
        words.add(new Word("Top Arrow",R.drawable.top_with_upwards_arrow_above));
        words.add(new Word("Place of Worship",R.drawable.place_of_worship));
        words.add(new Word("Atom Symbol",R.drawable.atom_symbol));
        words.add(new Word("Om",R.drawable.om_symbol));
        words.add(new Word("Star of Davidh",R.drawable.star_of_david));
        words.add(new Word("Wheel of Dharma",R.drawable.wheel_of_dharma));
        words.add(new Word("Yin Yang",R.drawable.yin_yang));
        words.add(new Word("Latin Cross",R.drawable.latin_cross));
        words.add(new Word("Orthodox Cross",R.drawable.orthodox_cross));
        words.add(new Word("Star and Crescent",R.drawable.star_and_crescent));
        words.add(new Word("Peace Symbol",R.drawable.peace_symbol));
        words.add(new Word("Menorah",R.drawable.menorah_with_nine_branches));
        words.add(new Word("Dotted Six-Pointed Star",R.drawable.six_pointed_star_with_middle_dot));
        words.add(new Word("Aries",R.drawable.aries));
        words.add(new Word("Taurus",R.drawable.taurus));
        words.add(new Word("Gemini",R.drawable.gemini));
        words.add(new Word("Cancer",R.drawable.cancer));
        words.add(new Word("Leo",R.drawable.leo));
        words.add(new Word("Virgo",R.drawable.virgo));
        words.add(new Word("Libra",R.drawable.libra));
        words.add(new Word("Scorpius",R.drawable.scorpius));
        words.add(new Word("Sagittarius",R.drawable.sagittarius));
        words.add(new Word("Capricorn",R.drawable.capricorn));
        words.add(new Word("Aquarius",R.drawable.aquarius));
        words.add(new Word("Pisces",R.drawable.pisces));
        words.add(new Word("Ophiuchus",R.drawable.ophiuchus));
        words.add(new Word("Shuffle Tracks Button",R.drawable.twisted_rightwards_arrows));
        words.add(new Word("Repeat Button",R.drawable.clockwise_rightwards_and_leftwards_open_circle_arrows));
        words.add(new Word("Repeat Single Button",R.drawable.clockwise_rightwards_and_leftwards_open_circle_arrows_with_circled_one_overlay));
        words.add(new Word("Play Button",R.drawable.black_right_pointing_triangle));
        words.add(new Word("Fast-Forward Button",R.drawable.black_right_pointing_double_triangle));
        words.add(new Word("Reverse Button",R.drawable.black_left_pointing_triangle));
        words.add(new Word("Fast Reverse Button",R.drawable.black_left_pointing_double_triangle));
        words.add(new Word("Up Button",R.drawable.up_pointing_small_red_triangle));
        words.add(new Word("Fast Up Button",R.drawable.black_up_pointing_double_triangle));
        words.add(new Word("Down Button",R.drawable.down_pointing_small_red_triangle));
        words.add(new Word("Fast Down Button",R.drawable.black_down_pointing_double_triangle));
        words.add(new Word("Stop Button",R.drawable.black_square_for_stop));
        words.add(new Word("Cinema",R.drawable.cinema));
        words.add(new Word("Dim Button",R.drawable.low_brightness_symbol));
        words.add(new Word("Bright Button",R.drawable.high_brightness_symbol));
        words.add(new Word("Antenna Bars",R.drawable.antenna_with_bars));
        words.add(new Word("Vibration Mode",R.drawable.vibration_mode));
        words.add(new Word("Mobile Phone Off",R.drawable.mobile_phone_off));
        words.add(new Word("Recycling Symbol",R.drawable.black_universal_recycling_symbol));
        words.add(new Word("Trident Emblem",R.drawable.trident_emblem));
        words.add(new Word("Name Badge",R.drawable.name_badge));
        words.add(new Word("Japanese Symbol for Beginner",R.drawable.japanese_symbol_for_beginner));
        words.add(new Word("Heavy Large Circle",R.drawable.heavy_large_circle));
        words.add(new Word("White Heavy Check Mark",R.drawable.white_heavy_check_mark));
        words.add(new Word("Ballot Box With Check",R.drawable.ballot_box_with_check));
        words.add(new Word("Heavy Check Mark",R.drawable.heavy_check_mark));
        words.add(new Word("Heavy Multiplication X",R.drawable.heavy_multiplication_x));
        words.add(new Word("Cross Mark",R.drawable.cross_mark));
        words.add(new Word("Cross Mark Button",R.drawable.negative_squared_cross_mark));
        words.add(new Word("Heavy Plus Sign",R.drawable.heavy_plus_sign));
        words.add(new Word("Heavy Minus Sign",R.drawable.heavy_minus_sign));
        words.add(new Word("Heavy Division Sign",R.drawable.heavy_division_sign));
        words.add(new Word("Curly Loop",R.drawable.curly_loop));
        words.add(new Word("Double Curly Loop",R.drawable.double_curly_loop));
        words.add(new Word("Part Alternation Mark",R.drawable.part_alternation_mark));
        words.add(new Word("Eight-Spoked Asterisk",R.drawable.eight_spoked_asterisk));
        words.add(new Word("Eight-Pointed Stars",R.drawable.eight_pointed_black_star));
        words.add(new Word("Sparkle",R.drawable.sparkle));
        words.add(new Word(" Double Exclamation Mark",R.drawable.double_exclamation_mark));
        words.add(new Word("Exclamation Question Mark",R.drawable.exclamation_question_mark));
        words.add(new Word("Question Mark",R.drawable.black_question_mark_ornament));
        words.add(new Word("White Question Mark",R.drawable.white_question_mark_ornament));
        words.add(new Word("White Exclamation Mark",R.drawable.white_exclamation_mark_ornament));
        words.add(new Word("Exclamation Mark",R.drawable.heavy_exclamation_mark_symbol));
        words.add(new Word("Copyright",R.drawable.copyright_sign));
        words.add(new Word("Registered",R.drawable.registered_sign));
        words.add(new Word("Trade Mark",R.drawable.trade_mark_sign));
        words.add(new Word("Keycap Number Sign",R.drawable.keycap_number_sign));
        words.add(new Word("Keycap Digit Zero",R.drawable.keycap_digit_zero));
        words.add(new Word("Keycap Digit One",R.drawable.keycap_digit_one));
        words.add(new Word("Keycap Digit Two",R.drawable.keycap_digit_two));
        words.add(new Word("Keycap Digit Three",R.drawable.keycap_digit_three));
        words.add(new Word("Keycap Digit Four",R.drawable.keycap_digit_four));
        words.add(new Word("Keycap Digit Five",R.drawable.keycap_digit_five));
        words.add(new Word("Keycap Digit Six",R.drawable.keycap_digit_six));
        words.add(new Word("Keycap Digit Seven",R.drawable.keycap_digit_seven));
        words.add(new Word("Keycap Digit Eight",R.drawable.keycap_digit_eight));
        words.add(new Word("Keycap Digit Nine",R.drawable.keycap_digit_nine));
        words.add(new Word("Keycap 10",R.drawable.keycap_ten));
        words.add(new Word("Hundred Points",R.drawable.hundred_points_symbol));
        words.add(new Word("Input Latin Uppercase",R.drawable.input_symbol_for_latin_capital_letters));
        words.add(new Word("Input Latin Lowercase",R.drawable.input_symbol_for_latin_small_letters));
        words.add(new Word("Input Numbers",R.drawable.input_symbol_for_numbers));
        words.add(new Word("Input Symbols",R.drawable.input_symbol_for_symbols));
        words.add(new Word("Input Latin Letters",R.drawable.input_symbol_for_latin_letters));
        words.add(new Word("A Button (blood Type)",R.drawable.negative_squared_latin_capital_letter_a));
        words.add(new Word("Ab Button (blood Type)",R.drawable.negative_squared_ab));
        words.add(new Word("B Button (blood Type)",R.drawable.negative_squared_latin_capital_letter_b));
        words.add(new Word("CL Button",R.drawable.squared_cl));
        words.add(new Word("Cool Button",R.drawable.squared_cool));
        words.add(new Word("Free Button",R.drawable.squared_free));
        words.add(new Word("Information",R.drawable.information_source));
        words.add(new Word("ID Button",R.drawable.squared_id));
        words.add(new Word("Circled M",R.drawable.circled_latin_capital_letter_m));
        words.add(new Word("New Button",R.drawable.squared_new));
        words.add(new Word("NG Button",R.drawable.squared_ng));
        words.add(new Word("O Button (blood Type)",R.drawable.negative_squared_latin_capital_letter_o));
        words.add(new Word("OK Button",R.drawable.squared_ok));
        words.add(new Word("P Button",R.drawable.negative_squared_latin_capital_letter_p));
        words.add(new Word("SOS Button",R.drawable.squared_sos));
        words.add(new Word("Up! Button",R.drawable.squared_up_with_exclamation_mark));
        words.add(new Word("Vs Button",R.drawable.squared_vs));
        words.add(new Word("Japanese “here” Button",R.drawable.squared_katakana_koko));
        words.add(new Word("Japanese “service Charge” Button",R.drawable.squared_katakana_sa));
        words.add(new Word("Japanese “monthly Amount” Button",R.drawable.squared_cjk_unified_ideograph_6708));
        words.add(new Word("Japanese “not Free of Charge” Button",R.drawable.squared_cjk_unified_ideograph_6709));
        words.add(new Word("Japanese “reserved” Button",R.drawable.squared_cjk_unified_ideograph_6307));
        words.add(new Word("Japanese “bargain” Button",R.drawable.circled_ideograph_advantage));
        words.add(new Word("Japanese “discount” Button",R.drawable.squared_cjk_unified_ideograph_5272));
        words.add(new Word("Japanese “free of Charge” Button",R.drawable.squared_cjk_unified_ideograph_7121));
        words.add(new Word("Japanese “prohibited” Button",R.drawable.squared_cjk_unified_ideograph_7981));
        words.add(new Word("Japanese “acceptable” Button",R.drawable.circled_ideograph_accept));
        words.add(new Word("Japanese “application” Button",R.drawable.squared_cjk_unified_ideograph_7533));
        words.add(new Word("Japanese “passing Grade” Button",R.drawable.squared_cjk_unified_ideograph_5408));
        words.add(new Word("Japanese “vacancy” Button",R.drawable.squared_cjk_unified_ideograph_7a7a));
        words.add(new Word("Japanese “congratulations” Button",R.drawable.circled_ideograph_congratulation));
        words.add(new Word("Japanese “secret” Button",R.drawable.circled_ideograph_secret));
        words.add(new Word("Japanese “open for Business” Button",R.drawable.squared_cjk_unified_ideograph_55b6));
        words.add(new Word("Japanese “no Vacancy” Button",R.drawable.squared_cjk_unified_ideograph_6e80));

        words.add(new Word("Black Small Square",R.drawable.black_small_square));
        words.add(new Word("White Small Square",R.drawable.white_small_square));
        words.add(new Word("White Medium Square",R.drawable.white_medium_square));
        words.add(new Word("Black Medium Square",R.drawable.black_medium_square));
        words.add(new Word("White Medium-Small Square",R.drawable.white_medium_small_square));
        words.add(new Word("Black Medium-Small Square",R.drawable.black_medium_small_square));
        words.add(new Word("Black Large Square",R.drawable.black_large_square));
        words.add(new Word("White Large Square",R.drawable.white_large_square));
        words.add(new Word("Large Orange Diamond",R.drawable.large_orange_diamond));
        words.add(new Word("Large Blue Diamond",R.drawable.large_blue_diamond));
        words.add(new Word("Small Orange Diamond",R.drawable.small_orange_diamond));
        words.add(new Word("Small Blue Diamond",R.drawable.small_blue_diamond));
        words.add(new Word("Red Triangle Pointed Up",R.drawable.up_pointing_red_triangle));
        words.add(new Word("Red Triangle Pointed Down",R.drawable.down_pointing_red_triangle));
        words.add(new Word("Diamond With a Dot",R.drawable.diamond_shape_with_a_dot_inside));
        words.add(new Word("Black Square Button",R.drawable.black_square_button));
        words.add(new Word("White Square Button",R.drawable.white_square_button));
        words.add(new Word("White Circle",R.drawable.medium_white_circle));
        words.add(new Word("Black Circle",R.drawable.medium_black_circle));
        words.add(new Word("Red Circle",R.drawable.large_red_circle));
        words.add(new Word("Blue Circle",R.drawable.large_blue_circle));

        MeaningAdapter adapter = new MeaningAdapter(this, words, R.color.category_smileys_people);

        ListView listView = (ListView) findViewById(R.id.meaning_list_1);

        listView.setAdapter(adapter);
    }
}

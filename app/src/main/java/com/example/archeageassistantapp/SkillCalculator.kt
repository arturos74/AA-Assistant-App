package com.example.archeageassistantapp

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.GridLayout
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.core.view.isVisible
import org.w3c.dom.Text

class SkillCalculator : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skillcalculator)

        var skillPoints = 20
        var skillTree1Points = 0
        var skillTree2Points = 0
        var skillTree3Points = 0

        val btnMenu = findViewById<ImageButton>(R.id.btnMenu)
        btnMenu.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val addPoint1 = findViewById<CheckBox>(R.id.addPoint1)
        val addPoint2 = findViewById<CheckBox>(R.id.addPoint2)

        //region Skilltree Button Values
        val btnBattlerage1 = findViewById<Button>(R.id.btnBattlerage1)
        val btnBattlerage2 = findViewById<Button>(R.id.btnBattlerage2)
        val btnBattlerage3 = findViewById<Button>(R.id.btnBattlerage3)

        val btnArchery1 = findViewById<Button>(R.id.btnArchery1)
        val btnArchery2 = findViewById<Button>(R.id.btnArchery2)
        val btnArchery3 = findViewById<Button>(R.id.btnArchery3)

        val btnDefense1 = findViewById<Button>(R.id.btnDefense1)
        val btnDefense2 = findViewById<Button>(R.id.btnDefense2)
        val btnDefense3 = findViewById<Button>(R.id.btnDefense3)

        val btnOccultism1 = findViewById<Button>(R.id.btnOccultism1)
        val btnOccultism2 = findViewById<Button>(R.id.btnOccultism2)
        val btnOccultism3 = findViewById<Button>(R.id.btnOccultism3)

        val btnSorcery1 = findViewById<Button>(R.id.btnSorcery1)
        val btnSorcery2 = findViewById<Button>(R.id.btnSorcery2)
        val btnSorcery3 = findViewById<Button>(R.id.btnSorcery3)

        val btnSongcraft1 = findViewById<Button>(R.id.btnSongcraft1)
        val btnSongcraft2 = findViewById<Button>(R.id.btnSongcraft2)
        val btnSongcraft3 = findViewById<Button>(R.id.btnSongcraft3)


        val btnWitchcraft1 = findViewById<Button>(R.id.btnWitchcraft1)
        val btnWitchcraft2 = findViewById<Button>(R.id.btnWitchcraft2)
        val btnWitchcraft3 = findViewById<Button>(R.id.btnWitchcraft3)

        val btnAuramancy1 = findViewById<Button>(R.id.btnAuramancy1)
        val btnAuramancy2 = findViewById<Button>(R.id.btnAuramancy2)
        val btnAuramancy3 = findViewById<Button>(R.id.btnAuramancy3)

        val btnShadowplay1 = findViewById<Button>(R.id.btnShadowplay1)
        val btnShadowplay2 = findViewById<Button>(R.id.btnShadowplay2)
        val btnShadowplay3 = findViewById<Button>(R.id.btnShadowplay3)

        val btnVitalism1 = findViewById<Button>(R.id.btnVitalism1)
        val btnVitalism2 = findViewById<Button>(R.id.btnVitalism2)
        val btnVitalism3 = findViewById<Button>(R.id.btnVitalism3)

        val btnMalediction1 = findViewById<Button>(R.id.btnMalediction1)
        val btnMalediction2 = findViewById<Button>(R.id.btnMalediction2)
        val btnMalediction3 = findViewById<Button>(R.id.btnMalediction3)

        val btnSwiftblade1 = findViewById<Button>(R.id.btnSwiftblade1)
        val btnSwiftblade2 = findViewById<Button>(R.id.btnSwiftblade2)
        val btnSwiftblade3 = findViewById<Button>(R.id.btnSwiftblade3)

        val btnGunslinger1 = findViewById<Button>(R.id.btnGunslinger1)
        val btnGunslinger2 = findViewById<Button>(R.id.btnGunslinger2)
        val btnGunslinger3 = findViewById<Button>(R.id.btnGunslinger3)

        val btnSpelldance1 = findViewById<Button>(R.id.btnSpelldance1)
        val btnSpelldance2 = findViewById<Button>(R.id.btnSpelldance2)
        val btnSpelldance3 = findViewById<Button>(R.id.btnSpelldance3)
        //endregion

        //region Panel Values
        val gridSkillsets1 = findViewById<GridLayout>(R.id.gridSkillsets1)
        val gridSkillsets2 = findViewById<GridLayout>(R.id.gridSkillsets2)
        val gridSkillsets3 = findViewById<GridLayout>(R.id.gridSkillsets3)

        val gridBattlerage1 = findViewById<GridLayout>(R.id.gridBattlerage1)
        val gridBattleragePassive1 = findViewById<GridLayout>(R.id.gridBattleragePassive1)
        val gridBattlerage2 = findViewById<GridLayout>(R.id.gridBattlerage2)
        val gridBattleragePassive2 = findViewById<GridLayout>(R.id.gridBattleragePassive2)
        val gridBattlerage3 = findViewById<GridLayout>(R.id.gridBattlerage3)
        val gridBattleragePassive3 = findViewById<GridLayout>(R.id.gridBattleragePassive3)

        val gridArchery1 = findViewById<GridLayout>(R.id.gridArchery1)
        val gridArcheryPassive1 = findViewById<GridLayout>(R.id.gridArcheryPassive1)
        val gridArchery2 = findViewById<GridLayout>(R.id.gridArchery2)
        val gridArcheryPassive2 = findViewById<GridLayout>(R.id.gridArcheryPassive2)
        val gridArchery3 = findViewById<GridLayout>(R.id.gridArchery3)
        val gridArcheryPassive3 = findViewById<GridLayout>(R.id.gridArcheryPassive3)

        val gridDefense1 = findViewById<GridLayout>(R.id.gridDefense1)
        val gridDefensePassive1 = findViewById<GridLayout>(R.id.gridDefensePassive1)
        val gridDefense2 = findViewById<GridLayout>(R.id.gridDefense2)
        val gridDefensePassive2 = findViewById<GridLayout>(R.id.gridDefensePassive2)
        val gridDefense3 = findViewById<GridLayout>(R.id.gridDefense3)
        val gridDefensePassive3 = findViewById<GridLayout>(R.id.gridDefensePassive3)

        val gridOccultism1 = findViewById<GridLayout>(R.id.gridOccultism1)
        val gridOccultismPassive1 = findViewById<GridLayout>(R.id.gridOccultismPassive1)
        val gridOccultism2 = findViewById<GridLayout>(R.id.gridOccultism2)
        val gridOccultismPassive2 = findViewById<GridLayout>(R.id.gridOccultismPassive2)
        val gridOccultism3 = findViewById<GridLayout>(R.id.gridOccultism3)
        val gridOccultismPassive3 = findViewById<GridLayout>(R.id.gridOccultismPassive3)

        val gridSorcery1 = findViewById<GridLayout>(R.id.gridSorcery1)
        val gridSorceryPassive1 = findViewById<GridLayout>(R.id.gridSorceryPassive1)
        val gridSorcery2 = findViewById<GridLayout>(R.id.gridSorcery2)
        val gridSorceryPassive2 = findViewById<GridLayout>(R.id.gridSorceryPassive2)
        val gridSorcery3 = findViewById<GridLayout>(R.id.gridSorcery3)
        val gridSorceryPassive3 = findViewById<GridLayout>(R.id.gridSorceryPassive3)

        val gridSongcraft1 = findViewById<GridLayout>(R.id.gridSongcraft1)
        val gridSongcraftPassive1 = findViewById<GridLayout>(R.id.gridSongcraftPassive1)
        val gridSongcraft2 = findViewById<GridLayout>(R.id.gridSongcraft2)
        val gridSongcraftPassive2 = findViewById<GridLayout>(R.id.gridSongcraftPassive2)
        val gridSongcraft3 = findViewById<GridLayout>(R.id.gridSongcraft3)
        val gridSongcraftPassive3 = findViewById<GridLayout>(R.id.gridSongcraftPassive3)

        val gridWitchcraft1 = findViewById<GridLayout>(R.id.gridWitchcraft1)
        val gridWitchcraftPassive1 = findViewById<GridLayout>(R.id.gridWitchcraftPassive1)
        val gridWitchcraft2 = findViewById<GridLayout>(R.id.gridWitchcraft2)
        val gridWitchcraftPassive2 = findViewById<GridLayout>(R.id.gridWitchcraftPassive2)
        val gridWitchcraft3 = findViewById<GridLayout>(R.id.gridWitchcraft3)
        val gridWitchcraftPassive3 = findViewById<GridLayout>(R.id.gridWitchcraftPassive3)

        val gridAuramancy1 = findViewById<GridLayout>(R.id.gridAuramancy1)
        val gridAuramancyPassive1 = findViewById<GridLayout>(R.id.gridAuramancyPassive1)
        val gridAuramancy2 = findViewById<GridLayout>(R.id.gridAuramancy2)
        val gridAuramancyPassive2 = findViewById<GridLayout>(R.id.gridAuramancyPassive2)
        val gridAuramancy3 = findViewById<GridLayout>(R.id.gridAuramancy3)
        val gridAuramancyPassive3 = findViewById<GridLayout>(R.id.gridAuramancyPassive3)

        val gridShadowplay1 = findViewById<GridLayout>(R.id.gridShadowplay1)
        val gridShadowplayPassive1 = findViewById<GridLayout>(R.id.gridShadowplayPassive1)
        val gridShadowplay2 = findViewById<GridLayout>(R.id.gridShadowplay2)
        val gridShadowplayPassive2 = findViewById<GridLayout>(R.id.gridShadowplayPassive2)
        val gridShadowplay3 = findViewById<GridLayout>(R.id.gridShadowplay3)
        val gridShadowplayPassive3 = findViewById<GridLayout>(R.id.gridShadowplayPassive3)

        val gridVitalism1 = findViewById<GridLayout>(R.id.gridVitalism1)
        val gridVitalismPassive1 = findViewById<GridLayout>(R.id.gridVitalismPassive1)
        val gridVitalism2 = findViewById<GridLayout>(R.id.gridVitalism2)
        val gridVitalismPassive2 = findViewById<GridLayout>(R.id.gridVitalismPassive2)
        val gridVitalism3 = findViewById<GridLayout>(R.id.gridVitalism3)
        val gridVitalismPassive3 = findViewById<GridLayout>(R.id.gridVitalismPassive3)

        val gridMalediction1 = findViewById<GridLayout>(R.id.gridMalediction1)
        val gridMaledictionPassive1 = findViewById<GridLayout>(R.id.gridMaledictionPassive1)
        val gridMalediction2 = findViewById<GridLayout>(R.id.gridMalediction2)
        val gridMaledictionPassive2 = findViewById<GridLayout>(R.id.gridMaledictionPassive2)
        val gridMalediction3 = findViewById<GridLayout>(R.id.gridMalediction3)
        val gridMaledictionPassive3 = findViewById<GridLayout>(R.id.gridMaledictionPassive3)

        val gridSwiftblade1 = findViewById<GridLayout>(R.id.gridSwiftblade1)
        val gridSwiftbladePassive1 = findViewById<GridLayout>(R.id.gridSwiftbladePassive1)
        val gridSwiftblade2 = findViewById<GridLayout>(R.id.gridSwiftblade2)
        val gridSwiftbladePassive2 = findViewById<GridLayout>(R.id.gridSwiftbladePassive2)
        val gridSwiftblade3 = findViewById<GridLayout>(R.id.gridSwiftblade3)
        val gridSwiftbladePassive3 = findViewById<GridLayout>(R.id.gridSwiftbladePassive3)

        val gridGunslinger1 = findViewById<GridLayout>(R.id.gridGunslinger1)
        val gridGunslingerPassive1 = findViewById<GridLayout>(R.id.gridGunslingerPassive1)
        val gridGunslinger2 = findViewById<GridLayout>(R.id.gridGunslinger2)
        val gridGunslingerPassive2 = findViewById<GridLayout>(R.id.gridGunslingerPassive2)
        val gridGunslinger3 = findViewById<GridLayout>(R.id.gridGunslinger3)
        val gridGunslingerPassive3 = findViewById<GridLayout>(R.id.gridGunslingerPassive3)

        val gridSpelldance1 = findViewById<GridLayout>(R.id.gridSpelldance1)
        val gridSpelldancePassive1 = findViewById<GridLayout>(R.id.gridSpelldancePassive1)
        val gridSpelldance2 = findViewById<GridLayout>(R.id.gridSpelldance2)
        val gridSpelldancePassive2 = findViewById<GridLayout>(R.id.gridSpelldancePassive2)
        val gridSpelldance3 = findViewById<GridLayout>(R.id.gridSpelldance3)
        val gridSpelldancePassive3 = findViewById<GridLayout>(R.id.gridSpelldancePassive3)

        val btnReset1 = findViewById<Button>(R.id.btnReset1)
        val btnReset2 = findViewById<Button>(R.id.btnReset2)
        val btnReset3 = findViewById<Button>(R.id.btnReset3)
        //endregion


        //region Text Values
        val tvPanel1Title = findViewById<TextView>(R.id.tvPanel1Title)
        val tvPanel2Title = findViewById<TextView>(R.id.tvPanel2Title)
        val tvPanel3Title = findViewById<TextView>(R.id.tvPanel3Title)
        val tvPointsLeft = findViewById<TextView>(R.id.tvPointsLeft)
        tvPointsLeft.text = " ${skillPoints} points left"
        val skillPoints1Text = findViewById<TextView>(R.id.skillPointsText)
        val skillPoints2Text = findViewById<TextView>(R.id.skillPointsText2)
        val skillPoints3Text = findViewById<TextView>(R.id.skillPointsText3)
        skillPoints1Text.text = " ${skillTree1Points} / 12"
        skillPoints2Text.text = " ${skillTree2Points} / 12"
        skillPoints3Text.text = " ${skillTree3Points} / 12"
        
        val combatText1 = findViewById<TextView>(R.id.combatText1)
        val passiveText1 = findViewById<TextView>(R.id.passiveText1)
        val battlerageText1 = findViewById<TextView>(R.id.battlerageText1)
        val archeryText1 = findViewById<TextView>(R.id.archeryText1)
        val defenseText1 = findViewById<TextView>(R.id.defenseText1)
        val occultismText1 = findViewById<TextView>(R.id.occultismText1)
        val sorceryText1 = findViewById<TextView>(R.id.sorceryText1)
        val songcraftText1 = findViewById<TextView>(R.id.songcraftText1)
        val witchcraftText1 = findViewById<TextView>(R.id.witchcraftText1)
        val auramancyText1 = findViewById<TextView>(R.id.auramancyText1)
        val shadowplayText1 = findViewById<TextView>(R.id.shadowplayText1)
        val vitalismText1 = findViewById<TextView>(R.id.vitalismText1)
        val maledictionText1 = findViewById<TextView>(R.id.maledictionText1)
        val swiftbladeText1 = findViewById<TextView>(R.id.swiftbladeText1)
        val gunslingerText1 = findViewById<TextView>(R.id.gunslingerText1)
        val spelldanceText1 = findViewById<TextView>(R.id.spelldanceText1)

        val combatText2 = findViewById<TextView>(R.id.combatText2)
        val passiveText2 = findViewById<TextView>(R.id.passiveText2)
        val battlerageText2 = findViewById<TextView>(R.id.battlerageText2)
        val archeryText2 = findViewById<TextView>(R.id.archeryText2)
        val defenseText2 = findViewById<TextView>(R.id.defenseText2)
        val occultismText2 = findViewById<TextView>(R.id.occultismText2)
        val sorceryText2 = findViewById<TextView>(R.id.sorceryText2)
        val songcraftText2 = findViewById<TextView>(R.id.songcraftText2)
        val witchcraftText2 = findViewById<TextView>(R.id.witchcraftText2)
        val auramancyText2 = findViewById<TextView>(R.id.auramancyText2)
        val shadowplayText2 = findViewById<TextView>(R.id.shadowplayText2)
        val vitalismText2 = findViewById<TextView>(R.id.vitalismText2)
        val maledictionText2 = findViewById<TextView>(R.id.maledictionText2)
        val swiftbladeText2 = findViewById<TextView>(R.id.swiftbladeText2)
        val gunslingerText2 = findViewById<TextView>(R.id.gunslingerText2)
        val spelldanceText2 = findViewById<TextView>(R.id.spelldanceText2)

        val combatText3 = findViewById<TextView>(R.id.combatText3)
        val passiveText3 = findViewById<TextView>(R.id.passiveText3)
        val battlerageText3 = findViewById<TextView>(R.id.battlerageText3)
        val archeryText3 = findViewById<TextView>(R.id.archeryText3)
        val defenseText3 = findViewById<TextView>(R.id.defenseText3)
        val occultismText3 = findViewById<TextView>(R.id.occultismText3)
        val sorceryText3 = findViewById<TextView>(R.id.sorceryText3)
        val songcraftText3 = findViewById<TextView>(R.id.songcraftText3)
        val witchcraftText3 = findViewById<TextView>(R.id.witchcraftText3)
        val auramancyText3 = findViewById<TextView>(R.id.auramancyText3)
        val shadowplayText3 = findViewById<TextView>(R.id.shadowplayText3)
        val vitalismText3 = findViewById<TextView>(R.id.vitalismText3)
        val maledictionText3 = findViewById<TextView>(R.id.maledictionText3)
        val swiftbladeText3 = findViewById<TextView>(R.id.swiftbladeText3)
        val gunslingerText3 = findViewById<TextView>(R.id.gunslingerText3)
        val spelldanceText3 = findViewById<TextView>(R.id.spelldanceText3)
        //endregion


        //region Battlerage Skill Values Panel 1
        val btnBattlerage1_1 = findViewById<ImageButton>(R.id.btnBattlerage1_1)
        btnBattlerage1_1.alpha = 0.3f
        val btnBattlerage1_2 = findViewById<ImageButton>(R.id.btnBattlerage1_2)
        btnBattlerage1_2.alpha = 0.3f
        val btnBattlerage1_3 = findViewById<ImageButton>(R.id.btnBattlerage1_3)
        btnBattlerage1_3.alpha = 0.3f
        val btnBattlerage1_4 = findViewById<ImageButton>(R.id.btnBattlerage1_4)
        btnBattlerage1_4.alpha = 0.3f
        btnBattlerage1_4.isEnabled = false
        val btnBattlerage1_5 = findViewById<ImageButton>(R.id.btnBattlerage1_5)
        btnBattlerage1_5.alpha = 0.3f
        val btnBattlerage1_6 = findViewById<ImageButton>(R.id.btnBattlerage1_6)
        btnBattlerage1_6.alpha = 0.3f
        val btnBattlerage1_7 = findViewById<ImageButton>(R.id.btnBattlerage1_7)
        btnBattlerage1_7.alpha = 0.3f
        val btnBattlerage1_8 = findViewById<ImageButton>(R.id.btnBattlerage1_8)
        btnBattlerage1_8.alpha = 0.3f
        btnBattlerage1_8.isEnabled = false
        val btnBattlerage1_9 = findViewById<ImageButton>(R.id.btnBattlerage1_9)
        btnBattlerage1_9.alpha = 0.3f
        val btnBattlerage1_10 = findViewById<ImageButton>(R.id.btnBattlerage1_10)
        btnBattlerage1_10.alpha = 0.3f
        val btnBattlerage1_11 = findViewById<ImageButton>(R.id.btnBattlerage1_11)
        btnBattlerage1_11.alpha = 0.3f
        val btnBattlerage1_12 = findViewById<ImageButton>(R.id.btnBattlerage1_12)
        btnBattlerage1_12.alpha = 0.3f
        btnBattlerage1_12.isEnabled = false
        //endregion

        //region Battlerage Passive Values Panel 1
        val btnBattleragePassive1_1 = findViewById<ImageButton>(R.id.btnBattleragePassive1_1)
        btnBattleragePassive1_1.alpha = 0.3f
        val btnBattleragePassive1_2 = findViewById<ImageButton>(R.id.btnBattleragePassive1_2)
        btnBattleragePassive1_2.alpha = 0.3f
        val btnBattleragePassive1_3 = findViewById<ImageButton>(R.id.btnBattleragePassive1_3)
        btnBattleragePassive1_3.alpha = 0.3f
        val btnBattleragePassive1_4 = findViewById<ImageButton>(R.id.btnBattleragePassive1_4)
        btnBattleragePassive1_4.alpha = 0.3f
        val btnBattleragePassive1_5 = findViewById<ImageButton>(R.id.btnBattleragePassive1_5)
        btnBattleragePassive1_5.alpha = 0.3f
        val btnBattleragePassive1_6 = findViewById<ImageButton>(R.id.btnBattleragePassive1_6)
        btnBattleragePassive1_6.alpha = 0.3f
        //endregion

        //region Battlerage Skill Values Panel 2
        val btnBattlerage2_1 = findViewById<ImageButton>(R.id.btnBattlerage2_1)
        btnBattlerage2_1.alpha = 0.3f
        val btnBattlerage2_2 = findViewById<ImageButton>(R.id.btnBattlerage2_2)
        btnBattlerage2_2.alpha = 0.3f
        val btnBattlerage2_3 = findViewById<ImageButton>(R.id.btnBattlerage2_3)
        btnBattlerage2_3.alpha = 0.3f
        val btnBattlerage2_4 = findViewById<ImageButton>(R.id.btnBattlerage2_4)
        btnBattlerage2_4.alpha = 0.3f
        btnBattlerage2_4.isEnabled = false
        val btnBattlerage2_5 = findViewById<ImageButton>(R.id.btnBattlerage2_5)
        btnBattlerage2_5.alpha = 0.3f
        val btnBattlerage2_6 = findViewById<ImageButton>(R.id.btnBattlerage2_6)
        btnBattlerage2_6.alpha = 0.3f
        val btnBattlerage2_7 = findViewById<ImageButton>(R.id.btnBattlerage2_7)
        btnBattlerage2_7.alpha = 0.3f
        val btnBattlerage2_8 = findViewById<ImageButton>(R.id.btnBattlerage2_8)
        btnBattlerage2_8.alpha = 0.3f
        btnBattlerage2_8.isEnabled = false
        val btnBattlerage2_9 = findViewById<ImageButton>(R.id.btnBattlerage2_9)
        btnBattlerage2_9.alpha = 0.3f
        val btnBattlerage2_10 = findViewById<ImageButton>(R.id.btnBattlerage2_10)
        btnBattlerage2_10.alpha = 0.3f
        val btnBattlerage2_11 = findViewById<ImageButton>(R.id.btnBattlerage2_11)
        btnBattlerage2_11.alpha = 0.3f
        val btnBattlerage2_12 = findViewById<ImageButton>(R.id.btnBattlerage2_12)
        btnBattlerage2_12.alpha = 0.3f
        btnBattlerage2_12.isEnabled = false
        //endregion

        //region Battlerage Passive Values Panel 2
        val btnBattleragePassive2_1 = findViewById<ImageButton>(R.id.btnBattleragePassive2_1)
        btnBattleragePassive2_1.alpha = 0.3f
        val btnBattleragePassive2_2 = findViewById<ImageButton>(R.id.btnBattleragePassive2_2)
        btnBattleragePassive2_2.alpha = 0.3f
        val btnBattleragePassive2_3 = findViewById<ImageButton>(R.id.btnBattleragePassive2_3)
        btnBattleragePassive2_3.alpha = 0.3f
        val btnBattleragePassive2_4 = findViewById<ImageButton>(R.id.btnBattleragePassive2_4)
        btnBattleragePassive2_4.alpha = 0.3f
        val btnBattleragePassive2_5 = findViewById<ImageButton>(R.id.btnBattleragePassive2_5)
        btnBattleragePassive2_5.alpha = 0.3f
        val btnBattleragePassive2_6 = findViewById<ImageButton>(R.id.btnBattleragePassive2_6)
        btnBattleragePassive2_6.alpha = 0.3f
        //endregion

        //region Battlerage Skill Values Panel 3
        val btnBattlerage3_1 = findViewById<ImageButton>(R.id.btnBattlerage3_1)
        btnBattlerage3_1.alpha = 0.3f
        val btnBattlerage3_2 = findViewById<ImageButton>(R.id.btnBattlerage3_2)
        btnBattlerage3_2.alpha = 0.3f
        val btnBattlerage3_3 = findViewById<ImageButton>(R.id.btnBattlerage3_3)
        btnBattlerage3_3.alpha = 0.3f
        val btnBattlerage3_4 = findViewById<ImageButton>(R.id.btnBattlerage3_4)
        btnBattlerage3_4.alpha = 0.3f
        btnBattlerage3_4.isEnabled = false
        val btnBattlerage3_5 = findViewById<ImageButton>(R.id.btnBattlerage3_5)
        btnBattlerage3_5.alpha = 0.3f
        val btnBattlerage3_6 = findViewById<ImageButton>(R.id.btnBattlerage3_6)
        btnBattlerage3_6.alpha = 0.3f
        val btnBattlerage3_7 = findViewById<ImageButton>(R.id.btnBattlerage3_7)
        btnBattlerage3_7.alpha = 0.3f
        val btnBattlerage3_8 = findViewById<ImageButton>(R.id.btnBattlerage3_8)
        btnBattlerage3_8.alpha = 0.3f
        btnBattlerage3_8.isEnabled = false
        val btnBattlerage3_9 = findViewById<ImageButton>(R.id.btnBattlerage3_9)
        btnBattlerage3_9.alpha = 0.3f
        val btnBattlerage3_10 = findViewById<ImageButton>(R.id.btnBattlerage3_10)
        btnBattlerage3_10.alpha = 0.3f
        val btnBattlerage3_11 = findViewById<ImageButton>(R.id.btnBattlerage3_11)
        btnBattlerage3_11.alpha = 0.3f
        val btnBattlerage3_12 = findViewById<ImageButton>(R.id.btnBattlerage3_12)
        btnBattlerage3_12.alpha = 0.3f
        btnBattlerage3_12.isEnabled = false
        //endregion

        //region Battlerage Passive Values Panel 3
        val btnBattleragePassive3_1 = findViewById<ImageButton>(R.id.btnBattleragePassive3_1)
        btnBattleragePassive3_1.alpha = 0.3f
        val btnBattleragePassive3_2 = findViewById<ImageButton>(R.id.btnBattleragePassive3_2)
        btnBattleragePassive3_2.alpha = 0.3f
        val btnBattleragePassive3_3 = findViewById<ImageButton>(R.id.btnBattleragePassive3_3)
        btnBattleragePassive3_3.alpha = 0.3f
        val btnBattleragePassive3_4 = findViewById<ImageButton>(R.id.btnBattleragePassive3_4)
        btnBattleragePassive3_4.alpha = 0.3f
        val btnBattleragePassive3_5 = findViewById<ImageButton>(R.id.btnBattleragePassive3_5)
        btnBattleragePassive3_5.alpha = 0.3f
        val btnBattleragePassive3_6 = findViewById<ImageButton>(R.id.btnBattleragePassive3_6)
        btnBattleragePassive3_6.alpha = 0.3f
        //endregion

        //region Archery Skill Values Panel 1
        val btnArchery1_1 = findViewById<ImageButton>(R.id.btnArchery1_1)
        btnArchery1_1.alpha = 0.3f
        val btnArchery1_2 = findViewById<ImageButton>(R.id.btnArchery1_2)
        btnArchery1_2.alpha = 0.3f
        val btnArchery1_3 = findViewById<ImageButton>(R.id.btnArchery1_3)
        btnArchery1_3.alpha = 0.3f
        val btnArchery1_4 = findViewById<ImageButton>(R.id.btnArchery1_4)
        btnArchery1_4.alpha = 0.3f
        btnArchery1_4.isEnabled = false
        val btnArchery1_5 = findViewById<ImageButton>(R.id.btnArchery1_5)
        btnArchery1_5.alpha = 0.3f
        val btnArchery1_6 = findViewById<ImageButton>(R.id.btnArchery1_6)
        btnArchery1_6.alpha = 0.3f
        val btnArchery1_7 = findViewById<ImageButton>(R.id.btnArchery1_7)
        btnArchery1_7.alpha = 0.3f
        val btnArchery1_8 = findViewById<ImageButton>(R.id.btnArchery1_8)
        btnArchery1_8.alpha = 0.3f
        btnArchery1_8.isEnabled = false
        val btnArchery1_9 = findViewById<ImageButton>(R.id.btnArchery1_9)
        btnArchery1_9.alpha = 0.3f
        val btnArchery1_10 = findViewById<ImageButton>(R.id.btnArchery1_10)
        btnArchery1_10.alpha = 0.3f
        val btnArchery1_11 = findViewById<ImageButton>(R.id.btnArchery1_11)
        btnArchery1_11.alpha = 0.3f
        val btnArchery1_12 = findViewById<ImageButton>(R.id.btnArchery1_12)
        btnArchery1_12.alpha = 0.3f
        btnArchery1_12.isEnabled = false
        //endregion

        //region Archery Passive Values Panel 1
        val btnArcheryPassive1_1 = findViewById<ImageButton>(R.id.btnArcheryPassive1_1)
        btnArcheryPassive1_1.alpha = 0.3f
        val btnArcheryPassive1_2 = findViewById<ImageButton>(R.id.btnArcheryPassive1_2)
        btnArcheryPassive1_2.alpha = 0.3f
        val btnArcheryPassive1_3 = findViewById<ImageButton>(R.id.btnArcheryPassive1_3)
        btnArcheryPassive1_3.alpha = 0.3f
        val btnArcheryPassive1_4 = findViewById<ImageButton>(R.id.btnArcheryPassive1_4)
        btnArcheryPassive1_4.alpha = 0.3f
        val btnArcheryPassive1_5 = findViewById<ImageButton>(R.id.btnArcheryPassive1_5)
        btnArcheryPassive1_5.alpha = 0.3f
        val btnArcheryPassive1_6 = findViewById<ImageButton>(R.id.btnArcheryPassive1_6)
        btnArcheryPassive1_6.alpha = 0.3f
        //endregion

        //region Archery Skill Values Panel 2
        val btnArchery2_1 = findViewById<ImageButton>(R.id.btnArchery2_1)
        btnArchery2_1.alpha = 0.3f
        val btnArchery2_2 = findViewById<ImageButton>(R.id.btnArchery2_2)
        btnArchery2_2.alpha = 0.3f
        val btnArchery2_3 = findViewById<ImageButton>(R.id.btnArchery2_3)
        btnArchery2_3.alpha = 0.3f
        val btnArchery2_4 = findViewById<ImageButton>(R.id.btnArchery2_4)
        btnArchery2_4.alpha = 0.3f
        btnArchery2_4.isEnabled = false
        val btnArchery2_5 = findViewById<ImageButton>(R.id.btnArchery2_5)
        btnArchery2_5.alpha = 0.3f
        val btnArchery2_6 = findViewById<ImageButton>(R.id.btnArchery2_6)
        btnArchery2_6.alpha = 0.3f
        val btnArchery2_7 = findViewById<ImageButton>(R.id.btnArchery2_7)
        btnArchery2_7.alpha = 0.3f
        val btnArchery2_8 = findViewById<ImageButton>(R.id.btnArchery2_8)
        btnArchery2_8.alpha = 0.3f
        btnArchery2_8.isEnabled = false
        val btnArchery2_9 = findViewById<ImageButton>(R.id.btnArchery2_9)
        btnArchery2_9.alpha = 0.3f
        val btnArchery2_10 = findViewById<ImageButton>(R.id.btnArchery2_10)
        btnArchery2_10.alpha = 0.3f
        val btnArchery2_11 = findViewById<ImageButton>(R.id.btnArchery2_11)
        btnArchery2_11.alpha = 0.3f
        val btnArchery2_12 = findViewById<ImageButton>(R.id.btnArchery2_12)
        btnArchery2_12.alpha = 0.3f
        btnArchery2_12.isEnabled = false
        //endregion

        //region Archery Passive Values Panel 2
        val btnArcheryPassive2_1 = findViewById<ImageButton>(R.id.btnArcheryPassive2_1)
        btnArcheryPassive2_1.alpha = 0.3f
        val btnArcheryPassive2_2 = findViewById<ImageButton>(R.id.btnArcheryPassive2_2)
        btnArcheryPassive2_2.alpha = 0.3f
        val btnArcheryPassive2_3 = findViewById<ImageButton>(R.id.btnArcheryPassive2_3)
        btnArcheryPassive2_3.alpha = 0.3f
        val btnArcheryPassive2_4 = findViewById<ImageButton>(R.id.btnArcheryPassive2_4)
        btnArcheryPassive2_4.alpha = 0.3f
        val btnArcheryPassive2_5 = findViewById<ImageButton>(R.id.btnArcheryPassive2_5)
        btnArcheryPassive2_5.alpha = 0.3f
        val btnArcheryPassive2_6 = findViewById<ImageButton>(R.id.btnArcheryPassive2_6)
        btnArcheryPassive2_6.alpha = 0.3f
        //endregion

        //region Archery Skill Values Panel 3
        val btnArchery3_1 = findViewById<ImageButton>(R.id.btnArchery3_1)
        btnArchery3_1.alpha = 0.3f
        val btnArchery3_2 = findViewById<ImageButton>(R.id.btnArchery3_2)
        btnArchery3_2.alpha = 0.3f
        val btnArchery3_3 = findViewById<ImageButton>(R.id.btnArchery3_3)
        btnArchery3_3.alpha = 0.3f
        val btnArchery3_4 = findViewById<ImageButton>(R.id.btnArchery3_4)
        btnArchery3_4.alpha = 0.3f
        btnArchery3_4.isEnabled = false
        val btnArchery3_5 = findViewById<ImageButton>(R.id.btnArchery3_5)
        btnArchery3_5.alpha = 0.3f
        val btnArchery3_6 = findViewById<ImageButton>(R.id.btnArchery3_6)
        btnArchery3_6.alpha = 0.3f
        val btnArchery3_7 = findViewById<ImageButton>(R.id.btnArchery3_7)
        btnArchery3_7.alpha = 0.3f
        val btnArchery3_8 = findViewById<ImageButton>(R.id.btnArchery3_8)
        btnArchery3_8.alpha = 0.3f
        btnArchery3_8.isEnabled = false
        val btnArchery3_9 = findViewById<ImageButton>(R.id.btnArchery3_9)
        btnArchery3_9.alpha = 0.3f
        val btnArchery3_10 = findViewById<ImageButton>(R.id.btnArchery3_10)
        btnArchery3_10.alpha = 0.3f
        val btnArchery3_11 = findViewById<ImageButton>(R.id.btnArchery3_11)
        btnArchery3_11.alpha = 0.3f
        val btnArchery3_12 = findViewById<ImageButton>(R.id.btnArchery3_12)
        btnArchery3_12.alpha = 0.3f
        btnArchery3_12.isEnabled = false
        //endregion

        //region Archery Passive Values Panel 3
        val btnArcheryPassive3_1 = findViewById<ImageButton>(R.id.btnArcheryPassive3_1)
        btnArcheryPassive3_1.alpha = 0.3f
        val btnArcheryPassive3_2 = findViewById<ImageButton>(R.id.btnArcheryPassive3_2)
        btnArcheryPassive3_2.alpha = 0.3f
        val btnArcheryPassive3_3 = findViewById<ImageButton>(R.id.btnArcheryPassive3_3)
        btnArcheryPassive3_3.alpha = 0.3f
        val btnArcheryPassive3_4 = findViewById<ImageButton>(R.id.btnArcheryPassive3_4)
        btnArcheryPassive3_4.alpha = 0.3f
        val btnArcheryPassive3_5 = findViewById<ImageButton>(R.id.btnArcheryPassive3_5)
        btnArcheryPassive3_5.alpha = 0.3f
        val btnArcheryPassive3_6 = findViewById<ImageButton>(R.id.btnArcheryPassive3_6)
        btnArcheryPassive3_6.alpha = 0.3f
        //endregion

        //region Defense Skill Values Panel 1
        val btnDefense1_1 = findViewById<ImageButton>(R.id.btnDefense1_1)
        btnDefense1_1.alpha = 0.3f
        val btnDefense1_2 = findViewById<ImageButton>(R.id.btnDefense1_2)
        btnDefense1_2.alpha = 0.3f
        val btnDefense1_3 = findViewById<ImageButton>(R.id.btnDefense1_3)
        btnDefense1_3.alpha = 0.3f
        val btnDefense1_4 = findViewById<ImageButton>(R.id.btnDefense1_4)
        btnDefense1_4.alpha = 0.3f
        val btnDefense1_5 = findViewById<ImageButton>(R.id.btnDefense1_5)
        btnDefense1_5.alpha = 0.3f
        val btnDefense1_6 = findViewById<ImageButton>(R.id.btnDefense1_6)
        btnDefense1_6.alpha = 0.3f
        val btnDefense1_7 = findViewById<ImageButton>(R.id.btnDefense1_7)
        btnDefense1_7.alpha = 0.3f
        val btnDefense1_8 = findViewById<ImageButton>(R.id.btnDefense1_8)
        btnDefense1_8.alpha = 0.3f
        val btnDefense1_9 = findViewById<ImageButton>(R.id.btnDefense1_9)
        btnDefense1_9.alpha = 0.3f
        val btnDefense1_10 = findViewById<ImageButton>(R.id.btnDefense1_10)
        btnDefense1_10.alpha = 0.3f
        val btnDefense1_11 = findViewById<ImageButton>(R.id.btnDefense1_11)
        btnDefense1_11.alpha = 0.3f
        val btnDefense1_12 = findViewById<ImageButton>(R.id.btnDefense1_12)
        btnDefense1_12.alpha = 0.3f

        //endregion

        //region Defense Passive Values Panel 1
        val btnDefensePassive1_1 = findViewById<ImageButton>(R.id.btnDefensePassive1_1)
        btnDefensePassive1_1.alpha = 0.3f
        val btnDefensePassive1_2 = findViewById<ImageButton>(R.id.btnDefensePassive1_2)
        btnDefensePassive1_2.alpha = 0.3f
        val btnDefensePassive1_3 = findViewById<ImageButton>(R.id.btnDefensePassive1_3)
        btnDefensePassive1_3.alpha = 0.3f
        val btnDefensePassive1_4 = findViewById<ImageButton>(R.id.btnDefensePassive1_4)
        btnDefensePassive1_4.alpha = 0.3f
        val btnDefensePassive1_5 = findViewById<ImageButton>(R.id.btnDefensePassive1_5)
        btnDefensePassive1_5.alpha = 0.3f
        val btnDefensePassive1_6 = findViewById<ImageButton>(R.id.btnDefensePassive1_6)
        btnDefensePassive1_6.alpha = 0.3f
        //endregion

        //region Defense Skill Values Panel 2
        val btnDefense2_1 = findViewById<ImageButton>(R.id.btnDefense2_1)
        btnDefense2_1.alpha = 0.3f
        val btnDefense2_2 = findViewById<ImageButton>(R.id.btnDefense2_2)
        btnDefense2_2.alpha = 0.3f
        val btnDefense2_3 = findViewById<ImageButton>(R.id.btnDefense2_3)
        btnDefense2_3.alpha = 0.3f
        val btnDefense2_4 = findViewById<ImageButton>(R.id.btnDefense2_4)
        btnDefense2_4.alpha = 0.3f
        val btnDefense2_5 = findViewById<ImageButton>(R.id.btnDefense2_5)
        btnDefense2_5.alpha = 0.3f
        val btnDefense2_6 = findViewById<ImageButton>(R.id.btnDefense2_6)
        btnDefense2_6.alpha = 0.3f
        val btnDefense2_7 = findViewById<ImageButton>(R.id.btnDefense2_7)
        btnDefense2_7.alpha = 0.3f
        val btnDefense2_8 = findViewById<ImageButton>(R.id.btnDefense2_8)
        btnDefense2_8.alpha = 0.3f
        val btnDefense2_9 = findViewById<ImageButton>(R.id.btnDefense2_9)
        btnDefense2_9.alpha = 0.3f
        val btnDefense2_10 = findViewById<ImageButton>(R.id.btnDefense2_10)
        btnDefense2_10.alpha = 0.3f
        val btnDefense2_11 = findViewById<ImageButton>(R.id.btnDefense2_11)
        btnDefense2_11.alpha = 0.3f
        val btnDefense2_12 = findViewById<ImageButton>(R.id.btnDefense2_12)
        btnDefense2_12.alpha = 0.3f

        //endregion

        //region Defense Passive Values Panel 2
        val btnDefensePassive2_1 = findViewById<ImageButton>(R.id.btnDefensePassive2_1)
        btnDefensePassive2_1.alpha = 0.3f
        val btnDefensePassive2_2 = findViewById<ImageButton>(R.id.btnDefensePassive2_2)
        btnDefensePassive2_2.alpha = 0.3f
        val btnDefensePassive2_3 = findViewById<ImageButton>(R.id.btnDefensePassive2_3)
        btnDefensePassive2_3.alpha = 0.3f
        val btnDefensePassive2_4 = findViewById<ImageButton>(R.id.btnDefensePassive2_4)
        btnDefensePassive2_4.alpha = 0.3f
        val btnDefensePassive2_5 = findViewById<ImageButton>(R.id.btnDefensePassive2_5)
        btnDefensePassive2_5.alpha = 0.3f
        val btnDefensePassive2_6 = findViewById<ImageButton>(R.id.btnDefensePassive2_6)
        btnDefensePassive2_6.alpha = 0.3f
        //endregion

        //region Defense Skill Values Panel 3
        val btnDefense3_1 = findViewById<ImageButton>(R.id.btnDefense3_1)
        btnDefense3_1.alpha = 0.3f
        val btnDefense3_2 = findViewById<ImageButton>(R.id.btnDefense3_2)
        btnDefense3_2.alpha = 0.3f
        val btnDefense3_3 = findViewById<ImageButton>(R.id.btnDefense3_3)
        btnDefense3_3.alpha = 0.3f
        val btnDefense3_4 = findViewById<ImageButton>(R.id.btnDefense3_4)
        btnDefense3_4.alpha = 0.3f
        val btnDefense3_5 = findViewById<ImageButton>(R.id.btnDefense3_5)
        btnDefense3_5.alpha = 0.3f
        val btnDefense3_6 = findViewById<ImageButton>(R.id.btnDefense3_6)
        btnDefense3_6.alpha = 0.3f
        val btnDefense3_7 = findViewById<ImageButton>(R.id.btnDefense3_7)
        btnDefense3_7.alpha = 0.3f
        val btnDefense3_8 = findViewById<ImageButton>(R.id.btnDefense3_8)
        btnDefense3_8.alpha = 0.3f
        val btnDefense3_9 = findViewById<ImageButton>(R.id.btnDefense3_9)
        btnDefense3_9.alpha = 0.3f
        val btnDefense3_10 = findViewById<ImageButton>(R.id.btnDefense3_10)
        btnDefense3_10.alpha = 0.3f
        val btnDefense3_11 = findViewById<ImageButton>(R.id.btnDefense3_11)
        btnDefense3_11.alpha = 0.3f
        val btnDefense3_12 = findViewById<ImageButton>(R.id.btnDefense3_12)
        btnDefense3_12.alpha = 0.3f

        //endregion

        //region Defense Passive Values Panel 3
        val btnDefensePassive3_1 = findViewById<ImageButton>(R.id.btnDefensePassive3_1)
        btnDefensePassive3_1.alpha = 0.3f
        val btnDefensePassive3_2 = findViewById<ImageButton>(R.id.btnDefensePassive3_2)
        btnDefensePassive3_2.alpha = 0.3f
        val btnDefensePassive3_3 = findViewById<ImageButton>(R.id.btnDefensePassive3_3)
        btnDefensePassive3_3.alpha = 0.3f
        val btnDefensePassive3_4 = findViewById<ImageButton>(R.id.btnDefensePassive3_4)
        btnDefensePassive3_4.alpha = 0.3f
        val btnDefensePassive3_5 = findViewById<ImageButton>(R.id.btnDefensePassive3_5)
        btnDefensePassive3_5.alpha = 0.3f
        val btnDefensePassive3_6 = findViewById<ImageButton>(R.id.btnDefensePassive3_6)
        btnDefensePassive3_6.alpha = 0.3f
        //endregion

        //region Occultism Skill Values Panel 1
        val btnOccultism1_1 = findViewById<ImageButton>(R.id.btnOccultism1_1)
        btnOccultism1_1.alpha = 0.3f
        val btnOccultism1_2 = findViewById<ImageButton>(R.id.btnOccultism1_2)
        btnOccultism1_2.alpha = 0.3f
        val btnOccultism1_3 = findViewById<ImageButton>(R.id.btnOccultism1_3)
        btnOccultism1_3.alpha = 0.3f
        val btnOccultism1_4 = findViewById<ImageButton>(R.id.btnOccultism1_4)
        btnOccultism1_4.alpha = 0.3f
        val btnOccultism1_5 = findViewById<ImageButton>(R.id.btnOccultism1_5)
        btnOccultism1_5.alpha = 0.3f
        val btnOccultism1_6 = findViewById<ImageButton>(R.id.btnOccultism1_6)
        btnOccultism1_6.alpha = 0.3f
        val btnOccultism1_7 = findViewById<ImageButton>(R.id.btnOccultism1_7)
        btnOccultism1_7.alpha = 0.3f
        val btnOccultism1_8 = findViewById<ImageButton>(R.id.btnOccultism1_8)
        btnOccultism1_8.alpha = 0.3f
        val btnOccultism1_9 = findViewById<ImageButton>(R.id.btnOccultism1_9)
        btnOccultism1_9.alpha = 0.3f
        val btnOccultism1_10 = findViewById<ImageButton>(R.id.btnOccultism1_10)
        btnOccultism1_10.alpha = 0.3f
        val btnOccultism1_11 = findViewById<ImageButton>(R.id.btnOccultism1_11)
        btnOccultism1_11.alpha = 0.3f
        val btnOccultism1_12 = findViewById<ImageButton>(R.id.btnOccultism1_12)
        btnOccultism1_12.alpha = 0.3f
        //endregion

        //region Occultism Passive Values Panel 1
        val btnOccultismPassive1_1 = findViewById<ImageButton>(R.id.btnOccultismPassive1_1)
        btnOccultismPassive1_1.alpha = 0.3f
        val btnOccultismPassive1_2 = findViewById<ImageButton>(R.id.btnOccultismPassive1_2)
        btnOccultismPassive1_2.alpha = 0.3f
        val btnOccultismPassive1_3 = findViewById<ImageButton>(R.id.btnOccultismPassive1_3)
        btnOccultismPassive1_3.alpha = 0.3f
        val btnOccultismPassive1_4 = findViewById<ImageButton>(R.id.btnOccultismPassive1_4)
        btnOccultismPassive1_4.alpha = 0.3f
        val btnOccultismPassive1_5 = findViewById<ImageButton>(R.id.btnOccultismPassive1_5)
        btnOccultismPassive1_5.alpha = 0.3f
        val btnOccultismPassive1_6 = findViewById<ImageButton>(R.id.btnOccultismPassive1_6)
        btnOccultismPassive1_6.alpha = 0.3f
        //endregion

        //region Occultism Skill Values Panel 2
        val btnOccultism2_1 = findViewById<ImageButton>(R.id.btnOccultism2_1)
        btnOccultism2_1.alpha = 0.3f
        val btnOccultism2_2 = findViewById<ImageButton>(R.id.btnOccultism2_2)
        btnOccultism2_2.alpha = 0.3f
        val btnOccultism2_3 = findViewById<ImageButton>(R.id.btnOccultism2_3)
        btnOccultism2_3.alpha = 0.3f
        val btnOccultism2_4 = findViewById<ImageButton>(R.id.btnOccultism2_4)
        btnOccultism2_4.alpha = 0.3f
        val btnOccultism2_5 = findViewById<ImageButton>(R.id.btnOccultism2_5)
        btnOccultism2_5.alpha = 0.3f
        val btnOccultism2_6 = findViewById<ImageButton>(R.id.btnOccultism2_6)
        btnOccultism2_6.alpha = 0.3f
        val btnOccultism2_7 = findViewById<ImageButton>(R.id.btnOccultism2_7)
        btnOccultism2_7.alpha = 0.3f
        val btnOccultism2_8 = findViewById<ImageButton>(R.id.btnOccultism2_8)
        btnOccultism2_8.alpha = 0.3f
        val btnOccultism2_9 = findViewById<ImageButton>(R.id.btnOccultism2_9)
        btnOccultism2_9.alpha = 0.3f
        val btnOccultism2_10 = findViewById<ImageButton>(R.id.btnOccultism2_10)
        btnOccultism2_10.alpha = 0.3f
        val btnOccultism2_11 = findViewById<ImageButton>(R.id.btnOccultism2_11)
        btnOccultism2_11.alpha = 0.3f
        val btnOccultism2_12 = findViewById<ImageButton>(R.id.btnOccultism2_12)
        btnOccultism2_12.alpha = 0.3f
        //endregion

        //region Occultism Passive Values Panel 2
        val btnOccultismPassive2_1 = findViewById<ImageButton>(R.id.btnOccultismPassive2_1)
        btnOccultismPassive2_1.alpha = 0.3f
        val btnOccultismPassive2_2 = findViewById<ImageButton>(R.id.btnOccultismPassive2_2)
        btnOccultismPassive2_2.alpha = 0.3f
        val btnOccultismPassive2_3 = findViewById<ImageButton>(R.id.btnOccultismPassive2_3)
        btnOccultismPassive2_3.alpha = 0.3f
        val btnOccultismPassive2_4 = findViewById<ImageButton>(R.id.btnOccultismPassive2_4)
        btnOccultismPassive2_4.alpha = 0.3f
        val btnOccultismPassive2_5 = findViewById<ImageButton>(R.id.btnOccultismPassive2_5)
        btnOccultismPassive2_5.alpha = 0.3f
        val btnOccultismPassive2_6 = findViewById<ImageButton>(R.id.btnOccultismPassive2_6)
        btnOccultismPassive2_6.alpha = 0.3f
        //endregion

        //region Occultism Skill Values Panel 3
        val btnOccultism3_1 = findViewById<ImageButton>(R.id.btnOccultism3_1)
        btnOccultism3_1.alpha = 0.3f
        val btnOccultism3_2 = findViewById<ImageButton>(R.id.btnOccultism3_2)
        btnOccultism3_2.alpha = 0.3f
        val btnOccultism3_3 = findViewById<ImageButton>(R.id.btnOccultism3_3)
        btnOccultism3_3.alpha = 0.3f
        val btnOccultism3_4 = findViewById<ImageButton>(R.id.btnOccultism3_4)
        btnOccultism3_4.alpha = 0.3f
        val btnOccultism3_5 = findViewById<ImageButton>(R.id.btnOccultism3_5)
        btnOccultism3_5.alpha = 0.3f
        val btnOccultism3_6 = findViewById<ImageButton>(R.id.btnOccultism3_6)
        btnOccultism3_6.alpha = 0.3f
        val btnOccultism3_7 = findViewById<ImageButton>(R.id.btnOccultism3_7)
        btnOccultism3_7.alpha = 0.3f
        val btnOccultism3_8 = findViewById<ImageButton>(R.id.btnOccultism3_8)
        btnOccultism3_8.alpha = 0.3f
        val btnOccultism3_9 = findViewById<ImageButton>(R.id.btnOccultism3_9)
        btnOccultism3_9.alpha = 0.3f
        val btnOccultism3_10 = findViewById<ImageButton>(R.id.btnOccultism3_10)
        btnOccultism3_10.alpha = 0.3f
        val btnOccultism3_11 = findViewById<ImageButton>(R.id.btnOccultism3_11)
        btnOccultism3_11.alpha = 0.3f
        val btnOccultism3_12 = findViewById<ImageButton>(R.id.btnOccultism3_12)
        btnOccultism3_12.alpha = 0.3f
        //endregion

        //region Occultism Passive Values Panel 3
        val btnOccultismPassive3_1 = findViewById<ImageButton>(R.id.btnOccultismPassive3_1)
        btnOccultismPassive3_1.alpha = 0.3f
        val btnOccultismPassive3_2 = findViewById<ImageButton>(R.id.btnOccultismPassive3_2)
        btnOccultismPassive3_2.alpha = 0.3f
        val btnOccultismPassive3_3 = findViewById<ImageButton>(R.id.btnOccultismPassive3_3)
        btnOccultismPassive3_3.alpha = 0.3f
        val btnOccultismPassive3_4 = findViewById<ImageButton>(R.id.btnOccultismPassive3_4)
        btnOccultismPassive3_4.alpha = 0.3f
        val btnOccultismPassive3_5 = findViewById<ImageButton>(R.id.btnOccultismPassive3_5)
        btnOccultismPassive3_5.alpha = 0.3f
        val btnOccultismPassive3_6 = findViewById<ImageButton>(R.id.btnOccultismPassive3_6)
        btnOccultismPassive3_6.alpha = 0.3f
        //endregion

        //region Sorcery Skill Values Panel 1
        val btnSorcery1_1 = findViewById<ImageButton>(R.id.btnSorcery1_1)
        btnSorcery1_1.alpha = 0.3f
        val btnSorcery1_2 = findViewById<ImageButton>(R.id.btnSorcery1_2)
        btnSorcery1_2.alpha = 0.3f
        val btnSorcery1_3 = findViewById<ImageButton>(R.id.btnSorcery1_3)
        btnSorcery1_3.alpha = 0.3f
        val btnSorcery1_4 = findViewById<ImageButton>(R.id.btnSorcery1_4)
        btnSorcery1_4.alpha = 0.3f
        val btnSorcery1_5 = findViewById<ImageButton>(R.id.btnSorcery1_5)
        btnSorcery1_5.alpha = 0.3f
        val btnSorcery1_6 = findViewById<ImageButton>(R.id.btnSorcery1_6)
        btnSorcery1_6.alpha = 0.3f
        val btnSorcery1_7 = findViewById<ImageButton>(R.id.btnSorcery1_7)
        btnSorcery1_7.alpha = 0.3f
        val btnSorcery1_8 = findViewById<ImageButton>(R.id.btnSorcery1_8)
        btnSorcery1_8.alpha = 0.3f
        val btnSorcery1_9 = findViewById<ImageButton>(R.id.btnSorcery1_9)
        btnSorcery1_9.alpha = 0.3f
        val btnSorcery1_10 = findViewById<ImageButton>(R.id.btnSorcery1_10)
        btnSorcery1_10.alpha = 0.3f
        val btnSorcery1_11 = findViewById<ImageButton>(R.id.btnSorcery1_11)
        btnSorcery1_11.alpha = 0.3f
        val btnSorcery1_12 = findViewById<ImageButton>(R.id.btnSorcery1_12)
        btnSorcery1_12.alpha = 0.3f

        //endregion

        //region Sorcery Passive Values Panel 1
        val btnSorceryPassive1_1 = findViewById<ImageButton>(R.id.btnSorceryPassive1_1)
        btnSorceryPassive1_1.alpha = 0.3f
        val btnSorceryPassive1_2 = findViewById<ImageButton>(R.id.btnSorceryPassive1_2)
        btnSorceryPassive1_2.alpha = 0.3f
        val btnSorceryPassive1_3 = findViewById<ImageButton>(R.id.btnSorceryPassive1_3)
        btnSorceryPassive1_3.alpha = 0.3f
        val btnSorceryPassive1_4 = findViewById<ImageButton>(R.id.btnSorceryPassive1_4)
        btnSorceryPassive1_4.alpha = 0.3f
        val btnSorceryPassive1_5 = findViewById<ImageButton>(R.id.btnSorceryPassive1_5)
        btnSorceryPassive1_5.alpha = 0.3f
        val btnSorceryPassive1_6 = findViewById<ImageButton>(R.id.btnSorceryPassive1_6)
        btnSorceryPassive1_6.alpha = 0.3f

        //endregion

        //region Sorcery Skill Values Panel 2
        val btnSorcery2_1 = findViewById<ImageButton>(R.id.btnSorcery2_1)
        btnSorcery2_1.alpha = 0.3f
        val btnSorcery2_2 = findViewById<ImageButton>(R.id.btnSorcery2_2)
        btnSorcery2_2.alpha = 0.3f
        val btnSorcery2_3 = findViewById<ImageButton>(R.id.btnSorcery2_3)
        btnSorcery2_3.alpha = 0.3f
        val btnSorcery2_4 = findViewById<ImageButton>(R.id.btnSorcery2_4)
        btnSorcery2_4.alpha = 0.3f
        val btnSorcery2_5 = findViewById<ImageButton>(R.id.btnSorcery2_5)
        btnSorcery2_5.alpha = 0.3f
        val btnSorcery2_6 = findViewById<ImageButton>(R.id.btnSorcery2_6)
        btnSorcery2_6.alpha = 0.3f
        val btnSorcery2_7 = findViewById<ImageButton>(R.id.btnSorcery2_7)
        btnSorcery2_7.alpha = 0.3f
        val btnSorcery2_8 = findViewById<ImageButton>(R.id.btnSorcery2_8)
        btnSorcery2_8.alpha = 0.3f
        val btnSorcery2_9 = findViewById<ImageButton>(R.id.btnSorcery2_9)
        btnSorcery2_9.alpha = 0.3f
        val btnSorcery2_10 = findViewById<ImageButton>(R.id.btnSorcery2_10)
        btnSorcery2_10.alpha = 0.3f
        val btnSorcery2_11 = findViewById<ImageButton>(R.id.btnSorcery2_11)
        btnSorcery2_11.alpha = 0.3f
        val btnSorcery2_12 = findViewById<ImageButton>(R.id.btnSorcery2_12)
        btnSorcery2_12.alpha = 0.3f

        //endregion

        //region Sorcery Passive Values Panel 2
        val btnSorceryPassive2_1 = findViewById<ImageButton>(R.id.btnSorceryPassive2_1)
        btnSorceryPassive2_1.alpha = 0.3f
        val btnSorceryPassive2_2 = findViewById<ImageButton>(R.id.btnSorceryPassive2_2)
        btnSorceryPassive2_2.alpha = 0.3f
        val btnSorceryPassive2_3 = findViewById<ImageButton>(R.id.btnSorceryPassive2_3)
        btnSorceryPassive2_3.alpha = 0.3f
        val btnSorceryPassive2_4 = findViewById<ImageButton>(R.id.btnSorceryPassive2_4)
        btnSorceryPassive2_4.alpha = 0.3f
        val btnSorceryPassive2_5 = findViewById<ImageButton>(R.id.btnSorceryPassive2_5)
        btnSorceryPassive2_5.alpha = 0.3f
        val btnSorceryPassive2_6 = findViewById<ImageButton>(R.id.btnSorceryPassive2_6)
        btnSorceryPassive2_6.alpha = 0.3f

        //endregion

        //region Sorcery Skill Values Panel 3
        val btnSorcery3_1 = findViewById<ImageButton>(R.id.btnSorcery3_1)
        btnSorcery3_1.alpha = 0.3f
        val btnSorcery3_2 = findViewById<ImageButton>(R.id.btnSorcery3_2)
        btnSorcery3_2.alpha = 0.3f
        val btnSorcery3_3 = findViewById<ImageButton>(R.id.btnSorcery3_3)
        btnSorcery3_3.alpha = 0.3f
        val btnSorcery3_4 = findViewById<ImageButton>(R.id.btnSorcery3_4)
        btnSorcery3_4.alpha = 0.3f
        val btnSorcery3_5 = findViewById<ImageButton>(R.id.btnSorcery3_5)
        btnSorcery3_5.alpha = 0.3f
        val btnSorcery3_6 = findViewById<ImageButton>(R.id.btnSorcery3_6)
        btnSorcery3_6.alpha = 0.3f
        val btnSorcery3_7 = findViewById<ImageButton>(R.id.btnSorcery3_7)
        btnSorcery3_7.alpha = 0.3f
        val btnSorcery3_8 = findViewById<ImageButton>(R.id.btnSorcery3_8)
        btnSorcery3_8.alpha = 0.3f
        val btnSorcery3_9 = findViewById<ImageButton>(R.id.btnSorcery3_9)
        btnSorcery3_9.alpha = 0.3f
        val btnSorcery3_10 = findViewById<ImageButton>(R.id.btnSorcery3_10)
        btnSorcery3_10.alpha = 0.3f
        val btnSorcery3_11 = findViewById<ImageButton>(R.id.btnSorcery3_11)
        btnSorcery3_11.alpha = 0.3f
        val btnSorcery3_12 = findViewById<ImageButton>(R.id.btnSorcery3_12)
        btnSorcery3_12.alpha = 0.3f

        //endregion

        //region Sorcery Passive Values Panel 3
        val btnSorceryPassive3_1 = findViewById<ImageButton>(R.id.btnSorceryPassive3_1)
        btnSorceryPassive3_1.alpha = 0.3f
        val btnSorceryPassive3_2 = findViewById<ImageButton>(R.id.btnSorceryPassive3_2)
        btnSorceryPassive3_2.alpha = 0.3f
        val btnSorceryPassive3_3 = findViewById<ImageButton>(R.id.btnSorceryPassive3_3)
        btnSorceryPassive3_3.alpha = 0.3f
        val btnSorceryPassive3_4 = findViewById<ImageButton>(R.id.btnSorceryPassive3_4)
        btnSorceryPassive3_4.alpha = 0.3f
        val btnSorceryPassive3_5 = findViewById<ImageButton>(R.id.btnSorceryPassive3_5)
        btnSorceryPassive3_5.alpha = 0.3f
        val btnSorceryPassive3_6 = findViewById<ImageButton>(R.id.btnSorceryPassive3_6)
        btnSorceryPassive3_6.alpha = 0.3f

        //endregion

        //region Songcraft Skill Values Panel 1
        val btnSongcraft1_1 = findViewById<ImageButton>(R.id.btnSongcraft1_1)
        btnSongcraft1_1.alpha = 0.3f

        val btnSongcraft1_2 = findViewById<ImageButton>(R.id.btnSongcraft1_2)
        btnSongcraft1_2.alpha = 0.3f

        val btnSongcraft1_3 = findViewById<ImageButton>(R.id.btnSongcraft1_3)
        btnSongcraft1_3.alpha = 0.3f

        val btnSongcraft1_4 = findViewById<ImageButton>(R.id.btnSongcraft1_4)
        btnSongcraft1_4.alpha = 0.3f

        val btnSongcraft1_5 = findViewById<ImageButton>(R.id.btnSongcraft1_5)
        btnSongcraft1_5.alpha = 0.3f

        val btnSongcraft1_6 = findViewById<ImageButton>(R.id.btnSongcraft1_6)
        btnSongcraft1_6.alpha = 0.3f

        val btnSongcraft1_7 = findViewById<ImageButton>(R.id.btnSongcraft1_7)
        btnSongcraft1_7.alpha = 0.3f

        val btnSongcraft1_8 = findViewById<ImageButton>(R.id.btnSongcraft1_8)
        btnSongcraft1_8.alpha = 0.3f

        val btnSongcraft1_9 = findViewById<ImageButton>(R.id.btnSongcraft1_9)
        btnSongcraft1_9.alpha = 0.3f

        val btnSongcraft1_10 = findViewById<ImageButton>(R.id.btnSongcraft1_10)
        btnSongcraft1_10.alpha = 0.3f

        val btnSongcraft1_11 = findViewById<ImageButton>(R.id.btnSongcraft1_11)
        btnSongcraft1_11.alpha = 0.3f

        val btnSongcraft1_12 = findViewById<ImageButton>(R.id.btnSongcraft1_12)
        btnSongcraft1_12.alpha = 0.3f
//endregion

        //region Songcraft Passive Values Panel 1
        val btnSongcraftPassive1_1 = findViewById<ImageButton>(R.id.btnSongcraftPassive1_1)
        btnSongcraftPassive1_1.alpha = 0.3f

        val btnSongcraftPassive1_2 = findViewById<ImageButton>(R.id.btnSongcraftPassive1_2)
        btnSongcraftPassive1_2.alpha = 0.3f

        val btnSongcraftPassive1_3 = findViewById<ImageButton>(R.id.btnSongcraftPassive1_3)
        btnSongcraftPassive1_3.alpha = 0.3f

        val btnSongcraftPassive1_4 = findViewById<ImageButton>(R.id.btnSongcraftPassive1_4)
        btnSongcraftPassive1_4.alpha = 0.3f

        val btnSongcraftPassive1_5 = findViewById<ImageButton>(R.id.btnSongcraftPassive1_5)
        btnSongcraftPassive1_5.alpha = 0.3f

        val btnSongcraftPassive1_6 = findViewById<ImageButton>(R.id.btnSongcraftPassive1_6)
        btnSongcraftPassive1_6.alpha = 0.3f
//endregion

        //region Songcraft Skill Values Panel 2
        val btnSongcraft2_1 = findViewById<ImageButton>(R.id.btnSongcraft2_1)
        btnSongcraft2_1.alpha = 0.3f

        val btnSongcraft2_2 = findViewById<ImageButton>(R.id.btnSongcraft2_2)
        btnSongcraft2_2.alpha = 0.3f

        val btnSongcraft2_3 = findViewById<ImageButton>(R.id.btnSongcraft2_3)
        btnSongcraft2_3.alpha = 0.3f

        val btnSongcraft2_4 = findViewById<ImageButton>(R.id.btnSongcraft2_4)
        btnSongcraft2_4.alpha = 0.3f

        val btnSongcraft2_5 = findViewById<ImageButton>(R.id.btnSongcraft2_5)
        btnSongcraft2_5.alpha = 0.3f

        val btnSongcraft2_6 = findViewById<ImageButton>(R.id.btnSongcraft2_6)
        btnSongcraft2_6.alpha = 0.3f

        val btnSongcraft2_7 = findViewById<ImageButton>(R.id.btnSongcraft2_7)
        btnSongcraft2_7.alpha = 0.3f

        val btnSongcraft2_8 = findViewById<ImageButton>(R.id.btnSongcraft2_8)
        btnSongcraft2_8.alpha = 0.3f

        val btnSongcraft2_9 = findViewById<ImageButton>(R.id.btnSongcraft2_9)
        btnSongcraft2_9.alpha = 0.3f

        val btnSongcraft2_10 = findViewById<ImageButton>(R.id.btnSongcraft2_10)
        btnSongcraft2_10.alpha = 0.3f

        val btnSongcraft2_11 = findViewById<ImageButton>(R.id.btnSongcraft2_11)
        btnSongcraft2_11.alpha = 0.3f

        val btnSongcraft2_12 = findViewById<ImageButton>(R.id.btnSongcraft2_12)
        btnSongcraft2_12.alpha = 0.3f
        //endregion

        //region Songcraft Passive Values Panel 2
        val btnSongcraftPassive2_1 = findViewById<ImageButton>(R.id.btnSongcraftPassive2_1)
        btnSongcraftPassive2_1.alpha = 0.3f

        val btnSongcraftPassive2_2 = findViewById<ImageButton>(R.id.btnSongcraftPassive2_2)
        btnSongcraftPassive2_2.alpha = 0.3f

        val btnSongcraftPassive2_3 = findViewById<ImageButton>(R.id.btnSongcraftPassive2_3)
        btnSongcraftPassive2_3.alpha = 0.3f

        val btnSongcraftPassive2_4 = findViewById<ImageButton>(R.id.btnSongcraftPassive2_4)
        btnSongcraftPassive2_4.alpha = 0.3f

        val btnSongcraftPassive2_5 = findViewById<ImageButton>(R.id.btnSongcraftPassive2_5)
        btnSongcraftPassive2_5.alpha = 0.3f

        val btnSongcraftPassive2_6 = findViewById<ImageButton>(R.id.btnSongcraftPassive2_6)
        btnSongcraftPassive2_6.alpha = 0.3f
        //endregion

        //region Songcraft Skill Values Panel 3
        val btnSongcraft3_1 = findViewById<ImageButton>(R.id.btnSongcraft3_1)
        btnSongcraft3_1.alpha = 0.3f

        val btnSongcraft3_2 = findViewById<ImageButton>(R.id.btnSongcraft3_2)
        btnSongcraft3_2.alpha = 0.3f

        val btnSongcraft3_3 = findViewById<ImageButton>(R.id.btnSongcraft3_3)
        btnSongcraft3_3.alpha = 0.3f

        val btnSongcraft3_4 = findViewById<ImageButton>(R.id.btnSongcraft3_4)
        btnSongcraft3_4.alpha = 0.3f

        val btnSongcraft3_5 = findViewById<ImageButton>(R.id.btnSongcraft3_5)
        btnSongcraft3_5.alpha = 0.3f

        val btnSongcraft3_6 = findViewById<ImageButton>(R.id.btnSongcraft3_6)
        btnSongcraft3_6.alpha = 0.3f

        val btnSongcraft3_7 = findViewById<ImageButton>(R.id.btnSongcraft3_7)
        btnSongcraft3_7.alpha = 0.3f

        val btnSongcraft3_8 = findViewById<ImageButton>(R.id.btnSongcraft3_8)
        btnSongcraft3_8.alpha = 0.3f

        val btnSongcraft3_9 = findViewById<ImageButton>(R.id.btnSongcraft3_9)
        btnSongcraft3_9.alpha = 0.3f

        val btnSongcraft3_10 = findViewById<ImageButton>(R.id.btnSongcraft3_10)
        btnSongcraft3_10.alpha = 0.3f

        val btnSongcraft3_11 = findViewById<ImageButton>(R.id.btnSongcraft3_11)
        btnSongcraft3_11.alpha = 0.3f

        val btnSongcraft3_12 = findViewById<ImageButton>(R.id.btnSongcraft3_12)
        btnSongcraft3_12.alpha = 0.3f
        //endregion

        //region Songcraft Passive Values Panel 3
        val btnSongcraftPassive3_1 = findViewById<ImageButton>(R.id.btnSongcraftPassive3_1)
        btnSongcraftPassive3_1.alpha = 0.3f

        val btnSongcraftPassive3_2 = findViewById<ImageButton>(R.id.btnSongcraftPassive3_2)
        btnSongcraftPassive3_2.alpha = 0.3f

        val btnSongcraftPassive3_3 = findViewById<ImageButton>(R.id.btnSongcraftPassive3_3)
        btnSongcraftPassive3_3.alpha = 0.3f

        val btnSongcraftPassive3_4 = findViewById<ImageButton>(R.id.btnSongcraftPassive3_4)
        btnSongcraftPassive3_4.alpha = 0.3f

        val btnSongcraftPassive3_5 = findViewById<ImageButton>(R.id.btnSongcraftPassive3_5)
        btnSongcraftPassive3_5.alpha = 0.3f

        val btnSongcraftPassive3_6 = findViewById<ImageButton>(R.id.btnSongcraftPassive3_6)
        btnSongcraftPassive3_6.alpha = 0.3f
        //endregion

        //region Witchcraft Skill Values Panel 1
        val btnWitchcraft1_1 = findViewById<ImageButton>(R.id.btnWitchcraft1_1)
        btnWitchcraft1_1.alpha = 0.3f

        val btnWitchcraft1_2 = findViewById<ImageButton>(R.id.btnWitchcraft1_2)
        btnWitchcraft1_2.alpha = 0.3f

        val btnWitchcraft1_3 = findViewById<ImageButton>(R.id.btnWitchcraft1_3)
        btnWitchcraft1_3.alpha = 0.3f

        val btnWitchcraft1_4 = findViewById<ImageButton>(R.id.btnWitchcraft1_4)
        btnWitchcraft1_4.alpha = 0.3f

        val btnWitchcraft1_5 = findViewById<ImageButton>(R.id.btnWitchcraft1_5)
        btnWitchcraft1_5.alpha = 0.3f

        val btnWitchcraft1_6 = findViewById<ImageButton>(R.id.btnWitchcraft1_6)
        btnWitchcraft1_6.alpha = 0.3f

        val btnWitchcraft1_7 = findViewById<ImageButton>(R.id.btnWitchcraft1_7)
        btnWitchcraft1_7.alpha = 0.3f

        val btnWitchcraft1_8 = findViewById<ImageButton>(R.id.btnWitchcraft1_8)
        btnWitchcraft1_8.alpha = 0.3f

        val btnWitchcraft1_9 = findViewById<ImageButton>(R.id.btnWitchcraft1_9)
        btnWitchcraft1_9.alpha = 0.3f

        val btnWitchcraft1_10 = findViewById<ImageButton>(R.id.btnWitchcraft1_10)
        btnWitchcraft1_10.alpha = 0.3f

        val btnWitchcraft1_11 = findViewById<ImageButton>(R.id.btnWitchcraft1_11)
        btnWitchcraft1_11.alpha = 0.3f

        val btnWitchcraft1_12 = findViewById<ImageButton>(R.id.btnWitchcraft1_12)
        btnWitchcraft1_12.alpha = 0.3f
        //endregion

        //region Witchcraft Passive Values Panel 1
        val btnWitchcraftPassive1_1 = findViewById<ImageButton>(R.id.btnWitchcraftPassive1_1)
        btnWitchcraftPassive1_1.alpha = 0.3f

        val btnWitchcraftPassive1_2 = findViewById<ImageButton>(R.id.btnWitchcraftPassive1_2)
        btnWitchcraftPassive1_2.alpha = 0.3f

        val btnWitchcraftPassive1_3 = findViewById<ImageButton>(R.id.btnWitchcraftPassive1_3)
        btnWitchcraftPassive1_3.alpha = 0.3f

        val btnWitchcraftPassive1_4 = findViewById<ImageButton>(R.id.btnWitchcraftPassive1_4)
        btnWitchcraftPassive1_4.alpha = 0.3f

        val btnWitchcraftPassive1_5 = findViewById<ImageButton>(R.id.btnWitchcraftPassive1_5)
        btnWitchcraftPassive1_5.alpha = 0.3f

        val btnWitchcraftPassive1_6 = findViewById<ImageButton>(R.id.btnWitchcraftPassive1_6)
        btnWitchcraftPassive1_6.alpha = 0.3f
        //endregion

        //region Witchcraft Skill Values Panel 2
        val btnWitchcraft2_1 = findViewById<ImageButton>(R.id.btnWitchcraft2_1)
        btnWitchcraft2_1.alpha = 0.3f

        val btnWitchcraft2_2 = findViewById<ImageButton>(R.id.btnWitchcraft2_2)
        btnWitchcraft2_2.alpha = 0.3f

        val btnWitchcraft2_3 = findViewById<ImageButton>(R.id.btnWitchcraft2_3)
        btnWitchcraft2_3.alpha = 0.3f

        val btnWitchcraft2_4 = findViewById<ImageButton>(R.id.btnWitchcraft2_4)
        btnWitchcraft2_4.alpha = 0.3f

        val btnWitchcraft2_5 = findViewById<ImageButton>(R.id.btnWitchcraft2_5)
        btnWitchcraft2_5.alpha = 0.3f

        val btnWitchcraft2_6 = findViewById<ImageButton>(R.id.btnWitchcraft2_6)
        btnWitchcraft2_6.alpha = 0.3f

        val btnWitchcraft2_7 = findViewById<ImageButton>(R.id.btnWitchcraft2_7)
        btnWitchcraft2_7.alpha = 0.3f

        val btnWitchcraft2_8 = findViewById<ImageButton>(R.id.btnWitchcraft2_8)
        btnWitchcraft2_8.alpha = 0.3f

        val btnWitchcraft2_9 = findViewById<ImageButton>(R.id.btnWitchcraft2_9)
        btnWitchcraft2_9.alpha = 0.3f

        val btnWitchcraft2_10 = findViewById<ImageButton>(R.id.btnWitchcraft2_10)
        btnWitchcraft2_10.alpha = 0.3f

        val btnWitchcraft2_11 = findViewById<ImageButton>(R.id.btnWitchcraft2_11)
        btnWitchcraft2_11.alpha = 0.3f

        val btnWitchcraft2_12 = findViewById<ImageButton>(R.id.btnWitchcraft2_12)
        btnWitchcraft2_12.alpha = 0.3f
        //endregion

        //region Witchcraft Passive Values Panel 2
        val btnWitchcraftPassive2_1 = findViewById<ImageButton>(R.id.btnWitchcraftPassive2_1)
        btnWitchcraftPassive2_1.alpha = 0.3f

        val btnWitchcraftPassive2_2 = findViewById<ImageButton>(R.id.btnWitchcraftPassive2_2)
        btnWitchcraftPassive2_2.alpha = 0.3f

        val btnWitchcraftPassive2_3 = findViewById<ImageButton>(R.id.btnWitchcraftPassive2_3)
        btnWitchcraftPassive2_3.alpha = 0.3f

        val btnWitchcraftPassive2_4 = findViewById<ImageButton>(R.id.btnWitchcraftPassive2_4)
        btnWitchcraftPassive2_4.alpha = 0.3f

        val btnWitchcraftPassive2_5 = findViewById<ImageButton>(R.id.btnWitchcraftPassive2_5)
        btnWitchcraftPassive2_5.alpha = 0.3f

        val btnWitchcraftPassive2_6 = findViewById<ImageButton>(R.id.btnWitchcraftPassive2_6)
        btnWitchcraftPassive2_6.alpha = 0.3f
        //endregion

        //region Witchcraft Skill Values Panel 3
        val btnWitchcraft3_1 = findViewById<ImageButton>(R.id.btnWitchcraft3_1)
        btnWitchcraft3_1.alpha = 0.3f

        val btnWitchcraft3_2 = findViewById<ImageButton>(R.id.btnWitchcraft3_2)
        btnWitchcraft3_2.alpha = 0.3f

        val btnWitchcraft3_3 = findViewById<ImageButton>(R.id.btnWitchcraft3_3)
        btnWitchcraft3_3.alpha = 0.3f

        val btnWitchcraft3_4 = findViewById<ImageButton>(R.id.btnWitchcraft3_4)
        btnWitchcraft3_4.alpha = 0.3f

        val btnWitchcraft3_5 = findViewById<ImageButton>(R.id.btnWitchcraft3_5)
        btnWitchcraft3_5.alpha = 0.3f

        val btnWitchcraft3_6 = findViewById<ImageButton>(R.id.btnWitchcraft3_6)
        btnWitchcraft3_6.alpha = 0.3f

        val btnWitchcraft3_7 = findViewById<ImageButton>(R.id.btnWitchcraft3_7)
        btnWitchcraft3_7.alpha = 0.3f

        val btnWitchcraft3_8 = findViewById<ImageButton>(R.id.btnWitchcraft3_8)
        btnWitchcraft3_8.alpha = 0.3f

        val btnWitchcraft3_9 = findViewById<ImageButton>(R.id.btnWitchcraft3_9)
        btnWitchcraft3_9.alpha = 0.3f

        val btnWitchcraft3_10 = findViewById<ImageButton>(R.id.btnWitchcraft3_10)
        btnWitchcraft3_10.alpha = 0.3f

        val btnWitchcraft3_11 = findViewById<ImageButton>(R.id.btnWitchcraft3_11)
        btnWitchcraft3_11.alpha = 0.3f

        val btnWitchcraft3_12 = findViewById<ImageButton>(R.id.btnWitchcraft3_12)
        btnWitchcraft3_12.alpha = 0.3f
        //endregion

        //region Witchcraft Passive Values Panel 3
        val btnWitchcraftPassive3_1 = findViewById<ImageButton>(R.id.btnWitchcraftPassive3_1)
        btnWitchcraftPassive3_1.alpha = 0.3f

        val btnWitchcraftPassive3_2 = findViewById<ImageButton>(R.id.btnWitchcraftPassive3_2)
        btnWitchcraftPassive3_2.alpha = 0.3f

        val btnWitchcraftPassive3_3 = findViewById<ImageButton>(R.id.btnWitchcraftPassive3_3)
        btnWitchcraftPassive3_3.alpha = 0.3f

        val btnWitchcraftPassive3_4 = findViewById<ImageButton>(R.id.btnWitchcraftPassive3_4)
        btnWitchcraftPassive3_4.alpha = 0.3f

        val btnWitchcraftPassive3_5 = findViewById<ImageButton>(R.id.btnWitchcraftPassive3_5)
        btnWitchcraftPassive3_5.alpha = 0.3f

        val btnWitchcraftPassive3_6 = findViewById<ImageButton>(R.id.btnWitchcraftPassive3_6)
        btnWitchcraftPassive3_6.alpha = 0.3f
        //endregion

        //region Auramancy Skill Values Panel 1
        val btnAuramancy1_1 = findViewById<ImageButton>(R.id.btnAuramancy1_1)
        btnAuramancy1_1.alpha = 0.3f

        val btnAuramancy1_2 = findViewById<ImageButton>(R.id.btnAuramancy1_2)
        btnAuramancy1_2.alpha = 0.3f

        val btnAuramancy1_3 = findViewById<ImageButton>(R.id.btnAuramancy1_3)
        btnAuramancy1_3.alpha = 0.3f

        val btnAuramancy1_4 = findViewById<ImageButton>(R.id.btnAuramancy1_4)
        btnAuramancy1_4.alpha = 0.3f

        val btnAuramancy1_5 = findViewById<ImageButton>(R.id.btnAuramancy1_5)
        btnAuramancy1_5.alpha = 0.3f

        val btnAuramancy1_6 = findViewById<ImageButton>(R.id.btnAuramancy1_6)
        btnAuramancy1_6.alpha = 0.3f

        val btnAuramancy1_7 = findViewById<ImageButton>(R.id.btnAuramancy1_7)
        btnAuramancy1_7.alpha = 0.3f

        val btnAuramancy1_8 = findViewById<ImageButton>(R.id.btnAuramancy1_8)
        btnAuramancy1_8.alpha = 0.3f

        val btnAuramancy1_9 = findViewById<ImageButton>(R.id.btnAuramancy1_9)
        btnAuramancy1_9.alpha = 0.3f

        val btnAuramancy1_10 = findViewById<ImageButton>(R.id.btnAuramancy1_10)
        btnAuramancy1_10.alpha = 0.3f

        val btnAuramancy1_11 = findViewById<ImageButton>(R.id.btnAuramancy1_11)
        btnAuramancy1_11.alpha = 0.3f

        val btnAuramancy1_12 = findViewById<ImageButton>(R.id.btnAuramancy1_12)
        btnAuramancy1_12.alpha = 0.3f
//endregion

        //region Auramancy Passive Values Panel 1
        val btnAuramancyPassive1_1 = findViewById<ImageButton>(R.id.btnAuramancyPassive1_1)
        btnAuramancyPassive1_1.alpha = 0.3f

        val btnAuramancyPassive1_2 = findViewById<ImageButton>(R.id.btnAuramancyPassive1_2)
        btnAuramancyPassive1_2.alpha = 0.3f

        val btnAuramancyPassive1_3 = findViewById<ImageButton>(R.id.btnAuramancyPassive1_3)
        btnAuramancyPassive1_3.alpha = 0.3f

        val btnAuramancyPassive1_4 = findViewById<ImageButton>(R.id.btnAuramancyPassive1_4)
        btnAuramancyPassive1_4.alpha = 0.3f

        val btnAuramancyPassive1_5 = findViewById<ImageButton>(R.id.btnAuramancyPassive1_5)
        btnAuramancyPassive1_5.alpha = 0.3f

        val btnAuramancyPassive1_6 = findViewById<ImageButton>(R.id.btnAuramancyPassive1_6)
        btnAuramancyPassive1_6.alpha = 0.3f
//endregion

        //region Auramancy Skill Values Panel 2
        val btnAuramancy2_1 = findViewById<ImageButton>(R.id.btnAuramancy2_1)
        btnAuramancy2_1.alpha = 0.3f

        val btnAuramancy2_2 = findViewById<ImageButton>(R.id.btnAuramancy2_2)
        btnAuramancy2_2.alpha = 0.3f

        val btnAuramancy2_3 = findViewById<ImageButton>(R.id.btnAuramancy2_3)
        btnAuramancy2_3.alpha = 0.3f

        val btnAuramancy2_4 = findViewById<ImageButton>(R.id.btnAuramancy2_4)
        btnAuramancy2_4.alpha = 0.3f

        val btnAuramancy2_5 = findViewById<ImageButton>(R.id.btnAuramancy2_5)
        btnAuramancy2_5.alpha = 0.3f

        val btnAuramancy2_6 = findViewById<ImageButton>(R.id.btnAuramancy2_6)
        btnAuramancy2_6.alpha = 0.3f

        val btnAuramancy2_7 = findViewById<ImageButton>(R.id.btnAuramancy2_7)
        btnAuramancy2_7.alpha = 0.3f

        val btnAuramancy2_8 = findViewById<ImageButton>(R.id.btnAuramancy2_8)
        btnAuramancy2_8.alpha = 0.3f

        val btnAuramancy2_9 = findViewById<ImageButton>(R.id.btnAuramancy2_9)
        btnAuramancy2_9.alpha = 0.3f

        val btnAuramancy2_10 = findViewById<ImageButton>(R.id.btnAuramancy2_10)
        btnAuramancy2_10.alpha = 0.3f

        val btnAuramancy2_11 = findViewById<ImageButton>(R.id.btnAuramancy2_11)
        btnAuramancy2_11.alpha = 0.3f

        val btnAuramancy2_12 = findViewById<ImageButton>(R.id.btnAuramancy2_12)
        btnAuramancy2_12.alpha = 0.3f
//endregion

        //region Auramancy Passive Values Panel 2
        val btnAuramancyPassive2_1 = findViewById<ImageButton>(R.id.btnAuramancyPassive2_1)
        btnAuramancyPassive2_1.alpha = 0.3f

        val btnAuramancyPassive2_2 = findViewById<ImageButton>(R.id.btnAuramancyPassive2_2)
        btnAuramancyPassive2_2.alpha = 0.3f

        val btnAuramancyPassive2_3 = findViewById<ImageButton>(R.id.btnAuramancyPassive2_3)
        btnAuramancyPassive2_3.alpha = 0.3f

        val btnAuramancyPassive2_4 = findViewById<ImageButton>(R.id.btnAuramancyPassive2_4)
        btnAuramancyPassive2_4.alpha = 0.3f

        val btnAuramancyPassive2_5 = findViewById<ImageButton>(R.id.btnAuramancyPassive2_5)
        btnAuramancyPassive2_5.alpha = 0.3f

        val btnAuramancyPassive2_6 = findViewById<ImageButton>(R.id.btnAuramancyPassive2_6)
        btnAuramancyPassive2_6.alpha = 0.3f
//endregion

        //region Auramancy Skill Values Panel 3
        val btnAuramancy3_1 = findViewById<ImageButton>(R.id.btnAuramancy3_1)
        btnAuramancy3_1.alpha = 0.3f

        val btnAuramancy3_2 = findViewById<ImageButton>(R.id.btnAuramancy3_2)
        btnAuramancy3_2.alpha = 0.3f

        val btnAuramancy3_3 = findViewById<ImageButton>(R.id.btnAuramancy3_3)
        btnAuramancy3_3.alpha = 0.3f

        val btnAuramancy3_4 = findViewById<ImageButton>(R.id.btnAuramancy3_4)
        btnAuramancy3_4.alpha = 0.3f

        val btnAuramancy3_5 = findViewById<ImageButton>(R.id.btnAuramancy3_5)
        btnAuramancy3_5.alpha = 0.3f

        val btnAuramancy3_6 = findViewById<ImageButton>(R.id.btnAuramancy3_6)
        btnAuramancy3_6.alpha = 0.3f

        val btnAuramancy3_7 = findViewById<ImageButton>(R.id.btnAuramancy3_7)
        btnAuramancy3_7.alpha = 0.3f

        val btnAuramancy3_8 = findViewById<ImageButton>(R.id.btnAuramancy3_8)
        btnAuramancy3_8.alpha = 0.3f

        val btnAuramancy3_9 = findViewById<ImageButton>(R.id.btnAuramancy3_9)
        btnAuramancy3_9.alpha = 0.3f

        val btnAuramancy3_10 = findViewById<ImageButton>(R.id.btnAuramancy3_10)
        btnAuramancy3_10.alpha = 0.3f

        val btnAuramancy3_11 = findViewById<ImageButton>(R.id.btnAuramancy3_11)
        btnAuramancy3_11.alpha = 0.3f

        val btnAuramancy3_12 = findViewById<ImageButton>(R.id.btnAuramancy3_12)
        btnAuramancy3_12.alpha = 0.3f
//endregion

        //region Auramancy Passive Values Panel 3
        val btnAuramancyPassive3_1 = findViewById<ImageButton>(R.id.btnAuramancyPassive3_1)
        btnAuramancyPassive3_1.alpha = 0.3f

        val btnAuramancyPassive3_2 = findViewById<ImageButton>(R.id.btnAuramancyPassive3_2)
        btnAuramancyPassive3_2.alpha = 0.3f

        val btnAuramancyPassive3_3 = findViewById<ImageButton>(R.id.btnAuramancyPassive3_3)
        btnAuramancyPassive3_3.alpha = 0.3f

        val btnAuramancyPassive3_4 = findViewById<ImageButton>(R.id.btnAuramancyPassive3_4)
        btnAuramancyPassive3_4.alpha = 0.3f

        val btnAuramancyPassive3_5 = findViewById<ImageButton>(R.id.btnAuramancyPassive3_5)
        btnAuramancyPassive3_5.alpha = 0.3f

        val btnAuramancyPassive3_6 = findViewById<ImageButton>(R.id.btnAuramancyPassive3_6)
        btnAuramancyPassive3_6.alpha = 0.3f
//endregion

        //region Shadowplay Skill Values Panel 1
        val btnShadowplay1_1 = findViewById<ImageButton>(R.id.btnShadowplay1_1)
        btnShadowplay1_1.alpha = 0.3f

        val btnShadowplay1_2 = findViewById<ImageButton>(R.id.btnShadowplay1_2)
        btnShadowplay1_2.alpha = 0.3f

        val btnShadowplay1_3 = findViewById<ImageButton>(R.id.btnShadowplay1_3)
        btnShadowplay1_3.alpha = 0.3f

        val btnShadowplay1_4 = findViewById<ImageButton>(R.id.btnShadowplay1_4)
        btnShadowplay1_4.alpha = 0.3f

        val btnShadowplay1_5 = findViewById<ImageButton>(R.id.btnShadowplay1_5)
        btnShadowplay1_5.alpha = 0.3f

        val btnShadowplay1_6 = findViewById<ImageButton>(R.id.btnShadowplay1_6)
        btnShadowplay1_6.alpha = 0.3f

        val btnShadowplay1_7 = findViewById<ImageButton>(R.id.btnShadowplay1_7)
        btnShadowplay1_7.alpha = 0.3f

        val btnShadowplay1_8 = findViewById<ImageButton>(R.id.btnShadowplay1_8)
        btnShadowplay1_8.alpha = 0.3f

        val btnShadowplay1_9 = findViewById<ImageButton>(R.id.btnShadowplay1_9)
        btnShadowplay1_9.alpha = 0.3f

        val btnShadowplay1_10 = findViewById<ImageButton>(R.id.btnShadowplay1_10)
        btnShadowplay1_10.alpha = 0.3f

        val btnShadowplay1_11 = findViewById<ImageButton>(R.id.btnShadowplay1_11)
        btnShadowplay1_11.alpha = 0.3f

        val btnShadowplay1_12 = findViewById<ImageButton>(R.id.btnShadowplay1_12)
        btnShadowplay1_12.alpha = 0.3f
        //endregion

        //region Shadowplay Passive Values Panel 1
        val btnShadowplayPassive1_1 = findViewById<ImageButton>(R.id.btnShadowplayPassive1_1)
        btnShadowplayPassive1_1.alpha = 0.3f

        val btnShadowplayPassive1_2 = findViewById<ImageButton>(R.id.btnShadowplayPassive1_2)
        btnShadowplayPassive1_2.alpha = 0.3f

        val btnShadowplayPassive1_3 = findViewById<ImageButton>(R.id.btnShadowplayPassive1_3)
        btnShadowplayPassive1_3.alpha = 0.3f

        val btnShadowplayPassive1_4 = findViewById<ImageButton>(R.id.btnShadowplayPassive1_4)
        btnShadowplayPassive1_4.alpha = 0.3f

        val btnShadowplayPassive1_5 = findViewById<ImageButton>(R.id.btnShadowplayPassive1_5)
        btnShadowplayPassive1_5.alpha = 0.3f

        val btnShadowplayPassive1_6 = findViewById<ImageButton>(R.id.btnShadowplayPassive1_6)
        btnShadowplayPassive1_6.alpha = 0.3f
        //endregion

        //region Shadowplay Skill Values Panel 2
        val btnShadowplay2_1 = findViewById<ImageButton>(R.id.btnShadowplay2_1)
        btnShadowplay2_1.alpha = 0.3f

        val btnShadowplay2_2 = findViewById<ImageButton>(R.id.btnShadowplay2_2)
        btnShadowplay2_2.alpha = 0.3f

        val btnShadowplay2_3 = findViewById<ImageButton>(R.id.btnShadowplay2_3)
        btnShadowplay2_3.alpha = 0.3f

        val btnShadowplay2_4 = findViewById<ImageButton>(R.id.btnShadowplay2_4)
        btnShadowplay2_4.alpha = 0.3f

        val btnShadowplay2_5 = findViewById<ImageButton>(R.id.btnShadowplay2_5)
        btnShadowplay2_5.alpha = 0.3f

        val btnShadowplay2_6 = findViewById<ImageButton>(R.id.btnShadowplay2_6)
        btnShadowplay2_6.alpha = 0.3f

        val btnShadowplay2_7 = findViewById<ImageButton>(R.id.btnShadowplay2_7)
        btnShadowplay2_7.alpha = 0.3f

        val btnShadowplay2_8 = findViewById<ImageButton>(R.id.btnShadowplay2_8)
        btnShadowplay2_8.alpha = 0.3f

        val btnShadowplay2_9 = findViewById<ImageButton>(R.id.btnShadowplay2_9)
        btnShadowplay2_9.alpha = 0.3f

        val btnShadowplay2_10 = findViewById<ImageButton>(R.id.btnShadowplay2_10)
        btnShadowplay2_10.alpha = 0.3f

        val btnShadowplay2_11 = findViewById<ImageButton>(R.id.btnShadowplay2_11)
        btnShadowplay2_11.alpha = 0.3f

        val btnShadowplay2_12 = findViewById<ImageButton>(R.id.btnShadowplay2_12)
        btnShadowplay2_12.alpha = 0.3f
        //endregion

        //region Shadowplay Passive Values Panel 2
        val btnShadowplayPassive2_1 = findViewById<ImageButton>(R.id.btnShadowplayPassive2_1)
        btnShadowplayPassive2_1.alpha = 0.3f

        val btnShadowplayPassive2_2 = findViewById<ImageButton>(R.id.btnShadowplayPassive2_2)
        btnShadowplayPassive2_2.alpha = 0.3f

        val btnShadowplayPassive2_3 = findViewById<ImageButton>(R.id.btnShadowplayPassive2_3)
        btnShadowplayPassive2_3.alpha = 0.3f

        val btnShadowplayPassive2_4 = findViewById<ImageButton>(R.id.btnShadowplayPassive2_4)
        btnShadowplayPassive2_4.alpha = 0.3f

        val btnShadowplayPassive2_5 = findViewById<ImageButton>(R.id.btnShadowplayPassive2_5)
        btnShadowplayPassive2_5.alpha = 0.3f

        val btnShadowplayPassive2_6 = findViewById<ImageButton>(R.id.btnShadowplayPassive2_6)
        btnShadowplayPassive2_6.alpha = 0.3f
        //endregion

        //region Shadowplay Skill Values Panel 3
        val btnShadowplay3_1 = findViewById<ImageButton>(R.id.btnShadowplay3_1)
        btnShadowplay3_1.alpha = 0.3f

        val btnShadowplay3_2 = findViewById<ImageButton>(R.id.btnShadowplay3_2)
        btnShadowplay3_2.alpha = 0.3f

        val btnShadowplay3_3 = findViewById<ImageButton>(R.id.btnShadowplay3_3)
        btnShadowplay3_3.alpha = 0.3f

        val btnShadowplay3_4 = findViewById<ImageButton>(R.id.btnShadowplay3_4)
        btnShadowplay3_4.alpha = 0.3f

        val btnShadowplay3_5 = findViewById<ImageButton>(R.id.btnShadowplay3_5)
        btnShadowplay3_5.alpha = 0.3f

        val btnShadowplay3_6 = findViewById<ImageButton>(R.id.btnShadowplay3_6)
        btnShadowplay3_6.alpha = 0.3f

        val btnShadowplay3_7 = findViewById<ImageButton>(R.id.btnShadowplay3_7)
        btnShadowplay3_7.alpha = 0.3f

        val btnShadowplay3_8 = findViewById<ImageButton>(R.id.btnShadowplay3_8)
        btnShadowplay3_8.alpha = 0.3f

        val btnShadowplay3_9 = findViewById<ImageButton>(R.id.btnShadowplay3_9)
        btnShadowplay3_9.alpha = 0.3f

        val btnShadowplay3_10 = findViewById<ImageButton>(R.id.btnShadowplay3_10)
        btnShadowplay3_10.alpha = 0.3f

        val btnShadowplay3_11 = findViewById<ImageButton>(R.id.btnShadowplay3_11)
        btnShadowplay3_11.alpha = 0.3f

        val btnShadowplay3_12 = findViewById<ImageButton>(R.id.btnShadowplay3_12)
        btnShadowplay3_12.alpha = 0.3f
        //endregion

        //region Shadowplay Passive Values Panel 3
        val btnShadowplayPassive3_1 = findViewById<ImageButton>(R.id.btnShadowplayPassive3_1)
        btnShadowplayPassive3_1.alpha = 0.3f

        val btnShadowplayPassive3_2 = findViewById<ImageButton>(R.id.btnShadowplayPassive3_2)
        btnShadowplayPassive3_2.alpha = 0.3f

        val btnShadowplayPassive3_3 = findViewById<ImageButton>(R.id.btnShadowplayPassive3_3)
        btnShadowplayPassive3_3.alpha = 0.3f

        val btnShadowplayPassive3_4 = findViewById<ImageButton>(R.id.btnShadowplayPassive3_4)
        btnShadowplayPassive3_4.alpha = 0.3f

        val btnShadowplayPassive3_5 = findViewById<ImageButton>(R.id.btnShadowplayPassive3_5)
        btnShadowplayPassive3_5.alpha = 0.3f

        val btnShadowplayPassive3_6 = findViewById<ImageButton>(R.id.btnShadowplayPassive3_6)
        btnShadowplayPassive3_6.alpha = 0.3f
        //endregion

        //region Vitalism Skill Values Panel 1
        val btnVitalism1_1 = findViewById<ImageButton>(R.id.btnVitalism1_1)
        btnVitalism1_1.alpha = 0.3f

        val btnVitalism1_2 = findViewById<ImageButton>(R.id.btnVitalism1_2)
        btnVitalism1_2.alpha = 0.3f

        val btnVitalism1_3 = findViewById<ImageButton>(R.id.btnVitalism1_3)
        btnVitalism1_3.alpha = 0.3f

        val btnVitalism1_4 = findViewById<ImageButton>(R.id.btnVitalism1_4)
        btnVitalism1_4.alpha = 0.3f

        val btnVitalism1_5 = findViewById<ImageButton>(R.id.btnVitalism1_5)
        btnVitalism1_5.alpha = 0.3f

        val btnVitalism1_6 = findViewById<ImageButton>(R.id.btnVitalism1_6)
        btnVitalism1_6.alpha = 0.3f

        val btnVitalism1_7 = findViewById<ImageButton>(R.id.btnVitalism1_7)
        btnVitalism1_7.alpha = 0.3f

        val btnVitalism1_8 = findViewById<ImageButton>(R.id.btnVitalism1_8)
        btnVitalism1_8.alpha = 0.3f

        val btnVitalism1_9 = findViewById<ImageButton>(R.id.btnVitalism1_9)
        btnVitalism1_9.alpha = 0.3f

        val btnVitalism1_10 = findViewById<ImageButton>(R.id.btnVitalism1_10)
        btnVitalism1_10.alpha = 0.3f

        val btnVitalism1_11 = findViewById<ImageButton>(R.id.btnVitalism1_11)
        btnVitalism1_11.alpha = 0.3f

        val btnVitalism1_12 = findViewById<ImageButton>(R.id.btnVitalism1_12)
        btnVitalism1_12.alpha = 0.3f
        //endregion

        //region Vitalism Passive Values Panel 1
        val btnVitalismPassive1_1 = findViewById<ImageButton>(R.id.btnVitalismPassive1_1)
        btnVitalismPassive1_1.alpha = 0.3f

        val btnVitalismPassive1_2 = findViewById<ImageButton>(R.id.btnVitalismPassive1_2)
        btnVitalismPassive1_2.alpha = 0.3f

        val btnVitalismPassive1_3 = findViewById<ImageButton>(R.id.btnVitalismPassive1_3)
        btnVitalismPassive1_3.alpha = 0.3f

        val btnVitalismPassive1_4 = findViewById<ImageButton>(R.id.btnVitalismPassive1_4)
        btnVitalismPassive1_4.alpha = 0.3f

        val btnVitalismPassive1_5 = findViewById<ImageButton>(R.id.btnVitalismPassive1_5)
        btnVitalismPassive1_5.alpha = 0.3f

        val btnVitalismPassive1_6 = findViewById<ImageButton>(R.id.btnVitalismPassive1_6)
        btnVitalismPassive1_6.alpha = 0.3f
        //endregion

        //region Vitalism Skill Values Panel 2
        val btnVitalism2_1 = findViewById<ImageButton>(R.id.btnVitalism2_1)
        btnVitalism2_1.alpha = 0.3f

        val btnVitalism2_2 = findViewById<ImageButton>(R.id.btnVitalism2_2)
        btnVitalism2_2.alpha = 0.3f

        val btnVitalism2_3 = findViewById<ImageButton>(R.id.btnVitalism2_3)
        btnVitalism2_3.alpha = 0.3f

        val btnVitalism2_4 = findViewById<ImageButton>(R.id.btnVitalism2_4)
        btnVitalism2_4.alpha = 0.3f

        val btnVitalism2_5 = findViewById<ImageButton>(R.id.btnVitalism2_5)
        btnVitalism2_5.alpha = 0.3f

        val btnVitalism2_6 = findViewById<ImageButton>(R.id.btnVitalism2_6)
        btnVitalism2_6.alpha = 0.3f

        val btnVitalism2_7 = findViewById<ImageButton>(R.id.btnVitalism2_7)
        btnVitalism2_7.alpha = 0.3f

        val btnVitalism2_8 = findViewById<ImageButton>(R.id.btnVitalism2_8)
        btnVitalism2_8.alpha = 0.3f

        val btnVitalism2_9 = findViewById<ImageButton>(R.id.btnVitalism2_9)
        btnVitalism2_9.alpha = 0.3f

        val btnVitalism2_10 = findViewById<ImageButton>(R.id.btnVitalism2_10)
        btnVitalism2_10.alpha = 0.3f

        val btnVitalism2_11 = findViewById<ImageButton>(R.id.btnVitalism2_11)
        btnVitalism2_11.alpha = 0.3f

        val btnVitalism2_12 = findViewById<ImageButton>(R.id.btnVitalism2_12)
        btnVitalism2_12.alpha = 0.3f
        //endregion

        //region Vitalism Passive Values Panel 2
        val btnVitalismPassive2_1 = findViewById<ImageButton>(R.id.btnVitalismPassive2_1)
        btnVitalismPassive2_1.alpha = 0.3f

        val btnVitalismPassive2_2 = findViewById<ImageButton>(R.id.btnVitalismPassive2_2)
        btnVitalismPassive2_2.alpha = 0.3f

        val btnVitalismPassive2_3 = findViewById<ImageButton>(R.id.btnVitalismPassive2_3)
        btnVitalismPassive2_3.alpha = 0.3f

        val btnVitalismPassive2_4 = findViewById<ImageButton>(R.id.btnVitalismPassive2_4)
        btnVitalismPassive2_4.alpha = 0.3f

        val btnVitalismPassive2_5 = findViewById<ImageButton>(R.id.btnVitalismPassive2_5)
        btnVitalismPassive2_5.alpha = 0.3f

        val btnVitalismPassive2_6 = findViewById<ImageButton>(R.id.btnVitalismPassive2_6)
        btnVitalismPassive2_6.alpha = 0.3f
        //endregion

        //region Vitalism Skill Values Panel 3
        val btnVitalism3_1 = findViewById<ImageButton>(R.id.btnVitalism3_1)
        btnVitalism3_1.alpha = 0.3f

        val btnVitalism3_2 = findViewById<ImageButton>(R.id.btnVitalism3_2)
        btnVitalism3_2.alpha = 0.3f

        val btnVitalism3_3 = findViewById<ImageButton>(R.id.btnVitalism3_3)
        btnVitalism3_3.alpha = 0.3f

        val btnVitalism3_4 = findViewById<ImageButton>(R.id.btnVitalism3_4)
        btnVitalism3_4.alpha = 0.3f

        val btnVitalism3_5 = findViewById<ImageButton>(R.id.btnVitalism3_5)
        btnVitalism3_5.alpha = 0.3f

        val btnVitalism3_6 = findViewById<ImageButton>(R.id.btnVitalism3_6)
        btnVitalism3_6.alpha = 0.3f

        val btnVitalism3_7 = findViewById<ImageButton>(R.id.btnVitalism3_7)
        btnVitalism3_7.alpha = 0.3f

        val btnVitalism3_8 = findViewById<ImageButton>(R.id.btnVitalism3_8)
        btnVitalism3_8.alpha = 0.3f

        val btnVitalism3_9 = findViewById<ImageButton>(R.id.btnVitalism3_9)
        btnVitalism3_9.alpha = 0.3f

        val btnVitalism3_10 = findViewById<ImageButton>(R.id.btnVitalism3_10)
        btnVitalism3_10.alpha = 0.3f

        val btnVitalism3_11 = findViewById<ImageButton>(R.id.btnVitalism3_11)
        btnVitalism3_11.alpha = 0.3f

        val btnVitalism3_12 = findViewById<ImageButton>(R.id.btnVitalism3_12)
        btnVitalism3_12.alpha = 0.3f
        //endregion

        //region Vitalism Passive Values Panel 3
        val btnVitalismPassive3_1 = findViewById<ImageButton>(R.id.btnVitalismPassive3_1)
        btnVitalismPassive3_1.alpha = 0.3f

        val btnVitalismPassive3_2 = findViewById<ImageButton>(R.id.btnVitalismPassive3_2)
        btnVitalismPassive3_2.alpha = 0.3f

        val btnVitalismPassive3_3 = findViewById<ImageButton>(R.id.btnVitalismPassive3_3)
        btnVitalismPassive3_3.alpha = 0.3f

        val btnVitalismPassive3_4 = findViewById<ImageButton>(R.id.btnVitalismPassive3_4)
        btnVitalismPassive3_4.alpha = 0.3f

        val btnVitalismPassive3_5 = findViewById<ImageButton>(R.id.btnVitalismPassive3_5)
        btnVitalismPassive3_5.alpha = 0.3f

        val btnVitalismPassive3_6 = findViewById<ImageButton>(R.id.btnVitalismPassive3_6)
        btnVitalismPassive3_6.alpha = 0.3f
        //endregion

        //region Malediction Skill Values Panel 1
        val btnMalediction1_1 = findViewById<ImageButton>(R.id.btnMalediction1_1)
        btnMalediction1_1.alpha = 0.3f

        val btnMalediction1_2 = findViewById<ImageButton>(R.id.btnMalediction1_2)
        btnMalediction1_2.alpha = 0.3f

        val btnMalediction1_3 = findViewById<ImageButton>(R.id.btnMalediction1_3)
        btnMalediction1_3.alpha = 0.3f

        val btnMalediction1_4 = findViewById<ImageButton>(R.id.btnMalediction1_4)
        btnMalediction1_4.alpha = 0.3f

        val btnMalediction1_5 = findViewById<ImageButton>(R.id.btnMalediction1_5)
        btnMalediction1_5.alpha = 0.3f

        val btnMalediction1_6 = findViewById<ImageButton>(R.id.btnMalediction1_6)
        btnMalediction1_6.alpha = 0.3f

        val btnMalediction1_7 = findViewById<ImageButton>(R.id.btnMalediction1_7)
        btnMalediction1_7.alpha = 0.3f

        val btnMalediction1_8 = findViewById<ImageButton>(R.id.btnMalediction1_8)
        btnMalediction1_8.alpha = 0.3f

        val btnMalediction1_9 = findViewById<ImageButton>(R.id.btnMalediction1_9)
        btnMalediction1_9.alpha = 0.3f

        val btnMalediction1_10 = findViewById<ImageButton>(R.id.btnMalediction1_10)
        btnMalediction1_10.alpha = 0.3f

        val btnMalediction1_11 = findViewById<ImageButton>(R.id.btnMalediction1_11)
        btnMalediction1_11.alpha = 0.3f

        val btnMalediction1_12 = findViewById<ImageButton>(R.id.btnMalediction1_12)
        btnMalediction1_12.alpha = 0.3f
        //endregion

        //region Malediction Passive Values Panel 1
        val btnMaledictionPassive1_1 = findViewById<ImageButton>(R.id.btnMaledictionPassive1_1)
        btnMaledictionPassive1_1.alpha = 0.3f

        val btnMaledictionPassive1_2 = findViewById<ImageButton>(R.id.btnMaledictionPassive1_2)
        btnMaledictionPassive1_2.alpha = 0.3f

        val btnMaledictionPassive1_3 = findViewById<ImageButton>(R.id.btnMaledictionPassive1_3)
        btnMaledictionPassive1_3.alpha = 0.3f

        val btnMaledictionPassive1_4 = findViewById<ImageButton>(R.id.btnMaledictionPassive1_4)
        btnMaledictionPassive1_4.alpha = 0.3f

        val btnMaledictionPassive1_5 = findViewById<ImageButton>(R.id.btnMaledictionPassive1_5)
        btnMaledictionPassive1_5.alpha = 0.3f

        val btnMaledictionPassive1_6 = findViewById<ImageButton>(R.id.btnMaledictionPassive1_6)
        btnMaledictionPassive1_6.alpha = 0.3f
        //endregion

        //region Malediction Skill Values Panel 2
        val btnMalediction2_1 = findViewById<ImageButton>(R.id.btnMalediction2_1)
        btnMalediction2_1.alpha = 0.3f

        val btnMalediction2_2 = findViewById<ImageButton>(R.id.btnMalediction2_2)
        btnMalediction2_2.alpha = 0.3f

        val btnMalediction2_3 = findViewById<ImageButton>(R.id.btnMalediction2_3)
        btnMalediction2_3.alpha = 0.3f

        val btnMalediction2_4 = findViewById<ImageButton>(R.id.btnMalediction2_4)
        btnMalediction2_4.alpha = 0.3f

        val btnMalediction2_5 = findViewById<ImageButton>(R.id.btnMalediction2_5)
        btnMalediction2_5.alpha = 0.3f

        val btnMalediction2_6 = findViewById<ImageButton>(R.id.btnMalediction2_6)
        btnMalediction2_6.alpha = 0.3f

        val btnMalediction2_7 = findViewById<ImageButton>(R.id.btnMalediction2_7)
        btnMalediction2_7.alpha = 0.3f

        val btnMalediction2_8 = findViewById<ImageButton>(R.id.btnMalediction2_8)
        btnMalediction2_8.alpha = 0.3f

        val btnMalediction2_9 = findViewById<ImageButton>(R.id.btnMalediction2_9)
        btnMalediction2_9.alpha = 0.3f

        val btnMalediction2_10 = findViewById<ImageButton>(R.id.btnMalediction2_10)
        btnMalediction2_10.alpha = 0.3f

        val btnMalediction2_11 = findViewById<ImageButton>(R.id.btnMalediction2_11)
        btnMalediction2_11.alpha = 0.3f

        val btnMalediction2_12 = findViewById<ImageButton>(R.id.btnMalediction2_12)
        btnMalediction2_12.alpha = 0.3f
        //endregion

        //region Malediction Passive Values Panel 2
        val btnMaledictionPassive2_1 = findViewById<ImageButton>(R.id.btnMaledictionPassive2_1)
        btnMaledictionPassive2_1.alpha = 0.3f

        val btnMaledictionPassive2_2 = findViewById<ImageButton>(R.id.btnMaledictionPassive2_2)
        btnMaledictionPassive2_2.alpha = 0.3f

        val btnMaledictionPassive2_3 = findViewById<ImageButton>(R.id.btnMaledictionPassive2_3)
        btnMaledictionPassive2_3.alpha = 0.3f

        val btnMaledictionPassive2_4 = findViewById<ImageButton>(R.id.btnMaledictionPassive2_4)
        btnMaledictionPassive2_4.alpha = 0.3f

        val btnMaledictionPassive2_5 = findViewById<ImageButton>(R.id.btnMaledictionPassive2_5)
        btnMaledictionPassive2_5.alpha = 0.3f

        val btnMaledictionPassive2_6 = findViewById<ImageButton>(R.id.btnMaledictionPassive2_6)
        btnMaledictionPassive2_6.alpha = 0.3f
        //endregion

        //region Malediction Skill Values Panel 3
        val btnMalediction3_1 = findViewById<ImageButton>(R.id.btnMalediction3_1)
        btnMalediction3_1.alpha = 0.3f

        val btnMalediction3_2 = findViewById<ImageButton>(R.id.btnMalediction3_2)
        btnMalediction3_2.alpha = 0.3f

        val btnMalediction3_3 = findViewById<ImageButton>(R.id.btnMalediction3_3)
        btnMalediction3_3.alpha = 0.3f

        val btnMalediction3_4 = findViewById<ImageButton>(R.id.btnMalediction3_4)
        btnMalediction3_4.alpha = 0.3f

        val btnMalediction3_5 = findViewById<ImageButton>(R.id.btnMalediction3_5)
        btnMalediction3_5.alpha = 0.3f

        val btnMalediction3_6 = findViewById<ImageButton>(R.id.btnMalediction3_6)
        btnMalediction3_6.alpha = 0.3f

        val btnMalediction3_7 = findViewById<ImageButton>(R.id.btnMalediction3_7)
        btnMalediction3_7.alpha = 0.3f

        val btnMalediction3_8 = findViewById<ImageButton>(R.id.btnMalediction3_8)
        btnMalediction3_8.alpha = 0.3f

        val btnMalediction3_9 = findViewById<ImageButton>(R.id.btnMalediction3_9)
        btnMalediction3_9.alpha = 0.3f

        val btnMalediction3_10 = findViewById<ImageButton>(R.id.btnMalediction3_10)
        btnMalediction3_10.alpha = 0.3f

        val btnMalediction3_11 = findViewById<ImageButton>(R.id.btnMalediction3_11)
        btnMalediction3_11.alpha = 0.3f

        val btnMalediction3_12 = findViewById<ImageButton>(R.id.btnMalediction3_12)
        btnMalediction3_12.alpha = 0.3f
        //endregion

        //region Malediction Passive Values Panel 3
        val btnMaledictionPassive3_1 = findViewById<ImageButton>(R.id.btnMaledictionPassive3_1)
        btnMaledictionPassive3_1.alpha = 0.3f

        val btnMaledictionPassive3_2 = findViewById<ImageButton>(R.id.btnMaledictionPassive3_2)
        btnMaledictionPassive3_2.alpha = 0.3f

        val btnMaledictionPassive3_3 = findViewById<ImageButton>(R.id.btnMaledictionPassive3_3)
        btnMaledictionPassive3_3.alpha = 0.3f

        val btnMaledictionPassive3_4 = findViewById<ImageButton>(R.id.btnMaledictionPassive3_4)
        btnMaledictionPassive3_4.alpha = 0.3f

        val btnMaledictionPassive3_5 = findViewById<ImageButton>(R.id.btnMaledictionPassive3_5)
        btnMaledictionPassive3_5.alpha = 0.3f

        val btnMaledictionPassive3_6 = findViewById<ImageButton>(R.id.btnMaledictionPassive3_6)
        btnMaledictionPassive3_6.alpha = 0.3f
        //endregion

        //region Swiftblade Skill Values Panel 1
        val btnSwiftblade1_1 = findViewById<ImageButton>(R.id.btnSwiftblade1_1)
        btnSwiftblade1_1.alpha = 0.3f

        val btnSwiftblade1_2 = findViewById<ImageButton>(R.id.btnSwiftblade1_2)
        btnSwiftblade1_2.alpha = 0.3f

        val btnSwiftblade1_3 = findViewById<ImageButton>(R.id.btnSwiftblade1_3)
        btnSwiftblade1_3.alpha = 0.3f

        val btnSwiftblade1_4 = findViewById<ImageButton>(R.id.btnSwiftblade1_4)
        btnSwiftblade1_4.alpha = 0.3f

        val btnSwiftblade1_5 = findViewById<ImageButton>(R.id.btnSwiftblade1_5)
        btnSwiftblade1_5.alpha = 0.3f

        val btnSwiftblade1_6 = findViewById<ImageButton>(R.id.btnSwiftblade1_6)
        btnSwiftblade1_6.alpha = 0.3f

        val btnSwiftblade1_7 = findViewById<ImageButton>(R.id.btnSwiftblade1_7)
        btnSwiftblade1_7.alpha = 0.3f

        val btnSwiftblade1_8 = findViewById<ImageButton>(R.id.btnSwiftblade1_8)
        btnSwiftblade1_8.alpha = 0.3f

        val btnSwiftblade1_9 = findViewById<ImageButton>(R.id.btnSwiftblade1_9)
        btnSwiftblade1_9.alpha = 0.3f

        val btnSwiftblade1_10 = findViewById<ImageButton>(R.id.btnSwiftblade1_10)
        btnSwiftblade1_10.alpha = 0.3f

        val btnSwiftblade1_11 = findViewById<ImageButton>(R.id.btnSwiftblade1_11)
        btnSwiftblade1_11.alpha = 0.3f

        val btnSwiftblade1_12 = findViewById<ImageButton>(R.id.btnSwiftblade1_12)
        btnSwiftblade1_12.alpha = 0.3f
        //endregion

        //region Swiftblade Passive Values Panel 1
        val btnSwiftbladePassive1_1 = findViewById<ImageButton>(R.id.btnSwiftbladePassive1_1)
        btnSwiftbladePassive1_1.alpha = 0.3f

        val btnSwiftbladePassive1_2 = findViewById<ImageButton>(R.id.btnSwiftbladePassive1_2)
        btnSwiftbladePassive1_2.alpha = 0.3f

        val btnSwiftbladePassive1_3 = findViewById<ImageButton>(R.id.btnSwiftbladePassive1_3)
        btnSwiftbladePassive1_3.alpha = 0.3f

        val btnSwiftbladePassive1_4 = findViewById<ImageButton>(R.id.btnSwiftbladePassive1_4)
        btnSwiftbladePassive1_4.alpha = 0.3f

        val btnSwiftbladePassive1_5 = findViewById<ImageButton>(R.id.btnSwiftbladePassive1_5)
        btnSwiftbladePassive1_5.alpha = 0.3f

        val btnSwiftbladePassive1_6 = findViewById<ImageButton>(R.id.btnSwiftbladePassive1_6)
        btnSwiftbladePassive1_6.alpha = 0.3f
        //endregion

        //region Swiftblade Skill Values Panel 2
        val btnSwiftblade2_1 = findViewById<ImageButton>(R.id.btnSwiftblade2_1)
        btnSwiftblade2_1.alpha = 0.3f

        val btnSwiftblade2_2 = findViewById<ImageButton>(R.id.btnSwiftblade2_2)
        btnSwiftblade2_2.alpha = 0.3f

        val btnSwiftblade2_3 = findViewById<ImageButton>(R.id.btnSwiftblade2_3)
        btnSwiftblade2_3.alpha = 0.3f

        val btnSwiftblade2_4 = findViewById<ImageButton>(R.id.btnSwiftblade2_4)
        btnSwiftblade2_4.alpha = 0.3f

        val btnSwiftblade2_5 = findViewById<ImageButton>(R.id.btnSwiftblade2_5)
        btnSwiftblade2_5.alpha = 0.3f

        val btnSwiftblade2_6 = findViewById<ImageButton>(R.id.btnSwiftblade2_6)
        btnSwiftblade2_6.alpha = 0.3f

        val btnSwiftblade2_7 = findViewById<ImageButton>(R.id.btnSwiftblade2_7)
        btnSwiftblade2_7.alpha = 0.3f

        val btnSwiftblade2_8 = findViewById<ImageButton>(R.id.btnSwiftblade2_8)
        btnSwiftblade2_8.alpha = 0.3f

        val btnSwiftblade2_9 = findViewById<ImageButton>(R.id.btnSwiftblade2_9)
        btnSwiftblade2_9.alpha = 0.3f

        val btnSwiftblade2_10 = findViewById<ImageButton>(R.id.btnSwiftblade2_10)
        btnSwiftblade2_10.alpha = 0.3f

        val btnSwiftblade2_11 = findViewById<ImageButton>(R.id.btnSwiftblade2_11)
        btnSwiftblade2_11.alpha = 0.3f

        val btnSwiftblade2_12 = findViewById<ImageButton>(R.id.btnSwiftblade2_12)
        btnSwiftblade2_12.alpha = 0.3f
        //endregion

        //region Swiftblade Passive Values Panel 2
        val btnSwiftbladePassive2_1 = findViewById<ImageButton>(R.id.btnSwiftbladePassive2_1)
        btnSwiftbladePassive2_1.alpha = 0.3f

        val btnSwiftbladePassive2_2 = findViewById<ImageButton>(R.id.btnSwiftbladePassive2_2)
        btnSwiftbladePassive2_2.alpha = 0.3f

        val btnSwiftbladePassive2_3 = findViewById<ImageButton>(R.id.btnSwiftbladePassive2_3)
        btnSwiftbladePassive2_3.alpha = 0.3f

        val btnSwiftbladePassive2_4 = findViewById<ImageButton>(R.id.btnSwiftbladePassive2_4)
        btnSwiftbladePassive2_4.alpha = 0.3f

        val btnSwiftbladePassive2_5 = findViewById<ImageButton>(R.id.btnSwiftbladePassive2_5)
        btnSwiftbladePassive2_5.alpha = 0.3f

        val btnSwiftbladePassive2_6 = findViewById<ImageButton>(R.id.btnSwiftbladePassive2_6)
        btnSwiftbladePassive2_6.alpha = 0.3f
        //endregion

        //region Swiftblade Skill Values Panel 3
        val btnSwiftblade3_1 = findViewById<ImageButton>(R.id.btnSwiftblade3_1)
        btnSwiftblade3_1.alpha = 0.3f

        val btnSwiftblade3_2 = findViewById<ImageButton>(R.id.btnSwiftblade3_2)
        btnSwiftblade3_2.alpha = 0.3f

        val btnSwiftblade3_3 = findViewById<ImageButton>(R.id.btnSwiftblade3_3)
        btnSwiftblade3_3.alpha = 0.3f

        val btnSwiftblade3_4 = findViewById<ImageButton>(R.id.btnSwiftblade3_4)
        btnSwiftblade3_4.alpha = 0.3f

        val btnSwiftblade3_5 = findViewById<ImageButton>(R.id.btnSwiftblade3_5)
        btnSwiftblade3_5.alpha = 0.3f

        val btnSwiftblade3_6 = findViewById<ImageButton>(R.id.btnSwiftblade3_6)
        btnSwiftblade3_6.alpha = 0.3f

        val btnSwiftblade3_7 = findViewById<ImageButton>(R.id.btnSwiftblade3_7)
        btnSwiftblade3_7.alpha = 0.3f

        val btnSwiftblade3_8 = findViewById<ImageButton>(R.id.btnSwiftblade3_8)
        btnSwiftblade3_8.alpha = 0.3f

        val btnSwiftblade3_9 = findViewById<ImageButton>(R.id.btnSwiftblade3_9)
        btnSwiftblade3_9.alpha = 0.3f

        val btnSwiftblade3_10 = findViewById<ImageButton>(R.id.btnSwiftblade3_10)
        btnSwiftblade3_10.alpha = 0.3f

        val btnSwiftblade3_11 = findViewById<ImageButton>(R.id.btnSwiftblade3_11)
        btnSwiftblade3_11.alpha = 0.3f

        val btnSwiftblade3_12 = findViewById<ImageButton>(R.id.btnSwiftblade3_12)
        btnSwiftblade3_12.alpha = 0.3f
        //endregion

        //region Swiftblade Passive Values Panel 3
        val btnSwiftbladePassive3_1 = findViewById<ImageButton>(R.id.btnSwiftbladePassive3_1)
        btnSwiftbladePassive3_1.alpha = 0.3f

        val btnSwiftbladePassive3_2 = findViewById<ImageButton>(R.id.btnSwiftbladePassive3_2)
        btnSwiftbladePassive3_2.alpha = 0.3f

        val btnSwiftbladePassive3_3 = findViewById<ImageButton>(R.id.btnSwiftbladePassive3_3)
        btnSwiftbladePassive3_3.alpha = 0.3f

        val btnSwiftbladePassive3_4 = findViewById<ImageButton>(R.id.btnSwiftbladePassive3_4)
        btnSwiftbladePassive3_4.alpha = 0.3f

        val btnSwiftbladePassive3_5 = findViewById<ImageButton>(R.id.btnSwiftbladePassive3_5)
        btnSwiftbladePassive3_5.alpha = 0.3f

        val btnSwiftbladePassive3_6 = findViewById<ImageButton>(R.id.btnSwiftbladePassive3_6)
        btnSwiftbladePassive3_6.alpha = 0.3f
        //endregion
        
        //region Gunslinger Skill Values Panel 1
        val btnGunslinger1_1 = findViewById<ImageButton>(R.id.btnGunslinger1_1)
        btnGunslinger1_1.alpha = 0.3f

        val btnGunslinger1_2 = findViewById<ImageButton>(R.id.btnGunslinger1_2)
        btnGunslinger1_2.alpha = 0.3f

        val btnGunslinger1_3 = findViewById<ImageButton>(R.id.btnGunslinger1_3)
        btnGunslinger1_3.alpha = 0.3f

        val btnGunslinger1_4 = findViewById<ImageButton>(R.id.btnGunslinger1_4)
        btnGunslinger1_4.alpha = 0.3f

        val btnGunslinger1_5 = findViewById<ImageButton>(R.id.btnGunslinger1_5)
        btnGunslinger1_5.alpha = 0.3f

        val btnGunslinger1_6 = findViewById<ImageButton>(R.id.btnGunslinger1_6)
        btnGunslinger1_6.alpha = 0.3f

        val btnGunslinger1_7 = findViewById<ImageButton>(R.id.btnGunslinger1_7)
        btnGunslinger1_7.alpha = 0.3f

        val btnGunslinger1_8 = findViewById<ImageButton>(R.id.btnGunslinger1_8)
        btnGunslinger1_8.alpha = 0.3f

        val btnGunslinger1_9 = findViewById<ImageButton>(R.id.btnGunslinger1_9)
        btnGunslinger1_9.alpha = 0.3f

        val btnGunslinger1_10 = findViewById<ImageButton>(R.id.btnGunslinger1_10)
        btnGunslinger1_10.alpha = 0.3f

        val btnGunslinger1_11 = findViewById<ImageButton>(R.id.btnGunslinger1_11)
        btnGunslinger1_11.alpha = 0.3f

        val btnGunslinger1_12 = findViewById<ImageButton>(R.id.btnGunslinger1_12)
        btnGunslinger1_12.alpha = 0.3f
        //endregion

        //region Gunslinger Passive Values Panel 1
        val btnGunslingerPassive1_1 = findViewById<ImageButton>(R.id.btnGunslingerPassive1_1)
        btnGunslingerPassive1_1.alpha = 0.3f

        val btnGunslingerPassive1_2 = findViewById<ImageButton>(R.id.btnGunslingerPassive1_2)
        btnGunslingerPassive1_2.alpha = 0.3f

        val btnGunslingerPassive1_3 = findViewById<ImageButton>(R.id.btnGunslingerPassive1_3)
        btnGunslingerPassive1_3.alpha = 0.3f

        val btnGunslingerPassive1_4 = findViewById<ImageButton>(R.id.btnGunslingerPassive1_4)
        btnGunslingerPassive1_4.alpha = 0.3f

        val btnGunslingerPassive1_5 = findViewById<ImageButton>(R.id.btnGunslingerPassive1_5)
        btnGunslingerPassive1_5.alpha = 0.3f

        val btnGunslingerPassive1_6 = findViewById<ImageButton>(R.id.btnGunslingerPassive1_6)
        btnGunslingerPassive1_6.alpha = 0.3f
        //endregion

        //region Gunslinger Skill Values Panel 2
        val btnGunslinger2_1 = findViewById<ImageButton>(R.id.btnGunslinger2_1)
        btnGunslinger2_1.alpha = 0.3f

        val btnGunslinger2_2 = findViewById<ImageButton>(R.id.btnGunslinger2_2)
        btnGunslinger2_2.alpha = 0.3f

        val btnGunslinger2_3 = findViewById<ImageButton>(R.id.btnGunslinger2_3)
        btnGunslinger2_3.alpha = 0.3f

        val btnGunslinger2_4 = findViewById<ImageButton>(R.id.btnGunslinger2_4)
        btnGunslinger2_4.alpha = 0.3f

        val btnGunslinger2_5 = findViewById<ImageButton>(R.id.btnGunslinger2_5)
        btnGunslinger2_5.alpha = 0.3f

        val btnGunslinger2_6 = findViewById<ImageButton>(R.id.btnGunslinger2_6)
        btnGunslinger2_6.alpha = 0.3f

        val btnGunslinger2_7 = findViewById<ImageButton>(R.id.btnGunslinger2_7)
        btnGunslinger2_7.alpha = 0.3f

        val btnGunslinger2_8 = findViewById<ImageButton>(R.id.btnGunslinger2_8)
        btnGunslinger2_8.alpha = 0.3f

        val btnGunslinger2_9 = findViewById<ImageButton>(R.id.btnGunslinger2_9)
        btnGunslinger2_9.alpha = 0.3f

        val btnGunslinger2_10 = findViewById<ImageButton>(R.id.btnGunslinger2_10)
        btnGunslinger2_10.alpha = 0.3f

        val btnGunslinger2_11 = findViewById<ImageButton>(R.id.btnGunslinger2_11)
        btnGunslinger2_11.alpha = 0.3f

        val btnGunslinger2_12 = findViewById<ImageButton>(R.id.btnGunslinger2_12)
        btnGunslinger2_12.alpha = 0.3f
        //endregion

        //region Gunslinger Passive Values Panel 2
        val btnGunslingerPassive2_1 = findViewById<ImageButton>(R.id.btnGunslingerPassive2_1)
        btnGunslingerPassive2_1.alpha = 0.3f

        val btnGunslingerPassive2_2 = findViewById<ImageButton>(R.id.btnGunslingerPassive2_2)
        btnGunslingerPassive2_2.alpha = 0.3f

        val btnGunslingerPassive2_3 = findViewById<ImageButton>(R.id.btnGunslingerPassive2_3)
        btnGunslingerPassive2_3.alpha = 0.3f

        val btnGunslingerPassive2_4 = findViewById<ImageButton>(R.id.btnGunslingerPassive2_4)
        btnGunslingerPassive2_4.alpha = 0.3f

        val btnGunslingerPassive2_5 = findViewById<ImageButton>(R.id.btnGunslingerPassive2_5)
        btnGunslingerPassive2_5.alpha = 0.3f

        val btnGunslingerPassive2_6 = findViewById<ImageButton>(R.id.btnGunslingerPassive2_6)
        btnGunslingerPassive2_6.alpha = 0.3f
        //endregion

        //region Gunslinger Skill Values Panel 3
        val btnGunslinger3_1 = findViewById<ImageButton>(R.id.btnGunslinger3_1)
        btnGunslinger3_1.alpha = 0.3f

        val btnGunslinger3_2 = findViewById<ImageButton>(R.id.btnGunslinger3_2)
        btnGunslinger3_2.alpha = 0.3f

        val btnGunslinger3_3 = findViewById<ImageButton>(R.id.btnGunslinger3_3)
        btnGunslinger3_3.alpha = 0.3f

        val btnGunslinger3_4 = findViewById<ImageButton>(R.id.btnGunslinger3_4)
        btnGunslinger3_4.alpha = 0.3f

        val btnGunslinger3_5 = findViewById<ImageButton>(R.id.btnGunslinger3_5)
        btnGunslinger3_5.alpha = 0.3f

        val btnGunslinger3_6 = findViewById<ImageButton>(R.id.btnGunslinger3_6)
        btnGunslinger3_6.alpha = 0.3f

        val btnGunslinger3_7 = findViewById<ImageButton>(R.id.btnGunslinger3_7)
        btnGunslinger3_7.alpha = 0.3f

        val btnGunslinger3_8 = findViewById<ImageButton>(R.id.btnGunslinger3_8)
        btnGunslinger3_8.alpha = 0.3f

        val btnGunslinger3_9 = findViewById<ImageButton>(R.id.btnGunslinger3_9)
        btnGunslinger3_9.alpha = 0.3f

        val btnGunslinger3_10 = findViewById<ImageButton>(R.id.btnGunslinger3_10)
        btnGunslinger3_10.alpha = 0.3f

        val btnGunslinger3_11 = findViewById<ImageButton>(R.id.btnGunslinger3_11)
        btnGunslinger3_11.alpha = 0.3f

        val btnGunslinger3_12 = findViewById<ImageButton>(R.id.btnGunslinger3_12)
        btnGunslinger3_12.alpha = 0.3f
        //endregion

        //region Gunslinger Passive Values Panel 3
        val btnGunslingerPassive3_1 = findViewById<ImageButton>(R.id.btnGunslingerPassive3_1)
        btnGunslingerPassive3_1.alpha = 0.3f

        val btnGunslingerPassive3_2 = findViewById<ImageButton>(R.id.btnGunslingerPassive3_2)
        btnGunslingerPassive3_2.alpha = 0.3f

        val btnGunslingerPassive3_3 = findViewById<ImageButton>(R.id.btnGunslingerPassive3_3)
        btnGunslingerPassive3_3.alpha = 0.3f

        val btnGunslingerPassive3_4 = findViewById<ImageButton>(R.id.btnGunslingerPassive3_4)
        btnGunslingerPassive3_4.alpha = 0.3f

        val btnGunslingerPassive3_5 = findViewById<ImageButton>(R.id.btnGunslingerPassive3_5)
        btnGunslingerPassive3_5.alpha = 0.3f

        val btnGunslingerPassive3_6 = findViewById<ImageButton>(R.id.btnGunslingerPassive3_6)
        btnGunslingerPassive3_6.alpha = 0.3f
        //endregion

        //region Spelldance Skill Values Panel 1
        val btnSpelldance1_1 = findViewById<ImageButton>(R.id.btnSpelldance1_1)
        btnSpelldance1_1.alpha = 0.3f

        val btnSpelldance1_2 = findViewById<ImageButton>(R.id.btnSpelldance1_2)
        btnSpelldance1_2.alpha = 0.3f

        val btnSpelldance1_3 = findViewById<ImageButton>(R.id.btnSpelldance1_3)
        btnSpelldance1_3.alpha = 0.3f

        val btnSpelldance1_4 = findViewById<ImageButton>(R.id.btnSpelldance1_4)
        btnSpelldance1_4.alpha = 0.3f

        val btnSpelldance1_5 = findViewById<ImageButton>(R.id.btnSpelldance1_5)
        btnSpelldance1_5.alpha = 0.3f

        val btnSpelldance1_6 = findViewById<ImageButton>(R.id.btnSpelldance1_6)
        btnSpelldance1_6.alpha = 0.3f

        val btnSpelldance1_7 = findViewById<ImageButton>(R.id.btnSpelldance1_7)
        btnSpelldance1_7.alpha = 0.3f

        val btnSpelldance1_8 = findViewById<ImageButton>(R.id.btnSpelldance1_8)
        btnSpelldance1_8.alpha = 0.3f

        val btnSpelldance1_9 = findViewById<ImageButton>(R.id.btnSpelldance1_9)
        btnSpelldance1_9.alpha = 0.3f

        val btnSpelldance1_10 = findViewById<ImageButton>(R.id.btnSpelldance1_10)
        btnSpelldance1_10.alpha = 0.3f

        val btnSpelldance1_11 = findViewById<ImageButton>(R.id.btnSpelldance1_11)
        btnSpelldance1_11.alpha = 0.3f

        val btnSpelldance1_12 = findViewById<ImageButton>(R.id.btnSpelldance1_12)
        btnSpelldance1_12.alpha = 0.3f
    //endregion

        //region Spelldance Passive Values Panel 1
        val btnSpelldancePassive1_1 = findViewById<ImageButton>(R.id.btnSpelldancePassive1_1)
        btnSpelldancePassive1_1.alpha = 0.3f

        val btnSpelldancePassive1_2 = findViewById<ImageButton>(R.id.btnSpelldancePassive1_2)
        btnSpelldancePassive1_2.alpha = 0.3f

        val btnSpelldancePassive1_3 = findViewById<ImageButton>(R.id.btnSpelldancePassive1_3)
        btnSpelldancePassive1_3.alpha = 0.3f

        val btnSpelldancePassive1_4 = findViewById<ImageButton>(R.id.btnSpelldancePassive1_4)
        btnSpelldancePassive1_4.alpha = 0.3f

        val btnSpelldancePassive1_5 = findViewById<ImageButton>(R.id.btnSpelldancePassive1_5)
        btnSpelldancePassive1_5.alpha = 0.3f

        val btnSpelldancePassive1_6 = findViewById<ImageButton>(R.id.btnSpelldancePassive1_6)
        btnSpelldancePassive1_6.alpha = 0.3f
        //endregion

        //region Spelldance Skill Values Panel 2
        val btnSpelldance2_1 = findViewById<ImageButton>(R.id.btnSpelldance2_1)
        btnSpelldance2_1.alpha = 0.3f

        val btnSpelldance2_2 = findViewById<ImageButton>(R.id.btnSpelldance2_2)
        btnSpelldance2_2.alpha = 0.3f

        val btnSpelldance2_3 = findViewById<ImageButton>(R.id.btnSpelldance2_3)
        btnSpelldance2_3.alpha = 0.3f

        val btnSpelldance2_4 = findViewById<ImageButton>(R.id.btnSpelldance2_4)
        btnSpelldance2_4.alpha = 0.3f

        val btnSpelldance2_5 = findViewById<ImageButton>(R.id.btnSpelldance2_5)
        btnSpelldance2_5.alpha = 0.3f

        val btnSpelldance2_6 = findViewById<ImageButton>(R.id.btnSpelldance2_6)
        btnSpelldance2_6.alpha = 0.3f

        val btnSpelldance2_7 = findViewById<ImageButton>(R.id.btnSpelldance2_7)
        btnSpelldance2_7.alpha = 0.3f

        val btnSpelldance2_8 = findViewById<ImageButton>(R.id.btnSpelldance2_8)
        btnSpelldance2_8.alpha = 0.3f

        val btnSpelldance2_9 = findViewById<ImageButton>(R.id.btnSpelldance2_9)
        btnSpelldance2_9.alpha = 0.3f

        val btnSpelldance2_10 = findViewById<ImageButton>(R.id.btnSpelldance2_10)
        btnSpelldance2_10.alpha = 0.3f

        val btnSpelldance2_11 = findViewById<ImageButton>(R.id.btnSpelldance2_11)
        btnSpelldance2_11.alpha = 0.3f

        val btnSpelldance2_12 = findViewById<ImageButton>(R.id.btnSpelldance2_12)
        btnSpelldance2_12.alpha = 0.3f
        //endregion

        //region Spelldance Passive Values Panel 2
        val btnSpelldancePassive2_1 = findViewById<ImageButton>(R.id.btnSpelldancePassive2_1)
        btnSpelldancePassive2_1.alpha = 0.3f

        val btnSpelldancePassive2_2 = findViewById<ImageButton>(R.id.btnSpelldancePassive2_2)
        btnSpelldancePassive2_2.alpha = 0.3f

        val btnSpelldancePassive2_3 = findViewById<ImageButton>(R.id.btnSpelldancePassive2_3)
        btnSpelldancePassive2_3.alpha = 0.3f

        val btnSpelldancePassive2_4 = findViewById<ImageButton>(R.id.btnSpelldancePassive2_4)
        btnSpelldancePassive2_4.alpha = 0.3f

        val btnSpelldancePassive2_5 = findViewById<ImageButton>(R.id.btnSpelldancePassive2_5)
        btnSpelldancePassive2_5.alpha = 0.3f

        val btnSpelldancePassive2_6 = findViewById<ImageButton>(R.id.btnSpelldancePassive2_6)
        btnSpelldancePassive2_6.alpha = 0.3f
        //endregion

        //region Spelldance Skill Values Panel 3
        val btnSpelldance3_1 = findViewById<ImageButton>(R.id.btnSpelldance3_1)
        btnSpelldance3_1.alpha = 0.3f

        val btnSpelldance3_2 = findViewById<ImageButton>(R.id.btnSpelldance3_2)
        btnSpelldance3_2.alpha = 0.3f

        val btnSpelldance3_3 = findViewById<ImageButton>(R.id.btnSpelldance3_3)
        btnSpelldance3_3.alpha = 0.3f

        val btnSpelldance3_4 = findViewById<ImageButton>(R.id.btnSpelldance3_4)
        btnSpelldance3_4.alpha = 0.3f

        val btnSpelldance3_5 = findViewById<ImageButton>(R.id.btnSpelldance3_5)
        btnSpelldance3_5.alpha = 0.3f

        val btnSpelldance3_6 = findViewById<ImageButton>(R.id.btnSpelldance3_6)
        btnSpelldance3_6.alpha = 0.3f

        val btnSpelldance3_7 = findViewById<ImageButton>(R.id.btnSpelldance3_7)
        btnSpelldance3_7.alpha = 0.3f

        val btnSpelldance3_8 = findViewById<ImageButton>(R.id.btnSpelldance3_8)
        btnSpelldance3_8.alpha = 0.3f

        val btnSpelldance3_9 = findViewById<ImageButton>(R.id.btnSpelldance3_9)
        btnSpelldance3_9.alpha = 0.3f

        val btnSpelldance3_10 = findViewById<ImageButton>(R.id.btnSpelldance3_10)
        btnSpelldance3_10.alpha = 0.3f

        val btnSpelldance3_11 = findViewById<ImageButton>(R.id.btnSpelldance3_11)
        btnSpelldance3_11.alpha = 0.3f

        val btnSpelldance3_12 = findViewById<ImageButton>(R.id.btnSpelldance3_12)
        btnSpelldance3_12.alpha = 0.3f
        //endregion

        //region Spelldance Passive Values Panel 3
        val btnSpelldancePassive3_1 = findViewById<ImageButton>(R.id.btnSpelldancePassive3_1)
        btnSpelldancePassive3_1.alpha = 0.3f

        val btnSpelldancePassive3_2 = findViewById<ImageButton>(R.id.btnSpelldancePassive3_2)
        btnSpelldancePassive3_2.alpha = 0.3f

        val btnSpelldancePassive3_3 = findViewById<ImageButton>(R.id.btnSpelldancePassive3_3)
        btnSpelldancePassive3_3.alpha = 0.3f

        val btnSpelldancePassive3_4 = findViewById<ImageButton>(R.id.btnSpelldancePassive3_4)
        btnSpelldancePassive3_4.alpha = 0.3f

        val btnSpelldancePassive3_5 = findViewById<ImageButton>(R.id.btnSpelldancePassive3_5)
        btnSpelldancePassive3_5.alpha = 0.3f

        val btnSpelldancePassive3_6 = findViewById<ImageButton>(R.id.btnSpelldancePassive3_6)
        btnSpelldancePassive3_6.alpha = 0.3f
        //endregion


        //region Add Skill Point Listeners
        addPoint1.setOnClickListener {
            if(!addPoint1.isSelected) {
                skillPoints++
                tvPointsLeft.text = " $skillPoints points left"
            }
            else {
                skillPoints--
                tvPointsLeft.text = " $skillPoints points left"
            }
            addPoint1.isSelected = !addPoint1.isSelected
        }

        addPoint2.setOnClickListener {
            if(!addPoint2.isSelected) {
                skillPoints++
                tvPointsLeft.text = " $skillPoints points left"
            }
            else {
                skillPoints--
                tvPointsLeft.text = " $skillPoints points left"
            }
            addPoint2.isSelected = !addPoint2.isSelected
        }
        //endregion


        //region Panel 1 Skill Tree Button Actions
        btnBattlerage1.setOnClickListener {
            gridSkillsets1.visibility = View.GONE
            tvPanel1Title.visibility = View.GONE
            btnBattlerage2.visibility = View.GONE
            btnBattlerage3.visibility = View.GONE

            battlerageText1.visibility = View.VISIBLE
            combatText1.visibility = View.VISIBLE
            skillPoints1Text.visibility = View.VISIBLE
            gridBattlerage1.visibility = View.VISIBLE

            passiveText1.visibility = View.VISIBLE
            gridBattleragePassive1.visibility = View.VISIBLE

            btnReset1.visibility = View.VISIBLE
        }

        btnArchery1.setOnClickListener {
            gridSkillsets1.visibility = View.GONE
            tvPanel1Title.visibility = View.GONE
            btnArchery2.visibility = View.GONE
            btnArchery3.visibility = View.GONE

            archeryText1.visibility = View.VISIBLE
            combatText1.visibility = View.VISIBLE
            skillPoints1Text.visibility = View.VISIBLE
            gridArchery1.visibility = View.VISIBLE

            passiveText1.visibility = View.VISIBLE
            gridArcheryPassive1.visibility = View.VISIBLE

            btnReset1.visibility = View.VISIBLE
        }

        btnDefense1.setOnClickListener {
            gridSkillsets1.visibility = View.GONE
            tvPanel1Title.visibility = View.GONE
            btnDefense2.visibility = View.GONE
            btnDefense3.visibility = View.GONE

            defenseText1.visibility = View.VISIBLE
            combatText1.visibility = View.VISIBLE
            skillPoints1Text.visibility = View.VISIBLE
            gridDefense1.visibility = View.VISIBLE

            passiveText1.visibility = View.VISIBLE
            gridDefensePassive1.visibility = View.VISIBLE

            btnReset1.visibility = View.VISIBLE
        }

        btnOccultism1.setOnClickListener {
            gridSkillsets1.visibility = View.GONE
            tvPanel1Title.visibility = View.GONE
            btnOccultism2.visibility = View.GONE
            btnOccultism3.visibility = View.GONE

            occultismText1.visibility = View.VISIBLE
            combatText1.visibility = View.VISIBLE
            skillPoints1Text.visibility = View.VISIBLE
            gridOccultism1.visibility = View.VISIBLE

            passiveText1.visibility = View.VISIBLE
            gridOccultismPassive1.visibility = View.VISIBLE

            btnReset1.visibility = View.VISIBLE
        }

        btnSorcery1.setOnClickListener {
            gridSkillsets1.visibility = View.GONE
            tvPanel1Title.visibility = View.GONE
            btnSorcery2.visibility = View.GONE
            btnSorcery3.visibility = View.GONE

            sorceryText1.visibility = View.VISIBLE
            combatText1.visibility = View.VISIBLE
            skillPoints1Text.visibility = View.VISIBLE
            gridSorcery1.visibility = View.VISIBLE

            passiveText1.visibility = View.VISIBLE
            gridSorceryPassive1.visibility = View.VISIBLE

            btnReset1.visibility = View.VISIBLE
        }

        btnSongcraft1.setOnClickListener {
            gridSkillsets1.visibility = View.GONE
            tvPanel1Title.visibility = View.GONE
            btnSongcraft2.visibility = View.GONE
            btnSongcraft3.visibility = View.GONE

            songcraftText1.visibility = View.VISIBLE
            combatText1.visibility = View.VISIBLE
            skillPoints1Text.visibility = View.VISIBLE
            gridSongcraft1.visibility = View.VISIBLE

            passiveText1.visibility = View.VISIBLE
            gridSongcraftPassive1.visibility = View.VISIBLE

            btnReset1.visibility = View.VISIBLE
        }

        btnWitchcraft1.setOnClickListener {
            gridSkillsets1.visibility = View.GONE
            tvPanel1Title.visibility = View.GONE
            btnWitchcraft2.visibility = View.GONE
            btnWitchcraft3.visibility = View.GONE

            witchcraftText1.visibility = View.VISIBLE
            combatText1.visibility = View.VISIBLE
            skillPoints1Text.visibility = View.VISIBLE
            gridWitchcraft1.visibility = View.VISIBLE

            passiveText1.visibility = View.VISIBLE
            gridWitchcraftPassive1.visibility = View.VISIBLE

            btnReset1.visibility = View.VISIBLE
        }

        btnAuramancy1.setOnClickListener {
            gridSkillsets1.visibility = View.GONE
            tvPanel1Title.visibility = View.GONE
            btnAuramancy2.visibility = View.GONE
            btnAuramancy3.visibility = View.GONE

            auramancyText1.visibility = View.VISIBLE
            combatText1.visibility = View.VISIBLE
            skillPoints1Text.visibility = View.VISIBLE
            gridAuramancy1.visibility = View.VISIBLE

            passiveText1.visibility = View.VISIBLE
            gridAuramancyPassive1.visibility = View.VISIBLE

            btnReset1.visibility = View.VISIBLE
        }

        btnShadowplay1.setOnClickListener {
            gridSkillsets1.visibility = View.GONE
            tvPanel1Title.visibility = View.GONE
            btnShadowplay2.visibility = View.GONE
            btnShadowplay3.visibility = View.GONE

            shadowplayText1.visibility = View.VISIBLE
            combatText1.visibility = View.VISIBLE
            skillPoints1Text.visibility = View.VISIBLE
            gridShadowplay1.visibility = View.VISIBLE

            passiveText1.visibility = View.VISIBLE
            gridShadowplayPassive1.visibility = View.VISIBLE

            btnReset1.visibility = View.VISIBLE
        }

        btnVitalism1.setOnClickListener {
            gridSkillsets1.visibility = View.GONE
            tvPanel1Title.visibility = View.GONE
            btnVitalism2.visibility = View.GONE
            btnVitalism3.visibility = View.GONE

            vitalismText1.visibility = View.VISIBLE
            combatText1.visibility = View.VISIBLE
            skillPoints1Text.visibility = View.VISIBLE
            gridVitalism1.visibility = View.VISIBLE

            passiveText1.visibility = View.VISIBLE
            gridVitalismPassive1.visibility = View.VISIBLE

            btnReset1.visibility = View.VISIBLE
        }

        btnMalediction1.setOnClickListener {
            gridSkillsets1.visibility = View.GONE
            tvPanel1Title.visibility = View.GONE
            btnMalediction2.visibility = View.GONE
            btnMalediction3.visibility = View.GONE

            maledictionText1.visibility = View.VISIBLE
            combatText1.visibility = View.VISIBLE
            skillPoints1Text.visibility = View.VISIBLE
            gridMalediction1.visibility = View.VISIBLE

            passiveText1.visibility = View.VISIBLE
            gridMaledictionPassive1.visibility = View.VISIBLE

            btnReset1.visibility = View.VISIBLE
        }

        btnSwiftblade1.setOnClickListener {
            gridSkillsets1.visibility = View.GONE
            tvPanel1Title.visibility = View.GONE
            btnSwiftblade2.visibility = View.GONE
            btnSwiftblade3.visibility = View.GONE

            swiftbladeText1.visibility = View.VISIBLE
            combatText1.visibility = View.VISIBLE
            skillPoints1Text.visibility = View.VISIBLE
            gridSwiftblade1.visibility = View.VISIBLE

            passiveText1.visibility = View.VISIBLE
            gridSwiftbladePassive1.visibility = View.VISIBLE

            btnReset1.visibility = View.VISIBLE
        }

        btnGunslinger1.setOnClickListener {
            gridSkillsets1.visibility = View.GONE
            tvPanel1Title.visibility = View.GONE
            btnGunslinger2.visibility = View.GONE
            btnGunslinger3.visibility = View.GONE

            gunslingerText1.visibility = View.VISIBLE
            combatText1.visibility = View.VISIBLE
            skillPoints1Text.visibility = View.VISIBLE
            gridGunslinger1.visibility = View.VISIBLE

            passiveText1.visibility = View.VISIBLE
            gridGunslingerPassive1.visibility = View.VISIBLE

            btnReset1.visibility = View.VISIBLE
        }

        btnSpelldance1.setOnClickListener {
            gridSkillsets1.visibility = View.GONE
            tvPanel1Title.visibility = View.GONE
            btnSpelldance2.visibility = View.GONE
            btnSpelldance3.visibility = View.GONE

            spelldanceText1.visibility = View.VISIBLE
            combatText1.visibility = View.VISIBLE
            skillPoints1Text.visibility = View.VISIBLE
            gridSpelldance1.visibility = View.VISIBLE

            passiveText1.visibility = View.VISIBLE
            gridSpelldancePassive1.visibility = View.VISIBLE

            btnReset1.visibility = View.VISIBLE
        }




        //region Skill Reset Function
        fun resetGrid(grid: GridLayout) {
            for (i in 0 until grid.childCount) {
                val child = grid.getChildAt(i)
                if (child is ImageButton) {
                    child.isSelected = false
                    child.alpha = 0.3f
                    // If you want them all disabled at start:
                    // child.isEnabled = false
                }
            }
        }
        //endregion

        //region Panel 1 Reset Button
        btnReset1.setOnClickListener {
            //Enables Visibility of Original Skill Select Panel
            gridSkillsets1.visibility = View.VISIBLE
            tvPanel1Title.visibility = View.VISIBLE

            //Disables Visibility of Skill Texts for the ones enabled
            battlerageText1.visibility = View.GONE
            archeryText1.visibility = View.GONE
            defenseText1.visibility = View.GONE
            occultismText1.visibility = View.GONE
            sorceryText1.visibility = View.GONE
            songcraftText1.visibility = View.GONE
            witchcraftText1.visibility = View.GONE
            auramancyText1.visibility = View.GONE
            shadowplayText1.visibility = View.GONE
            vitalismText1.visibility = View.GONE
            maledictionText1.visibility = View.GONE
            swiftbladeText1.visibility = View.GONE
            gunslingerText1.visibility = View.GONE
            spelldanceText1.visibility = View.GONE

            //Disables Visibility of 'Combat' Text and the Skill Points Text
            combatText1.visibility = View.GONE
            skillPoints1Text.visibility = View.GONE

            //Disables visibility of any visible skill grids
            gridBattlerage1.visibility = View.GONE
            gridArchery1.visibility = View.GONE
            gridDefense1.visibility = View.GONE
            gridOccultism1.visibility = View.GONE
            gridSorcery1.visibility = View.GONE
            gridSongcraft1.visibility = View.GONE
            gridWitchcraft1.visibility = View.GONE
            gridAuramancy1.visibility = View.GONE
            gridShadowplay1.visibility = View.GONE
            gridVitalism1.visibility = View.GONE
            gridMalediction1.visibility = View.GONE
            gridSwiftblade1.visibility = View.GONE
            gridGunslinger1.visibility = View.GONE
            gridSpelldance1.visibility = View.GONE

            //Disables Visibility of 'Passives' Text
            passiveText1.visibility = View.GONE

            //Disables Visibility of Passive Grid for Skill Sets
            gridBattleragePassive1.visibility = View.GONE
            gridArcheryPassive1.visibility = View.GONE
            gridDefensePassive1.visibility = View.GONE
            gridOccultismPassive1.visibility = View.GONE
            gridSorceryPassive1.visibility = View.GONE
            gridSongcraftPassive1.visibility = View.GONE
            gridWitchcraftPassive1.visibility = View.GONE
            gridAuramancyPassive1.visibility = View.GONE
            gridShadowplayPassive1.visibility = View.GONE
            gridVitalismPassive1.visibility = View.GONE
            gridMaledictionPassive1.visibility = View.GONE
            gridSwiftbladePassive1.visibility = View.GONE
            gridGunslingerPassive1.visibility = View.GONE
            gridSpelldancePassive1.visibility = View.GONE

            //Enables Visibility of any invisible buttons
            //btnBattlerage1.visibility = View.VISIBLE

            if(gridBattlerage2.isVisible || gridBattlerage3.isVisible) {
                btnBattlerage1.visibility = View.GONE
            } else {
                btnBattlerage1.visibility = View.VISIBLE
                btnBattlerage2.visibility = View.VISIBLE
                btnBattlerage3.visibility = View.VISIBLE
            }


            if(gridArchery2.isVisible || gridArchery3.isVisible) {
                btnArchery1.visibility = View.GONE
            } else {
                btnArchery1.visibility = View.VISIBLE
                btnArchery2.visibility = View.VISIBLE
                btnArchery3.visibility = View.VISIBLE
            }

            if(gridDefense2.isVisible || gridDefense3.isVisible) {
                btnDefense1.visibility = View.GONE
            } else {
                btnDefense1.visibility = View.VISIBLE
                btnDefense2.visibility = View.VISIBLE
                btnDefense3.visibility = View.VISIBLE
            }

            if(gridOccultism2.isVisible || gridOccultism3.isVisible) {
                btnOccultism1.visibility = View.GONE
            } else {
                btnOccultism1.visibility = View.VISIBLE
                btnOccultism2.visibility = View.VISIBLE
                btnOccultism3.visibility = View.VISIBLE
            }

            if(gridSorcery2.isVisible || gridSorcery3.isVisible) {
                btnSorcery1.visibility = View.GONE
            } else {
                btnSorcery1.visibility = View.VISIBLE
                btnSorcery2.visibility = View.VISIBLE
                btnSorcery3.visibility = View.VISIBLE
            }

            btnSongcraft1.visibility = View.VISIBLE
            btnSongcraft2.visibility = View.VISIBLE
            btnSongcraft3.visibility = View.VISIBLE

            btnWitchcraft1.visibility = View.VISIBLE
            btnWitchcraft2.visibility = View.VISIBLE
            btnWitchcraft3.visibility = View.VISIBLE

            btnAuramancy1.visibility = View.VISIBLE
            btnAuramancy2.visibility = View.VISIBLE
            btnAuramancy3.visibility = View.VISIBLE

            btnShadowplay1.visibility = View.VISIBLE
            btnShadowplay2.visibility = View.VISIBLE
            btnShadowplay3.visibility = View.VISIBLE

            btnVitalism1.visibility = View.VISIBLE
            btnVitalism2.visibility = View.VISIBLE
            btnVitalism3.visibility = View.VISIBLE

            btnMalediction1.visibility = View.VISIBLE
            btnMalediction2.visibility = View.VISIBLE
            btnMalediction3.visibility = View.VISIBLE

            btnSwiftblade1.visibility = View.VISIBLE
            btnSwiftblade2.visibility = View.VISIBLE
            btnSwiftblade3.visibility = View.VISIBLE

            btnGunslinger1.visibility = View.VISIBLE
            btnGunslinger2.visibility = View.VISIBLE
            btnGunslinger3.visibility = View.VISIBLE

            btnSpelldance1.visibility = View.VISIBLE
            btnSpelldance2.visibility = View.VISIBLE
            btnSpelldance3.visibility = View.VISIBLE

            btnReset1.visibility = View.GONE

            skillPoints += skillTree1Points
            skillTree1Points = 0
            tvPointsLeft.text = " $skillPoints points left"
            skillPoints1Text.text = "$skillTree1Points / 12"

            resetGrid(gridBattlerage1)
            resetGrid(gridBattleragePassive1)

            resetGrid(gridArchery1)
            resetGrid(gridArcheryPassive1)

            resetGrid(gridDefense1)
            resetGrid(gridDefensePassive1)

            resetGrid(gridOccultism1)
            resetGrid(gridOccultismPassive1)

            resetGrid(gridSorcery1)
            resetGrid(gridSorceryPassive1)

            resetGrid(gridSongcraft1)
            resetGrid(gridSongcraftPassive1)

            resetGrid(gridWitchcraft1)
            resetGrid(gridWitchcraftPassive1)

            resetGrid(gridAuramancy1)
            resetGrid(gridAuramancyPassive1)

            resetGrid(gridShadowplay1)
            resetGrid(gridShadowplayPassive1)

            resetGrid(gridVitalism1)
            resetGrid(gridVitalismPassive1)

            resetGrid(gridMalediction1)
            resetGrid(gridMaledictionPassive1)

            resetGrid(gridSwiftblade1)
            resetGrid(gridSwiftbladePassive1)

            resetGrid(gridGunslinger1)
            resetGrid(gridGunslingerPassive1)

            resetGrid(gridSpelldance1)
            resetGrid(gridSpelldancePassive1)
        }
        //endregion


        //region Panel 2 Skill Tree Button Actions
        btnBattlerage2.setOnClickListener {
            gridSkillsets2.visibility = View.GONE
            tvPanel2Title.visibility = View.GONE
            btnBattlerage1.visibility = View.GONE
            btnBattlerage3.visibility = View.GONE

            battlerageText2.visibility = View.VISIBLE
            combatText2.visibility = View.VISIBLE
            skillPoints2Text.visibility = View.VISIBLE
            gridBattlerage2.visibility = View.VISIBLE

            passiveText2.visibility = View.VISIBLE
            gridBattleragePassive2.visibility = View.VISIBLE

            btnReset2.visibility = View.VISIBLE
        }

        btnArchery2.setOnClickListener {
            gridSkillsets2.visibility = View.GONE
            tvPanel2Title.visibility = View.GONE
            btnArchery2.visibility = View.GONE
            btnArchery3.visibility = View.GONE

            archeryText2.visibility = View.VISIBLE
            combatText2.visibility = View.VISIBLE
            skillPoints2Text.visibility = View.VISIBLE
            gridArchery2.visibility = View.VISIBLE

            passiveText2.visibility = View.VISIBLE
            gridArcheryPassive2.visibility = View.VISIBLE

            btnReset2.visibility = View.VISIBLE
        }

        btnDefense2.setOnClickListener {
            gridSkillsets2.visibility = View.GONE
            tvPanel2Title.visibility = View.GONE
            btnDefense2.visibility = View.GONE
            btnDefense3.visibility = View.GONE

            defenseText2.visibility = View.VISIBLE
            combatText2.visibility = View.VISIBLE
            skillPoints2Text.visibility = View.VISIBLE
            gridDefense2.visibility = View.VISIBLE

            passiveText2.visibility = View.VISIBLE
            gridDefensePassive2.visibility = View.VISIBLE

            btnReset2.visibility = View.VISIBLE
        }

        btnOccultism2.setOnClickListener {
            gridSkillsets2.visibility = View.GONE
            tvPanel2Title.visibility = View.GONE
            btnOccultism2.visibility = View.GONE
            btnOccultism3.visibility = View.GONE

            occultismText2.visibility = View.VISIBLE
            combatText2.visibility = View.VISIBLE
            skillPoints2Text.visibility = View.VISIBLE
            gridOccultism2.visibility = View.VISIBLE

            passiveText2.visibility = View.VISIBLE
            gridOccultismPassive2.visibility = View.VISIBLE

            btnReset2.visibility = View.VISIBLE
        }

        btnSorcery2.setOnClickListener {
            gridSkillsets2.visibility = View.GONE
            tvPanel2Title.visibility = View.GONE
            btnSorcery2.visibility = View.GONE
            btnSorcery3.visibility = View.GONE

            sorceryText2.visibility = View.VISIBLE
            combatText2.visibility = View.VISIBLE
            skillPoints2Text.visibility = View.VISIBLE
            gridSorcery2.visibility = View.VISIBLE

            passiveText2.visibility = View.VISIBLE
            gridSorceryPassive2.visibility = View.VISIBLE

            btnReset2.visibility = View.VISIBLE
        }

        btnSongcraft2.setOnClickListener {
            gridSkillsets2.visibility = View.GONE
            tvPanel2Title.visibility = View.GONE
            btnSongcraft2.visibility = View.GONE
            btnSongcraft3.visibility = View.GONE

            songcraftText2.visibility = View.VISIBLE
            combatText2.visibility = View.VISIBLE
            skillPoints2Text.visibility = View.VISIBLE
            gridSongcraft2.visibility = View.VISIBLE

            passiveText2.visibility = View.VISIBLE
            gridSongcraftPassive2.visibility = View.VISIBLE

            btnReset2.visibility = View.VISIBLE
        }

        btnWitchcraft2.setOnClickListener {
            gridSkillsets2.visibility = View.GONE
            tvPanel2Title.visibility = View.GONE
            btnWitchcraft2.visibility = View.GONE
            btnWitchcraft3.visibility = View.GONE

            witchcraftText2.visibility = View.VISIBLE
            combatText2.visibility = View.VISIBLE
            skillPoints2Text.visibility = View.VISIBLE
            gridWitchcraft2.visibility = View.VISIBLE

            passiveText2.visibility = View.VISIBLE
            gridWitchcraftPassive2.visibility = View.VISIBLE

            btnReset2.visibility = View.VISIBLE
        }

        btnAuramancy2.setOnClickListener {
            gridSkillsets2.visibility = View.GONE
            tvPanel2Title.visibility = View.GONE
            btnAuramancy2.visibility = View.GONE
            btnAuramancy3.visibility = View.GONE

            auramancyText2.visibility = View.VISIBLE
            combatText2.visibility = View.VISIBLE
            skillPoints2Text.visibility = View.VISIBLE
            gridAuramancy2.visibility = View.VISIBLE

            passiveText2.visibility = View.VISIBLE
            gridAuramancyPassive2.visibility = View.VISIBLE

            btnReset2.visibility = View.VISIBLE
        }

        btnShadowplay2.setOnClickListener {
            gridSkillsets2.visibility = View.GONE
            tvPanel2Title.visibility = View.GONE
            btnShadowplay2.visibility = View.GONE
            btnShadowplay3.visibility = View.GONE

            shadowplayText2.visibility = View.VISIBLE
            combatText2.visibility = View.VISIBLE
            skillPoints2Text.visibility = View.VISIBLE
            gridShadowplay2.visibility = View.VISIBLE

            passiveText2.visibility = View.VISIBLE
            gridShadowplayPassive2.visibility = View.VISIBLE

            btnReset2.visibility = View.VISIBLE
        }

        btnVitalism2.setOnClickListener {
            gridSkillsets2.visibility = View.GONE
            tvPanel2Title.visibility = View.GONE
            btnVitalism2.visibility = View.GONE
            btnVitalism3.visibility = View.GONE

            vitalismText2.visibility = View.VISIBLE
            combatText2.visibility = View.VISIBLE
            skillPoints2Text.visibility = View.VISIBLE
            gridVitalism2.visibility = View.VISIBLE

            passiveText2.visibility = View.VISIBLE
            gridVitalismPassive2.visibility = View.VISIBLE

            btnReset2.visibility = View.VISIBLE
        }

        btnMalediction2.setOnClickListener {
            gridSkillsets2.visibility = View.GONE
            tvPanel2Title.visibility = View.GONE
            btnMalediction2.visibility = View.GONE
            btnMalediction3.visibility = View.GONE

            maledictionText2.visibility = View.VISIBLE
            combatText2.visibility = View.VISIBLE
            skillPoints2Text.visibility = View.VISIBLE
            gridMalediction2.visibility = View.VISIBLE

            passiveText2.visibility = View.VISIBLE
            gridMaledictionPassive2.visibility = View.VISIBLE

            btnReset2.visibility = View.VISIBLE
        }

        btnSwiftblade2.setOnClickListener {
            gridSkillsets2.visibility = View.GONE
            tvPanel2Title.visibility = View.GONE
            btnSwiftblade2.visibility = View.GONE
            btnSwiftblade3.visibility = View.GONE

            swiftbladeText2.visibility = View.VISIBLE
            combatText2.visibility = View.VISIBLE
            skillPoints2Text.visibility = View.VISIBLE
            gridSwiftblade2.visibility = View.VISIBLE

            passiveText2.visibility = View.VISIBLE
            gridSwiftbladePassive2.visibility = View.VISIBLE

            btnReset2.visibility = View.VISIBLE
        }

        btnGunslinger2.setOnClickListener {
            gridSkillsets2.visibility = View.GONE
            tvPanel2Title.visibility = View.GONE
            btnGunslinger2.visibility = View.GONE
            btnGunslinger3.visibility = View.GONE

            gunslingerText2.visibility = View.VISIBLE
            combatText2.visibility = View.VISIBLE
            skillPoints2Text.visibility = View.VISIBLE
            gridGunslinger2.visibility = View.VISIBLE

            passiveText2.visibility = View.VISIBLE
            gridGunslingerPassive2.visibility = View.VISIBLE

            btnReset2.visibility = View.VISIBLE
        }

        btnSpelldance2.setOnClickListener {
            gridSkillsets2.visibility = View.GONE
            tvPanel2Title.visibility = View.GONE
            btnSpelldance2.visibility = View.GONE
            btnSpelldance3.visibility = View.GONE

            spelldanceText2.visibility = View.VISIBLE
            combatText2.visibility = View.VISIBLE
            skillPoints2Text.visibility = View.VISIBLE
            gridSpelldance2.visibility = View.VISIBLE

            passiveText2.visibility = View.VISIBLE
            gridSpelldancePassive2.visibility = View.VISIBLE

            btnReset2.visibility = View.VISIBLE
        }

        //endregion

        //region Panel 2 Reset Button
        btnReset2.setOnClickListener {
            //Enables Visibility of Original Skill Select Panel
            gridSkillsets2.visibility = View.VISIBLE
            tvPanel2Title.visibility = View.VISIBLE

            //Disables Visibility of Skill Texts for the ones enabled
            battlerageText2.visibility = View.GONE
            archeryText2.visibility = View.GONE
            defenseText2.visibility = View.GONE
            occultismText2.visibility = View.GONE
            sorceryText2.visibility = View.GONE
            songcraftText2.visibility = View.GONE
            witchcraftText2.visibility = View.GONE
            auramancyText2.visibility = View.GONE
            shadowplayText2.visibility = View.GONE
            vitalismText2.visibility = View.GONE
            maledictionText2.visibility = View.GONE
            swiftbladeText2.visibility = View.GONE
            gunslingerText2.visibility = View.GONE
            spelldanceText2.visibility = View.GONE

            //Disables Visibility of 'Combat' Text and the Skill Points Text
            combatText2.visibility = View.GONE
            skillPoints2Text.visibility = View.GONE

            //Disables visibility of any visible skill grids
            gridBattlerage2.visibility = View.GONE
            gridArchery2.visibility = View.GONE
            gridDefense2.visibility = View.GONE
            gridOccultism2.visibility = View.GONE
            gridSorcery2.visibility = View.GONE
            gridSongcraft2.visibility = View.GONE
            gridWitchcraft2.visibility = View.GONE
            gridAuramancy2.visibility = View.GONE
            gridShadowplay2.visibility = View.GONE
            gridVitalism2.visibility = View.GONE
            gridMalediction2.visibility = View.GONE
            gridSwiftblade2.visibility = View.GONE
            gridGunslinger2.visibility = View.GONE
            gridSpelldance2.visibility = View.GONE

            //Disables Visibility of 'Passives' Text
            passiveText2.visibility = View.GONE

            //Disables Visibility of Passive Grid for Skill Sets
            gridBattleragePassive2.visibility = View.GONE
            gridArcheryPassive2.visibility = View.GONE
            gridDefensePassive2.visibility = View.GONE
            gridOccultismPassive2.visibility = View.GONE
            gridSorceryPassive2.visibility = View.GONE
            gridSongcraftPassive2.visibility = View.GONE
            gridWitchcraftPassive2.visibility = View.GONE
            gridAuramancyPassive2.visibility = View.GONE
            gridShadowplayPassive2.visibility = View.GONE
            gridVitalismPassive2.visibility = View.GONE
            gridMaledictionPassive2.visibility = View.GONE
            gridSwiftbladePassive2.visibility = View.GONE
            gridGunslingerPassive2.visibility = View.GONE
            gridSpelldancePassive2.visibility = View.GONE

            //Enables Visibility of any invisible buttons
            btnBattlerage1.visibility = View.VISIBLE
            btnBattlerage2.visibility = View.VISIBLE
            btnBattlerage3.visibility = View.VISIBLE

            btnArchery1.visibility = View.VISIBLE
            btnArchery2.visibility = View.VISIBLE
            btnArchery3.visibility = View.VISIBLE

            btnDefense1.visibility = View.VISIBLE
            btnDefense2.visibility = View.VISIBLE
            btnDefense3.visibility = View.VISIBLE

            btnOccultism1.visibility = View.VISIBLE
            btnOccultism2.visibility = View.VISIBLE
            btnOccultism3.visibility = View.VISIBLE

            btnSorcery1.visibility = View.VISIBLE
            btnSorcery2.visibility = View.VISIBLE
            btnSorcery3.visibility = View.VISIBLE

            btnSongcraft1.visibility = View.VISIBLE
            btnSongcraft2.visibility = View.VISIBLE
            btnSongcraft3.visibility = View.VISIBLE

            btnWitchcraft1.visibility = View.VISIBLE
            btnWitchcraft2.visibility = View.VISIBLE
            btnWitchcraft3.visibility = View.VISIBLE

            btnAuramancy1.visibility = View.VISIBLE
            btnAuramancy2.visibility = View.VISIBLE
            btnAuramancy3.visibility = View.VISIBLE

            btnShadowplay1.visibility = View.VISIBLE
            btnShadowplay2.visibility = View.VISIBLE
            btnShadowplay3.visibility = View.VISIBLE

            btnVitalism1.visibility = View.VISIBLE
            btnVitalism2.visibility = View.VISIBLE
            btnVitalism3.visibility = View.VISIBLE

            btnMalediction1.visibility = View.VISIBLE
            btnMalediction2.visibility = View.VISIBLE
            btnMalediction3.visibility = View.VISIBLE

            btnSwiftblade1.visibility = View.VISIBLE
            btnSwiftblade2.visibility = View.VISIBLE
            btnSwiftblade3.visibility = View.VISIBLE

            btnGunslinger1.visibility = View.VISIBLE
            btnGunslinger2.visibility = View.VISIBLE
            btnGunslinger3.visibility = View.VISIBLE

            btnSpelldance1.visibility = View.VISIBLE
            btnSpelldance2.visibility = View.VISIBLE
            btnSpelldance3.visibility = View.VISIBLE

            btnReset2.visibility = View.GONE

            skillPoints += skillTree2Points
            skillTree2Points = 0
            tvPointsLeft.text = " $skillPoints points left"
            skillPoints2Text.text = "$skillTree2Points / 12"

            resetGrid(gridBattlerage2)
            resetGrid(gridBattleragePassive2)

            resetGrid(gridArchery2)
            resetGrid(gridArcheryPassive2)

            resetGrid(gridDefense2)
            resetGrid(gridDefensePassive2)

            resetGrid(gridOccultism2)
            resetGrid(gridOccultismPassive2)

            resetGrid(gridSorcery2)
            resetGrid(gridSorceryPassive2)

            resetGrid(gridSongcraft2)
            resetGrid(gridSongcraftPassive2)

            resetGrid(gridWitchcraft2)
            resetGrid(gridWitchcraftPassive2)

            resetGrid(gridAuramancy2)
            resetGrid(gridAuramancyPassive2)

            resetGrid(gridShadowplay2)
            resetGrid(gridShadowplayPassive2)

            resetGrid(gridVitalism2)
            resetGrid(gridVitalismPassive2)

            resetGrid(gridMalediction2)
            resetGrid(gridMaledictionPassive2)

            resetGrid(gridSwiftblade2)
            resetGrid(gridSwiftbladePassive2)

            resetGrid(gridGunslinger2)
            resetGrid(gridGunslingerPassive2)

            resetGrid(gridSpelldance2)
            resetGrid(gridSpelldancePassive2)
        }
        //endregion


        //region Panel 3 Skill Tree Button Actions
        btnBattlerage3.setOnClickListener {
            gridSkillsets3.visibility = View.GONE
            tvPanel3Title.visibility = View.GONE
            btnBattlerage1.visibility = View.GONE
            btnBattlerage2.visibility = View.GONE

            battlerageText3.visibility = View.VISIBLE
            combatText3.visibility = View.VISIBLE
            skillPoints3Text.visibility = View.VISIBLE
            gridBattlerage3.visibility = View.VISIBLE

            passiveText3.visibility = View.VISIBLE
            gridBattleragePassive3.visibility = View.VISIBLE

            btnReset3.visibility = View.VISIBLE
        }

        btnArchery3.setOnClickListener {
            gridSkillsets3.visibility = View.GONE
            tvPanel3Title.visibility = View.GONE
            btnArchery1.visibility = View.GONE
            btnArchery2.visibility = View.GONE

            archeryText3.visibility = View.VISIBLE
            combatText3.visibility = View.VISIBLE
            skillPoints3Text.visibility = View.VISIBLE
            gridArchery3.visibility = View.VISIBLE

            passiveText3.visibility = View.VISIBLE
            gridArcheryPassive3.visibility = View.VISIBLE

            btnReset3.visibility = View.VISIBLE
        }

        btnDefense3.setOnClickListener {
            gridSkillsets3.visibility = View.GONE
            tvPanel3Title.visibility = View.GONE
            btnDefense1.visibility = View.GONE
            btnDefense2.visibility = View.GONE

            defenseText3.visibility = View.VISIBLE
            combatText3.visibility = View.VISIBLE
            skillPoints3Text.visibility = View.VISIBLE
            gridDefense3.visibility = View.VISIBLE

            passiveText3.visibility = View.VISIBLE
            gridDefensePassive3.visibility = View.VISIBLE

            btnReset3.visibility = View.VISIBLE
        }

        btnOccultism3.setOnClickListener {
            gridSkillsets3.visibility = View.GONE
            tvPanel3Title.visibility = View.GONE
            btnOccultism1.visibility = View.GONE
            btnOccultism2.visibility = View.GONE

            occultismText3.visibility = View.VISIBLE
            combatText3.visibility = View.VISIBLE
            skillPoints3Text.visibility = View.VISIBLE
            gridOccultism3.visibility = View.VISIBLE

            passiveText3.visibility = View.VISIBLE
            gridOccultismPassive3.visibility = View.VISIBLE

            btnReset3.visibility = View.VISIBLE
        }

        btnSorcery3.setOnClickListener {
            gridSkillsets3.visibility = View.GONE
            tvPanel3Title.visibility = View.GONE
            btnSorcery1.visibility = View.GONE
            btnSorcery2.visibility = View.GONE

            sorceryText3.visibility = View.VISIBLE
            combatText3.visibility = View.VISIBLE
            skillPoints3Text.visibility = View.VISIBLE
            gridSorcery3.visibility = View.VISIBLE

            passiveText3.visibility = View.VISIBLE
            gridSorceryPassive3.visibility = View.VISIBLE

            btnReset3.visibility = View.VISIBLE
        }

        btnSongcraft3.setOnClickListener {
            gridSkillsets3.visibility = View.GONE
            tvPanel3Title.visibility = View.GONE
            btnSongcraft1.visibility = View.GONE
            btnSongcraft2.visibility = View.GONE

            songcraftText3.visibility = View.VISIBLE
            combatText3.visibility = View.VISIBLE
            skillPoints3Text.visibility = View.VISIBLE
            gridSongcraft3.visibility = View.VISIBLE

            passiveText3.visibility = View.VISIBLE
            gridSongcraftPassive3.visibility = View.VISIBLE

            btnReset3.visibility = View.VISIBLE
        }

        btnWitchcraft3.setOnClickListener {
            gridSkillsets3.visibility = View.GONE
            tvPanel3Title.visibility = View.GONE
            btnWitchcraft1.visibility = View.GONE
            btnWitchcraft2.visibility = View.GONE

            witchcraftText3.visibility = View.VISIBLE
            combatText3.visibility = View.VISIBLE
            skillPoints3Text.visibility = View.VISIBLE
            gridWitchcraft3.visibility = View.VISIBLE

            passiveText3.visibility = View.VISIBLE
            gridWitchcraftPassive3.visibility = View.VISIBLE

            btnReset3.visibility = View.VISIBLE
        }

        btnAuramancy3.setOnClickListener {
            gridSkillsets3.visibility = View.GONE
            tvPanel3Title.visibility = View.GONE
            btnAuramancy3.visibility = View.GONE
            btnAuramancy3.visibility = View.GONE

            auramancyText3.visibility = View.VISIBLE
            combatText3.visibility = View.VISIBLE
            skillPoints3Text.visibility = View.VISIBLE
            gridAuramancy3.visibility = View.VISIBLE

            passiveText3.visibility = View.VISIBLE
            gridAuramancyPassive3.visibility = View.VISIBLE

            btnReset3.visibility = View.VISIBLE
        }

        btnShadowplay3.setOnClickListener {
            gridSkillsets3.visibility = View.GONE
            tvPanel3Title.visibility = View.GONE
            btnShadowplay3.visibility = View.GONE
            btnShadowplay3.visibility = View.GONE

            shadowplayText3.visibility = View.VISIBLE
            combatText3.visibility = View.VISIBLE
            skillPoints3Text.visibility = View.VISIBLE
            gridShadowplay3.visibility = View.VISIBLE

            passiveText3.visibility = View.VISIBLE
            gridShadowplayPassive3.visibility = View.VISIBLE

            btnReset3.visibility = View.VISIBLE
        }

        btnVitalism3.setOnClickListener {
            gridSkillsets3.visibility = View.GONE
            tvPanel3Title.visibility = View.GONE
            btnVitalism3.visibility = View.GONE
            btnVitalism3.visibility = View.GONE

            vitalismText3.visibility = View.VISIBLE
            combatText3.visibility = View.VISIBLE
            skillPoints3Text.visibility = View.VISIBLE
            gridVitalism3.visibility = View.VISIBLE

            passiveText3.visibility = View.VISIBLE
            gridVitalismPassive3.visibility = View.VISIBLE

            btnReset3.visibility = View.VISIBLE
        }

        btnMalediction3.setOnClickListener {
            gridSkillsets3.visibility = View.GONE
            tvPanel3Title.visibility = View.GONE
            btnMalediction3.visibility = View.GONE
            btnMalediction3.visibility = View.GONE

            maledictionText3.visibility = View.VISIBLE
            combatText3.visibility = View.VISIBLE
            skillPoints3Text.visibility = View.VISIBLE
            gridMalediction3.visibility = View.VISIBLE

            passiveText3.visibility = View.VISIBLE
            gridMaledictionPassive3.visibility = View.VISIBLE

            btnReset3.visibility = View.VISIBLE
        }

        btnSwiftblade3.setOnClickListener {
            gridSkillsets3.visibility = View.GONE
            tvPanel3Title.visibility = View.GONE
            btnSwiftblade3.visibility = View.GONE
            btnSwiftblade3.visibility = View.GONE

            swiftbladeText3.visibility = View.VISIBLE
            combatText3.visibility = View.VISIBLE
            skillPoints3Text.visibility = View.VISIBLE
            gridSwiftblade3.visibility = View.VISIBLE

            passiveText3.visibility = View.VISIBLE
            gridSwiftbladePassive3.visibility = View.VISIBLE

            btnReset3.visibility = View.VISIBLE
        }

        btnGunslinger3.setOnClickListener {
            gridSkillsets3.visibility = View.GONE
            tvPanel3Title.visibility = View.GONE
            btnGunslinger3.visibility = View.GONE
            btnGunslinger3.visibility = View.GONE

            gunslingerText3.visibility = View.VISIBLE
            combatText3.visibility = View.VISIBLE
            skillPoints3Text.visibility = View.VISIBLE
            gridGunslinger3.visibility = View.VISIBLE

            passiveText3.visibility = View.VISIBLE
            gridGunslingerPassive3.visibility = View.VISIBLE

            btnReset3.visibility = View.VISIBLE
        }

        btnSpelldance3.setOnClickListener {
            gridSkillsets3.visibility = View.GONE
            tvPanel3Title.visibility = View.GONE
            btnSpelldance3.visibility = View.GONE
            btnSpelldance3.visibility = View.GONE

            spelldanceText3.visibility = View.VISIBLE
            combatText3.visibility = View.VISIBLE
            skillPoints3Text.visibility = View.VISIBLE
            gridSpelldance3.visibility = View.VISIBLE

            passiveText3.visibility = View.VISIBLE
            gridSpelldancePassive3.visibility = View.VISIBLE

            btnReset3.visibility = View.VISIBLE
        }

        //endregion

        //region Panel 3 Reset Button
        btnReset3.setOnClickListener {
            //Enables Visibility of Original Skill Select Panel
            gridSkillsets3.visibility = View.VISIBLE
            tvPanel3Title.visibility = View.VISIBLE

            //Disables Visibility of Skill Texts for the ones enabled
            battlerageText3.visibility = View.GONE
            archeryText3.visibility = View.GONE
            defenseText3.visibility = View.GONE
            occultismText3.visibility = View.GONE
            sorceryText3.visibility = View.GONE
            songcraftText3.visibility = View.GONE
            witchcraftText3.visibility = View.GONE
            auramancyText3.visibility = View.GONE
            shadowplayText3.visibility = View.GONE
            vitalismText3.visibility = View.GONE
            maledictionText3.visibility = View.GONE
            swiftbladeText3.visibility = View.GONE
            gunslingerText3.visibility = View.GONE
            spelldanceText3.visibility = View.GONE

            //Disables Visibility of 'Combat' Text and the Skill Points Text
            combatText3.visibility = View.GONE
            skillPoints3Text.visibility = View.GONE

            //Disables visibility of any visible skill grids
            gridBattlerage3.visibility = View.GONE
            gridArchery3.visibility = View.GONE
            gridDefense3.visibility = View.GONE
            gridOccultism3.visibility = View.GONE
            gridSorcery3.visibility = View.GONE
            gridSongcraft3.visibility = View.GONE
            gridWitchcraft3.visibility = View.GONE
            gridAuramancy3.visibility = View.GONE
            gridShadowplay3.visibility = View.GONE
            gridVitalism3.visibility = View.GONE
            gridMalediction3.visibility = View.GONE
            gridSwiftblade3.visibility = View.GONE
            gridGunslinger3.visibility = View.GONE
            gridSpelldance3.visibility = View.GONE

            //Disables Visibility of 'Passives' Text
            passiveText3.visibility = View.GONE

            //Disables Visibility of Passive Grid for Skill Sets
            gridBattleragePassive3.visibility = View.GONE
            gridArcheryPassive3.visibility = View.GONE
            gridDefensePassive3.visibility = View.GONE
            gridOccultismPassive3.visibility = View.GONE
            gridSorceryPassive3.visibility = View.GONE
            gridSongcraftPassive3.visibility = View.GONE
            gridWitchcraftPassive3.visibility = View.GONE
            gridAuramancyPassive3.visibility = View.GONE
            gridShadowplayPassive3.visibility = View.GONE
            gridVitalismPassive3.visibility = View.GONE
            gridMaledictionPassive3.visibility = View.GONE
            gridSwiftbladePassive3.visibility = View.GONE
            gridGunslingerPassive3.visibility = View.GONE
            gridSpelldancePassive3.visibility = View.GONE

            //Enables Visibility of any invisible buttons
            btnBattlerage1.visibility = View.VISIBLE
            btnBattlerage2.visibility = View.VISIBLE
            btnBattlerage3.visibility = View.VISIBLE

            btnArchery1.visibility = View.VISIBLE
            btnArchery2.visibility = View.VISIBLE
            btnArchery3.visibility = View.VISIBLE

            btnDefense1.visibility = View.VISIBLE
            btnDefense2.visibility = View.VISIBLE
            btnDefense3.visibility = View.VISIBLE

            btnOccultism1.visibility = View.VISIBLE
            btnOccultism2.visibility = View.VISIBLE
            btnOccultism3.visibility = View.VISIBLE

            btnSorcery1.visibility = View.VISIBLE
            btnSorcery2.visibility = View.VISIBLE
            btnSorcery3.visibility = View.VISIBLE

            btnSongcraft1.visibility = View.VISIBLE
            btnSongcraft2.visibility = View.VISIBLE
            btnSongcraft3.visibility = View.VISIBLE

            btnWitchcraft1.visibility = View.VISIBLE
            btnWitchcraft2.visibility = View.VISIBLE
            btnWitchcraft3.visibility = View.VISIBLE

            btnAuramancy1.visibility = View.VISIBLE
            btnAuramancy2.visibility = View.VISIBLE
            btnAuramancy3.visibility = View.VISIBLE

            btnShadowplay1.visibility = View.VISIBLE
            btnShadowplay2.visibility = View.VISIBLE
            btnShadowplay3.visibility = View.VISIBLE

            btnVitalism1.visibility = View.VISIBLE
            btnVitalism2.visibility = View.VISIBLE
            btnVitalism3.visibility = View.VISIBLE

            btnMalediction1.visibility = View.VISIBLE
            btnMalediction2.visibility = View.VISIBLE
            btnMalediction3.visibility = View.VISIBLE

            btnSwiftblade1.visibility = View.VISIBLE
            btnSwiftblade2.visibility = View.VISIBLE
            btnSwiftblade3.visibility = View.VISIBLE

            btnGunslinger1.visibility = View.VISIBLE
            btnGunslinger2.visibility = View.VISIBLE
            btnGunslinger3.visibility = View.VISIBLE

            btnSpelldance1.visibility = View.VISIBLE
            btnSpelldance2.visibility = View.VISIBLE
            btnSpelldance3.visibility = View.VISIBLE

            btnReset3.visibility = View.GONE

            skillPoints += skillTree3Points
            skillTree3Points = 0
            tvPointsLeft.text = " $skillPoints points left"
            skillPoints3Text.text = "$skillTree3Points / 12"

            resetGrid(gridBattlerage3)
            resetGrid(gridBattleragePassive3)

            resetGrid(gridArchery3)
            resetGrid(gridArcheryPassive3)

            resetGrid(gridDefense3)
            resetGrid(gridDefensePassive3)

            resetGrid(gridOccultism3)
            resetGrid(gridOccultismPassive3)

            resetGrid(gridSorcery3)
            resetGrid(gridSorceryPassive3)

            resetGrid(gridSongcraft3)
            resetGrid(gridSongcraftPassive3)

            resetGrid(gridWitchcraft3)
            resetGrid(gridWitchcraftPassive3)

            resetGrid(gridAuramancy3)
            resetGrid(gridAuramancyPassive3)

            resetGrid(gridShadowplay3)
            resetGrid(gridShadowplayPassive3)

            resetGrid(gridVitalism3)
            resetGrid(gridVitalismPassive3)

            resetGrid(gridMalediction3)
            resetGrid(gridMaledictionPassive3)

            resetGrid(gridSwiftblade3)
            resetGrid(gridSwiftbladePassive3)

            resetGrid(gridGunslinger3)
            resetGrid(gridGunslingerPassive3)

            resetGrid(gridSpelldance3)
            resetGrid(gridSpelldancePassive3)
        }
        //endregion



        //region Passive Unlocker Function
        fun passiveUnlocker(passive1: ImageButton, passive2: ImageButton, passive3: ImageButton, passive4: ImageButton, passive5: ImageButton, passive6: ImageButton, skillTreePointsText: TextView, skillTreePoints: Int) {
            if (skillTreePoints >= 3) {
                passive1.alpha = 1.0f
            } else {
                passive1.alpha = 0.3f
            }
            if (skillTreePoints >= 4) {
                passive2.alpha = 1.0f
            } else {
                passive2.alpha = 0.3f
            }
            if (skillTreePoints >= 5) {
                passive3.alpha = 1.0f
            } else {
                passive3.alpha = 0.3f
            }
            if (skillTreePoints >= 6) {
                passive4.alpha = 1.0f
            } else {
                passive4.alpha =0.3f
            }
            if (skillTreePoints >= 7) {
                passive5.alpha = 1.0f
            } else {
                passive5.alpha = 0.3f
            }
            if (skillTreePoints >= 8) {
                passive6.alpha = 1.0f
            } else {
                passive6.alpha = 0.3f
            }
        }
        //endregion

        //region Skills 1 Unlocking Function
        fun skillUnlock1(
            btn4: ImageButton,
            btn8: ImageButton,
            btn12: ImageButton,
            p1: ImageButton,
            p2: ImageButton,
            p3: ImageButton,
            p4: ImageButton,
            p5: ImageButton,
            p6: ImageButton,
            skillText: TextView,
            skillTreePoints: Int
        ) {
            // basic enable/disable based on current points
            btn4.isEnabled = skillTree1Points >= 3
            btn8.isEnabled = skillTree1Points >= 4
            btn12.isEnabled = skillTree1Points >= 6


            // 🔹 skill 12: requires 6 points
            if (skillTree1Points < 7 && btn12.isSelected) {
                btn12.isSelected = false
                btn12.isEnabled = false
                btn12.alpha = 0.3f
                skillPoints++
                skillTree1Points--
            }

            // 🔹 skill 8: requires 4 points
            if (skillTree1Points < 5 && btn8.isSelected) {
                btn8.isSelected = false
                btn8.isEnabled = false
                btn8.alpha = 0.3f
                skillPoints++
                skillTree1Points--
            }

            // 🔹 skill 4: requires 3 points
            if (skillTree1Points < 4 && btn4.isSelected) {
                btn4.isSelected = false
                btn4.isEnabled = false
                btn4.alpha = 0.3f
                skillPoints++          // refund the point spent on this skill
                skillTree1Points--     // one less point in this tree
            }


            // 🔹 After any auto-unselect/refund, keep the labels in sync
            tvPointsLeft.text = " $skillPoints points left"
            skillPoints1Text.text  = "$skillTree1Points / 12"

            passiveUnlocker(p1,p2,p3,p4,p5,p6, skillText,skillTreePoints)
        }

        //endregion
        
        //region Skills 2 Unlocking Function
        fun skillUnlock2(
            btn4: ImageButton,
            btn8: ImageButton,
            btn12: ImageButton,
            p1: ImageButton,
            p2: ImageButton,
            p3: ImageButton,
            p4: ImageButton,
            p5: ImageButton,
            p6: ImageButton,
            skillText: TextView,
            skillTreePoints: Int
        ) {
            // basic enable/disable based on current points
            btn4.isEnabled = skillTree2Points >= 3
            btn8.isEnabled = skillTree2Points >= 4
            btn12.isEnabled = skillTree2Points >= 6


            // 🔹 skill 12: requires 6 points
            if (skillTree2Points < 7 && btn12.isSelected) {
                btn12.isSelected = false
                btn12.isEnabled = false
                btn12.alpha = 0.3f
                skillPoints++
                skillTree2Points--
            }

            // 🔹 skill 8: requires 4 points
            if (skillTree2Points < 5 && btn8.isSelected) {
                btn8.isSelected = false
                btn8.isEnabled = false
                btn8.alpha = 0.3f
                skillPoints++
                skillTree2Points--
            }

            // 🔹 skill 4: requires 3 points
            if (skillTree2Points < 4 && btn4.isSelected) {
                btn4.isSelected = false
                btn4.isEnabled = false
                btn4.alpha = 0.3f
                skillPoints++          // refund the point spent on this skill
                skillTree2Points--     // one less point in this tree
            }


            // 🔹 After any auto-unselect/refund, keep the labels in sync
            tvPointsLeft.text = " $skillPoints points left"
            skillPoints2Text.text  = "$skillTree2Points / 12"

            passiveUnlocker(p1,p2,p3,p4,p5,p6, skillText,skillTree2Points)
        }

        //endregion

        //region Skills 3 Unlocking Function
        fun skillUnlock3(
            btn4: ImageButton,
            btn8: ImageButton,
            btn12: ImageButton,
            p1: ImageButton,
            p2: ImageButton,
            p3: ImageButton,
            p4: ImageButton,
            p5: ImageButton,
            p6: ImageButton,
            skillText: TextView,
            skillTreePoints: Int
        ) {
            // basic enable/disable based on current points
            btn4.isEnabled = skillTree3Points >= 3
            btn8.isEnabled = skillTree3Points >= 4
            btn12.isEnabled = skillTree3Points >= 6


            // 🔹 skill 12: requires 6 points
            if (skillTree3Points < 7 && btn12.isSelected) {
                btn12.isSelected = false
                btn12.isEnabled = false
                btn12.alpha = 0.3f
                skillPoints++
                skillTree3Points--
            }

            // 🔹 skill 8: requires 4 points
            if (skillTree3Points < 5 && btn8.isSelected) {
                btn8.isSelected = false
                btn8.isEnabled = false
                btn8.alpha = 0.3f
                skillPoints++
                skillTree3Points--
            }

            // 🔹 skill 4: requires 3 points
            if (skillTree3Points < 4 && btn4.isSelected) {
                btn4.isSelected = false
                btn4.isEnabled = false
                btn4.alpha = 0.3f
                skillPoints++          // refund the point spent on this skill
                skillTree3Points--     // one less point in this tree
            }


            // 🔹 After any auto-unselect/refund, keep the labels in sync
            tvPointsLeft.text = " $skillPoints points left"
            skillPoints3Text.text  = "$skillTree3Points / 12"

            passiveUnlocker(p1,p2,p3,p4,p5,p6, skillText,skillTree2Points)
        }

        //endregion



        //region Update Buttons 1 Logic Function
        fun updateButtons1(btnSkill : ImageButton) {
            if(btnSkill.isSelected) {
                btnSkill.alpha = 0.3f
                skillPoints++
                skillTree1Points--
                tvPointsLeft.text = " ${skillPoints} points left"
                skillPoints1Text.text  = "${skillTree1Points} / 12"
            } else {
                btnSkill.alpha = 1.0f
                skillPoints--
                skillTree1Points++
                tvPointsLeft.text = " ${skillPoints} points left"
                skillPoints1Text.text  = "${skillTree1Points} / 12"
            }

        }
        //endregion
        
        //region Update Buttons 2 Logic Function
        fun updateButtons2(btnSkill : ImageButton) {
            if(btnSkill.isSelected) {
                btnSkill.alpha = 0.3f
                skillPoints++
                skillTree2Points--
                tvPointsLeft.text = " ${skillPoints} points left"
                skillPoints2Text.text  = "${skillTree2Points} / 12"
            } else {
                btnSkill.alpha = 1.0f
                skillPoints--
                skillTree2Points++
                tvPointsLeft.text = " ${skillPoints} points left"
                skillPoints2Text.text  = "${skillTree2Points} / 12"
            }

        }
        //endregion

        //region Update Buttons 3 Logic Function
        fun updateButtons3(btnSkill : ImageButton) {
            if(btnSkill.isSelected) {
                btnSkill.alpha = 0.3f
                skillPoints++
                skillTree3Points--
                tvPointsLeft.text = " ${skillPoints} points left"
                skillPoints3Text.text  = "${skillTree3Points} / 12"
            } else {
                btnSkill.alpha = 1.0f
                skillPoints--
                skillTree3Points++
                tvPointsLeft.text = " ${skillPoints} points left"
                skillPoints3Text.text  = "${skillTree3Points} / 12"
            }

        }
        //endregion


        //region Battlerage1 Button Actions
        btnBattlerage1_1.setOnClickListener {
            if (skillPoints <= 0){
                if (btnBattlerage1_1.isSelected) {
                    updateButtons1(btnBattlerage1_1)
                    btnBattlerage1_1.isSelected = !btnBattlerage1_1.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnBattlerage1_1)

            skillUnlock1(
                btnBattlerage1_4, btnBattlerage1_8, btnBattlerage1_12,
                btnBattleragePassive1_1, btnBattleragePassive1_2, btnBattleragePassive1_3,
                btnBattleragePassive1_4, btnBattleragePassive1_5, btnBattleragePassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnBattlerage1_1.isSelected = !btnBattlerage1_1.isSelected
        }

        btnBattlerage1_2.setOnClickListener {

            if (skillPoints <= 0){
                if (btnBattlerage1_2.isSelected) {
                    updateButtons1(btnBattlerage1_2)
                    btnBattlerage1_2.isSelected = !btnBattlerage1_2.isSelected
                }
                return@setOnClickListener
            }

            updateButtons1(btnBattlerage1_2)

            skillUnlock1(
                btnBattlerage1_4, btnBattlerage1_8, btnBattlerage1_12,
                btnBattleragePassive1_1, btnBattleragePassive1_2, btnBattleragePassive1_3,
                btnBattleragePassive1_4, btnBattleragePassive1_5, btnBattleragePassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnBattlerage1_2.isSelected = !btnBattlerage1_2.isSelected
        }

        btnBattlerage1_3.setOnClickListener {

            if (skillPoints <= 0){
                if (btnBattlerage1_3.isSelected) {
                    updateButtons1(btnBattlerage1_3)
                    btnBattlerage1_3.isSelected = !btnBattlerage1_3.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnBattlerage1_3)

            skillUnlock1(
                btnBattlerage1_4, btnBattlerage1_8, btnBattlerage1_12,
                btnBattleragePassive1_1, btnBattleragePassive1_2, btnBattleragePassive1_3,
                btnBattleragePassive1_4, btnBattleragePassive1_5, btnBattleragePassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnBattlerage1_3.isSelected = !btnBattlerage1_3.isSelected
        }

        btnBattlerage1_4.setOnClickListener {

            if (skillPoints <= 0){
                if (btnBattlerage1_4.isSelected) {
                    updateButtons1(btnBattlerage1_4)
                    btnBattlerage1_4.isSelected = !btnBattlerage1_4.isSelected
                }
                return@setOnClickListener
            }

            updateButtons1(btnBattlerage1_4)

            btnBattlerage1_4.isSelected = !btnBattlerage1_4.isSelected
            skillUnlock1(
                btnBattlerage1_4, btnBattlerage1_8, btnBattlerage1_12,
                btnBattleragePassive1_1, btnBattleragePassive1_2, btnBattleragePassive1_3,
                btnBattleragePassive1_4, btnBattleragePassive1_5, btnBattleragePassive1_6,
                skillPoints1Text, skillTree1Points
            )
        }

        btnBattlerage1_5.setOnClickListener {

            if (skillPoints <= 0){
                if (btnBattlerage1_5.isSelected) {
                    updateButtons1(btnBattlerage1_5)
                    btnBattlerage1_5.isSelected = !btnBattlerage1_5.isSelected
                }
                return@setOnClickListener
            }

            updateButtons1(btnBattlerage1_5)

            skillUnlock1(
                btnBattlerage1_4, btnBattlerage1_8, btnBattlerage1_12,
                btnBattleragePassive1_1, btnBattleragePassive1_2, btnBattleragePassive1_3,
                btnBattleragePassive1_4, btnBattleragePassive1_5, btnBattleragePassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnBattlerage1_5.isSelected = !btnBattlerage1_5.isSelected
        }

        btnBattlerage1_6.setOnClickListener {

            if (skillPoints <= 0){
                if (btnBattlerage1_6.isSelected) {
                    updateButtons1(btnBattlerage1_6)
                    btnBattlerage1_6.isSelected = !btnBattlerage1_6.isSelected
                }
                return@setOnClickListener
            }

            updateButtons1(btnBattlerage1_6)

            skillUnlock1(
                btnBattlerage1_4, btnBattlerage1_8, btnBattlerage1_12,
                btnBattleragePassive1_1, btnBattleragePassive1_2, btnBattleragePassive1_3,
                btnBattleragePassive1_4, btnBattleragePassive1_5, btnBattleragePassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnBattlerage1_6.isSelected = !btnBattlerage1_6.isSelected
        }

        btnBattlerage1_7.setOnClickListener {

            if (skillPoints <= 0){
                if (btnBattlerage1_7.isSelected) {
                    updateButtons1(btnBattlerage1_7)
                    btnBattlerage1_7.isSelected = !btnBattlerage1_7.isSelected
                }
                return@setOnClickListener
            }

            updateButtons1(btnBattlerage1_7)

            skillUnlock1(
                btnBattlerage1_4, btnBattlerage1_8, btnBattlerage1_12,
                btnBattleragePassive1_1, btnBattleragePassive1_2, btnBattleragePassive1_3,
                btnBattleragePassive1_4, btnBattleragePassive1_5, btnBattleragePassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnBattlerage1_7.isSelected = !btnBattlerage1_7.isSelected
        }

        btnBattlerage1_8.setOnClickListener {

            if (skillPoints <= 0){
                if (btnBattlerage1_8.isSelected) {
                    updateButtons1(btnBattlerage1_8)
                    btnBattlerage1_8.isSelected = !btnBattlerage1_8.isSelected
                }
                return@setOnClickListener
            }

            updateButtons1(btnBattlerage1_8)

            btnBattlerage1_8.isSelected = !btnBattlerage1_8.isSelected
            skillUnlock1(
                btnBattlerage1_4, btnBattlerage1_8, btnBattlerage1_12,
                btnBattleragePassive1_1, btnBattleragePassive1_2, btnBattleragePassive1_3,
                btnBattleragePassive1_4, btnBattleragePassive1_5, btnBattleragePassive1_6,
                skillPoints1Text, skillTree1Points
            )
        }

        btnBattlerage1_9.setOnClickListener {

            if (skillPoints <= 0){
                if (btnBattlerage1_9.isSelected) {
                    updateButtons1(btnBattlerage1_9)
                    btnBattlerage1_9.isSelected = !btnBattlerage1_9.isSelected
                }
                return@setOnClickListener
            }

            updateButtons1(btnBattlerage1_9)

            skillUnlock1(
                btnBattlerage1_4, btnBattlerage1_8, btnBattlerage1_12,
                btnBattleragePassive1_1, btnBattleragePassive1_2, btnBattleragePassive1_3,
                btnBattleragePassive1_4, btnBattleragePassive1_5, btnBattleragePassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnBattlerage1_9.isSelected = !btnBattlerage1_9.isSelected
        }

        btnBattlerage1_10.setOnClickListener {

            if (skillPoints <= 0){
                if (btnBattlerage1_10.isSelected) {
                    updateButtons1(btnBattlerage1_10)
                    btnBattlerage1_10.isSelected = !btnBattlerage1_10.isSelected
                }
                return@setOnClickListener
            }

            updateButtons1(btnBattlerage1_10)

            skillUnlock1(
                btnBattlerage1_4, btnBattlerage1_8, btnBattlerage1_12,
                btnBattleragePassive1_1, btnBattleragePassive1_2, btnBattleragePassive1_3,
                btnBattleragePassive1_4, btnBattleragePassive1_5, btnBattleragePassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnBattlerage1_10.isSelected = !btnBattlerage1_10.isSelected
        }

        btnBattlerage1_11.setOnClickListener {

            if (skillPoints <= 0){
                if (btnBattlerage1_11.isSelected) {
                    updateButtons1(btnBattlerage1_11)
                    btnBattlerage1_11.isSelected = !btnBattlerage1_11.isSelected
                }
                return@setOnClickListener
            }

            updateButtons1(btnBattlerage1_11)

            skillUnlock1(
                btnBattlerage1_4, btnBattlerage1_8, btnBattlerage1_12,
                btnBattleragePassive1_1, btnBattleragePassive1_2, btnBattleragePassive1_3,
                btnBattleragePassive1_4, btnBattleragePassive1_5, btnBattleragePassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnBattlerage1_11.isSelected = !btnBattlerage1_11.isSelected
        }

        btnBattlerage1_12.setOnClickListener {

            if (skillPoints <= 0){
                if (btnBattlerage1_12.isSelected) {
                    updateButtons1(btnBattlerage1_12)
                    btnBattlerage1_12.isSelected = !btnBattlerage1_12.isSelected
                }
                return@setOnClickListener
            }

            updateButtons1(btnBattlerage1_12)

            btnBattlerage1_12.isSelected = !btnBattlerage1_12.isSelected
            skillUnlock1(
                btnBattlerage1_4, btnBattlerage1_8, btnBattlerage1_12,
                btnBattleragePassive1_1, btnBattleragePassive1_2, btnBattleragePassive1_3,
                btnBattleragePassive1_4, btnBattleragePassive1_5, btnBattleragePassive1_6,
                skillPoints1Text, skillTree1Points
            )
        }


        //endregion

        //region Battlerage2 Button Actions
        btnBattlerage2_1.setOnClickListener {
            if (skillPoints <= 0){
                if (btnBattlerage2_1.isSelected) {
                    updateButtons2(btnBattlerage2_1)
                    btnBattlerage2_1.isSelected = !btnBattlerage2_1.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnBattlerage2_1)

            skillUnlock2(
                btnBattlerage2_4, btnBattlerage2_8, btnBattlerage2_12,
                btnBattleragePassive2_1, btnBattleragePassive2_2, btnBattleragePassive2_3,
                btnBattleragePassive2_4, btnBattleragePassive2_5, btnBattleragePassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnBattlerage2_1.isSelected = !btnBattlerage2_1.isSelected
        }

        btnBattlerage2_2.setOnClickListener {

            if (skillPoints <= 0){
                if (btnBattlerage2_2.isSelected) {
                    updateButtons2(btnBattlerage2_2)
                    btnBattlerage2_2.isSelected = !btnBattlerage2_2.isSelected
                }
                return@setOnClickListener
            }

            updateButtons2(btnBattlerage2_2)

            skillUnlock2(
                btnBattlerage2_4, btnBattlerage2_8, btnBattlerage2_12,
                btnBattleragePassive2_1, btnBattleragePassive2_2, btnBattleragePassive2_3,
                btnBattleragePassive2_4, btnBattleragePassive2_5, btnBattleragePassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnBattlerage2_2.isSelected = !btnBattlerage2_2.isSelected
        }

        btnBattlerage2_3.setOnClickListener {

            if (skillPoints <= 0){
                if (btnBattlerage2_3.isSelected) {
                    updateButtons2(btnBattlerage2_3)
                    btnBattlerage2_3.isSelected = !btnBattlerage2_3.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnBattlerage2_3)

            skillUnlock2(
                btnBattlerage2_4, btnBattlerage2_8, btnBattlerage2_12,
                btnBattleragePassive2_1, btnBattleragePassive2_2, btnBattleragePassive2_3,
                btnBattleragePassive2_4, btnBattleragePassive2_5, btnBattleragePassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnBattlerage2_3.isSelected = !btnBattlerage2_3.isSelected
        }

        btnBattlerage2_4.setOnClickListener {

            if (skillPoints <= 0){
                if (btnBattlerage2_4.isSelected) {
                    updateButtons2(btnBattlerage2_4)
                    btnBattlerage2_4.isSelected = !btnBattlerage2_4.isSelected
                }
                return@setOnClickListener
            }

            updateButtons2(btnBattlerage2_4)

            btnBattlerage2_4.isSelected = !btnBattlerage2_4.isSelected
            skillUnlock2(
                btnBattlerage2_4, btnBattlerage2_8, btnBattlerage2_12,
                btnBattleragePassive2_1, btnBattleragePassive2_2, btnBattleragePassive2_3,
                btnBattleragePassive2_4, btnBattleragePassive2_5, btnBattleragePassive2_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnBattlerage2_5.setOnClickListener {

            if (skillPoints <= 0){
                if (btnBattlerage2_5.isSelected) {
                    updateButtons2(btnBattlerage2_5)
                    btnBattlerage2_5.isSelected = !btnBattlerage2_5.isSelected
                }
                return@setOnClickListener
            }

            updateButtons2(btnBattlerage2_5)

            skillUnlock2(
                btnBattlerage2_4, btnBattlerage2_8, btnBattlerage2_12,
                btnBattleragePassive2_1, btnBattleragePassive2_2, btnBattleragePassive2_3,
                btnBattleragePassive2_4, btnBattleragePassive2_5, btnBattleragePassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnBattlerage2_5.isSelected = !btnBattlerage2_5.isSelected
        }

        btnBattlerage2_6.setOnClickListener {

            if (skillPoints <= 0){
                if (btnBattlerage2_6.isSelected) {
                    updateButtons2(btnBattlerage2_6)
                    btnBattlerage2_6.isSelected = !btnBattlerage2_6.isSelected
                }
                return@setOnClickListener
            }

            updateButtons2(btnBattlerage2_6)

            skillUnlock2(
                btnBattlerage2_4, btnBattlerage2_8, btnBattlerage2_12,
                btnBattleragePassive2_1, btnBattleragePassive2_2, btnBattleragePassive2_3,
                btnBattleragePassive2_4, btnBattleragePassive2_5, btnBattleragePassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnBattlerage2_6.isSelected = !btnBattlerage2_6.isSelected
        }

        btnBattlerage2_7.setOnClickListener {

            if (skillPoints <= 0){
                if (btnBattlerage2_7.isSelected) {
                    updateButtons2(btnBattlerage2_7)
                    btnBattlerage2_7.isSelected = !btnBattlerage2_7.isSelected
                }
                return@setOnClickListener
            }

            updateButtons2(btnBattlerage2_7)

            skillUnlock2(
                btnBattlerage2_4, btnBattlerage2_8, btnBattlerage2_12,
                btnBattleragePassive2_1, btnBattleragePassive2_2, btnBattleragePassive2_3,
                btnBattleragePassive2_4, btnBattleragePassive2_5, btnBattleragePassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnBattlerage2_7.isSelected = !btnBattlerage2_7.isSelected
        }

        btnBattlerage2_8.setOnClickListener {

            if (skillPoints <= 0){
                if (btnBattlerage2_8.isSelected) {
                    updateButtons2(btnBattlerage2_8)
                    btnBattlerage2_8.isSelected = !btnBattlerage2_8.isSelected
                }
                return@setOnClickListener
            }

            updateButtons2(btnBattlerage2_8)

            btnBattlerage2_8.isSelected = !btnBattlerage2_8.isSelected
            skillUnlock2(
                btnBattlerage2_4, btnBattlerage2_8, btnBattlerage2_12,
                btnBattleragePassive2_1, btnBattleragePassive2_2, btnBattleragePassive2_3,
                btnBattleragePassive2_4, btnBattleragePassive2_5, btnBattleragePassive2_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnBattlerage2_9.setOnClickListener {

            if (skillPoints <= 0){
                if (btnBattlerage2_9.isSelected) {
                    updateButtons2(btnBattlerage2_9)
                    btnBattlerage2_9.isSelected = !btnBattlerage2_9.isSelected
                }
                return@setOnClickListener
            }

            updateButtons2(btnBattlerage2_9)

            skillUnlock2(
                btnBattlerage2_4, btnBattlerage2_8, btnBattlerage2_12,
                btnBattleragePassive2_1, btnBattleragePassive2_2, btnBattleragePassive2_3,
                btnBattleragePassive2_4, btnBattleragePassive2_5, btnBattleragePassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnBattlerage2_9.isSelected = !btnBattlerage2_9.isSelected
        }

        btnBattlerage2_10.setOnClickListener {

            if (skillPoints <= 0){
                if (btnBattlerage2_10.isSelected) {
                    updateButtons2(btnBattlerage2_10)
                    btnBattlerage2_10.isSelected = !btnBattlerage2_10.isSelected
                }
                return@setOnClickListener
            }

            updateButtons2(btnBattlerage2_10)

            skillUnlock2(
                btnBattlerage2_4, btnBattlerage2_8, btnBattlerage2_12,
                btnBattleragePassive2_1, btnBattleragePassive2_2, btnBattleragePassive2_3,
                btnBattleragePassive2_4, btnBattleragePassive2_5, btnBattleragePassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnBattlerage2_10.isSelected = !btnBattlerage2_10.isSelected
        }

        btnBattlerage2_11.setOnClickListener {

            if (skillPoints <= 0){
                if (btnBattlerage2_11.isSelected) {
                    updateButtons2(btnBattlerage2_11)
                    btnBattlerage2_11.isSelected = !btnBattlerage2_11.isSelected
                }
                return@setOnClickListener
            }

            updateButtons2(btnBattlerage2_11)

            skillUnlock2(
                btnBattlerage2_4, btnBattlerage2_8, btnBattlerage2_12,
                btnBattleragePassive2_1, btnBattleragePassive2_2, btnBattleragePassive2_3,
                btnBattleragePassive2_4, btnBattleragePassive2_5, btnBattleragePassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnBattlerage2_11.isSelected = !btnBattlerage2_11.isSelected
        }

        btnBattlerage2_12.setOnClickListener {

            if (skillPoints <= 0){
                if (btnBattlerage2_12.isSelected) {
                    updateButtons2(btnBattlerage2_12)
                    btnBattlerage2_12.isSelected = !btnBattlerage2_12.isSelected
                }
                return@setOnClickListener
            }

            updateButtons2(btnBattlerage2_12)

            btnBattlerage2_12.isSelected = !btnBattlerage2_12.isSelected
            skillUnlock2(
                btnBattlerage2_4, btnBattlerage2_8, btnBattlerage2_12,
                btnBattleragePassive2_1, btnBattleragePassive2_2, btnBattleragePassive2_3,
                btnBattleragePassive2_4, btnBattleragePassive2_5, btnBattleragePassive2_6,
                skillPoints2Text, skillTree2Points
            )
        }


        //endregion

        //region Battlerage3 Button Actions
        btnBattlerage3_1.setOnClickListener {
            if (skillPoints <= 0){
                if (btnBattlerage3_1.isSelected) {
                    updateButtons3(btnBattlerage3_1)
                    btnBattlerage3_1.isSelected = !btnBattlerage3_1.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnBattlerage3_1)

            skillUnlock3(
                btnBattlerage3_4, btnBattlerage3_8, btnBattlerage3_12,
                btnBattleragePassive3_1, btnBattleragePassive3_2, btnBattleragePassive3_3,
                btnBattleragePassive3_4, btnBattleragePassive3_5, btnBattleragePassive3_6,
                skillPoints3Text, skillTree3Points
            )
            btnBattlerage3_1.isSelected = !btnBattlerage3_1.isSelected
        }

        btnBattlerage3_2.setOnClickListener {

            if (skillPoints <= 0){
                if (btnBattlerage3_2.isSelected) {
                    updateButtons3(btnBattlerage3_2)
                    btnBattlerage3_2.isSelected = !btnBattlerage3_2.isSelected
                }
                return@setOnClickListener
            }

            updateButtons3(btnBattlerage3_2)

            skillUnlock3(
                btnBattlerage3_4, btnBattlerage3_8, btnBattlerage3_12,
                btnBattleragePassive3_1, btnBattleragePassive3_2, btnBattleragePassive3_3,
                btnBattleragePassive3_4, btnBattleragePassive3_5, btnBattleragePassive3_6,
                skillPoints3Text, skillTree3Points
            )
            btnBattlerage3_2.isSelected = !btnBattlerage3_2.isSelected
        }

        btnBattlerage3_3.setOnClickListener {

            if (skillPoints <= 0){
                if (btnBattlerage3_3.isSelected) {
                    updateButtons3(btnBattlerage3_3)
                    btnBattlerage3_3.isSelected = !btnBattlerage3_3.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnBattlerage3_3)

            skillUnlock3(
                btnBattlerage3_4, btnBattlerage3_8, btnBattlerage3_12,
                btnBattleragePassive3_1, btnBattleragePassive3_2, btnBattleragePassive3_3,
                btnBattleragePassive3_4, btnBattleragePassive3_5, btnBattleragePassive3_6,
                skillPoints3Text, skillTree3Points
            )
            btnBattlerage3_3.isSelected = !btnBattlerage3_3.isSelected
        }

        btnBattlerage3_4.setOnClickListener {

            if (skillPoints <= 0){
                if (btnBattlerage3_4.isSelected) {
                    updateButtons3(btnBattlerage3_4)
                    btnBattlerage3_4.isSelected = !btnBattlerage3_4.isSelected
                }
                return@setOnClickListener
            }

            updateButtons3(btnBattlerage3_4)

            btnBattlerage3_4.isSelected = !btnBattlerage3_4.isSelected
            skillUnlock3(
                btnBattlerage3_4, btnBattlerage3_8, btnBattlerage3_12,
                btnBattleragePassive3_1, btnBattleragePassive3_2, btnBattleragePassive3_3,
                btnBattleragePassive3_4, btnBattleragePassive3_5, btnBattleragePassive3_6,
                skillPoints3Text, skillTree3Points
            )
        }

        btnBattlerage3_5.setOnClickListener {

            if (skillPoints <= 0){
                if (btnBattlerage3_5.isSelected) {
                    updateButtons3(btnBattlerage3_5)
                    btnBattlerage3_5.isSelected = !btnBattlerage3_5.isSelected
                }
                return@setOnClickListener
            }

            updateButtons3(btnBattlerage3_5)

            skillUnlock3(
                btnBattlerage3_4, btnBattlerage3_8, btnBattlerage3_12,
                btnBattleragePassive3_1, btnBattleragePassive3_2, btnBattleragePassive3_3,
                btnBattleragePassive3_4, btnBattleragePassive3_5, btnBattleragePassive3_6,
                skillPoints3Text, skillTree3Points
            )
            btnBattlerage3_5.isSelected = !btnBattlerage3_5.isSelected
        }

        btnBattlerage3_6.setOnClickListener {

            if (skillPoints <= 0){
                if (btnBattlerage3_6.isSelected) {
                    updateButtons3(btnBattlerage3_6)
                    btnBattlerage3_6.isSelected = !btnBattlerage3_6.isSelected
                }
                return@setOnClickListener
            }

            updateButtons3(btnBattlerage3_6)

            skillUnlock3(
                btnBattlerage3_4, btnBattlerage3_8, btnBattlerage3_12,
                btnBattleragePassive3_1, btnBattleragePassive3_2, btnBattleragePassive3_3,
                btnBattleragePassive3_4, btnBattleragePassive3_5, btnBattleragePassive3_6,
                skillPoints3Text, skillTree3Points
            )
            btnBattlerage3_6.isSelected = !btnBattlerage3_6.isSelected
        }

        btnBattlerage3_7.setOnClickListener {

            if (skillPoints <= 0){
                if (btnBattlerage3_7.isSelected) {
                    updateButtons3(btnBattlerage3_7)
                    btnBattlerage3_7.isSelected = !btnBattlerage3_7.isSelected
                }
                return@setOnClickListener
            }

            updateButtons3(btnBattlerage3_7)

            skillUnlock3(
                btnBattlerage3_4, btnBattlerage3_8, btnBattlerage3_12,
                btnBattleragePassive3_1, btnBattleragePassive3_2, btnBattleragePassive3_3,
                btnBattleragePassive3_4, btnBattleragePassive3_5, btnBattleragePassive3_6,
                skillPoints3Text, skillTree3Points
            )
            btnBattlerage3_7.isSelected = !btnBattlerage3_7.isSelected
        }

        btnBattlerage3_8.setOnClickListener {

            if (skillPoints <= 0){
                if (btnBattlerage3_8.isSelected) {
                    updateButtons3(btnBattlerage3_8)
                    btnBattlerage3_8.isSelected = !btnBattlerage3_8.isSelected
                }
                return@setOnClickListener
            }

            updateButtons3(btnBattlerage3_8)

            btnBattlerage3_8.isSelected = !btnBattlerage3_8.isSelected
            skillUnlock3(
                btnBattlerage3_4, btnBattlerage3_8, btnBattlerage3_12,
                btnBattleragePassive3_1, btnBattleragePassive3_2, btnBattleragePassive3_3,
                btnBattleragePassive3_4, btnBattleragePassive3_5, btnBattleragePassive3_6,
                skillPoints3Text, skillTree3Points
            )
        }

        btnBattlerage3_9.setOnClickListener {

            if (skillPoints <= 0){
                if (btnBattlerage3_9.isSelected) {
                    updateButtons3(btnBattlerage3_9)
                    btnBattlerage3_9.isSelected = !btnBattlerage3_9.isSelected
                }
                return@setOnClickListener
            }

            updateButtons3(btnBattlerage3_9)

            skillUnlock3(
                btnBattlerage3_4, btnBattlerage3_8, btnBattlerage3_12,
                btnBattleragePassive3_1, btnBattleragePassive3_2, btnBattleragePassive3_3,
                btnBattleragePassive3_4, btnBattleragePassive3_5, btnBattleragePassive3_6,
                skillPoints3Text, skillTree3Points
            )
            btnBattlerage3_9.isSelected = !btnBattlerage3_9.isSelected
        }

        btnBattlerage3_10.setOnClickListener {

            if (skillPoints <= 0){
                if (btnBattlerage3_10.isSelected) {
                    updateButtons3(btnBattlerage3_10)
                    btnBattlerage3_10.isSelected = !btnBattlerage3_10.isSelected
                }
                return@setOnClickListener
            }

            updateButtons3(btnBattlerage3_10)

            skillUnlock3(
                btnBattlerage3_4, btnBattlerage3_8, btnBattlerage3_12,
                btnBattleragePassive3_1, btnBattleragePassive3_2, btnBattleragePassive3_3,
                btnBattleragePassive3_4, btnBattleragePassive3_5, btnBattleragePassive3_6,
                skillPoints3Text, skillTree3Points
            )
            btnBattlerage3_10.isSelected = !btnBattlerage3_10.isSelected
        }

        btnBattlerage3_11.setOnClickListener {

            if (skillPoints <= 0){
                if (btnBattlerage3_11.isSelected) {
                    updateButtons3(btnBattlerage3_11)
                    btnBattlerage3_11.isSelected = !btnBattlerage3_11.isSelected
                }
                return@setOnClickListener
            }

            updateButtons3(btnBattlerage3_11)

            skillUnlock3(
                btnBattlerage3_4, btnBattlerage3_8, btnBattlerage3_12,
                btnBattleragePassive3_1, btnBattleragePassive3_2, btnBattleragePassive3_3,
                btnBattleragePassive3_4, btnBattleragePassive3_5, btnBattleragePassive3_6,
                skillPoints3Text, skillTree3Points
            )
            btnBattlerage3_11.isSelected = !btnBattlerage3_11.isSelected
        }

        btnBattlerage3_12.setOnClickListener {

            if (skillPoints <= 0){
                if (btnBattlerage3_12.isSelected) {
                    updateButtons3(btnBattlerage3_12)
                    btnBattlerage3_12.isSelected = !btnBattlerage3_12.isSelected
                }
                return@setOnClickListener
            }

            updateButtons3(btnBattlerage3_12)

            btnBattlerage3_12.isSelected = !btnBattlerage3_12.isSelected
            skillUnlock3(
                btnBattlerage3_4, btnBattlerage3_8, btnBattlerage3_12,
                btnBattleragePassive3_1, btnBattleragePassive3_2, btnBattleragePassive3_3,
                btnBattleragePassive3_4, btnBattleragePassive3_5, btnBattleragePassive3_6,
                skillPoints3Text, skillTree3Points
            )
        }


        //endregion


        //region Archery1 Button Actions
        btnArchery1_1.setOnClickListener {
            if (skillPoints <= 0) {
                if (btnArchery1_1.isSelected) {
                    updateButtons1(btnArchery1_1)
                    btnArchery1_1.isSelected = !btnArchery1_1.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnArchery1_1)

            skillUnlock1(
                btnArchery1_4, btnArchery1_8, btnArchery1_12,
                btnArcheryPassive1_1, btnArcheryPassive1_2, btnArcheryPassive1_3,
                btnArcheryPassive1_4, btnArcheryPassive1_5, btnArcheryPassive1_6, skillPoints1Text,
                skillTree1Points
            )
            btnArchery1_1.isSelected = !btnArchery1_1.isSelected
        }

        btnArchery1_2.setOnClickListener {
            if (skillPoints <= 0) {
                if (btnArchery1_2.isSelected) {
                    updateButtons1(btnArchery1_2)
                    btnArchery1_2.isSelected = !btnArchery1_2.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnArchery1_2)

            skillUnlock1(
                btnArchery1_4, btnArchery1_8, btnArchery1_12,
                btnArcheryPassive1_1, btnArcheryPassive1_2, btnArcheryPassive1_3,
                btnArcheryPassive1_4, btnArcheryPassive1_5, btnArcheryPassive1_6, skillPoints1Text,
                skillTree1Points
            )
            btnArchery1_2.isSelected = !btnArchery1_2.isSelected
        }

        btnArchery1_3.setOnClickListener {
            if (skillPoints <= 0) {
                if (btnArchery1_3.isSelected) {
                    updateButtons1(btnArchery1_3)
                    btnArchery1_3.isSelected = !btnArchery1_3.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnArchery1_3)

            skillUnlock1(
                btnArchery1_4, btnArchery1_8, btnArchery1_12,
                btnArcheryPassive1_1, btnArcheryPassive1_2, btnArcheryPassive1_3,
                btnArcheryPassive1_4, btnArcheryPassive1_5, btnArcheryPassive1_6, skillPoints1Text,
                skillTree1Points
            )
            btnArchery1_3.isSelected = !btnArchery1_3.isSelected
        }

        btnArchery1_4.setOnClickListener {
            if (skillPoints <= 0) {
                if (btnArchery1_4.isSelected) {
                    updateButtons1(btnArchery1_4)
                    btnArchery1_4.isSelected = !btnArchery1_4.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnArchery1_4)

            btnArchery1_4.isSelected = !btnArchery1_4.isSelected
            skillUnlock1(
                btnArchery1_4, btnArchery1_8, btnArchery1_12,
                btnArcheryPassive1_1, btnArcheryPassive1_2, btnArcheryPassive1_3,
                btnArcheryPassive1_4, btnArcheryPassive1_5, btnArcheryPassive1_6, skillPoints1Text,
                skillTree1Points
            )
        }

        btnArchery1_5.setOnClickListener {
            if (skillPoints <= 0) {
                if (btnArchery1_5.isSelected) {
                    updateButtons1(btnArchery1_5)
                    btnArchery1_5.isSelected = !btnArchery1_5.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnArchery1_5)

            skillUnlock1(
                btnArchery1_4, btnArchery1_8, btnArchery1_12,
                btnArcheryPassive1_1, btnArcheryPassive1_2, btnArcheryPassive1_3,
                btnArcheryPassive1_4, btnArcheryPassive1_5, btnArcheryPassive1_6, skillPoints1Text,
                skillTree1Points
            )
            btnArchery1_5.isSelected = !btnArchery1_5.isSelected
        }

        btnArchery1_6.setOnClickListener {
            if (skillPoints <= 0) {
                if (btnArchery1_6.isSelected) {
                    updateButtons1(btnArchery1_6)
                    btnArchery1_6.isSelected = !btnArchery1_6.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnArchery1_6)

            skillUnlock1(
                btnArchery1_4, btnArchery1_8, btnArchery1_12,
                btnArcheryPassive1_1, btnArcheryPassive1_2, btnArcheryPassive1_3,
                btnArcheryPassive1_4, btnArcheryPassive1_5, btnArcheryPassive1_6, skillPoints1Text,
                skillTree1Points
            )
            btnArchery1_6.isSelected = !btnArchery1_6.isSelected
        }

        btnArchery1_7.setOnClickListener {
            if (skillPoints <= 0) {
                if (btnArchery1_7.isSelected) {
                    updateButtons1(btnArchery1_7)
                    btnArchery1_7.isSelected = !btnArchery1_7.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnArchery1_7)

            skillUnlock1(
                btnArchery1_4, btnArchery1_8, btnArchery1_12,
                btnArcheryPassive1_1, btnArcheryPassive1_2, btnArcheryPassive1_3,
                btnArcheryPassive1_4, btnArcheryPassive1_5, btnArcheryPassive1_6, skillPoints1Text,
                skillTree1Points
            )
            btnArchery1_7.isSelected = !btnArchery1_7.isSelected
        }

        btnArchery1_8.setOnClickListener {
            if (skillPoints <= 0) {
                if (btnArchery1_8.isSelected) {
                    updateButtons1(btnArchery1_8)
                    btnArchery1_8.isSelected = !btnArchery1_8.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnArchery1_8)

            btnArchery1_8.isSelected = !btnArchery1_8.isSelected
            skillUnlock1(
                btnArchery1_4, btnArchery1_8, btnArchery1_12,
                btnArcheryPassive1_1, btnArcheryPassive1_2, btnArcheryPassive1_3,
                btnArcheryPassive1_4, btnArcheryPassive1_5, btnArcheryPassive1_6, skillPoints1Text,
                skillTree1Points
            )
        }

        btnArchery1_9.setOnClickListener {
            if (skillPoints <= 0) {
                if (btnArchery1_9.isSelected) {
                    updateButtons1(btnArchery1_9)
                    btnArchery1_9.isSelected = !btnArchery1_9.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnArchery1_9)

            skillUnlock1(
                btnArchery1_4, btnArchery1_8, btnArchery1_12,
                btnArcheryPassive1_1, btnArcheryPassive1_2, btnArcheryPassive1_3,
                btnArcheryPassive1_4, btnArcheryPassive1_5, btnArcheryPassive1_6, skillPoints1Text,
                skillTree1Points
            )
            btnArchery1_9.isSelected = !btnArchery1_9.isSelected
        }

        btnArchery1_10.setOnClickListener {
            if (skillPoints <= 0) {
                if (btnArchery1_10.isSelected) {
                    updateButtons1(btnArchery1_10)
                    btnArchery1_10.isSelected = !btnArchery1_10.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnArchery1_10)

            skillUnlock1(
                btnArchery1_4, btnArchery1_8, btnArchery1_12,
                btnArcheryPassive1_1, btnArcheryPassive1_2, btnArcheryPassive1_3,
                btnArcheryPassive1_4, btnArcheryPassive1_5, btnArcheryPassive1_6, skillPoints1Text,
                skillTree1Points
            )
            btnArchery1_10.isSelected = !btnArchery1_10.isSelected
        }

        btnArchery1_11.setOnClickListener {
            if (skillPoints <= 0) {
                if (btnArchery1_11.isSelected) {
                    updateButtons1(btnArchery1_11)
                    btnArchery1_11.isSelected = !btnArchery1_11.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnArchery1_11)

            skillUnlock1(
                btnArchery1_4, btnArchery1_8, btnArchery1_12,
                btnArcheryPassive1_1, btnArcheryPassive1_2, btnArcheryPassive1_3,
                btnArcheryPassive1_4, btnArcheryPassive1_5, btnArcheryPassive1_6, skillPoints1Text,
                skillTree1Points
            )
            btnArchery1_11.isSelected = !btnArchery1_11.isSelected
        }

        btnArchery1_12.setOnClickListener {
            if (skillPoints <= 0) {
                if (btnArchery1_12.isSelected) {
                    updateButtons1(btnArchery1_12)
                    btnArchery1_12.isSelected = !btnArchery1_12.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnArchery1_12)

            btnArchery1_12.isSelected = !btnArchery1_12.isSelected
            skillUnlock1(
                btnArchery1_4, btnArchery1_8, btnArchery1_12,
                btnArcheryPassive1_1, btnArcheryPassive1_2, btnArcheryPassive1_3,
                btnArcheryPassive1_4, btnArcheryPassive1_5, btnArcheryPassive1_6, skillPoints1Text,
                skillTree1Points
            )
        }
//endregion

        //region Archery2 Button Actions
        btnArchery2_1.setOnClickListener {
            if (skillPoints <= 0){
                if (btnArchery2_1.isSelected) {
                    updateButtons2(btnArchery2_1)
                    btnArchery2_1.isSelected = !btnArchery2_1.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnArchery2_1)

            skillUnlock2(
                btnArchery2_4, btnArchery2_8, btnArchery2_12,
                btnArcheryPassive2_1, btnArcheryPassive2_2, btnArcheryPassive2_3,
                btnArcheryPassive2_4, btnArcheryPassive2_5, btnArcheryPassive2_6, 
                skillPoints2Text, skillTree2Points
            )
            btnArchery2_1.isSelected = !btnArchery2_1.isSelected
        }

        btnArchery2_2.setOnClickListener {
            if (skillPoints <= 0){
                if (btnArchery2_2.isSelected) {
                    updateButtons2(btnArchery2_2)
                    btnArchery2_2.isSelected = !btnArchery2_2.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnArchery2_2)

            skillUnlock2(
                btnArchery2_4, btnArchery2_8, btnArchery2_12,
                btnArcheryPassive2_1, btnArcheryPassive2_2, btnArcheryPassive2_3,
                btnArcheryPassive2_4, btnArcheryPassive2_5, btnArcheryPassive2_6, 
                skillPoints2Text, skillTree2Points
            )
            btnArchery2_2.isSelected = !btnArchery2_2.isSelected
        }

        btnArchery2_3.setOnClickListener {
            if (skillPoints <= 0){
                if (btnArchery2_3.isSelected) {
                    updateButtons2(btnArchery2_3)
                    btnArchery2_3.isSelected = !btnArchery2_3.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnArchery2_3)

            skillUnlock2(
                btnArchery2_4, btnArchery2_8, btnArchery2_12,
                btnArcheryPassive2_1, btnArcheryPassive2_2, btnArcheryPassive2_3,
                btnArcheryPassive2_4, btnArcheryPassive2_5, btnArcheryPassive2_6, 
                skillPoints2Text, skillTree2Points
            )
            btnArchery2_3.isSelected = !btnArchery2_3.isSelected
        }

        btnArchery2_4.setOnClickListener {
            if (skillPoints <= 0){
                if (btnArchery2_4.isSelected) {
                    updateButtons2(btnArchery2_4)
                    btnArchery2_4.isSelected = !btnArchery2_4.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnArchery2_4)

            btnArchery2_4.isSelected = !btnArchery2_4.isSelected
            skillUnlock2(
                btnArchery2_4, btnArchery2_8, btnArchery2_12,
                btnArcheryPassive2_1, btnArcheryPassive2_2, btnArcheryPassive2_3,
                btnArcheryPassive2_4, btnArcheryPassive2_5, btnArcheryPassive2_6, 
                skillPoints2Text, skillTree2Points
            )
        }

        btnArchery2_5.setOnClickListener {
            if (skillPoints <= 0){
                if (btnArchery2_5.isSelected) {
                    updateButtons2(btnArchery2_5)
                    btnArchery2_5.isSelected = !btnArchery2_5.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnArchery2_5)

            skillUnlock2(
                btnArchery2_4, btnArchery2_8, btnArchery2_12,
                btnArcheryPassive2_1, btnArcheryPassive2_2, btnArcheryPassive2_3,
                btnArcheryPassive2_4, btnArcheryPassive2_5, btnArcheryPassive2_6, 
                skillPoints2Text, skillTree2Points
            )
            btnArchery2_5.isSelected = !btnArchery2_5.isSelected
        }

        btnArchery2_6.setOnClickListener {
            if (skillPoints <= 0){
                if (btnArchery2_6.isSelected) {
                    updateButtons2(btnArchery2_6)
                    btnArchery2_6.isSelected = !btnArchery2_6.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnArchery2_6)

            skillUnlock2(
                btnArchery2_4, btnArchery2_8, btnArchery2_12,
                btnArcheryPassive2_1, btnArcheryPassive2_2, btnArcheryPassive2_3,
                btnArcheryPassive2_4, btnArcheryPassive2_5, btnArcheryPassive2_6, 
                skillPoints2Text, skillTree2Points
            )
            btnArchery2_6.isSelected = !btnArchery2_6.isSelected
        }

        btnArchery2_7.setOnClickListener {
            if (skillPoints <= 0){
                if (btnArchery2_7.isSelected) {
                    updateButtons2(btnArchery2_7)
                    btnArchery2_7.isSelected = !btnArchery2_7.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnArchery2_7)

            skillUnlock2(
                btnArchery2_4, btnArchery2_8, btnArchery2_12,
                btnArcheryPassive2_1, btnArcheryPassive2_2, btnArcheryPassive2_3,
                btnArcheryPassive2_4, btnArcheryPassive2_5, btnArcheryPassive2_6, 
                skillPoints2Text, skillTree2Points
            )
            btnArchery2_7.isSelected = !btnArchery2_7.isSelected
        }

        btnArchery2_8.setOnClickListener {
            if (skillPoints <= 0){
                if (btnArchery2_8.isSelected) {
                    updateButtons2(btnArchery2_8)
                    btnArchery2_8.isSelected = !btnArchery2_8.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnArchery2_8)

            btnArchery2_8.isSelected = !btnArchery2_8.isSelected
            skillUnlock2(
                btnArchery2_4, btnArchery2_8, btnArchery2_12,
                btnArcheryPassive2_1, btnArcheryPassive2_2, btnArcheryPassive2_3,
                btnArcheryPassive2_4, btnArcheryPassive2_5, btnArcheryPassive2_6, 
                skillPoints2Text, skillTree2Points
            )
        }

        btnArchery2_9.setOnClickListener {
            if (skillPoints <= 0){
                if (btnArchery2_9.isSelected) {
                    updateButtons2(btnArchery2_9)
                    btnArchery2_9.isSelected = !btnArchery2_9.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnArchery2_9)

            skillUnlock2(
                btnArchery2_4, btnArchery2_8, btnArchery2_12,
                btnArcheryPassive2_1, btnArcheryPassive2_2, btnArcheryPassive2_3,
                btnArcheryPassive2_4, btnArcheryPassive2_5, btnArcheryPassive2_6, 
                skillPoints2Text, skillTree2Points
            )
            btnArchery2_9.isSelected = !btnArchery2_9.isSelected
        }

        btnArchery2_10.setOnClickListener {
            if (skillPoints <= 0){
                if (btnArchery2_10.isSelected) {
                    updateButtons2(btnArchery2_10)
                    btnArchery2_10.isSelected = !btnArchery2_10.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnArchery2_10)

            skillUnlock2(
                btnArchery2_4, btnArchery2_8, btnArchery2_12,
                btnArcheryPassive2_1, btnArcheryPassive2_2, btnArcheryPassive2_3,
                btnArcheryPassive2_4, btnArcheryPassive2_5, btnArcheryPassive2_6, 
                skillPoints2Text, skillTree2Points
            )
            btnArchery2_10.isSelected = !btnArchery2_10.isSelected
        }

        btnArchery2_11.setOnClickListener {
            if (skillPoints <= 0){
                if (btnArchery2_11.isSelected) {
                    updateButtons2(btnArchery2_11)
                    btnArchery2_11.isSelected = !btnArchery2_11.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnArchery2_11)

            skillUnlock2(
                btnArchery2_4, btnArchery2_8, btnArchery2_12,
                btnArcheryPassive2_1, btnArcheryPassive2_2, btnArcheryPassive2_3,
                btnArcheryPassive2_4, btnArcheryPassive2_5, btnArcheryPassive2_6, 
                skillPoints2Text, skillTree2Points
            )
            btnArchery2_11.isSelected = !btnArchery2_11.isSelected
        }

        btnArchery2_12.setOnClickListener {
            if (skillPoints <= 0){
                if (btnArchery2_12.isSelected) {
                    updateButtons2(btnArchery2_12)
                    btnArchery2_12.isSelected = !btnArchery2_12.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnArchery2_12)

            btnArchery2_12.isSelected = !btnArchery2_12.isSelected
            skillUnlock2(
                btnArchery2_4, btnArchery2_8, btnArchery2_12,
                btnArcheryPassive2_1, btnArcheryPassive2_2, btnArcheryPassive2_3,
                btnArcheryPassive2_4, btnArcheryPassive2_5, btnArcheryPassive2_6, 
                skillPoints2Text, skillTree2Points
            )
        }
//endregion

        //region Archery3 Button Actions
        btnArchery3_1.setOnClickListener {
            if (skillPoints <= 0){
                if (btnArchery3_1.isSelected) {
                    updateButtons3(btnArchery3_1)
                    btnArchery3_1.isSelected = !btnArchery3_1.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnArchery3_1)

            skillUnlock3(
                btnArchery3_4, btnArchery3_8, btnArchery3_12,
                btnArcheryPassive3_1, btnArcheryPassive3_2, btnArcheryPassive3_3,
                btnArcheryPassive3_4, btnArcheryPassive3_5, btnArcheryPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnArchery3_1.isSelected = !btnArchery3_1.isSelected
        }

        btnArchery3_2.setOnClickListener {
            if (skillPoints <= 0){
                if (btnArchery3_2.isSelected) {
                    updateButtons3(btnArchery3_2)
                    btnArchery3_2.isSelected = !btnArchery3_2.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnArchery3_2)

            skillUnlock3(
                btnArchery3_4, btnArchery3_8, btnArchery3_12,
                btnArcheryPassive3_1, btnArcheryPassive3_2, btnArcheryPassive3_3,
                btnArcheryPassive3_4, btnArcheryPassive3_5, btnArcheryPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnArchery3_2.isSelected = !btnArchery3_2.isSelected
        }

        btnArchery3_3.setOnClickListener {
            if (skillPoints <= 0){
                if (btnArchery3_3.isSelected) {
                    updateButtons3(btnArchery3_3)
                    btnArchery3_3.isSelected = !btnArchery3_3.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnArchery3_3)

            skillUnlock3(
                btnArchery3_4, btnArchery3_8, btnArchery3_12,
                btnArcheryPassive3_1, btnArcheryPassive3_2, btnArcheryPassive3_3,
                btnArcheryPassive3_4, btnArcheryPassive3_5, btnArcheryPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnArchery3_3.isSelected = !btnArchery3_3.isSelected
        }

        btnArchery3_4.setOnClickListener {
            if (skillPoints <= 0){
                if (btnArchery3_4.isSelected) {
                    updateButtons3(btnArchery3_4)
                    btnArchery3_4.isSelected = !btnArchery3_4.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnArchery3_4)

            btnArchery3_4.isSelected = !btnArchery3_4.isSelected
            skillUnlock3(
                btnArchery3_4, btnArchery3_8, btnArchery3_12,
                btnArcheryPassive3_1, btnArcheryPassive3_2, btnArcheryPassive3_3,
                btnArcheryPassive3_4, btnArcheryPassive3_5, btnArcheryPassive3_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnArchery3_5.setOnClickListener {
            if (skillPoints <= 0){
                if (btnArchery3_5.isSelected) {
                    updateButtons3(btnArchery3_5)
                    btnArchery3_5.isSelected = !btnArchery3_5.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnArchery3_5)

            skillUnlock3(
                btnArchery3_4, btnArchery3_8, btnArchery3_12,
                btnArcheryPassive3_1, btnArcheryPassive3_2, btnArcheryPassive3_3,
                btnArcheryPassive3_4, btnArcheryPassive3_5, btnArcheryPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnArchery3_5.isSelected = !btnArchery3_5.isSelected
        }

        btnArchery3_6.setOnClickListener {
            if (skillPoints <= 0){
                if (btnArchery3_6.isSelected) {
                    updateButtons3(btnArchery3_6)
                    btnArchery3_6.isSelected = !btnArchery3_6.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnArchery3_6)

            skillUnlock3(
                btnArchery3_4, btnArchery3_8, btnArchery3_12,
                btnArcheryPassive3_1, btnArcheryPassive3_2, btnArcheryPassive3_3,
                btnArcheryPassive3_4, btnArcheryPassive3_5, btnArcheryPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnArchery3_6.isSelected = !btnArchery3_6.isSelected
        }

        btnArchery3_7.setOnClickListener {
            if (skillPoints <= 0){
                if (btnArchery3_7.isSelected) {
                    updateButtons3(btnArchery3_7)
                    btnArchery3_7.isSelected = !btnArchery3_7.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnArchery3_7)

            skillUnlock3(
                btnArchery3_4, btnArchery3_8, btnArchery3_12,
                btnArcheryPassive3_1, btnArcheryPassive3_2, btnArcheryPassive3_3,
                btnArcheryPassive3_4, btnArcheryPassive3_5, btnArcheryPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnArchery3_7.isSelected = !btnArchery3_7.isSelected
        }

        btnArchery3_8.setOnClickListener {
            if (skillPoints <= 0){
                if (btnArchery3_8.isSelected) {
                    updateButtons3(btnArchery3_8)
                    btnArchery3_8.isSelected = !btnArchery3_8.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnArchery3_8)

            btnArchery3_8.isSelected = !btnArchery3_8.isSelected
            skillUnlock3(
                btnArchery3_4, btnArchery3_8, btnArchery3_12,
                btnArcheryPassive3_1, btnArcheryPassive3_2, btnArcheryPassive3_3,
                btnArcheryPassive3_4, btnArcheryPassive3_5, btnArcheryPassive3_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnArchery3_9.setOnClickListener {
            if (skillPoints <= 0){
                if (btnArchery3_9.isSelected) {
                    updateButtons3(btnArchery3_9)
                    btnArchery3_9.isSelected = !btnArchery3_9.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnArchery3_9)

            skillUnlock3(
                btnArchery3_4, btnArchery3_8, btnArchery3_12,
                btnArcheryPassive3_1, btnArcheryPassive3_2, btnArcheryPassive3_3,
                btnArcheryPassive3_4, btnArcheryPassive3_5, btnArcheryPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnArchery3_9.isSelected = !btnArchery3_9.isSelected
        }

        btnArchery3_10.setOnClickListener {
            if (skillPoints <= 0){
                if (btnArchery3_10.isSelected) {
                    updateButtons3(btnArchery3_10)
                    btnArchery3_10.isSelected = !btnArchery3_10.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnArchery3_10)

            skillUnlock3(
                btnArchery3_4, btnArchery3_8, btnArchery3_12,
                btnArcheryPassive3_1, btnArcheryPassive3_2, btnArcheryPassive3_3,
                btnArcheryPassive3_4, btnArcheryPassive3_5, btnArcheryPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnArchery3_10.isSelected = !btnArchery3_10.isSelected
        }

        btnArchery3_11.setOnClickListener {
            if (skillPoints <= 0){
                if (btnArchery3_11.isSelected) {
                    updateButtons3(btnArchery3_11)
                    btnArchery3_11.isSelected = !btnArchery3_11.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnArchery3_11)

            skillUnlock3(
                btnArchery3_4, btnArchery3_8, btnArchery3_12,
                btnArcheryPassive3_1, btnArcheryPassive3_2, btnArcheryPassive3_3,
                btnArcheryPassive3_4, btnArcheryPassive3_5, btnArcheryPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnArchery3_11.isSelected = !btnArchery3_11.isSelected
        }

        btnArchery3_12.setOnClickListener {
            if (skillPoints <= 0){
                if (btnArchery3_12.isSelected) {
                    updateButtons3(btnArchery3_12)
                    btnArchery3_12.isSelected = !btnArchery3_12.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnArchery3_12)

            btnArchery3_12.isSelected = !btnArchery3_12.isSelected
            skillUnlock3(
                btnArchery3_4, btnArchery3_8, btnArchery3_12,
                btnArcheryPassive3_1, btnArcheryPassive3_2, btnArcheryPassive3_3,
                btnArcheryPassive3_4, btnArcheryPassive3_5, btnArcheryPassive3_6,
                skillPoints2Text, skillTree2Points
            )
        }
//endregion
        

        //region Defense1 Button Actions
        btnDefense1_1.setOnClickListener {
            if (skillPoints <= 0){
                if (btnDefense1_1.isSelected) {
                    updateButtons1(btnDefense1_1)
                    btnDefense1_1.isSelected = !btnDefense1_1.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnDefense1_1)

            skillUnlock1(
                btnDefense1_4, btnDefense1_8, btnDefense1_12,
                btnDefensePassive1_1, btnDefensePassive1_2, btnDefensePassive1_3,
                btnDefensePassive1_4, btnDefensePassive1_5, btnDefensePassive1_6, 
                skillPoints1Text, skillTree1Points
            )
            btnDefense1_1.isSelected = !btnDefense1_1.isSelected
        }

        btnDefense1_2.setOnClickListener {
            if (skillPoints <= 0){
                if (btnDefense1_2.isSelected) {
                    updateButtons1(btnDefense1_2)
                    btnDefense1_2.isSelected = !btnDefense1_2.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnDefense1_2)

            skillUnlock1(
                btnDefense1_4, btnDefense1_8, btnDefense1_12,
                btnDefensePassive1_1, btnDefensePassive1_2, btnDefensePassive1_3,
                btnDefensePassive1_4, btnDefensePassive1_5, btnDefensePassive1_6, 
                skillPoints1Text, skillTree1Points
            )
            btnDefense1_2.isSelected = !btnDefense1_2.isSelected
        }

        btnDefense1_3.setOnClickListener {
            if (skillPoints <= 0){
                if (btnDefense1_3.isSelected) {
                    updateButtons1(btnDefense1_3)
                    btnDefense1_3.isSelected = !btnDefense1_3.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnDefense1_3)

            skillUnlock1(
                btnDefense1_4, btnDefense1_8, btnDefense1_12,
                btnDefensePassive1_1, btnDefensePassive1_2, btnDefensePassive1_3,
                btnDefensePassive1_4, btnDefensePassive1_5, btnDefensePassive1_6, 
                skillPoints1Text, skillTree1Points
            )
            btnDefense1_3.isSelected = !btnDefense1_3.isSelected
        }

        btnDefense1_4.setOnClickListener {
            if (skillPoints <= 0){
                if (btnDefense1_4.isSelected) {
                    updateButtons1(btnDefense1_4)
                    btnDefense1_4.isSelected = !btnDefense1_4.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnDefense1_4)

            btnDefense1_4.isSelected = !btnDefense1_4.isSelected
            skillUnlock1(
                btnDefense1_4, btnDefense1_8, btnDefense1_12,
                btnDefensePassive1_1, btnDefensePassive1_2, btnDefensePassive1_3,
                btnDefensePassive1_4, btnDefensePassive1_5, btnDefensePassive1_6, 
                skillPoints1Text, skillTree1Points
            )
        }

        btnDefense1_5.setOnClickListener {
            if (skillPoints <= 0){
                if (btnDefense1_5.isSelected) {
                    updateButtons1(btnDefense1_5)
                    btnDefense1_5.isSelected = !btnDefense1_5.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnDefense1_5)

            skillUnlock1(
                btnDefense1_4, btnDefense1_8, btnDefense1_12,
                btnDefensePassive1_1, btnDefensePassive1_2, btnDefensePassive1_3,
                btnDefensePassive1_4, btnDefensePassive1_5, btnDefensePassive1_6, 
                skillPoints1Text, skillTree1Points
            )
            btnDefense1_5.isSelected = !btnDefense1_5.isSelected
        }

        btnDefense1_6.setOnClickListener {
            if (skillPoints <= 0){
                if (btnDefense1_6.isSelected) {
                    updateButtons1(btnDefense1_6)
                    btnDefense1_6.isSelected = !btnDefense1_6.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnDefense1_6)

            skillUnlock1(
                btnDefense1_4, btnDefense1_8, btnDefense1_12,
                btnDefensePassive1_1, btnDefensePassive1_2, btnDefensePassive1_3,
                btnDefensePassive1_4, btnDefensePassive1_5, btnDefensePassive1_6, 
                skillPoints1Text, skillTree1Points
            )
            btnDefense1_6.isSelected = !btnDefense1_6.isSelected
        }

        btnDefense1_7.setOnClickListener {
            if (skillPoints <= 0){
                if (btnDefense1_7.isSelected) {
                    updateButtons1(btnDefense1_7)
                    btnDefense1_7.isSelected = !btnDefense1_7.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnDefense1_7)

            skillUnlock1(
                btnDefense1_4, btnDefense1_8, btnDefense1_12,
                btnDefensePassive1_1, btnDefensePassive1_2, btnDefensePassive1_3,
                btnDefensePassive1_4, btnDefensePassive1_5, btnDefensePassive1_6, 
                skillPoints1Text, skillTree1Points
            )
            btnDefense1_7.isSelected = !btnDefense1_7.isSelected
        }

        btnDefense1_8.setOnClickListener {
            if (skillPoints <= 0){
                if (btnDefense1_8.isSelected) {
                    updateButtons1(btnDefense1_8)
                    btnDefense1_8.isSelected = !btnDefense1_8.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnDefense1_8)

            btnDefense1_8.isSelected = !btnDefense1_8.isSelected
            skillUnlock1(
                btnDefense1_4, btnDefense1_8, btnDefense1_12,
                btnDefensePassive1_1, btnDefensePassive1_2, btnDefensePassive1_3,
                btnDefensePassive1_4, btnDefensePassive1_5, btnDefensePassive1_6, 
                skillPoints1Text, skillTree1Points
            )
        }

        btnDefense1_9.setOnClickListener {
            if (skillPoints <= 0){
                if (btnDefense1_9.isSelected) {
                    updateButtons1(btnDefense1_9)
                    btnDefense1_9.isSelected = !btnDefense1_9.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnDefense1_9)

            skillUnlock1(
                btnDefense1_4, btnDefense1_8, btnDefense1_12,
                btnDefensePassive1_1, btnDefensePassive1_2, btnDefensePassive1_3,
                btnDefensePassive1_4, btnDefensePassive1_5, btnDefensePassive1_6, 
                skillPoints1Text, skillTree1Points
            )
            btnDefense1_9.isSelected = !btnDefense1_9.isSelected
        }

        btnDefense1_10.setOnClickListener {
            if (skillPoints <= 0){
                if (btnDefense1_10.isSelected) {
                    updateButtons1(btnDefense1_10)
                    btnDefense1_10.isSelected = !btnDefense1_10.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnDefense1_10)

            skillUnlock1(
                btnDefense1_4, btnDefense1_8, btnDefense1_12,
                btnDefensePassive1_1, btnDefensePassive1_2, btnDefensePassive1_3,
                btnDefensePassive1_4, btnDefensePassive1_5, btnDefensePassive1_6, 
                skillPoints1Text, skillTree1Points
            )
            btnDefense1_10.isSelected = !btnDefense1_10.isSelected
        }

        btnDefense1_11.setOnClickListener {
            if (skillPoints <= 0){
                if (btnDefense1_11.isSelected) {
                    updateButtons1(btnDefense1_11)
                    btnDefense1_11.isSelected = !btnDefense1_11.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnDefense1_11)

            skillUnlock1(
                btnDefense1_4, btnDefense1_8, btnDefense1_12,
                btnDefensePassive1_1, btnDefensePassive1_2, btnDefensePassive1_3,
                btnDefensePassive1_4, btnDefensePassive1_5, btnDefensePassive1_6, 
                skillPoints1Text, skillTree1Points
            )
            btnDefense1_11.isSelected = !btnDefense1_11.isSelected
        }

        btnDefense1_12.setOnClickListener {
            if (skillPoints <= 0){
                if (btnDefense1_12.isSelected) {
                    updateButtons1(btnDefense1_12)
                    btnDefense1_12.isSelected = !btnDefense1_12.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnDefense1_12)

            btnDefense1_12.isSelected = !btnDefense1_12.isSelected
            skillUnlock1(
                btnDefense1_4, btnDefense1_8, btnDefense1_12,
                btnDefensePassive1_1, btnDefensePassive1_2, btnDefensePassive1_3,
                btnDefensePassive1_4, btnDefensePassive1_5, btnDefensePassive1_6, 
                skillPoints1Text, skillTree1Points
            )
        }
//endregion
        
        //region Defense2 Button Actions
        btnDefense2_1.setOnClickListener {
            if (skillPoints <= 0){
                if (btnDefense2_1.isSelected) {
                    updateButtons2(btnDefense2_1)
                    btnDefense2_1.isSelected = !btnDefense2_1.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnDefense2_1)

            skillUnlock2(
                btnDefense2_4, btnDefense2_8, btnDefense2_12,
                btnDefensePassive2_1, btnDefensePassive2_2, btnDefensePassive2_3,
                btnDefensePassive2_4, btnDefensePassive2_5, btnDefensePassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnDefense2_1.isSelected = !btnDefense2_1.isSelected
        }

        btnDefense2_2.setOnClickListener {
            if (skillPoints <= 0){
                if (btnDefense2_2.isSelected) {
                    updateButtons2(btnDefense2_2)
                    btnDefense2_2.isSelected = !btnDefense2_2.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnDefense2_2)

            skillUnlock2(
                btnDefense2_4, btnDefense2_8, btnDefense2_12,
                btnDefensePassive2_1, btnDefensePassive2_2, btnDefensePassive2_3,
                btnDefensePassive2_4, btnDefensePassive2_5, btnDefensePassive2_6,
                skillPoints2Text, skillTree2Points
                )
            btnDefense2_2.isSelected = !btnDefense2_2.isSelected
        }

        btnDefense2_3.setOnClickListener {
            if (skillPoints <= 0){
                if (btnDefense2_3.isSelected) {
                    updateButtons2(btnDefense2_3)
                    btnDefense2_3.isSelected = !btnDefense2_3.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnDefense2_3)

            skillUnlock2(
                btnDefense2_4, btnDefense2_8, btnDefense2_12,
                btnDefensePassive2_1, btnDefensePassive2_2, btnDefensePassive2_3,
                btnDefensePassive2_4, btnDefensePassive2_5, btnDefensePassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnDefense2_3.isSelected = !btnDefense2_3.isSelected
        }

        btnDefense2_4.setOnClickListener {
            if (skillPoints <= 0){
                if (btnDefense2_4.isSelected) {
                    updateButtons2(btnDefense2_4)
                    btnDefense2_4.isSelected = !btnDefense2_4.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnDefense2_4)

            btnDefense2_4.isSelected = !btnDefense2_4.isSelected
            skillUnlock2(
                btnDefense2_4, btnDefense2_8, btnDefense2_12,
                btnDefensePassive2_1, btnDefensePassive2_2, btnDefensePassive2_3,
                btnDefensePassive2_4, btnDefensePassive2_5, btnDefensePassive2_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnDefense2_5.setOnClickListener {
            if (skillPoints <= 0){
                if (btnDefense2_5.isSelected) {
                    updateButtons2(btnDefense2_5)
                    btnDefense2_5.isSelected = !btnDefense2_5.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnDefense2_5)

            skillUnlock2(
                btnDefense2_4, btnDefense2_8, btnDefense2_12,
                btnDefensePassive2_1, btnDefensePassive2_2, btnDefensePassive2_3,
                btnDefensePassive2_4, btnDefensePassive2_5, btnDefensePassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnDefense2_5.isSelected = !btnDefense2_5.isSelected
        }

        btnDefense2_6.setOnClickListener {
            if (skillPoints <= 0){
                if (btnDefense2_6.isSelected) {
                    updateButtons2(btnDefense2_6)
                    btnDefense2_6.isSelected = !btnDefense2_6.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnDefense2_6)

            skillUnlock2(
                btnDefense2_4, btnDefense2_8, btnDefense2_12,
                btnDefensePassive2_1, btnDefensePassive2_2, btnDefensePassive2_3,
                btnDefensePassive2_4, btnDefensePassive2_5, btnDefensePassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnDefense2_6.isSelected = !btnDefense2_6.isSelected
        }

        btnDefense2_7.setOnClickListener {
            if (skillPoints <= 0){
                if (btnDefense2_7.isSelected) {
                    updateButtons2(btnDefense2_7)
                    btnDefense2_7.isSelected = !btnDefense2_7.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnDefense2_7)

            skillUnlock2(
                btnDefense2_4, btnDefense2_8, btnDefense2_12,
                btnDefensePassive2_1, btnDefensePassive2_2, btnDefensePassive2_3,
                btnDefensePassive2_4, btnDefensePassive2_5, btnDefensePassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnDefense2_7.isSelected = !btnDefense2_7.isSelected
        }

        btnDefense2_8.setOnClickListener {
            if (skillPoints <= 0){
                if (btnDefense2_8.isSelected) {
                    updateButtons2(btnDefense2_8)
                    btnDefense2_8.isSelected = !btnDefense2_8.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnDefense2_8)

            btnDefense2_8.isSelected = !btnDefense2_8.isSelected
            skillUnlock2(
                btnDefense2_4, btnDefense2_8, btnDefense2_12,
                btnDefensePassive2_1, btnDefensePassive2_2, btnDefensePassive2_3,
                btnDefensePassive2_4, btnDefensePassive2_5, btnDefensePassive2_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnDefense2_9.setOnClickListener {
            if (skillPoints <= 0){
                if (btnDefense2_9.isSelected) {
                    updateButtons2(btnDefense2_9)
                    btnDefense2_9.isSelected = !btnDefense2_9.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnDefense2_9)

            skillUnlock2(
                btnDefense2_4, btnDefense2_8, btnDefense2_12,
                btnDefensePassive2_1, btnDefensePassive2_2, btnDefensePassive2_3,
                btnDefensePassive2_4, btnDefensePassive2_5, btnDefensePassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnDefense2_9.isSelected = !btnDefense2_9.isSelected
        }

        btnDefense2_10.setOnClickListener {
            if (skillPoints <= 0){
                if (btnDefense2_10.isSelected) {
                    updateButtons2(btnDefense2_10)
                    btnDefense2_10.isSelected = !btnDefense2_10.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnDefense2_10)

            skillUnlock2(
                btnDefense2_4, btnDefense2_8, btnDefense2_12,
                btnDefensePassive2_1, btnDefensePassive2_2, btnDefensePassive2_3,
                btnDefensePassive2_4, btnDefensePassive2_5, btnDefensePassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnDefense2_10.isSelected = !btnDefense2_10.isSelected
        }

        btnDefense2_11.setOnClickListener {
            if (skillPoints <= 0){
                if (btnDefense2_11.isSelected) {
                    updateButtons2(btnDefense2_11)
                    btnDefense2_11.isSelected = !btnDefense2_11.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnDefense2_11)

            skillUnlock2(
                btnDefense2_4, btnDefense2_8, btnDefense2_12,
                btnDefensePassive2_1, btnDefensePassive2_2, btnDefensePassive2_3,
                btnDefensePassive2_4, btnDefensePassive2_5, btnDefensePassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnDefense2_11.isSelected = !btnDefense2_11.isSelected
        }

        btnDefense2_12.setOnClickListener {
            if (skillPoints <= 0){
                if (btnDefense2_12.isSelected) {
                    updateButtons2(btnDefense2_12)
                    btnDefense2_12.isSelected = !btnDefense2_12.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnDefense2_12)

            btnDefense2_12.isSelected = !btnDefense2_12.isSelected
            skillUnlock2(
                btnDefense2_4, btnDefense2_8, btnDefense2_12,
                btnDefensePassive2_1, btnDefensePassive2_2, btnDefensePassive2_3,
                btnDefensePassive2_4, btnDefensePassive2_5, btnDefensePassive2_6,
                skillPoints2Text, skillTree2Points
            )
        }
//endregion

        //region Defense3 Button Actions
        btnDefense3_1.setOnClickListener {
            if (skillPoints <= 0){
                if (btnDefense3_1.isSelected) {
                    updateButtons3(btnDefense3_1)
                    btnDefense3_1.isSelected = !btnDefense3_1.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnDefense3_1)

            skillUnlock3(
                btnDefense3_4, btnDefense3_8, btnDefense3_12,
                btnDefensePassive3_1, btnDefensePassive3_2, btnDefensePassive3_3,
                btnDefensePassive3_4, btnDefensePassive3_5, btnDefensePassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnDefense3_1.isSelected = !btnDefense3_1.isSelected
        }

        btnDefense3_2.setOnClickListener {
            if (skillPoints <= 0){
                if (btnDefense3_2.isSelected) {
                    updateButtons3(btnDefense3_2)
                    btnDefense3_2.isSelected = !btnDefense3_2.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnDefense3_2)

            skillUnlock3(
                btnDefense3_4, btnDefense3_8, btnDefense3_12,
                btnDefensePassive3_1, btnDefensePassive3_2, btnDefensePassive3_3,
                btnDefensePassive3_4, btnDefensePassive3_5, btnDefensePassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnDefense3_2.isSelected = !btnDefense3_2.isSelected
        }

        btnDefense3_3.setOnClickListener {
            if (skillPoints <= 0){
                if (btnDefense3_3.isSelected) {
                    updateButtons3(btnDefense3_3)
                    btnDefense3_3.isSelected = !btnDefense3_3.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnDefense3_3)

            skillUnlock3(
                btnDefense3_4, btnDefense3_8, btnDefense3_12,
                btnDefensePassive3_1, btnDefensePassive3_2, btnDefensePassive3_3,
                btnDefensePassive3_4, btnDefensePassive3_5, btnDefensePassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnDefense3_3.isSelected = !btnDefense3_3.isSelected
        }

        btnDefense3_4.setOnClickListener {
            if (skillPoints <= 0){
                if (btnDefense3_4.isSelected) {
                    updateButtons3(btnDefense3_4)
                    btnDefense3_4.isSelected = !btnDefense3_4.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnDefense3_4)

            btnDefense3_4.isSelected = !btnDefense3_4.isSelected
            skillUnlock3(
                btnDefense3_4, btnDefense3_8, btnDefense3_12,
                btnDefensePassive3_1, btnDefensePassive3_2, btnDefensePassive3_3,
                btnDefensePassive3_4, btnDefensePassive3_5, btnDefensePassive3_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnDefense3_5.setOnClickListener {
            if (skillPoints <= 0){
                if (btnDefense3_5.isSelected) {
                    updateButtons3(btnDefense3_5)
                    btnDefense3_5.isSelected = !btnDefense3_5.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnDefense3_5)

            skillUnlock3(
                btnDefense3_4, btnDefense3_8, btnDefense3_12,
                btnDefensePassive3_1, btnDefensePassive3_2, btnDefensePassive3_3,
                btnDefensePassive3_4, btnDefensePassive3_5, btnDefensePassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnDefense3_5.isSelected = !btnDefense3_5.isSelected
        }

        btnDefense3_6.setOnClickListener {
            if (skillPoints <= 0){
                if (btnDefense3_6.isSelected) {
                    updateButtons3(btnDefense3_6)
                    btnDefense3_6.isSelected = !btnDefense3_6.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnDefense3_6)

            skillUnlock3(
                btnDefense3_4, btnDefense3_8, btnDefense3_12,
                btnDefensePassive3_1, btnDefensePassive3_2, btnDefensePassive3_3,
                btnDefensePassive3_4, btnDefensePassive3_5, btnDefensePassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnDefense3_6.isSelected = !btnDefense3_6.isSelected
        }

        btnDefense3_7.setOnClickListener {
            if (skillPoints <= 0){
                if (btnDefense3_7.isSelected) {
                    updateButtons3(btnDefense3_7)
                    btnDefense3_7.isSelected = !btnDefense3_7.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnDefense3_7)

            skillUnlock3(
                btnDefense3_4, btnDefense3_8, btnDefense3_12,
                btnDefensePassive3_1, btnDefensePassive3_2, btnDefensePassive3_3,
                btnDefensePassive3_4, btnDefensePassive3_5, btnDefensePassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnDefense3_7.isSelected = !btnDefense3_7.isSelected
        }

        btnDefense3_8.setOnClickListener {
            if (skillPoints <= 0){
                if (btnDefense3_8.isSelected) {
                    updateButtons3(btnDefense3_8)
                    btnDefense3_8.isSelected = !btnDefense3_8.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnDefense3_8)

            btnDefense3_8.isSelected = !btnDefense3_8.isSelected
            skillUnlock3(
                btnDefense3_4, btnDefense3_8, btnDefense3_12,
                btnDefensePassive3_1, btnDefensePassive3_2, btnDefensePassive3_3,
                btnDefensePassive3_4, btnDefensePassive3_5, btnDefensePassive3_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnDefense3_9.setOnClickListener {
            if (skillPoints <= 0){
                if (btnDefense3_9.isSelected) {
                    updateButtons3(btnDefense3_9)
                    btnDefense3_9.isSelected = !btnDefense3_9.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnDefense3_9)

            skillUnlock3(
                btnDefense3_4, btnDefense3_8, btnDefense3_12,
                btnDefensePassive3_1, btnDefensePassive3_2, btnDefensePassive3_3,
                btnDefensePassive3_4, btnDefensePassive3_5, btnDefensePassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnDefense3_9.isSelected = !btnDefense3_9.isSelected
        }

        btnDefense3_10.setOnClickListener {
            if (skillPoints <= 0){
                if (btnDefense3_10.isSelected) {
                    updateButtons3(btnDefense3_10)
                    btnDefense3_10.isSelected = !btnDefense3_10.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnDefense3_10)

            skillUnlock3(
                btnDefense3_4, btnDefense3_8, btnDefense3_12,
                btnDefensePassive3_1, btnDefensePassive3_2, btnDefensePassive3_3,
                btnDefensePassive3_4, btnDefensePassive3_5, btnDefensePassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnDefense3_10.isSelected = !btnDefense3_10.isSelected
        }

        btnDefense3_11.setOnClickListener {
            if (skillPoints <= 0){
                if (btnDefense3_11.isSelected) {
                    updateButtons3(btnDefense3_11)
                    btnDefense3_11.isSelected = !btnDefense3_11.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnDefense3_11)

            skillUnlock3(
                btnDefense3_4, btnDefense3_8, btnDefense3_12,
                btnDefensePassive3_1, btnDefensePassive3_2, btnDefensePassive3_3,
                btnDefensePassive3_4, btnDefensePassive3_5, btnDefensePassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnDefense3_11.isSelected = !btnDefense3_11.isSelected
        }

        btnDefense3_12.setOnClickListener {
            if (skillPoints <= 0){
                if (btnDefense3_12.isSelected) {
                    updateButtons3(btnDefense3_12)
                    btnDefense3_12.isSelected = !btnDefense3_12.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnDefense3_12)

            btnDefense3_12.isSelected = !btnDefense3_12.isSelected
            skillUnlock3(
                btnDefense3_4, btnDefense3_8, btnDefense3_12,
                btnDefensePassive3_1, btnDefensePassive3_2, btnDefensePassive3_3,
                btnDefensePassive3_4, btnDefensePassive3_5, btnDefensePassive3_6,
                skillPoints2Text, skillTree2Points
            )
        }
//endregion

        

        //region Occultism1 Button Actions
        btnOccultism1_1.setOnClickListener {
            if (skillPoints <= 0){
                if (btnOccultism1_1.isSelected) {
                    updateButtons1(btnOccultism1_1)
                    btnOccultism1_1.isSelected = !btnOccultism1_1.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnOccultism1_1)

            skillUnlock1(
                btnOccultism1_4, btnOccultism1_8, btnOccultism1_12,
                btnOccultismPassive1_1, btnOccultismPassive1_2, btnOccultismPassive1_3,
                btnOccultismPassive1_4, btnOccultismPassive1_5, btnOccultismPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnOccultism1_1.isSelected = !btnOccultism1_1.isSelected
        }

        btnOccultism1_2.setOnClickListener {
            if (skillPoints <= 0){
                if (btnOccultism1_2.isSelected) {
                    updateButtons1(btnOccultism1_2)
                    btnOccultism1_2.isSelected = !btnOccultism1_2.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnOccultism1_2)

            skillUnlock1(
                btnOccultism1_4, btnOccultism1_8, btnOccultism1_12,
                btnOccultismPassive1_1, btnOccultismPassive1_2, btnOccultismPassive1_3,
                btnOccultismPassive1_4, btnOccultismPassive1_5, btnOccultismPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnOccultism1_2.isSelected = !btnOccultism1_2.isSelected
        }

        btnOccultism1_3.setOnClickListener {
            if (skillPoints <= 0){
                if (btnOccultism1_3.isSelected) {
                    updateButtons1(btnOccultism1_3)
                    btnOccultism1_3.isSelected = !btnOccultism1_3.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnOccultism1_3)

            skillUnlock1(
                btnOccultism1_4, btnOccultism1_8, btnOccultism1_12,
                btnOccultismPassive1_1, btnOccultismPassive1_2, btnOccultismPassive1_3,
                btnOccultismPassive1_4, btnOccultismPassive1_5, btnOccultismPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnOccultism1_3.isSelected = !btnOccultism1_3.isSelected
        }

        btnOccultism1_4.setOnClickListener {
            if (skillPoints <= 0){
                if (btnOccultism1_4.isSelected) {
                    updateButtons1(btnOccultism1_4)
                    btnOccultism1_4.isSelected = !btnOccultism1_4.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnOccultism1_4)

            btnOccultism1_4.isSelected = !btnOccultism1_4.isSelected
            skillUnlock1(
                btnOccultism1_4, btnOccultism1_8, btnOccultism1_12,
                btnOccultismPassive1_1, btnOccultismPassive1_2, btnOccultismPassive1_3,
                btnOccultismPassive1_4, btnOccultismPassive1_5, btnOccultismPassive1_6,
                skillPoints1Text, skillTree1Points
            )
        }

        btnOccultism1_5.setOnClickListener {
            if (skillPoints <= 0){
                if (btnOccultism1_5.isSelected) {
                    updateButtons1(btnOccultism1_5)
                    btnOccultism1_5.isSelected = !btnOccultism1_5.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnOccultism1_5)

            skillUnlock1(
                btnOccultism1_4, btnOccultism1_8, btnOccultism1_12,
                btnOccultismPassive1_1, btnOccultismPassive1_2, btnOccultismPassive1_3,
                btnOccultismPassive1_4, btnOccultismPassive1_5, btnOccultismPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnOccultism1_5.isSelected = !btnOccultism1_5.isSelected
        }

        btnOccultism1_6.setOnClickListener {
            if (skillPoints <= 0){
                if (btnOccultism1_6.isSelected) {
                    updateButtons1(btnOccultism1_6)
                    btnOccultism1_6.isSelected = !btnOccultism1_6.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnOccultism1_6)

            skillUnlock1(
                btnOccultism1_4, btnOccultism1_8, btnOccultism1_12,
                btnOccultismPassive1_1, btnOccultismPassive1_2, btnOccultismPassive1_3,
                btnOccultismPassive1_4, btnOccultismPassive1_5, btnOccultismPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnOccultism1_6.isSelected = !btnOccultism1_6.isSelected
        }

        btnOccultism1_7.setOnClickListener {
            if (skillPoints <= 0){
                if (btnOccultism1_7.isSelected) {
                    updateButtons1(btnOccultism1_7)
                    btnOccultism1_7.isSelected = !btnOccultism1_7.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnOccultism1_7)

            skillUnlock1(
                btnOccultism1_4, btnOccultism1_8, btnOccultism1_12,
                btnOccultismPassive1_1, btnOccultismPassive1_2, btnOccultismPassive1_3,
                btnOccultismPassive1_4, btnOccultismPassive1_5, btnOccultismPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnOccultism1_7.isSelected = !btnOccultism1_7.isSelected
        }

        btnOccultism1_8.setOnClickListener {
            if (skillPoints <= 0){
                if (btnOccultism1_8.isSelected) {
                    updateButtons1(btnOccultism1_8)
                    btnOccultism1_8.isSelected = !btnOccultism1_8.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnOccultism1_8)

            btnOccultism1_8.isSelected = !btnOccultism1_8.isSelected
            skillUnlock1(
                btnOccultism1_4, btnOccultism1_8, btnOccultism1_12,
                btnOccultismPassive1_1, btnOccultismPassive1_2, btnOccultismPassive1_3,
                btnOccultismPassive1_4, btnOccultismPassive1_5, btnOccultismPassive1_6,
                skillPoints1Text, skillTree1Points
            )
        }

        btnOccultism1_9.setOnClickListener {
            if (skillPoints <= 0){
                if (btnOccultism1_9.isSelected) {
                    updateButtons1(btnOccultism1_9)
                    btnOccultism1_9.isSelected = !btnOccultism1_9.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnOccultism1_9)

            skillUnlock1(
                btnOccultism1_4, btnOccultism1_8, btnOccultism1_12,
                btnOccultismPassive1_1, btnOccultismPassive1_2, btnOccultismPassive1_3,
                btnOccultismPassive1_4, btnOccultismPassive1_5, btnOccultismPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnOccultism1_9.isSelected = !btnOccultism1_9.isSelected
        }

        btnOccultism1_10.setOnClickListener {
            if (skillPoints <= 0){
                if (btnOccultism1_10.isSelected) {
                    updateButtons1(btnOccultism1_10)
                    btnOccultism1_10.isSelected = !btnOccultism1_10.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnOccultism1_10)

            skillUnlock1(
                btnOccultism1_4, btnOccultism1_8, btnOccultism1_12,
                btnOccultismPassive1_1, btnOccultismPassive1_2, btnOccultismPassive1_3,
                btnOccultismPassive1_4, btnOccultismPassive1_5, btnOccultismPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnOccultism1_10.isSelected = !btnOccultism1_10.isSelected
        }

        btnOccultism1_11.setOnClickListener {
            if (skillPoints <= 0){
                if (btnOccultism1_11.isSelected) {
                    updateButtons1(btnOccultism1_11)
                    btnOccultism1_11.isSelected = !btnOccultism1_11.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnOccultism1_11)

            skillUnlock1(
                btnOccultism1_4, btnOccultism1_8, btnOccultism1_12,
                btnOccultismPassive1_1, btnOccultismPassive1_2, btnOccultismPassive1_3,
                btnOccultismPassive1_4, btnOccultismPassive1_5, btnOccultismPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnOccultism1_11.isSelected = !btnOccultism1_11.isSelected
        }

        btnOccultism1_12.setOnClickListener {
            if (skillPoints <= 0){
                if (btnOccultism1_12.isSelected) {
                    updateButtons1(btnOccultism1_12)
                    btnOccultism1_12.isSelected = !btnOccultism1_12.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnOccultism1_12)

            btnOccultism1_12.isSelected = !btnOccultism1_12.isSelected
            skillUnlock1(
                btnOccultism1_4, btnOccultism1_8, btnOccultism1_12,
                btnOccultismPassive1_1, btnOccultismPassive1_2, btnOccultismPassive1_3,
                btnOccultismPassive1_4, btnOccultismPassive1_5, btnOccultismPassive1_6,
                skillPoints1Text, skillTree1Points
            )
        }
//endregion

        //region Occultism2 Button Actions
        btnOccultism2_1.setOnClickListener {
            if (skillPoints <= 0){
                if (btnOccultism2_1.isSelected) {
                    updateButtons2(btnOccultism2_1)
                    btnOccultism2_1.isSelected = !btnOccultism2_1.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnOccultism2_1)

            skillUnlock2(
                btnOccultism2_4, btnOccultism2_8, btnOccultism2_12,
                btnOccultismPassive2_1, btnOccultismPassive2_2, btnOccultismPassive2_3,
                btnOccultismPassive2_4, btnOccultismPassive2_5, btnOccultismPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnOccultism2_1.isSelected = !btnOccultism2_1.isSelected
        }

        btnOccultism2_2.setOnClickListener {
            if (skillPoints <= 0){
                if (btnOccultism2_2.isSelected) {
                    updateButtons2(btnOccultism2_2)
                    btnOccultism2_2.isSelected = !btnOccultism2_2.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnOccultism2_2)

            skillUnlock2(
                btnOccultism2_4, btnOccultism2_8, btnOccultism2_12,
                btnOccultismPassive2_1, btnOccultismPassive2_2, btnOccultismPassive2_3,
                btnOccultismPassive2_4, btnOccultismPassive2_5, btnOccultismPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnOccultism2_2.isSelected = !btnOccultism2_2.isSelected
        }

        btnOccultism2_3.setOnClickListener {
            if (skillPoints <= 0){
                if (btnOccultism2_3.isSelected) {
                    updateButtons2(btnOccultism2_3)
                    btnOccultism2_3.isSelected = !btnOccultism2_3.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnOccultism2_3)

            skillUnlock2(
                btnOccultism2_4, btnOccultism2_8, btnOccultism2_12,
                btnOccultismPassive2_1, btnOccultismPassive2_2, btnOccultismPassive2_3,
                btnOccultismPassive2_4, btnOccultismPassive2_5, btnOccultismPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnOccultism2_3.isSelected = !btnOccultism2_3.isSelected
        }

        btnOccultism2_4.setOnClickListener {
            if (skillPoints <= 0){
                if (btnOccultism2_4.isSelected) {
                    updateButtons2(btnOccultism2_4)
                    btnOccultism2_4.isSelected = !btnOccultism2_4.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnOccultism2_4)

            btnOccultism2_4.isSelected = !btnOccultism2_4.isSelected
            skillUnlock2(
                btnOccultism2_4, btnOccultism2_8, btnOccultism2_12,
                btnOccultismPassive2_1, btnOccultismPassive2_2, btnOccultismPassive2_3,
                btnOccultismPassive2_4, btnOccultismPassive2_5, btnOccultismPassive2_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnOccultism2_5.setOnClickListener {
            if (skillPoints <= 0){
                if (btnOccultism2_5.isSelected) {
                    updateButtons2(btnOccultism2_5)
                    btnOccultism2_5.isSelected = !btnOccultism2_5.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnOccultism2_5)

            skillUnlock2(
                btnOccultism2_4, btnOccultism2_8, btnOccultism2_12,
                btnOccultismPassive2_1, btnOccultismPassive2_2, btnOccultismPassive2_3,
                btnOccultismPassive2_4, btnOccultismPassive2_5, btnOccultismPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnOccultism2_5.isSelected = !btnOccultism2_5.isSelected
        }

        btnOccultism2_6.setOnClickListener {
            if (skillPoints <= 0){
                if (btnOccultism2_6.isSelected) {
                    updateButtons2(btnOccultism2_6)
                    btnOccultism2_6.isSelected = !btnOccultism2_6.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnOccultism2_6)

            skillUnlock2(
                btnOccultism2_4, btnOccultism2_8, btnOccultism2_12,
                btnOccultismPassive2_1, btnOccultismPassive2_2, btnOccultismPassive2_3,
                btnOccultismPassive2_4, btnOccultismPassive2_5, btnOccultismPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnOccultism2_6.isSelected = !btnOccultism2_6.isSelected
        }

        btnOccultism2_7.setOnClickListener {
            if (skillPoints <= 0){
                if (btnOccultism2_7.isSelected) {
                    updateButtons2(btnOccultism2_7)
                    btnOccultism2_7.isSelected = !btnOccultism2_7.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnOccultism2_7)

            skillUnlock2(
                btnOccultism2_4, btnOccultism2_8, btnOccultism2_12,
                btnOccultismPassive2_1, btnOccultismPassive2_2, btnOccultismPassive2_3,
                btnOccultismPassive2_4, btnOccultismPassive2_5, btnOccultismPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnOccultism2_7.isSelected = !btnOccultism2_7.isSelected
        }

        btnOccultism2_8.setOnClickListener {
            if (skillPoints <= 0){
                if (btnOccultism2_8.isSelected) {
                    updateButtons2(btnOccultism2_8)
                    btnOccultism2_8.isSelected = !btnOccultism2_8.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnOccultism2_8)

            btnOccultism2_8.isSelected = !btnOccultism2_8.isSelected
            skillUnlock2(
                btnOccultism2_4, btnOccultism2_8, btnOccultism2_12,
                btnOccultismPassive2_1, btnOccultismPassive2_2, btnOccultismPassive2_3,
                btnOccultismPassive2_4, btnOccultismPassive2_5, btnOccultismPassive2_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnOccultism2_9.setOnClickListener {
            if (skillPoints <= 0){
                if (btnOccultism2_9.isSelected) {
                    updateButtons2(btnOccultism2_9)
                    btnOccultism2_9.isSelected = !btnOccultism2_9.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnOccultism2_9)

            skillUnlock2(
                btnOccultism2_4, btnOccultism2_8, btnOccultism2_12,
                btnOccultismPassive2_1, btnOccultismPassive2_2, btnOccultismPassive2_3,
                btnOccultismPassive2_4, btnOccultismPassive2_5, btnOccultismPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnOccultism2_9.isSelected = !btnOccultism2_9.isSelected
        }

        btnOccultism2_10.setOnClickListener {
            if (skillPoints <= 0){
                if (btnOccultism2_10.isSelected) {
                    updateButtons2(btnOccultism2_10)
                    btnOccultism2_10.isSelected = !btnOccultism2_10.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnOccultism2_10)

            skillUnlock2(
                btnOccultism2_4, btnOccultism2_8, btnOccultism2_12,
                btnOccultismPassive2_1, btnOccultismPassive2_2, btnOccultismPassive2_3,
                btnOccultismPassive2_4, btnOccultismPassive2_5, btnOccultismPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnOccultism2_10.isSelected = !btnOccultism2_10.isSelected
        }

        btnOccultism2_11.setOnClickListener {
            if (skillPoints <= 0){
                if (btnOccultism2_11.isSelected) {
                    updateButtons2(btnOccultism2_11)
                    btnOccultism2_11.isSelected = !btnOccultism2_11.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnOccultism2_11)

            skillUnlock2(
                btnOccultism2_4, btnOccultism2_8, btnOccultism2_12,
                btnOccultismPassive2_1, btnOccultismPassive2_2, btnOccultismPassive2_3,
                btnOccultismPassive2_4, btnOccultismPassive2_5, btnOccultismPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnOccultism2_11.isSelected = !btnOccultism2_11.isSelected
        }

        btnOccultism2_12.setOnClickListener {
            if (skillPoints <= 0){
                if (btnOccultism2_12.isSelected) {
                    updateButtons2(btnOccultism2_12)
                    btnOccultism2_12.isSelected = !btnOccultism2_12.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnOccultism2_12)

            btnOccultism2_12.isSelected = !btnOccultism2_12.isSelected
            skillUnlock2(
                btnOccultism2_4, btnOccultism2_8, btnOccultism2_12,
                btnOccultismPassive2_1, btnOccultismPassive2_2, btnOccultismPassive2_3,
                btnOccultismPassive2_4, btnOccultismPassive2_5, btnOccultismPassive2_6,
                skillPoints2Text, skillTree2Points
            )
        }
//endregion

        //region Occultism3 Button Actions
        btnOccultism3_1.setOnClickListener {
            if (skillPoints <= 0){
                if (btnOccultism3_1.isSelected) {
                    updateButtons3(btnOccultism3_1)
                    btnOccultism3_1.isSelected = !btnOccultism3_1.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnOccultism3_1)

            skillUnlock3(
                btnOccultism3_4, btnOccultism3_8, btnOccultism3_12,
                btnOccultismPassive3_1, btnOccultismPassive3_2, btnOccultismPassive3_3,
                btnOccultismPassive3_4, btnOccultismPassive3_5, btnOccultismPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnOccultism3_1.isSelected = !btnOccultism3_1.isSelected
        }

        btnOccultism3_2.setOnClickListener {
            if (skillPoints <= 0){
                if (btnOccultism3_2.isSelected) {
                    updateButtons3(btnOccultism3_2)
                    btnOccultism3_2.isSelected = !btnOccultism3_2.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnOccultism3_2)

            skillUnlock3(
                btnOccultism3_4, btnOccultism3_8, btnOccultism3_12,
                btnOccultismPassive3_1, btnOccultismPassive3_2, btnOccultismPassive3_3,
                btnOccultismPassive3_4, btnOccultismPassive3_5, btnOccultismPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnOccultism3_2.isSelected = !btnOccultism3_2.isSelected
        }

        btnOccultism3_3.setOnClickListener {
            if (skillPoints <= 0){
                if (btnOccultism3_3.isSelected) {
                    updateButtons3(btnOccultism3_3)
                    btnOccultism3_3.isSelected = !btnOccultism3_3.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnOccultism3_3)

            skillUnlock3(
                btnOccultism3_4, btnOccultism3_8, btnOccultism3_12,
                btnOccultismPassive3_1, btnOccultismPassive3_2, btnOccultismPassive3_3,
                btnOccultismPassive3_4, btnOccultismPassive3_5, btnOccultismPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnOccultism3_3.isSelected = !btnOccultism3_3.isSelected
        }

        btnOccultism3_4.setOnClickListener {
            if (skillPoints <= 0){
                if (btnOccultism3_4.isSelected) {
                    updateButtons3(btnOccultism3_4)
                    btnOccultism3_4.isSelected = !btnOccultism3_4.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnOccultism3_4)

            btnOccultism3_4.isSelected = !btnOccultism3_4.isSelected
            skillUnlock3(
                btnOccultism3_4, btnOccultism3_8, btnOccultism3_12,
                btnOccultismPassive3_1, btnOccultismPassive3_2, btnOccultismPassive3_3,
                btnOccultismPassive3_4, btnOccultismPassive3_5, btnOccultismPassive3_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnOccultism3_5.setOnClickListener {
            if (skillPoints <= 0){
                if (btnOccultism3_5.isSelected) {
                    updateButtons3(btnOccultism3_5)
                    btnOccultism3_5.isSelected = !btnOccultism3_5.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnOccultism3_5)

            skillUnlock3(
                btnOccultism3_4, btnOccultism3_8, btnOccultism3_12,
                btnOccultismPassive3_1, btnOccultismPassive3_2, btnOccultismPassive3_3,
                btnOccultismPassive3_4, btnOccultismPassive3_5, btnOccultismPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnOccultism3_5.isSelected = !btnOccultism3_5.isSelected
        }

        btnOccultism3_6.setOnClickListener {
            if (skillPoints <= 0){
                if (btnOccultism3_6.isSelected) {
                    updateButtons3(btnOccultism3_6)
                    btnOccultism3_6.isSelected = !btnOccultism3_6.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnOccultism3_6)

            skillUnlock3(
                btnOccultism3_4, btnOccultism3_8, btnOccultism3_12,
                btnOccultismPassive3_1, btnOccultismPassive3_2, btnOccultismPassive3_3,
                btnOccultismPassive3_4, btnOccultismPassive3_5, btnOccultismPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnOccultism3_6.isSelected = !btnOccultism3_6.isSelected
        }

        btnOccultism3_7.setOnClickListener {
            if (skillPoints <= 0){
                if (btnOccultism3_7.isSelected) {
                    updateButtons3(btnOccultism3_7)
                    btnOccultism3_7.isSelected = !btnOccultism3_7.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnOccultism3_7)

            skillUnlock3(
                btnOccultism3_4, btnOccultism3_8, btnOccultism3_12,
                btnOccultismPassive3_1, btnOccultismPassive3_2, btnOccultismPassive3_3,
                btnOccultismPassive3_4, btnOccultismPassive3_5, btnOccultismPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnOccultism3_7.isSelected = !btnOccultism3_7.isSelected
        }

        btnOccultism3_8.setOnClickListener {
            if (skillPoints <= 0){
                if (btnOccultism3_8.isSelected) {
                    updateButtons3(btnOccultism3_8)
                    btnOccultism3_8.isSelected = !btnOccultism3_8.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnOccultism3_8)

            btnOccultism3_8.isSelected = !btnOccultism3_8.isSelected
            skillUnlock3(
                btnOccultism3_4, btnOccultism3_8, btnOccultism3_12,
                btnOccultismPassive3_1, btnOccultismPassive3_2, btnOccultismPassive3_3,
                btnOccultismPassive3_4, btnOccultismPassive3_5, btnOccultismPassive3_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnOccultism3_9.setOnClickListener {
            if (skillPoints <= 0){
                if (btnOccultism3_9.isSelected) {
                    updateButtons3(btnOccultism3_9)
                    btnOccultism3_9.isSelected = !btnOccultism3_9.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnOccultism3_9)

            skillUnlock3(
                btnOccultism3_4, btnOccultism3_8, btnOccultism3_12,
                btnOccultismPassive3_1, btnOccultismPassive3_2, btnOccultismPassive3_3,
                btnOccultismPassive3_4, btnOccultismPassive3_5, btnOccultismPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnOccultism3_9.isSelected = !btnOccultism3_9.isSelected
        }

        btnOccultism3_10.setOnClickListener {
            if (skillPoints <= 0){
                if (btnOccultism3_10.isSelected) {
                    updateButtons3(btnOccultism3_10)
                    btnOccultism3_10.isSelected = !btnOccultism3_10.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnOccultism3_10)

            skillUnlock3(
                btnOccultism3_4, btnOccultism3_8, btnOccultism3_12,
                btnOccultismPassive3_1, btnOccultismPassive3_2, btnOccultismPassive3_3,
                btnOccultismPassive3_4, btnOccultismPassive3_5, btnOccultismPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnOccultism3_10.isSelected = !btnOccultism3_10.isSelected
        }

        btnOccultism3_11.setOnClickListener {
            if (skillPoints <= 0){
                if (btnOccultism3_11.isSelected) {
                    updateButtons3(btnOccultism3_11)
                    btnOccultism3_11.isSelected = !btnOccultism3_11.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnOccultism3_11)

            skillUnlock3(
                btnOccultism3_4, btnOccultism3_8, btnOccultism3_12,
                btnOccultismPassive3_1, btnOccultismPassive3_2, btnOccultismPassive3_3,
                btnOccultismPassive3_4, btnOccultismPassive3_5, btnOccultismPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnOccultism3_11.isSelected = !btnOccultism3_11.isSelected
        }

        btnOccultism3_12.setOnClickListener {
            if (skillPoints <= 0){
                if (btnOccultism3_12.isSelected) {
                    updateButtons3(btnOccultism3_12)
                    btnOccultism3_12.isSelected = !btnOccultism3_12.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnOccultism3_12)

            btnOccultism3_12.isSelected = !btnOccultism3_12.isSelected
            skillUnlock3(
                btnOccultism3_4, btnOccultism3_8, btnOccultism3_12,
                btnOccultismPassive3_1, btnOccultismPassive3_2, btnOccultismPassive3_3,
                btnOccultismPassive3_4, btnOccultismPassive3_5, btnOccultismPassive3_6,
                skillPoints2Text, skillTree2Points
            )
        }
//endregion
        

        //region Sorcery1 Button Actions
        btnSorcery1_1.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSorcery1_1.isSelected) {
                    updateButtons1(btnSorcery1_1)
                    btnSorcery1_1.isSelected = !btnSorcery1_1.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSorcery1_1)

            skillUnlock1(
                btnSorcery1_4, btnSorcery1_8, btnSorcery1_12,
                btnSorceryPassive1_1, btnSorceryPassive1_2, btnSorceryPassive1_3,
                btnSorceryPassive1_4, btnSorceryPassive1_5, btnSorceryPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnSorcery1_1.isSelected = !btnSorcery1_1.isSelected
        }

        btnSorcery1_2.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSorcery1_2.isSelected) {
                    updateButtons1(btnSorcery1_2)
                    btnSorcery1_2.isSelected = !btnSorcery1_2.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSorcery1_2)

            skillUnlock1(
                btnSorcery1_4, btnSorcery1_8, btnSorcery1_12,
                btnSorceryPassive1_1, btnSorceryPassive1_2, btnSorceryPassive1_3,
                btnSorceryPassive1_4, btnSorceryPassive1_5, btnSorceryPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnSorcery1_2.isSelected = !btnSorcery1_2.isSelected
        }

        btnSorcery1_3.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSorcery1_3.isSelected) {
                    updateButtons1(btnSorcery1_3)
                    btnSorcery1_3.isSelected = !btnSorcery1_3.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSorcery1_3)

            skillUnlock1(
                btnSorcery1_4, btnSorcery1_8, btnSorcery1_12,
                btnSorceryPassive1_1, btnSorceryPassive1_2, btnSorceryPassive1_3,
                btnSorceryPassive1_4, btnSorceryPassive1_5, btnSorceryPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnSorcery1_3.isSelected = !btnSorcery1_3.isSelected
        }

        btnSorcery1_4.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSorcery1_4.isSelected) {
                    updateButtons1(btnSorcery1_4)
                    btnSorcery1_4.isSelected = !btnSorcery1_4.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSorcery1_4)

            btnSorcery1_4.isSelected = !btnSorcery1_4.isSelected
            skillUnlock1(
                btnSorcery1_4, btnSorcery1_8, btnSorcery1_12,
                btnSorceryPassive1_1, btnSorceryPassive1_2, btnSorceryPassive1_3,
                btnSorceryPassive1_4, btnSorceryPassive1_5, btnSorceryPassive1_6,
                skillPoints1Text, skillTree1Points
            )
        }

        btnSorcery1_5.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSorcery1_5.isSelected) {
                    updateButtons1(btnSorcery1_5)
                    btnSorcery1_5.isSelected = !btnSorcery1_5.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSorcery1_5)

            skillUnlock1(
                btnSorcery1_4, btnSorcery1_8, btnSorcery1_12,
                btnSorceryPassive1_1, btnSorceryPassive1_2, btnSorceryPassive1_3,
                btnSorceryPassive1_4, btnSorceryPassive1_5, btnSorceryPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnSorcery1_5.isSelected = !btnSorcery1_5.isSelected
        }

        btnSorcery1_6.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSorcery1_6.isSelected) {
                    updateButtons1(btnSorcery1_6)
                    btnSorcery1_6.isSelected = !btnSorcery1_6.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSorcery1_6)

            skillUnlock1(
                btnSorcery1_4, btnSorcery1_8, btnSorcery1_12,
                btnSorceryPassive1_1, btnSorceryPassive1_2, btnSorceryPassive1_3,
                btnSorceryPassive1_4, btnSorceryPassive1_5, btnSorceryPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnSorcery1_6.isSelected = !btnSorcery1_6.isSelected
        }

        btnSorcery1_7.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSorcery1_7.isSelected) {
                    updateButtons1(btnSorcery1_7)
                    btnSorcery1_7.isSelected = !btnSorcery1_7.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSorcery1_7)

            skillUnlock1(
                btnSorcery1_4, btnSorcery1_8, btnSorcery1_12,
                btnSorceryPassive1_1, btnSorceryPassive1_2, btnSorceryPassive1_3,
                btnSorceryPassive1_4, btnSorceryPassive1_5, btnSorceryPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnSorcery1_7.isSelected = !btnSorcery1_7.isSelected
        }

        btnSorcery1_8.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSorcery1_8.isSelected) {
                    updateButtons1(btnSorcery1_8)
                    btnSorcery1_8.isSelected = !btnSorcery1_8.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSorcery1_8)

            btnSorcery1_8.isSelected = !btnSorcery1_8.isSelected
            skillUnlock1(
                btnSorcery1_4, btnSorcery1_8, btnSorcery1_12,
                btnSorceryPassive1_1, btnSorceryPassive1_2, btnSorceryPassive1_3,
                btnSorceryPassive1_4, btnSorceryPassive1_5, btnSorceryPassive1_6,
                skillPoints1Text, skillTree1Points
            )
        }

        btnSorcery1_9.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSorcery1_9.isSelected) {
                    updateButtons1(btnSorcery1_9)
                    btnSorcery1_9.isSelected = !btnSorcery1_9.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSorcery1_9)

            skillUnlock1(
                btnSorcery1_4, btnSorcery1_8, btnSorcery1_12,
                btnSorceryPassive1_1, btnSorceryPassive1_2, btnSorceryPassive1_3,
                btnSorceryPassive1_4, btnSorceryPassive1_5, btnSorceryPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnSorcery1_9.isSelected = !btnSorcery1_9.isSelected
        }

        btnSorcery1_10.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSorcery1_10.isSelected) {
                    updateButtons1(btnSorcery1_10)
                    btnSorcery1_10.isSelected = !btnSorcery1_10.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSorcery1_10)

            skillUnlock1(
                btnSorcery1_4, btnSorcery1_8, btnSorcery1_12,
                btnSorceryPassive1_1, btnSorceryPassive1_2, btnSorceryPassive1_3,
                btnSorceryPassive1_4, btnSorceryPassive1_5, btnSorceryPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnSorcery1_10.isSelected = !btnSorcery1_10.isSelected
        }

        btnSorcery1_11.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSorcery1_11.isSelected) {
                    updateButtons1(btnSorcery1_11)
                    btnSorcery1_11.isSelected = !btnSorcery1_11.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSorcery1_11)

            skillUnlock1(
                btnSorcery1_4, btnSorcery1_8, btnSorcery1_12,
                btnSorceryPassive1_1, btnSorceryPassive1_2, btnSorceryPassive1_3,
                btnSorceryPassive1_4, btnSorceryPassive1_5, btnSorceryPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnSorcery1_11.isSelected = !btnSorcery1_11.isSelected
        }

        btnSorcery1_12.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSorcery1_12.isSelected) {
                    updateButtons1(btnSorcery1_12)
                    btnSorcery1_12.isSelected = !btnSorcery1_12.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSorcery1_12)

            btnSorcery1_12.isSelected = !btnSorcery1_12.isSelected
            skillUnlock1(
                btnSorcery1_4, btnSorcery1_8, btnSorcery1_12,
                btnSorceryPassive1_1, btnSorceryPassive1_2, btnSorceryPassive1_3,
                btnSorceryPassive1_4, btnSorceryPassive1_5, btnSorceryPassive1_6,
                skillPoints1Text, skillTree1Points
            )
        }
//endregion

        //region Sorcery2 Button Actions
        btnSorcery2_1.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSorcery2_1.isSelected) {
                    updateButtons2(btnSorcery2_1)
                    btnSorcery2_1.isSelected = !btnSorcery2_1.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSorcery2_1)

            skillUnlock2(
                btnSorcery2_4, btnSorcery2_8, btnSorcery2_12,
                btnSorceryPassive2_1, btnSorceryPassive2_2, btnSorceryPassive2_3,
                btnSorceryPassive2_4, btnSorceryPassive2_5, btnSorceryPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnSorcery2_1.isSelected = !btnSorcery2_1.isSelected
        }

        btnSorcery2_2.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSorcery2_2.isSelected) {
                    updateButtons2(btnSorcery2_2)
                    btnSorcery2_2.isSelected = !btnSorcery2_2.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSorcery2_2)

            skillUnlock2(
                btnSorcery1_4, btnSorcery1_8, btnSorcery1_12,
                btnSorceryPassive2_1, btnSorceryPassive2_2, btnSorceryPassive2_3,
                btnSorceryPassive2_4, btnSorceryPassive2_5, btnSorceryPassive2_6,
                skillPoints1Text, skillTree1Points
            )
            btnSorcery2_2.isSelected = !btnSorcery2_2.isSelected
        }

        btnSorcery2_3.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSorcery2_3.isSelected) {
                    updateButtons2(btnSorcery2_3)
                    btnSorcery2_3.isSelected = !btnSorcery2_3.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSorcery2_3)

            skillUnlock2(
                btnSorcery1_4, btnSorcery1_8, btnSorcery1_12,
                btnSorceryPassive2_1, btnSorceryPassive2_2, btnSorceryPassive2_3,
                btnSorceryPassive2_4, btnSorceryPassive2_5, btnSorceryPassive2_6,
                skillPoints1Text, skillTree1Points
            )
            btnSorcery2_3.isSelected = !btnSorcery2_3.isSelected
        }

        btnSorcery2_4.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSorcery2_4.isSelected) {
                    updateButtons2(btnSorcery2_4)
                    btnSorcery2_4.isSelected = !btnSorcery2_4.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSorcery2_4)

            btnSorcery2_4.isSelected = !btnSorcery2_4.isSelected
            skillUnlock2(
                btnSorcery1_4, btnSorcery1_8, btnSorcery1_12,
                btnSorceryPassive2_1, btnSorceryPassive2_2, btnSorceryPassive2_3,
                btnSorceryPassive2_4, btnSorceryPassive2_5, btnSorceryPassive2_6,
                skillPoints1Text, skillTree1Points
            )
        }

        btnSorcery2_5.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSorcery2_5.isSelected) {
                    updateButtons2(btnSorcery2_5)
                    btnSorcery2_5.isSelected = !btnSorcery2_5.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSorcery2_5)

            skillUnlock2(
                btnSorcery1_4, btnSorcery1_8, btnSorcery1_12,
                btnSorceryPassive2_1, btnSorceryPassive2_2, btnSorceryPassive2_3,
                btnSorceryPassive2_4, btnSorceryPassive2_5, btnSorceryPassive2_6,
                skillPoints1Text, skillTree1Points
            )
            btnSorcery2_5.isSelected = !btnSorcery2_5.isSelected
        }

        btnSorcery2_6.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSorcery2_6.isSelected) {
                    updateButtons2(btnSorcery2_6)
                    btnSorcery2_6.isSelected = !btnSorcery2_6.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSorcery2_6)

            skillUnlock2(
                btnSorcery1_4, btnSorcery1_8, btnSorcery1_12,
                btnSorceryPassive2_1, btnSorceryPassive2_2, btnSorceryPassive2_3,
                btnSorceryPassive2_4, btnSorceryPassive2_5, btnSorceryPassive2_6,
                skillPoints1Text, skillTree1Points
            )
            btnSorcery2_6.isSelected = !btnSorcery2_6.isSelected
        }

        btnSorcery2_7.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSorcery2_7.isSelected) {
                    updateButtons2(btnSorcery2_7)
                    btnSorcery2_7.isSelected = !btnSorcery2_7.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSorcery2_7)

            skillUnlock2(
                btnSorcery1_4, btnSorcery1_8, btnSorcery1_12,
                btnSorceryPassive2_1, btnSorceryPassive2_2, btnSorceryPassive2_3,
                btnSorceryPassive2_4, btnSorceryPassive2_5, btnSorceryPassive2_6,
                skillPoints1Text, skillTree1Points
            )
            btnSorcery2_7.isSelected = !btnSorcery2_7.isSelected
        }

        btnSorcery2_8.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSorcery2_8.isSelected) {
                    updateButtons2(btnSorcery2_8)
                    btnSorcery2_8.isSelected = !btnSorcery2_8.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSorcery2_8)

            btnSorcery2_8.isSelected = !btnSorcery2_8.isSelected
            skillUnlock2(
                btnSorcery1_4, btnSorcery1_8, btnSorcery1_12,
                btnSorceryPassive2_1, btnSorceryPassive2_2, btnSorceryPassive2_3,
                btnSorceryPassive2_4, btnSorceryPassive2_5, btnSorceryPassive2_6,
                skillPoints1Text, skillTree1Points
            )
        }

        btnSorcery2_9.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSorcery2_9.isSelected) {
                    updateButtons2(btnSorcery2_9)
                    btnSorcery2_9.isSelected = !btnSorcery2_9.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSorcery2_9)

            skillUnlock2(
                btnSorcery1_4, btnSorcery1_8, btnSorcery1_12,
                btnSorceryPassive2_1, btnSorceryPassive2_2, btnSorceryPassive2_3,
                btnSorceryPassive2_4, btnSorceryPassive2_5, btnSorceryPassive2_6,
                skillPoints1Text, skillTree1Points
            )
            btnSorcery2_9.isSelected = !btnSorcery2_9.isSelected
        }

        btnSorcery2_10.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSorcery2_10.isSelected) {
                    updateButtons2(btnSorcery2_10)
                    btnSorcery2_10.isSelected = !btnSorcery2_10.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSorcery2_10)

            skillUnlock2(
                btnSorcery1_4, btnSorcery1_8, btnSorcery1_12,
                btnSorceryPassive2_1, btnSorceryPassive2_2, btnSorceryPassive2_3,
                btnSorceryPassive2_4, btnSorceryPassive2_5, btnSorceryPassive2_6,
                skillPoints1Text, skillTree1Points
            )
            btnSorcery2_10.isSelected = !btnSorcery2_10.isSelected
        }

        btnSorcery2_11.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSorcery2_11.isSelected) {
                    updateButtons2(btnSorcery2_11)
                    btnSorcery2_11.isSelected = !btnSorcery2_11.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSorcery2_11)

            skillUnlock2(
                btnSorcery1_4, btnSorcery1_8, btnSorcery1_12,
                btnSorceryPassive2_1, btnSorceryPassive2_2, btnSorceryPassive2_3,
                btnSorceryPassive2_4, btnSorceryPassive2_5, btnSorceryPassive2_6,
                skillPoints1Text, skillTree1Points
            )
            btnSorcery2_11.isSelected = !btnSorcery2_11.isSelected
        }

        btnSorcery2_12.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSorcery2_12.isSelected) {
                    updateButtons2(btnSorcery2_12)
                    btnSorcery2_12.isSelected = !btnSorcery2_12.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSorcery2_12)

            btnSorcery2_12.isSelected = !btnSorcery2_12.isSelected
            skillUnlock2(
                btnSorcery1_4, btnSorcery1_8, btnSorcery1_12,
                btnSorceryPassive2_1, btnSorceryPassive2_2, btnSorceryPassive2_3,
                btnSorceryPassive2_4, btnSorceryPassive2_5, btnSorceryPassive2_6,
                skillPoints1Text, skillTree1Points
            )
        }
//endregion

        //region Sorcery3 Button Actions
        btnSorcery3_1.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSorcery3_1.isSelected) {
                    updateButtons3(btnSorcery3_1)
                    btnSorcery3_1.isSelected = !btnSorcery3_1.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSorcery3_1)

            skillUnlock3(
                btnSorcery3_4, btnSorcery3_8, btnSorcery3_12,
                btnSorceryPassive3_1, btnSorceryPassive3_2, btnSorceryPassive3_3,
                btnSorceryPassive3_4, btnSorceryPassive3_5, btnSorceryPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnSorcery3_1.isSelected = !btnSorcery3_1.isSelected
        }

        btnSorcery3_2.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSorcery3_2.isSelected) {
                    updateButtons3(btnSorcery3_2)
                    btnSorcery3_2.isSelected = !btnSorcery3_2.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSorcery3_2)

            skillUnlock3(
                btnSorcery1_4, btnSorcery1_8, btnSorcery1_12,
                btnSorceryPassive3_1, btnSorceryPassive3_2, btnSorceryPassive3_3,
                btnSorceryPassive3_4, btnSorceryPassive3_5, btnSorceryPassive3_6,
                skillPoints1Text, skillTree1Points
            )
            btnSorcery3_2.isSelected = !btnSorcery3_2.isSelected
        }

        btnSorcery3_3.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSorcery3_3.isSelected) {
                    updateButtons3(btnSorcery3_3)
                    btnSorcery3_3.isSelected = !btnSorcery3_3.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSorcery3_3)

            skillUnlock3(
                btnSorcery1_4, btnSorcery1_8, btnSorcery1_12,
                btnSorceryPassive3_1, btnSorceryPassive3_2, btnSorceryPassive3_3,
                btnSorceryPassive3_4, btnSorceryPassive3_5, btnSorceryPassive3_6,
                skillPoints1Text, skillTree1Points
            )
            btnSorcery3_3.isSelected = !btnSorcery3_3.isSelected
        }

        btnSorcery3_4.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSorcery3_4.isSelected) {
                    updateButtons3(btnSorcery3_4)
                    btnSorcery3_4.isSelected = !btnSorcery3_4.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSorcery3_4)

            btnSorcery3_4.isSelected = !btnSorcery3_4.isSelected
            skillUnlock3(
                btnSorcery1_4, btnSorcery1_8, btnSorcery1_12,
                btnSorceryPassive3_1, btnSorceryPassive3_2, btnSorceryPassive3_3,
                btnSorceryPassive3_4, btnSorceryPassive3_5, btnSorceryPassive3_6,
                skillPoints1Text, skillTree1Points
            )
        }

        btnSorcery3_5.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSorcery3_5.isSelected) {
                    updateButtons3(btnSorcery3_5)
                    btnSorcery3_5.isSelected = !btnSorcery3_5.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSorcery3_5)

            skillUnlock3(
                btnSorcery1_4, btnSorcery1_8, btnSorcery1_12,
                btnSorceryPassive3_1, btnSorceryPassive3_2, btnSorceryPassive3_3,
                btnSorceryPassive3_4, btnSorceryPassive3_5, btnSorceryPassive3_6,
                skillPoints1Text, skillTree1Points
            )
            btnSorcery3_5.isSelected = !btnSorcery3_5.isSelected
        }

        btnSorcery3_6.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSorcery3_6.isSelected) {
                    updateButtons3(btnSorcery3_6)
                    btnSorcery3_6.isSelected = !btnSorcery3_6.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSorcery3_6)

            skillUnlock3(
                btnSorcery1_4, btnSorcery1_8, btnSorcery1_12,
                btnSorceryPassive3_1, btnSorceryPassive3_2, btnSorceryPassive3_3,
                btnSorceryPassive3_4, btnSorceryPassive3_5, btnSorceryPassive3_6,
                skillPoints1Text, skillTree1Points
            )
            btnSorcery3_6.isSelected = !btnSorcery3_6.isSelected
        }

        btnSorcery3_7.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSorcery3_7.isSelected) {
                    updateButtons3(btnSorcery3_7)
                    btnSorcery3_7.isSelected = !btnSorcery3_7.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSorcery3_7)

            skillUnlock3(
                btnSorcery1_4, btnSorcery1_8, btnSorcery1_12,
                btnSorceryPassive3_1, btnSorceryPassive3_2, btnSorceryPassive3_3,
                btnSorceryPassive3_4, btnSorceryPassive3_5, btnSorceryPassive3_6,
                skillPoints1Text, skillTree1Points
            )
            btnSorcery3_7.isSelected = !btnSorcery3_7.isSelected
        }

        btnSorcery3_8.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSorcery3_8.isSelected) {
                    updateButtons3(btnSorcery3_8)
                    btnSorcery3_8.isSelected = !btnSorcery3_8.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSorcery3_8)

            btnSorcery3_8.isSelected = !btnSorcery3_8.isSelected
            skillUnlock3(
                btnSorcery1_4, btnSorcery1_8, btnSorcery1_12,
                btnSorceryPassive3_1, btnSorceryPassive3_2, btnSorceryPassive3_3,
                btnSorceryPassive3_4, btnSorceryPassive3_5, btnSorceryPassive3_6,
                skillPoints1Text, skillTree1Points
            )
        }

        btnSorcery3_9.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSorcery3_9.isSelected) {
                    updateButtons3(btnSorcery3_9)
                    btnSorcery3_9.isSelected = !btnSorcery3_9.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSorcery3_9)

            skillUnlock3(
                btnSorcery1_4, btnSorcery1_8, btnSorcery1_12,
                btnSorceryPassive3_1, btnSorceryPassive3_2, btnSorceryPassive3_3,
                btnSorceryPassive3_4, btnSorceryPassive3_5, btnSorceryPassive3_6,
                skillPoints1Text, skillTree1Points
            )
            btnSorcery3_9.isSelected = !btnSorcery3_9.isSelected
        }

        btnSorcery3_10.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSorcery3_10.isSelected) {
                    updateButtons3(btnSorcery3_10)
                    btnSorcery3_10.isSelected = !btnSorcery3_10.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSorcery3_10)

            skillUnlock3(
                btnSorcery1_4, btnSorcery1_8, btnSorcery1_12,
                btnSorceryPassive3_1, btnSorceryPassive3_2, btnSorceryPassive3_3,
                btnSorceryPassive3_4, btnSorceryPassive3_5, btnSorceryPassive3_6,
                skillPoints1Text, skillTree1Points
            )
            btnSorcery3_10.isSelected = !btnSorcery3_10.isSelected
        }

        btnSorcery3_11.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSorcery3_11.isSelected) {
                    updateButtons3(btnSorcery3_11)
                    btnSorcery3_11.isSelected = !btnSorcery3_11.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSorcery3_11)

            skillUnlock3(
                btnSorcery1_4, btnSorcery1_8, btnSorcery1_12,
                btnSorceryPassive3_1, btnSorceryPassive3_2, btnSorceryPassive3_3,
                btnSorceryPassive3_4, btnSorceryPassive3_5, btnSorceryPassive3_6,
                skillPoints1Text, skillTree1Points
            )
            btnSorcery3_11.isSelected = !btnSorcery3_11.isSelected
        }

        btnSorcery3_12.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSorcery3_12.isSelected) {
                    updateButtons3(btnSorcery3_12)
                    btnSorcery3_12.isSelected = !btnSorcery3_12.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSorcery3_12)

            btnSorcery3_12.isSelected = !btnSorcery3_12.isSelected
            skillUnlock3(
                btnSorcery1_4, btnSorcery1_8, btnSorcery1_12,
                btnSorceryPassive3_1, btnSorceryPassive3_2, btnSorceryPassive3_3,
                btnSorceryPassive3_4, btnSorceryPassive3_5, btnSorceryPassive3_6,
                skillPoints1Text, skillTree1Points
            )
        }
//endregion
        

        //region Songcraft1 Button Actions
        btnSongcraft1_1.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSongcraft1_1.isSelected) {
                    updateButtons1(btnSongcraft1_1)
                    btnSongcraft1_1.isSelected = !btnSongcraft1_1.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSongcraft1_1)

            skillUnlock1(
                btnSongcraft1_4, btnSongcraft1_8, btnSongcraft1_12,
                btnSongcraftPassive1_1, btnSongcraftPassive1_2, btnSongcraftPassive1_3,
                btnSongcraftPassive1_4, btnSongcraftPassive1_5, btnSongcraftPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnSongcraft1_1.isSelected = !btnSongcraft1_1.isSelected
        }

        btnSongcraft1_2.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSongcraft1_2.isSelected) {
                    updateButtons1(btnSongcraft1_2)
                    btnSongcraft1_2.isSelected = !btnSongcraft1_2.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSongcraft1_2)

            skillUnlock1(
                btnSongcraft1_4, btnSongcraft1_8, btnSongcraft1_12,
                btnSongcraftPassive1_1, btnSongcraftPassive1_2, btnSongcraftPassive1_3,
                btnSongcraftPassive1_4, btnSongcraftPassive1_5, btnSongcraftPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnSongcraft1_2.isSelected = !btnSongcraft1_2.isSelected
        }

        btnSongcraft1_3.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSongcraft1_3.isSelected) {
                    updateButtons1(btnSongcraft1_3)
                    btnSongcraft1_3.isSelected = !btnSongcraft1_3.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSongcraft1_3)

            skillUnlock1(
                btnSongcraft1_4, btnSongcraft1_8, btnSongcraft1_12,
                btnSongcraftPassive1_1, btnSongcraftPassive1_2, btnSongcraftPassive1_3,
                btnSongcraftPassive1_4, btnSongcraftPassive1_5, btnSongcraftPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnSongcraft1_3.isSelected = !btnSongcraft1_3.isSelected
        }

        btnSongcraft1_4.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSongcraft1_4.isSelected) {
                    updateButtons1(btnSongcraft1_4)
                    btnSongcraft1_4.isSelected = !btnSongcraft1_4.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSongcraft1_4)

            btnSongcraft1_4.isSelected = !btnSongcraft1_4.isSelected
            skillUnlock1(
                btnSongcraft1_4, btnSongcraft1_8, btnSongcraft1_12,
                btnSongcraftPassive1_1, btnSongcraftPassive1_2, btnSongcraftPassive1_3,
                btnSongcraftPassive1_4, btnSongcraftPassive1_5, btnSongcraftPassive1_6,
                skillPoints1Text, skillTree1Points
            )
        }

        btnSongcraft1_5.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSongcraft1_5.isSelected) {
                    updateButtons1(btnSongcraft1_5)
                    btnSongcraft1_5.isSelected = !btnSongcraft1_5.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSongcraft1_5)

            skillUnlock1(
                btnSongcraft1_4, btnSongcraft1_8, btnSongcraft1_12,
                btnSongcraftPassive1_1, btnSongcraftPassive1_2, btnSongcraftPassive1_3,
                btnSongcraftPassive1_4, btnSongcraftPassive1_5, btnSongcraftPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnSongcraft1_5.isSelected = !btnSongcraft1_5.isSelected
        }

        btnSongcraft1_6.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSongcraft1_6.isSelected) {
                    updateButtons1(btnSongcraft1_6)
                    btnSongcraft1_6.isSelected = !btnSongcraft1_6.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSongcraft1_6)

            skillUnlock1(
                btnSongcraft1_4, btnSongcraft1_8, btnSongcraft1_12,
                btnSongcraftPassive1_1, btnSongcraftPassive1_2, btnSongcraftPassive1_3,
                btnSongcraftPassive1_4, btnSongcraftPassive1_5, btnSongcraftPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnSongcraft1_6.isSelected = !btnSongcraft1_6.isSelected
        }

        btnSongcraft1_7.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSongcraft1_7.isSelected) {
                    updateButtons1(btnSongcraft1_7)
                    btnSongcraft1_7.isSelected = !btnSongcraft1_7.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSongcraft1_7)

            skillUnlock1(
                btnSongcraft1_4, btnSongcraft1_8, btnSongcraft1_12,
                btnSongcraftPassive1_1, btnSongcraftPassive1_2, btnSongcraftPassive1_3,
                btnSongcraftPassive1_4, btnSongcraftPassive1_5, btnSongcraftPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnSongcraft1_7.isSelected = !btnSongcraft1_7.isSelected
        }

        btnSongcraft1_8.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSongcraft1_8.isSelected) {
                    updateButtons1(btnSongcraft1_8)
                    btnSongcraft1_8.isSelected = !btnSongcraft1_8.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSongcraft1_8)

            btnSongcraft1_8.isSelected = !btnSongcraft1_8.isSelected
            skillUnlock1(
                btnSongcraft1_4, btnSongcraft1_8, btnSongcraft1_12,
                btnSongcraftPassive1_1, btnSongcraftPassive1_2, btnSongcraftPassive1_3,
                btnSongcraftPassive1_4, btnSongcraftPassive1_5, btnSongcraftPassive1_6,
                skillPoints1Text, skillTree1Points
            )
        }

        btnSongcraft1_9.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSongcraft1_9.isSelected) {
                    updateButtons1(btnSongcraft1_9)
                    btnSongcraft1_9.isSelected = !btnSongcraft1_9.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSongcraft1_9)

            skillUnlock1(
                btnSongcraft1_4, btnSongcraft1_8, btnSongcraft1_12,
                btnSongcraftPassive1_1, btnSongcraftPassive1_2, btnSongcraftPassive1_3,
                btnSongcraftPassive1_4, btnSongcraftPassive1_5, btnSongcraftPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnSongcraft1_9.isSelected = !btnSongcraft1_9.isSelected
        }

        btnSongcraft1_10.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSongcraft1_10.isSelected) {
                    updateButtons1(btnSongcraft1_10)
                    btnSongcraft1_10.isSelected = !btnSongcraft1_10.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSongcraft1_10)

            skillUnlock1(
                btnSongcraft1_4, btnSongcraft1_8, btnSongcraft1_12,
                btnSongcraftPassive1_1, btnSongcraftPassive1_2, btnSongcraftPassive1_3,
                btnSongcraftPassive1_4, btnSongcraftPassive1_5, btnSongcraftPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnSongcraft1_10.isSelected = !btnSongcraft1_10.isSelected
        }

        btnSongcraft1_11.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSongcraft1_11.isSelected) {
                    updateButtons1(btnSongcraft1_11)
                    btnSongcraft1_11.isSelected = !btnSongcraft1_11.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSongcraft1_11)

            skillUnlock1(
                btnSongcraft1_4, btnSongcraft1_8, btnSongcraft1_12,
                btnSongcraftPassive1_1, btnSongcraftPassive1_2, btnSongcraftPassive1_3,
                btnSongcraftPassive1_4, btnSongcraftPassive1_5, btnSongcraftPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnSongcraft1_11.isSelected = !btnSongcraft1_11.isSelected
        }

        btnSongcraft1_12.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSongcraft1_12.isSelected) {
                    updateButtons1(btnSongcraft1_12)
                    btnSongcraft1_12.isSelected = !btnSongcraft1_12.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSongcraft1_12)

            btnSongcraft1_12.isSelected = !btnSongcraft1_12.isSelected
            skillUnlock1(
                btnSongcraft1_4, btnSongcraft1_8, btnSongcraft1_12,
                btnSongcraftPassive1_1, btnSongcraftPassive1_2, btnSongcraftPassive1_3,
                btnSongcraftPassive1_4, btnSongcraftPassive1_5, btnSongcraftPassive1_6,
                skillPoints1Text, skillTree1Points
            )
        }
//endregion

        //region Songcraft2 Button Actions
        btnSongcraft2_1.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSongcraft2_1.isSelected) {
                    updateButtons2(btnSongcraft2_1)
                    btnSongcraft2_1.isSelected = !btnSongcraft2_1.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSongcraft2_1)

            skillUnlock2(
                btnSongcraft2_4, btnSongcraft2_8, btnSongcraft2_12,
                btnSongcraftPassive2_1, btnSongcraftPassive2_2, btnSongcraftPassive2_3,
                btnSongcraftPassive2_4, btnSongcraftPassive2_5, btnSongcraftPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnSongcraft2_1.isSelected = !btnSongcraft2_1.isSelected
        }

        btnSongcraft2_2.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSongcraft2_2.isSelected) {
                    updateButtons2(btnSongcraft2_2)
                    btnSongcraft2_2.isSelected = !btnSongcraft2_2.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSongcraft2_2)

            skillUnlock2(
                btnSongcraft2_4, btnSongcraft2_8, btnSongcraft2_12,
                btnSongcraftPassive2_1, btnSongcraftPassive2_2, btnSongcraftPassive2_3,
                btnSongcraftPassive2_4, btnSongcraftPassive2_5, btnSongcraftPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnSongcraft2_2.isSelected = !btnSongcraft2_2.isSelected
        }

        btnSongcraft2_3.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSongcraft2_3.isSelected) {
                    updateButtons2(btnSongcraft2_3)
                    btnSongcraft2_3.isSelected = !btnSongcraft2_3.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSongcraft2_3)

            skillUnlock2(
                btnSongcraft2_4, btnSongcraft2_8, btnSongcraft2_12,
                btnSongcraftPassive2_1, btnSongcraftPassive2_2, btnSongcraftPassive2_3,
                btnSongcraftPassive2_4, btnSongcraftPassive2_5, btnSongcraftPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnSongcraft2_3.isSelected = !btnSongcraft2_3.isSelected
        }

        btnSongcraft2_4.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSongcraft2_4.isSelected) {
                    updateButtons2(btnSongcraft2_4)
                    btnSongcraft2_4.isSelected = !btnSongcraft2_4.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSongcraft2_4)

            btnSongcraft2_4.isSelected = !btnSongcraft2_4.isSelected
            skillUnlock2(
                btnSongcraft2_4, btnSongcraft2_8, btnSongcraft2_12,
                btnSongcraftPassive2_1, btnSongcraftPassive2_2, btnSongcraftPassive2_3,
                btnSongcraftPassive2_4, btnSongcraftPassive2_5, btnSongcraftPassive2_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnSongcraft2_5.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSongcraft2_5.isSelected) {
                    updateButtons2(btnSongcraft2_5)
                    btnSongcraft2_5.isSelected = !btnSongcraft2_5.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSongcraft2_5)

            skillUnlock2(
                btnSongcraft2_4, btnSongcraft2_8, btnSongcraft2_12,
                btnSongcraftPassive2_1, btnSongcraftPassive2_2, btnSongcraftPassive2_3,
                btnSongcraftPassive2_4, btnSongcraftPassive2_5, btnSongcraftPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnSongcraft2_5.isSelected = !btnSongcraft2_5.isSelected
        }

        btnSongcraft2_6.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSongcraft2_6.isSelected) {
                    updateButtons2(btnSongcraft2_6)
                    btnSongcraft2_6.isSelected = !btnSongcraft2_6.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSongcraft2_6)

            skillUnlock2(
                btnSongcraft2_4, btnSongcraft2_8, btnSongcraft2_12,
                btnSongcraftPassive2_1, btnSongcraftPassive2_2, btnSongcraftPassive2_3,
                btnSongcraftPassive2_4, btnSongcraftPassive2_5, btnSongcraftPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnSongcraft2_6.isSelected = !btnSongcraft2_6.isSelected
        }

        btnSongcraft2_7.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSongcraft2_7.isSelected) {
                    updateButtons2(btnSongcraft2_7)
                    btnSongcraft2_7.isSelected = !btnSongcraft2_7.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSongcraft2_7)

            skillUnlock2(
                btnSongcraft2_4, btnSongcraft2_8, btnSongcraft2_12,
                btnSongcraftPassive2_1, btnSongcraftPassive2_2, btnSongcraftPassive2_3,
                btnSongcraftPassive2_4, btnSongcraftPassive2_5, btnSongcraftPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnSongcraft2_7.isSelected = !btnSongcraft2_7.isSelected
        }

        btnSongcraft2_8.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSongcraft2_8.isSelected) {
                    updateButtons2(btnSongcraft2_8)
                    btnSongcraft2_8.isSelected = !btnSongcraft2_8.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSongcraft2_8)

            btnSongcraft2_8.isSelected = !btnSongcraft2_8.isSelected
            skillUnlock2(
                btnSongcraft2_4, btnSongcraft2_8, btnSongcraft2_12,
                btnSongcraftPassive2_1, btnSongcraftPassive2_2, btnSongcraftPassive2_3,
                btnSongcraftPassive2_4, btnSongcraftPassive2_5, btnSongcraftPassive2_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnSongcraft2_9.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSongcraft2_9.isSelected) {
                    updateButtons2(btnSongcraft2_9)
                    btnSongcraft2_9.isSelected = !btnSongcraft2_9.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSongcraft2_9)

            skillUnlock2(
                btnSongcraft2_4, btnSongcraft2_8, btnSongcraft2_12,
                btnSongcraftPassive2_1, btnSongcraftPassive2_2, btnSongcraftPassive2_3,
                btnSongcraftPassive2_4, btnSongcraftPassive2_5, btnSongcraftPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnSongcraft2_9.isSelected = !btnSongcraft2_9.isSelected
        }

        btnSongcraft2_10.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSongcraft2_10.isSelected) {
                    updateButtons2(btnSongcraft2_10)
                    btnSongcraft2_10.isSelected = !btnSongcraft2_10.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSongcraft2_10)

            skillUnlock2(
                btnSongcraft2_4, btnSongcraft2_8, btnSongcraft2_12,
                btnSongcraftPassive2_1, btnSongcraftPassive2_2, btnSongcraftPassive2_3,
                btnSongcraftPassive2_4, btnSongcraftPassive2_5, btnSongcraftPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnSongcraft2_10.isSelected = !btnSongcraft2_10.isSelected
        }

        btnSongcraft2_11.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSongcraft2_11.isSelected) {
                    updateButtons2(btnSongcraft2_11)
                    btnSongcraft2_11.isSelected = !btnSongcraft2_11.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSongcraft2_11)

            skillUnlock2(
                btnSongcraft2_4, btnSongcraft2_8, btnSongcraft2_12,
                btnSongcraftPassive2_1, btnSongcraftPassive2_2, btnSongcraftPassive2_3,
                btnSongcraftPassive2_4, btnSongcraftPassive2_5, btnSongcraftPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnSongcraft2_11.isSelected = !btnSongcraft2_11.isSelected
        }

        btnSongcraft2_12.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSongcraft2_12.isSelected) {
                    updateButtons2(btnSongcraft2_12)
                    btnSongcraft2_12.isSelected = !btnSongcraft2_12.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSongcraft2_12)

            btnSongcraft2_12.isSelected = !btnSongcraft2_12.isSelected
            skillUnlock2(
                btnSongcraft2_4, btnSongcraft2_8, btnSongcraft2_12,
                btnSongcraftPassive2_1, btnSongcraftPassive2_2, btnSongcraftPassive2_3,
                btnSongcraftPassive2_4, btnSongcraftPassive2_5, btnSongcraftPassive2_6,
                skillPoints2Text, skillTree2Points
            )
        }
//endregion

        //region Songcraft3 Button Actions
        btnSongcraft3_1.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSongcraft3_1.isSelected) {
                    updateButtons3(btnSongcraft3_1)
                    btnSongcraft3_1.isSelected = !btnSongcraft3_1.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSongcraft3_1)

            skillUnlock3(
                btnSongcraft3_4, btnSongcraft3_8, btnSongcraft3_12,
                btnSongcraftPassive3_1, btnSongcraftPassive3_2, btnSongcraftPassive3_3,
                btnSongcraftPassive3_4, btnSongcraftPassive3_5, btnSongcraftPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnSongcraft3_1.isSelected = !btnSongcraft3_1.isSelected
        }

        btnSongcraft3_2.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSongcraft3_2.isSelected) {
                    updateButtons3(btnSongcraft3_2)
                    btnSongcraft3_2.isSelected = !btnSongcraft3_2.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSongcraft3_2)

            skillUnlock3(
                btnSongcraft3_4, btnSongcraft3_8, btnSongcraft3_12,
                btnSongcraftPassive3_1, btnSongcraftPassive3_2, btnSongcraftPassive3_3,
                btnSongcraftPassive3_4, btnSongcraftPassive3_5, btnSongcraftPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnSongcraft3_2.isSelected = !btnSongcraft3_2.isSelected
        }

        btnSongcraft3_3.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSongcraft3_3.isSelected) {
                    updateButtons3(btnSongcraft3_3)
                    btnSongcraft3_3.isSelected = !btnSongcraft3_3.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSongcraft3_3)

            skillUnlock3(
                btnSongcraft3_4, btnSongcraft3_8, btnSongcraft3_12,
                btnSongcraftPassive3_1, btnSongcraftPassive3_2, btnSongcraftPassive3_3,
                btnSongcraftPassive3_4, btnSongcraftPassive3_5, btnSongcraftPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnSongcraft3_3.isSelected = !btnSongcraft3_3.isSelected
        }

        btnSongcraft3_4.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSongcraft3_4.isSelected) {
                    updateButtons3(btnSongcraft3_4)
                    btnSongcraft3_4.isSelected = !btnSongcraft3_4.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSongcraft3_4)

            btnSongcraft3_4.isSelected = !btnSongcraft3_4.isSelected
            skillUnlock3(
                btnSongcraft3_4, btnSongcraft3_8, btnSongcraft3_12,
                btnSongcraftPassive3_1, btnSongcraftPassive3_2, btnSongcraftPassive3_3,
                btnSongcraftPassive3_4, btnSongcraftPassive3_5, btnSongcraftPassive3_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnSongcraft3_5.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSongcraft3_5.isSelected) {
                    updateButtons3(btnSongcraft3_5)
                    btnSongcraft3_5.isSelected = !btnSongcraft3_5.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSongcraft3_5)

            skillUnlock3(
                btnSongcraft3_4, btnSongcraft3_8, btnSongcraft3_12,
                btnSongcraftPassive3_1, btnSongcraftPassive3_2, btnSongcraftPassive3_3,
                btnSongcraftPassive3_4, btnSongcraftPassive3_5, btnSongcraftPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnSongcraft3_5.isSelected = !btnSongcraft3_5.isSelected
        }

        btnSongcraft3_6.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSongcraft3_6.isSelected) {
                    updateButtons3(btnSongcraft3_6)
                    btnSongcraft3_6.isSelected = !btnSongcraft3_6.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSongcraft3_6)

            skillUnlock3(
                btnSongcraft3_4, btnSongcraft3_8, btnSongcraft3_12,
                btnSongcraftPassive3_1, btnSongcraftPassive3_2, btnSongcraftPassive3_3,
                btnSongcraftPassive3_4, btnSongcraftPassive3_5, btnSongcraftPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnSongcraft3_6.isSelected = !btnSongcraft3_6.isSelected
        }

        btnSongcraft3_7.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSongcraft3_7.isSelected) {
                    updateButtons3(btnSongcraft3_7)
                    btnSongcraft3_7.isSelected = !btnSongcraft3_7.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSongcraft3_7)

            skillUnlock3(
                btnSongcraft3_4, btnSongcraft3_8, btnSongcraft3_12,
                btnSongcraftPassive3_1, btnSongcraftPassive3_2, btnSongcraftPassive3_3,
                btnSongcraftPassive3_4, btnSongcraftPassive3_5, btnSongcraftPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnSongcraft3_7.isSelected = !btnSongcraft3_7.isSelected
        }

        btnSongcraft3_8.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSongcraft3_8.isSelected) {
                    updateButtons3(btnSongcraft3_8)
                    btnSongcraft3_8.isSelected = !btnSongcraft3_8.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSongcraft3_8)

            btnSongcraft3_8.isSelected = !btnSongcraft3_8.isSelected
            skillUnlock3(
                btnSongcraft3_4, btnSongcraft3_8, btnSongcraft3_12,
                btnSongcraftPassive3_1, btnSongcraftPassive3_2, btnSongcraftPassive3_3,
                btnSongcraftPassive3_4, btnSongcraftPassive3_5, btnSongcraftPassive3_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnSongcraft3_9.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSongcraft3_9.isSelected) {
                    updateButtons3(btnSongcraft3_9)
                    btnSongcraft3_9.isSelected = !btnSongcraft3_9.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSongcraft3_9)

            skillUnlock3(
                btnSongcraft3_4, btnSongcraft3_8, btnSongcraft3_12,
                btnSongcraftPassive3_1, btnSongcraftPassive3_2, btnSongcraftPassive3_3,
                btnSongcraftPassive3_4, btnSongcraftPassive3_5, btnSongcraftPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnSongcraft3_9.isSelected = !btnSongcraft3_9.isSelected
        }

        btnSongcraft3_10.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSongcraft3_10.isSelected) {
                    updateButtons3(btnSongcraft3_10)
                    btnSongcraft3_10.isSelected = !btnSongcraft3_10.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSongcraft3_10)

            skillUnlock3(
                btnSongcraft3_4, btnSongcraft3_8, btnSongcraft3_12,
                btnSongcraftPassive3_1, btnSongcraftPassive3_2, btnSongcraftPassive3_3,
                btnSongcraftPassive3_4, btnSongcraftPassive3_5, btnSongcraftPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnSongcraft3_10.isSelected = !btnSongcraft3_10.isSelected
        }

        btnSongcraft3_11.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSongcraft3_11.isSelected) {
                    updateButtons3(btnSongcraft3_11)
                    btnSongcraft3_11.isSelected = !btnSongcraft3_11.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSongcraft3_11)

            skillUnlock3(
                btnSongcraft3_4, btnSongcraft3_8, btnSongcraft3_12,
                btnSongcraftPassive3_1, btnSongcraftPassive3_2, btnSongcraftPassive3_3,
                btnSongcraftPassive3_4, btnSongcraftPassive3_5, btnSongcraftPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnSongcraft3_11.isSelected = !btnSongcraft3_11.isSelected
        }

        btnSongcraft3_12.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSongcraft3_12.isSelected) {
                    updateButtons3(btnSongcraft3_12)
                    btnSongcraft3_12.isSelected = !btnSongcraft3_12.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSongcraft3_12)

            btnSongcraft3_12.isSelected = !btnSongcraft3_12.isSelected
            skillUnlock3(
                btnSongcraft3_4, btnSongcraft3_8, btnSongcraft3_12,
                btnSongcraftPassive3_1, btnSongcraftPassive3_2, btnSongcraftPassive3_3,
                btnSongcraftPassive3_4, btnSongcraftPassive3_5, btnSongcraftPassive3_6,
                skillPoints2Text, skillTree2Points
            )
        }
//endregion
        

        //region Witchcraft1 Button Actions
        btnWitchcraft1_1.setOnClickListener {
            if (skillPoints <= 0){
                if (btnWitchcraft1_1.isSelected) {
                    updateButtons1(btnWitchcraft1_1)
                    btnWitchcraft1_1.isSelected = !btnWitchcraft1_1.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnWitchcraft1_1)

            skillUnlock1(
                btnWitchcraft1_4, btnWitchcraft1_8, btnWitchcraft1_12,
                btnWitchcraftPassive1_1, btnWitchcraftPassive1_2, btnWitchcraftPassive1_3,
                btnWitchcraftPassive1_4, btnWitchcraftPassive1_5, btnWitchcraftPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnWitchcraft1_1.isSelected = !btnWitchcraft1_1.isSelected
        }

        btnWitchcraft1_2.setOnClickListener {
            if (skillPoints <= 0){
                if (btnWitchcraft1_2.isSelected) {
                    updateButtons1(btnWitchcraft1_2)
                    btnWitchcraft1_2.isSelected = !btnWitchcraft1_2.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnWitchcraft1_2)

            skillUnlock1(
                btnWitchcraft1_4, btnWitchcraft1_8, btnWitchcraft1_12,
                btnWitchcraftPassive1_1, btnWitchcraftPassive1_2, btnWitchcraftPassive1_3,
                btnWitchcraftPassive1_4, btnWitchcraftPassive1_5, btnWitchcraftPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnWitchcraft1_2.isSelected = !btnWitchcraft1_2.isSelected
        }

        btnWitchcraft1_3.setOnClickListener {
            if (skillPoints <= 0){
                if (btnWitchcraft1_3.isSelected) {
                    updateButtons1(btnWitchcraft1_3)
                    btnWitchcraft1_3.isSelected = !btnWitchcraft1_3.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnWitchcraft1_3)

            skillUnlock1(
                btnWitchcraft1_4, btnWitchcraft1_8, btnWitchcraft1_12,
                btnWitchcraftPassive1_1, btnWitchcraftPassive1_2, btnWitchcraftPassive1_3,
                btnWitchcraftPassive1_4, btnWitchcraftPassive1_5, btnWitchcraftPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnWitchcraft1_3.isSelected = !btnWitchcraft1_3.isSelected
        }

        btnWitchcraft1_4.setOnClickListener {
            if (skillPoints <= 0){
                if (btnWitchcraft1_4.isSelected) {
                    updateButtons1(btnWitchcraft1_4)
                    btnWitchcraft1_4.isSelected = !btnWitchcraft1_4.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnWitchcraft1_4)

            btnWitchcraft1_4.isSelected = !btnWitchcraft1_4.isSelected
            skillUnlock1(
                btnWitchcraft1_4, btnWitchcraft1_8, btnWitchcraft1_12,
                btnWitchcraftPassive1_1, btnWitchcraftPassive1_2, btnWitchcraftPassive1_3,
                btnWitchcraftPassive1_4, btnWitchcraftPassive1_5, btnWitchcraftPassive1_6,
                skillPoints1Text, skillTree1Points
            )
        }

        btnWitchcraft1_5.setOnClickListener {
            if (skillPoints <= 0){
                if (btnWitchcraft1_5.isSelected) {
                    updateButtons1(btnWitchcraft1_5)
                    btnWitchcraft1_5.isSelected = !btnWitchcraft1_5.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnWitchcraft1_5)

            skillUnlock1(
                btnWitchcraft1_4, btnWitchcraft1_8, btnWitchcraft1_12,
                btnWitchcraftPassive1_1, btnWitchcraftPassive1_2, btnWitchcraftPassive1_3,
                btnWitchcraftPassive1_4, btnWitchcraftPassive1_5, btnWitchcraftPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnWitchcraft1_5.isSelected = !btnWitchcraft1_5.isSelected
        }

        btnWitchcraft1_6.setOnClickListener {
            if (skillPoints <= 0){
                if (btnWitchcraft1_6.isSelected) {
                    updateButtons1(btnWitchcraft1_6)
                    btnWitchcraft1_6.isSelected = !btnWitchcraft1_6.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnWitchcraft1_6)

            skillUnlock1(
                btnWitchcraft1_4, btnWitchcraft1_8, btnWitchcraft1_12,
                btnWitchcraftPassive1_1, btnWitchcraftPassive1_2, btnWitchcraftPassive1_3,
                btnWitchcraftPassive1_4, btnWitchcraftPassive1_5, btnWitchcraftPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnWitchcraft1_6.isSelected = !btnWitchcraft1_6.isSelected
        }

        btnWitchcraft1_7.setOnClickListener {
            if (skillPoints <= 0){
                if (btnWitchcraft1_7.isSelected) {
                    updateButtons1(btnWitchcraft1_7)
                    btnWitchcraft1_7.isSelected = !btnWitchcraft1_7.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnWitchcraft1_7)

            skillUnlock1(
                btnWitchcraft1_4, btnWitchcraft1_8, btnWitchcraft1_12,
                btnWitchcraftPassive1_1, btnWitchcraftPassive1_2, btnWitchcraftPassive1_3,
                btnWitchcraftPassive1_4, btnWitchcraftPassive1_5, btnWitchcraftPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnWitchcraft1_7.isSelected = !btnWitchcraft1_7.isSelected
        }

        btnWitchcraft1_8.setOnClickListener {
            if (skillPoints <= 0){
                if (btnWitchcraft1_8.isSelected) {
                    updateButtons1(btnWitchcraft1_8)
                    btnWitchcraft1_8.isSelected = !btnWitchcraft1_8.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnWitchcraft1_8)

            btnWitchcraft1_8.isSelected = !btnWitchcraft1_8.isSelected
            skillUnlock1(
                btnWitchcraft1_4, btnWitchcraft1_8, btnWitchcraft1_12,
                btnWitchcraftPassive1_1, btnWitchcraftPassive1_2, btnWitchcraftPassive1_3,
                btnWitchcraftPassive1_4, btnWitchcraftPassive1_5, btnWitchcraftPassive1_6,
                skillPoints1Text, skillTree1Points
            )
        }

        btnWitchcraft1_9.setOnClickListener {
            if (skillPoints <= 0){
                if (btnWitchcraft1_9.isSelected) {
                    updateButtons1(btnWitchcraft1_9)
                    btnWitchcraft1_9.isSelected = !btnWitchcraft1_9.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnWitchcraft1_9)

            skillUnlock1(
                btnWitchcraft1_4, btnWitchcraft1_8, btnWitchcraft1_12,
                btnWitchcraftPassive1_1, btnWitchcraftPassive1_2, btnWitchcraftPassive1_3,
                btnWitchcraftPassive1_4, btnWitchcraftPassive1_5, btnWitchcraftPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnWitchcraft1_9.isSelected = !btnWitchcraft1_9.isSelected
        }

        btnWitchcraft1_10.setOnClickListener {
            if (skillPoints <= 0){
                if (btnWitchcraft1_10.isSelected) {
                    updateButtons1(btnWitchcraft1_10)
                    btnWitchcraft1_10.isSelected = !btnWitchcraft1_10.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnWitchcraft1_10)

            skillUnlock1(
                btnWitchcraft1_4, btnWitchcraft1_8, btnWitchcraft1_12,
                btnWitchcraftPassive1_1, btnWitchcraftPassive1_2, btnWitchcraftPassive1_3,
                btnWitchcraftPassive1_4, btnWitchcraftPassive1_5, btnWitchcraftPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnWitchcraft1_10.isSelected = !btnWitchcraft1_10.isSelected
        }

        btnWitchcraft1_11.setOnClickListener {
            if (skillPoints <= 0){
                if (btnWitchcraft1_11.isSelected) {
                    updateButtons1(btnWitchcraft1_11)
                    btnWitchcraft1_11.isSelected = !btnWitchcraft1_11.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnWitchcraft1_11)

            skillUnlock1(
                btnWitchcraft1_4, btnWitchcraft1_8, btnWitchcraft1_12,
                btnWitchcraftPassive1_1, btnWitchcraftPassive1_2, btnWitchcraftPassive1_3,
                btnWitchcraftPassive1_4, btnWitchcraftPassive1_5, btnWitchcraftPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnWitchcraft1_11.isSelected = !btnWitchcraft1_11.isSelected
        }

        btnWitchcraft1_12.setOnClickListener {
            if (skillPoints <= 0){
                if (btnWitchcraft1_12.isSelected) {
                    updateButtons1(btnWitchcraft1_12)
                    btnWitchcraft1_12.isSelected = !btnWitchcraft1_12.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnWitchcraft1_12)

            btnWitchcraft1_12.isSelected = !btnWitchcraft1_12.isSelected
            skillUnlock1(
                btnWitchcraft1_4, btnWitchcraft1_8, btnWitchcraft1_12,
                btnWitchcraftPassive1_1, btnWitchcraftPassive1_2, btnWitchcraftPassive1_3,
                btnWitchcraftPassive1_4, btnWitchcraftPassive1_5, btnWitchcraftPassive1_6,
                skillPoints1Text, skillTree1Points
            )
        }
//endregion

        //region Witchcraft2 Button Actions
        btnWitchcraft2_1.setOnClickListener {
            if (skillPoints <= 0){
                if (btnWitchcraft2_1.isSelected) {
                    updateButtons2(btnWitchcraft2_1)
                    btnWitchcraft2_1.isSelected = !btnWitchcraft2_1.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnWitchcraft2_1)

            skillUnlock2(
                btnWitchcraft2_4, btnWitchcraft2_8, btnWitchcraft2_12,
                btnWitchcraftPassive2_1, btnWitchcraftPassive2_2, btnWitchcraftPassive2_3,
                btnWitchcraftPassive2_4, btnWitchcraftPassive2_5, btnWitchcraftPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnWitchcraft2_1.isSelected = !btnWitchcraft2_1.isSelected
        }

        btnWitchcraft2_2.setOnClickListener {
            if (skillPoints <= 0){
                if (btnWitchcraft2_2.isSelected) {
                    updateButtons2(btnWitchcraft2_2)
                    btnWitchcraft2_2.isSelected = !btnWitchcraft2_2.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnWitchcraft2_2)

            skillUnlock2(
                btnWitchcraft2_4, btnWitchcraft2_8, btnWitchcraft2_12,
                btnWitchcraftPassive2_1, btnWitchcraftPassive2_2, btnWitchcraftPassive2_3,
                btnWitchcraftPassive2_4, btnWitchcraftPassive2_5, btnWitchcraftPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnWitchcraft2_2.isSelected = !btnWitchcraft2_2.isSelected
        }

        btnWitchcraft2_3.setOnClickListener {
            if (skillPoints <= 0){
                if (btnWitchcraft2_3.isSelected) {
                    updateButtons2(btnWitchcraft2_3)
                    btnWitchcraft2_3.isSelected = !btnWitchcraft2_3.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnWitchcraft2_3)

            skillUnlock2(
                btnWitchcraft2_4, btnWitchcraft2_8, btnWitchcraft2_12,
                btnWitchcraftPassive2_1, btnWitchcraftPassive2_2, btnWitchcraftPassive2_3,
                btnWitchcraftPassive2_4, btnWitchcraftPassive2_5, btnWitchcraftPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnWitchcraft2_3.isSelected = !btnWitchcraft2_3.isSelected
        }

        btnWitchcraft2_4.setOnClickListener {
            if (skillPoints <= 0){
                if (btnWitchcraft2_4.isSelected) {
                    updateButtons2(btnWitchcraft2_4)
                    btnWitchcraft2_4.isSelected = !btnWitchcraft2_4.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnWitchcraft2_4)

            btnWitchcraft2_4.isSelected = !btnWitchcraft2_4.isSelected
            skillUnlock2(
                btnWitchcraft2_4, btnWitchcraft2_8, btnWitchcraft2_12,
                btnWitchcraftPassive2_1, btnWitchcraftPassive2_2, btnWitchcraftPassive2_3,
                btnWitchcraftPassive2_4, btnWitchcraftPassive2_5, btnWitchcraftPassive2_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnWitchcraft2_5.setOnClickListener {
            if (skillPoints <= 0){
                if (btnWitchcraft2_5.isSelected) {
                    updateButtons2(btnWitchcraft2_5)
                    btnWitchcraft2_5.isSelected = !btnWitchcraft2_5.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnWitchcraft2_5)

            skillUnlock2(
                btnWitchcraft2_4, btnWitchcraft2_8, btnWitchcraft2_12,
                btnWitchcraftPassive2_1, btnWitchcraftPassive2_2, btnWitchcraftPassive2_3,
                btnWitchcraftPassive2_4, btnWitchcraftPassive2_5, btnWitchcraftPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnWitchcraft2_5.isSelected = !btnWitchcraft2_5.isSelected
        }

        btnWitchcraft2_6.setOnClickListener {
            if (skillPoints <= 0){
                if (btnWitchcraft2_6.isSelected) {
                    updateButtons2(btnWitchcraft2_6)
                    btnWitchcraft2_6.isSelected = !btnWitchcraft2_6.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnWitchcraft2_6)

            skillUnlock2(
                btnWitchcraft2_4, btnWitchcraft2_8, btnWitchcraft2_12,
                btnWitchcraftPassive2_1, btnWitchcraftPassive2_2, btnWitchcraftPassive2_3,
                btnWitchcraftPassive2_4, btnWitchcraftPassive2_5, btnWitchcraftPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnWitchcraft2_6.isSelected = !btnWitchcraft2_6.isSelected
        }

        btnWitchcraft2_7.setOnClickListener {
            if (skillPoints <= 0){
                if (btnWitchcraft2_7.isSelected) {
                    updateButtons2(btnWitchcraft2_7)
                    btnWitchcraft2_7.isSelected = !btnWitchcraft2_7.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnWitchcraft2_7)

            skillUnlock2(
                btnWitchcraft2_4, btnWitchcraft2_8, btnWitchcraft2_12,
                btnWitchcraftPassive2_1, btnWitchcraftPassive2_2, btnWitchcraftPassive2_3,
                btnWitchcraftPassive2_4, btnWitchcraftPassive2_5, btnWitchcraftPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnWitchcraft2_7.isSelected = !btnWitchcraft2_7.isSelected
        }

        btnWitchcraft2_8.setOnClickListener {
            if (skillPoints <= 0){
                if (btnWitchcraft2_8.isSelected) {
                    updateButtons2(btnWitchcraft2_8)
                    btnWitchcraft2_8.isSelected = !btnWitchcraft2_8.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnWitchcraft2_8)

            btnWitchcraft2_8.isSelected = !btnWitchcraft2_8.isSelected
            skillUnlock2(
                btnWitchcraft2_4, btnWitchcraft2_8, btnWitchcraft2_12,
                btnWitchcraftPassive2_1, btnWitchcraftPassive2_2, btnWitchcraftPassive2_3,
                btnWitchcraftPassive2_4, btnWitchcraftPassive2_5, btnWitchcraftPassive2_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnWitchcraft2_9.setOnClickListener {
            if (skillPoints <= 0){
                if (btnWitchcraft2_9.isSelected) {
                    updateButtons2(btnWitchcraft2_9)
                    btnWitchcraft2_9.isSelected = !btnWitchcraft2_9.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnWitchcraft2_9)

            skillUnlock2(
                btnWitchcraft2_4, btnWitchcraft2_8, btnWitchcraft2_12,
                btnWitchcraftPassive2_1, btnWitchcraftPassive2_2, btnWitchcraftPassive2_3,
                btnWitchcraftPassive2_4, btnWitchcraftPassive2_5, btnWitchcraftPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnWitchcraft2_9.isSelected = !btnWitchcraft2_9.isSelected
        }

        btnWitchcraft2_10.setOnClickListener {
            if (skillPoints <= 0){
                if (btnWitchcraft2_10.isSelected) {
                    updateButtons2(btnWitchcraft2_10)
                    btnWitchcraft2_10.isSelected = !btnWitchcraft2_10.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnWitchcraft2_10)

            skillUnlock2(
                btnWitchcraft2_4, btnWitchcraft2_8, btnWitchcraft2_12,
                btnWitchcraftPassive2_1, btnWitchcraftPassive2_2, btnWitchcraftPassive2_3,
                btnWitchcraftPassive2_4, btnWitchcraftPassive2_5, btnWitchcraftPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnWitchcraft2_10.isSelected = !btnWitchcraft2_10.isSelected
        }

        btnWitchcraft2_11.setOnClickListener {
            if (skillPoints <= 0){
                if (btnWitchcraft2_11.isSelected) {
                    updateButtons2(btnWitchcraft2_11)
                    btnWitchcraft2_11.isSelected = !btnWitchcraft2_11.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnWitchcraft2_11)

            skillUnlock2(
                btnWitchcraft2_4, btnWitchcraft2_8, btnWitchcraft2_12,
                btnWitchcraftPassive2_1, btnWitchcraftPassive2_2, btnWitchcraftPassive2_3,
                btnWitchcraftPassive2_4, btnWitchcraftPassive2_5, btnWitchcraftPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnWitchcraft2_11.isSelected = !btnWitchcraft2_11.isSelected
        }

        btnWitchcraft2_12.setOnClickListener {
            if (skillPoints <= 0){
                if (btnWitchcraft2_12.isSelected) {
                    updateButtons2(btnWitchcraft2_12)
                    btnWitchcraft2_12.isSelected = !btnWitchcraft2_12.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnWitchcraft2_12)

            btnWitchcraft2_12.isSelected = !btnWitchcraft2_12.isSelected
            skillUnlock2(
                btnWitchcraft2_4, btnWitchcraft2_8, btnWitchcraft2_12,
                btnWitchcraftPassive2_1, btnWitchcraftPassive2_2, btnWitchcraftPassive2_3,
                btnWitchcraftPassive2_4, btnWitchcraftPassive2_5, btnWitchcraftPassive2_6,
                skillPoints2Text, skillTree2Points
            )
        }
//endregion

        //region Witchcraft3 Button Actions
        btnWitchcraft3_1.setOnClickListener {
            if (skillPoints <= 0){
                if (btnWitchcraft3_1.isSelected) {
                    updateButtons3(btnWitchcraft3_1)
                    btnWitchcraft3_1.isSelected = !btnWitchcraft3_1.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnWitchcraft3_1)

            skillUnlock3(
                btnWitchcraft3_4, btnWitchcraft3_8, btnWitchcraft3_12,
                btnWitchcraftPassive3_1, btnWitchcraftPassive3_2, btnWitchcraftPassive3_3,
                btnWitchcraftPassive3_4, btnWitchcraftPassive3_5, btnWitchcraftPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnWitchcraft3_1.isSelected = !btnWitchcraft3_1.isSelected
        }

        btnWitchcraft3_2.setOnClickListener {
            if (skillPoints <= 0){
                if (btnWitchcraft3_2.isSelected) {
                    updateButtons3(btnWitchcraft3_2)
                    btnWitchcraft3_2.isSelected = !btnWitchcraft3_2.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnWitchcraft3_2)

            skillUnlock3(
                btnWitchcraft3_4, btnWitchcraft3_8, btnWitchcraft3_12,
                btnWitchcraftPassive3_1, btnWitchcraftPassive3_2, btnWitchcraftPassive3_3,
                btnWitchcraftPassive3_4, btnWitchcraftPassive3_5, btnWitchcraftPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnWitchcraft3_2.isSelected = !btnWitchcraft3_2.isSelected
        }

        btnWitchcraft3_3.setOnClickListener {
            if (skillPoints <= 0){
                if (btnWitchcraft3_3.isSelected) {
                    updateButtons3(btnWitchcraft3_3)
                    btnWitchcraft3_3.isSelected = !btnWitchcraft3_3.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnWitchcraft3_3)

            skillUnlock3(
                btnWitchcraft3_4, btnWitchcraft3_8, btnWitchcraft3_12,
                btnWitchcraftPassive3_1, btnWitchcraftPassive3_2, btnWitchcraftPassive3_3,
                btnWitchcraftPassive3_4, btnWitchcraftPassive3_5, btnWitchcraftPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnWitchcraft3_3.isSelected = !btnWitchcraft3_3.isSelected
        }

        btnWitchcraft3_4.setOnClickListener {
            if (skillPoints <= 0){
                if (btnWitchcraft3_4.isSelected) {
                    updateButtons3(btnWitchcraft3_4)
                    btnWitchcraft3_4.isSelected = !btnWitchcraft3_4.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnWitchcraft3_4)

            btnWitchcraft3_4.isSelected = !btnWitchcraft3_4.isSelected
            skillUnlock3(
                btnWitchcraft3_4, btnWitchcraft3_8, btnWitchcraft3_12,
                btnWitchcraftPassive3_1, btnWitchcraftPassive3_2, btnWitchcraftPassive3_3,
                btnWitchcraftPassive3_4, btnWitchcraftPassive3_5, btnWitchcraftPassive3_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnWitchcraft3_5.setOnClickListener {
            if (skillPoints <= 0){
                if (btnWitchcraft3_5.isSelected) {
                    updateButtons3(btnWitchcraft3_5)
                    btnWitchcraft3_5.isSelected = !btnWitchcraft3_5.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnWitchcraft3_5)

            skillUnlock3(
                btnWitchcraft3_4, btnWitchcraft3_8, btnWitchcraft3_12,
                btnWitchcraftPassive3_1, btnWitchcraftPassive3_2, btnWitchcraftPassive3_3,
                btnWitchcraftPassive3_4, btnWitchcraftPassive3_5, btnWitchcraftPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnWitchcraft3_5.isSelected = !btnWitchcraft3_5.isSelected
        }

        btnWitchcraft3_6.setOnClickListener {
            if (skillPoints <= 0){
                if (btnWitchcraft3_6.isSelected) {
                    updateButtons3(btnWitchcraft3_6)
                    btnWitchcraft3_6.isSelected = !btnWitchcraft3_6.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnWitchcraft3_6)

            skillUnlock3(
                btnWitchcraft3_4, btnWitchcraft3_8, btnWitchcraft3_12,
                btnWitchcraftPassive3_1, btnWitchcraftPassive3_2, btnWitchcraftPassive3_3,
                btnWitchcraftPassive3_4, btnWitchcraftPassive3_5, btnWitchcraftPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnWitchcraft3_6.isSelected = !btnWitchcraft3_6.isSelected
        }

        btnWitchcraft3_7.setOnClickListener {
            if (skillPoints <= 0){
                if (btnWitchcraft3_7.isSelected) {
                    updateButtons3(btnWitchcraft3_7)
                    btnWitchcraft3_7.isSelected = !btnWitchcraft3_7.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnWitchcraft3_7)

            skillUnlock3(
                btnWitchcraft3_4, btnWitchcraft3_8, btnWitchcraft3_12,
                btnWitchcraftPassive3_1, btnWitchcraftPassive3_2, btnWitchcraftPassive3_3,
                btnWitchcraftPassive3_4, btnWitchcraftPassive3_5, btnWitchcraftPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnWitchcraft3_7.isSelected = !btnWitchcraft3_7.isSelected
        }

        btnWitchcraft3_8.setOnClickListener {
            if (skillPoints <= 0){
                if (btnWitchcraft3_8.isSelected) {
                    updateButtons3(btnWitchcraft3_8)
                    btnWitchcraft3_8.isSelected = !btnWitchcraft3_8.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnWitchcraft3_8)

            btnWitchcraft3_8.isSelected = !btnWitchcraft3_8.isSelected
            skillUnlock3(
                btnWitchcraft3_4, btnWitchcraft3_8, btnWitchcraft3_12,
                btnWitchcraftPassive3_1, btnWitchcraftPassive3_2, btnWitchcraftPassive3_3,
                btnWitchcraftPassive3_4, btnWitchcraftPassive3_5, btnWitchcraftPassive3_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnWitchcraft3_9.setOnClickListener {
            if (skillPoints <= 0){
                if (btnWitchcraft3_9.isSelected) {
                    updateButtons3(btnWitchcraft3_9)
                    btnWitchcraft3_9.isSelected = !btnWitchcraft3_9.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnWitchcraft3_9)

            skillUnlock3(
                btnWitchcraft3_4, btnWitchcraft3_8, btnWitchcraft3_12,
                btnWitchcraftPassive3_1, btnWitchcraftPassive3_2, btnWitchcraftPassive3_3,
                btnWitchcraftPassive3_4, btnWitchcraftPassive3_5, btnWitchcraftPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnWitchcraft3_9.isSelected = !btnWitchcraft3_9.isSelected
        }

        btnWitchcraft3_10.setOnClickListener {
            if (skillPoints <= 0){
                if (btnWitchcraft3_10.isSelected) {
                    updateButtons3(btnWitchcraft3_10)
                    btnWitchcraft3_10.isSelected = !btnWitchcraft3_10.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnWitchcraft3_10)

            skillUnlock3(
                btnWitchcraft3_4, btnWitchcraft3_8, btnWitchcraft3_12,
                btnWitchcraftPassive3_1, btnWitchcraftPassive3_2, btnWitchcraftPassive3_3,
                btnWitchcraftPassive3_4, btnWitchcraftPassive3_5, btnWitchcraftPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnWitchcraft3_10.isSelected = !btnWitchcraft3_10.isSelected
        }

        btnWitchcraft3_11.setOnClickListener {
            if (skillPoints <= 0){
                if (btnWitchcraft3_11.isSelected) {
                    updateButtons3(btnWitchcraft3_11)
                    btnWitchcraft3_11.isSelected = !btnWitchcraft3_11.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnWitchcraft3_11)

            skillUnlock3(
                btnWitchcraft3_4, btnWitchcraft3_8, btnWitchcraft3_12,
                btnWitchcraftPassive3_1, btnWitchcraftPassive3_2, btnWitchcraftPassive3_3,
                btnWitchcraftPassive3_4, btnWitchcraftPassive3_5, btnWitchcraftPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnWitchcraft3_11.isSelected = !btnWitchcraft3_11.isSelected
        }

        btnWitchcraft3_12.setOnClickListener {
            if (skillPoints <= 0){
                if (btnWitchcraft3_12.isSelected) {
                    updateButtons3(btnWitchcraft3_12)
                    btnWitchcraft3_12.isSelected = !btnWitchcraft3_12.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnWitchcraft3_12)

            btnWitchcraft3_12.isSelected = !btnWitchcraft3_12.isSelected
            skillUnlock3(
                btnWitchcraft3_4, btnWitchcraft3_8, btnWitchcraft3_12,
                btnWitchcraftPassive3_1, btnWitchcraftPassive3_2, btnWitchcraftPassive3_3,
                btnWitchcraftPassive3_4, btnWitchcraftPassive3_5, btnWitchcraftPassive3_6,
                skillPoints2Text, skillTree2Points
            )
        }
//endregion
        

        //region Auramancy1 Button Actions
        btnAuramancy1_1.setOnClickListener {
            if (skillPoints <= 0){
                if (btnAuramancy1_1.isSelected) {
                    updateButtons1(btnAuramancy1_1)
                    btnAuramancy1_1.isSelected = !btnAuramancy1_1.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnAuramancy1_1)

            skillUnlock1(
                btnAuramancy1_4, btnAuramancy1_8, btnAuramancy1_12,
                btnAuramancyPassive1_1, btnAuramancyPassive1_2, btnAuramancyPassive1_3,
                btnAuramancyPassive1_4, btnAuramancyPassive1_5, btnAuramancyPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnAuramancy1_1.isSelected = !btnAuramancy1_1.isSelected
        }

        btnAuramancy1_2.setOnClickListener {
            if (skillPoints <= 0){
                if (btnAuramancy1_2.isSelected) {
                    updateButtons1(btnAuramancy1_2)
                    btnAuramancy1_2.isSelected = !btnAuramancy1_2.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnAuramancy1_2)

            skillUnlock1(
                btnAuramancy1_4, btnAuramancy1_8, btnAuramancy1_12,
                btnAuramancyPassive1_1, btnAuramancyPassive1_2, btnAuramancyPassive1_3,
                btnAuramancyPassive1_4, btnAuramancyPassive1_5, btnAuramancyPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnAuramancy1_2.isSelected = !btnAuramancy1_2.isSelected
        }

        btnAuramancy1_3.setOnClickListener {
            if (skillPoints <= 0){
                if (btnAuramancy1_3.isSelected) {
                    updateButtons1(btnAuramancy1_3)
                    btnAuramancy1_3.isSelected = !btnAuramancy1_3.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnAuramancy1_3)

            skillUnlock1(
                btnAuramancy1_4, btnAuramancy1_8, btnAuramancy1_12,
                btnAuramancyPassive1_1, btnAuramancyPassive1_2, btnAuramancyPassive1_3,
                btnAuramancyPassive1_4, btnAuramancyPassive1_5, btnAuramancyPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnAuramancy1_3.isSelected = !btnAuramancy1_3.isSelected
        }

        btnAuramancy1_4.setOnClickListener {
            if (skillPoints <= 0){
                if (btnAuramancy1_4.isSelected) {
                    updateButtons1(btnAuramancy1_4)
                    btnAuramancy1_4.isSelected = !btnAuramancy1_4.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnAuramancy1_4)

            btnAuramancy1_4.isSelected = !btnAuramancy1_4.isSelected
            skillUnlock1(
                btnAuramancy1_4, btnAuramancy1_8, btnAuramancy1_12,
                btnAuramancyPassive1_1, btnAuramancyPassive1_2, btnAuramancyPassive1_3,
                btnAuramancyPassive1_4, btnAuramancyPassive1_5, btnAuramancyPassive1_6,
                skillPoints1Text, skillTree1Points
            )
        }

        btnAuramancy1_5.setOnClickListener {
            if (skillPoints <= 0){
                if (btnAuramancy1_5.isSelected) {
                    updateButtons1(btnAuramancy1_5)
                    btnAuramancy1_5.isSelected = !btnAuramancy1_5.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnAuramancy1_5)

            skillUnlock1(
                btnAuramancy1_4, btnAuramancy1_8, btnAuramancy1_12,
                btnAuramancyPassive1_1, btnAuramancyPassive1_2, btnAuramancyPassive1_3,
                btnAuramancyPassive1_4, btnAuramancyPassive1_5, btnAuramancyPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnAuramancy1_5.isSelected = !btnAuramancy1_5.isSelected
        }

        btnAuramancy1_6.setOnClickListener {
            if (skillPoints <= 0){
                if (btnAuramancy1_6.isSelected) {
                    updateButtons1(btnAuramancy1_6)
                    btnAuramancy1_6.isSelected = !btnAuramancy1_6.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnAuramancy1_6)

            skillUnlock1(
                btnAuramancy1_4, btnAuramancy1_8, btnAuramancy1_12,
                btnAuramancyPassive1_1, btnAuramancyPassive1_2, btnAuramancyPassive1_3,
                btnAuramancyPassive1_4, btnAuramancyPassive1_5, btnAuramancyPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnAuramancy1_6.isSelected = !btnAuramancy1_6.isSelected
        }

        btnAuramancy1_7.setOnClickListener {
            if (skillPoints <= 0){
                if (btnAuramancy1_7.isSelected) {
                    updateButtons1(btnAuramancy1_7)
                    btnAuramancy1_7.isSelected = !btnAuramancy1_7.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnAuramancy1_7)

            skillUnlock1(
                btnAuramancy1_4, btnAuramancy1_8, btnAuramancy1_12,
                btnAuramancyPassive1_1, btnAuramancyPassive1_2, btnAuramancyPassive1_3,
                btnAuramancyPassive1_4, btnAuramancyPassive1_5, btnAuramancyPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnAuramancy1_7.isSelected = !btnAuramancy1_7.isSelected
        }

        btnAuramancy1_8.setOnClickListener {
            if (skillPoints <= 0){
                if (btnAuramancy1_8.isSelected) {
                    updateButtons1(btnAuramancy1_8)
                    btnAuramancy1_8.isSelected = !btnAuramancy1_8.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnAuramancy1_8)

            btnAuramancy1_8.isSelected = !btnAuramancy1_8.isSelected
            skillUnlock1(
                btnAuramancy1_4, btnAuramancy1_8, btnAuramancy1_12,
                btnAuramancyPassive1_1, btnAuramancyPassive1_2, btnAuramancyPassive1_3,
                btnAuramancyPassive1_4, btnAuramancyPassive1_5, btnAuramancyPassive1_6,
                skillPoints1Text, skillTree1Points
            )
        }

        btnAuramancy1_9.setOnClickListener {
            if (skillPoints <= 0){
                if (btnAuramancy1_9.isSelected) {
                    updateButtons1(btnAuramancy1_9)
                    btnAuramancy1_9.isSelected = !btnAuramancy1_9.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnAuramancy1_9)

            skillUnlock1(
                btnAuramancy1_4, btnAuramancy1_8, btnAuramancy1_12,
                btnAuramancyPassive1_1, btnAuramancyPassive1_2, btnAuramancyPassive1_3,
                btnAuramancyPassive1_4, btnAuramancyPassive1_5, btnAuramancyPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnAuramancy1_9.isSelected = !btnAuramancy1_9.isSelected
        }

        btnAuramancy1_10.setOnClickListener {
            if (skillPoints <= 0){
                if (btnAuramancy1_10.isSelected) {
                    updateButtons1(btnAuramancy1_10)
                    btnAuramancy1_10.isSelected = !btnAuramancy1_10.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnAuramancy1_10)

            skillUnlock1(
                btnAuramancy1_4, btnAuramancy1_8, btnAuramancy1_12,
                btnAuramancyPassive1_1, btnAuramancyPassive1_2, btnAuramancyPassive1_3,
                btnAuramancyPassive1_4, btnAuramancyPassive1_5, btnAuramancyPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnAuramancy1_10.isSelected = !btnAuramancy1_10.isSelected
        }

        btnAuramancy1_11.setOnClickListener {
            if (skillPoints <= 0){
                if (btnAuramancy1_11.isSelected) {
                    updateButtons1(btnAuramancy1_11)
                    btnAuramancy1_11.isSelected = !btnAuramancy1_11.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnAuramancy1_11)

            skillUnlock1(
                btnAuramancy1_4, btnAuramancy1_8, btnAuramancy1_12,
                btnAuramancyPassive1_1, btnAuramancyPassive1_2, btnAuramancyPassive1_3,
                btnAuramancyPassive1_4, btnAuramancyPassive1_5, btnAuramancyPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnAuramancy1_11.isSelected = !btnAuramancy1_11.isSelected
        }

        btnAuramancy1_12.setOnClickListener {
            if (skillPoints <= 0){
                if (btnAuramancy1_12.isSelected) {
                    updateButtons1(btnAuramancy1_12)
                    btnAuramancy1_12.isSelected = !btnAuramancy1_12.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnAuramancy1_12)

            btnAuramancy1_12.isSelected = !btnAuramancy1_12.isSelected
            skillUnlock1(
                btnAuramancy1_4, btnAuramancy1_8, btnAuramancy1_12,
                btnAuramancyPassive1_1, btnAuramancyPassive1_2, btnAuramancyPassive1_3,
                btnAuramancyPassive1_4, btnAuramancyPassive1_5, btnAuramancyPassive1_6,
                skillPoints1Text, skillTree1Points
            )
        }
//endregion

        //region Auramancy2 Button Actions
        btnAuramancy2_1.setOnClickListener {
            if (skillPoints <= 0){
                if (btnAuramancy2_1.isSelected) {
                    updateButtons2(btnAuramancy2_1)
                    btnAuramancy2_1.isSelected = !btnAuramancy2_1.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnAuramancy2_1)

            skillUnlock2(
                btnAuramancy2_4, btnAuramancy2_8, btnAuramancy2_12,
                btnAuramancyPassive2_1, btnAuramancyPassive2_2, btnAuramancyPassive2_3,
                btnAuramancyPassive2_4, btnAuramancyPassive2_5, btnAuramancyPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnAuramancy2_1.isSelected = !btnAuramancy2_1.isSelected
        }

        btnAuramancy2_2.setOnClickListener {
            if (skillPoints <= 0){
                if (btnAuramancy2_2.isSelected) {
                    updateButtons2(btnAuramancy2_2)
                    btnAuramancy2_2.isSelected = !btnAuramancy2_2.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnAuramancy2_2)

            skillUnlock2(
                btnAuramancy2_4, btnAuramancy2_8, btnAuramancy2_12,
                btnAuramancyPassive2_1, btnAuramancyPassive2_2, btnAuramancyPassive2_3,
                btnAuramancyPassive2_4, btnAuramancyPassive2_5, btnAuramancyPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnAuramancy2_2.isSelected = !btnAuramancy2_2.isSelected
        }

        btnAuramancy2_3.setOnClickListener {
            if (skillPoints <= 0){
                if (btnAuramancy2_3.isSelected) {
                    updateButtons2(btnAuramancy2_3)
                    btnAuramancy2_3.isSelected = !btnAuramancy2_3.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnAuramancy2_3)

            skillUnlock2(
                btnAuramancy2_4, btnAuramancy2_8, btnAuramancy2_12,
                btnAuramancyPassive2_1, btnAuramancyPassive2_2, btnAuramancyPassive2_3,
                btnAuramancyPassive2_4, btnAuramancyPassive2_5, btnAuramancyPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnAuramancy2_3.isSelected = !btnAuramancy2_3.isSelected
        }

        btnAuramancy2_4.setOnClickListener {
            if (skillPoints <= 0){
                if (btnAuramancy2_4.isSelected) {
                    updateButtons2(btnAuramancy2_4)
                    btnAuramancy2_4.isSelected = !btnAuramancy2_4.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnAuramancy2_4)

            btnAuramancy2_4.isSelected = !btnAuramancy2_4.isSelected
            skillUnlock2(
                btnAuramancy2_4, btnAuramancy2_8, btnAuramancy2_12,
                btnAuramancyPassive2_1, btnAuramancyPassive2_2, btnAuramancyPassive2_3,
                btnAuramancyPassive2_4, btnAuramancyPassive2_5, btnAuramancyPassive2_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnAuramancy2_5.setOnClickListener {
            if (skillPoints <= 0){
                if (btnAuramancy2_5.isSelected) {
                    updateButtons2(btnAuramancy2_5)
                    btnAuramancy2_5.isSelected = !btnAuramancy2_5.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnAuramancy2_5)

            skillUnlock2(
                btnAuramancy2_4, btnAuramancy2_8, btnAuramancy2_12,
                btnAuramancyPassive2_1, btnAuramancyPassive2_2, btnAuramancyPassive2_3,
                btnAuramancyPassive2_4, btnAuramancyPassive2_5, btnAuramancyPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnAuramancy2_5.isSelected = !btnAuramancy2_5.isSelected
        }

        btnAuramancy2_6.setOnClickListener {
            if (skillPoints <= 0){
                if (btnAuramancy2_6.isSelected) {
                    updateButtons2(btnAuramancy2_6)
                    btnAuramancy2_6.isSelected = !btnAuramancy2_6.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnAuramancy2_6)

            skillUnlock2(
                btnAuramancy2_4, btnAuramancy2_8, btnAuramancy2_12,
                btnAuramancyPassive2_1, btnAuramancyPassive2_2, btnAuramancyPassive2_3,
                btnAuramancyPassive2_4, btnAuramancyPassive2_5, btnAuramancyPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnAuramancy2_6.isSelected = !btnAuramancy2_6.isSelected
        }

        btnAuramancy2_7.setOnClickListener {
            if (skillPoints <= 0){
                if (btnAuramancy2_7.isSelected) {
                    updateButtons2(btnAuramancy2_7)
                    btnAuramancy2_7.isSelected = !btnAuramancy2_7.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnAuramancy2_7)

            skillUnlock2(
                btnAuramancy2_4, btnAuramancy2_8, btnAuramancy2_12,
                btnAuramancyPassive2_1, btnAuramancyPassive2_2, btnAuramancyPassive2_3,
                btnAuramancyPassive2_4, btnAuramancyPassive2_5, btnAuramancyPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnAuramancy2_7.isSelected = !btnAuramancy2_7.isSelected
        }

        btnAuramancy2_8.setOnClickListener {
            if (skillPoints <= 0){
                if (btnAuramancy2_8.isSelected) {
                    updateButtons2(btnAuramancy2_8)
                    btnAuramancy2_8.isSelected = !btnAuramancy2_8.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnAuramancy2_8)

            btnAuramancy2_8.isSelected = !btnAuramancy2_8.isSelected
            skillUnlock2(
                btnAuramancy2_4, btnAuramancy2_8, btnAuramancy2_12,
                btnAuramancyPassive2_1, btnAuramancyPassive2_2, btnAuramancyPassive2_3,
                btnAuramancyPassive2_4, btnAuramancyPassive2_5, btnAuramancyPassive2_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnAuramancy2_9.setOnClickListener {
            if (skillPoints <= 0){
                if (btnAuramancy2_9.isSelected) {
                    updateButtons2(btnAuramancy2_9)
                    btnAuramancy2_9.isSelected = !btnAuramancy2_9.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnAuramancy2_9)

            skillUnlock2(
                btnAuramancy2_4, btnAuramancy2_8, btnAuramancy2_12,
                btnAuramancyPassive2_1, btnAuramancyPassive2_2, btnAuramancyPassive2_3,
                btnAuramancyPassive2_4, btnAuramancyPassive2_5, btnAuramancyPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnAuramancy2_9.isSelected = !btnAuramancy2_9.isSelected
        }

        btnAuramancy2_10.setOnClickListener {
            if (skillPoints <= 0){
                if (btnAuramancy2_10.isSelected) {
                    updateButtons2(btnAuramancy2_10)
                    btnAuramancy2_10.isSelected = !btnAuramancy2_10.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnAuramancy2_10)

            skillUnlock2(
                btnAuramancy2_4, btnAuramancy2_8, btnAuramancy2_12,
                btnAuramancyPassive2_1, btnAuramancyPassive2_2, btnAuramancyPassive2_3,
                btnAuramancyPassive2_4, btnAuramancyPassive2_5, btnAuramancyPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnAuramancy2_10.isSelected = !btnAuramancy2_10.isSelected
        }

        btnAuramancy2_11.setOnClickListener {
            if (skillPoints <= 0){
                if (btnAuramancy2_11.isSelected) {
                    updateButtons2(btnAuramancy2_11)
                    btnAuramancy2_11.isSelected = !btnAuramancy2_11.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnAuramancy2_11)

            skillUnlock2(
                btnAuramancy2_4, btnAuramancy2_8, btnAuramancy2_12,
                btnAuramancyPassive2_1, btnAuramancyPassive2_2, btnAuramancyPassive2_3,
                btnAuramancyPassive2_4, btnAuramancyPassive2_5, btnAuramancyPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnAuramancy2_11.isSelected = !btnAuramancy2_11.isSelected
        }

        btnAuramancy2_12.setOnClickListener {
            if (skillPoints <= 0){
                if (btnAuramancy2_12.isSelected) {
                    updateButtons2(btnAuramancy2_12)
                    btnAuramancy2_12.isSelected = !btnAuramancy2_12.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnAuramancy2_12)

            btnAuramancy2_12.isSelected = !btnAuramancy2_12.isSelected
            skillUnlock2(
                btnAuramancy2_4, btnAuramancy2_8, btnAuramancy2_12,
                btnAuramancyPassive2_1, btnAuramancyPassive2_2, btnAuramancyPassive2_3,
                btnAuramancyPassive2_4, btnAuramancyPassive2_5, btnAuramancyPassive2_6,
                skillPoints2Text, skillTree2Points
            )
        }
//endregion

        //region Auramancy3 Button Actions
        btnAuramancy3_1.setOnClickListener {
            if (skillPoints <= 0){
                if (btnAuramancy3_1.isSelected) {
                    updateButtons3(btnAuramancy3_1)
                    btnAuramancy3_1.isSelected = !btnAuramancy3_1.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnAuramancy3_1)

            skillUnlock3(
                btnAuramancy3_4, btnAuramancy3_8, btnAuramancy3_12,
                btnAuramancyPassive3_1, btnAuramancyPassive3_2, btnAuramancyPassive3_3,
                btnAuramancyPassive3_4, btnAuramancyPassive3_5, btnAuramancyPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnAuramancy3_1.isSelected = !btnAuramancy3_1.isSelected
        }

        btnAuramancy3_2.setOnClickListener {
            if (skillPoints <= 0){
                if (btnAuramancy3_2.isSelected) {
                    updateButtons3(btnAuramancy3_2)
                    btnAuramancy3_2.isSelected = !btnAuramancy3_2.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnAuramancy3_2)

            skillUnlock3(
                btnAuramancy3_4, btnAuramancy3_8, btnAuramancy3_12,
                btnAuramancyPassive3_1, btnAuramancyPassive3_2, btnAuramancyPassive3_3,
                btnAuramancyPassive3_4, btnAuramancyPassive3_5, btnAuramancyPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnAuramancy3_2.isSelected = !btnAuramancy3_2.isSelected
        }

        btnAuramancy3_3.setOnClickListener {
            if (skillPoints <= 0){
                if (btnAuramancy3_3.isSelected) {
                    updateButtons3(btnAuramancy3_3)
                    btnAuramancy3_3.isSelected = !btnAuramancy3_3.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnAuramancy3_3)

            skillUnlock3(
                btnAuramancy3_4, btnAuramancy3_8, btnAuramancy3_12,
                btnAuramancyPassive3_1, btnAuramancyPassive3_2, btnAuramancyPassive3_3,
                btnAuramancyPassive3_4, btnAuramancyPassive3_5, btnAuramancyPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnAuramancy3_3.isSelected = !btnAuramancy3_3.isSelected
        }

        btnAuramancy3_4.setOnClickListener {
            if (skillPoints <= 0){
                if (btnAuramancy3_4.isSelected) {
                    updateButtons3(btnAuramancy3_4)
                    btnAuramancy3_4.isSelected = !btnAuramancy3_4.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnAuramancy3_4)

            btnAuramancy3_4.isSelected = !btnAuramancy3_4.isSelected
            skillUnlock3(
                btnAuramancy3_4, btnAuramancy3_8, btnAuramancy3_12,
                btnAuramancyPassive3_1, btnAuramancyPassive3_2, btnAuramancyPassive3_3,
                btnAuramancyPassive3_4, btnAuramancyPassive3_5, btnAuramancyPassive3_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnAuramancy3_5.setOnClickListener {
            if (skillPoints <= 0){
                if (btnAuramancy3_5.isSelected) {
                    updateButtons3(btnAuramancy3_5)
                    btnAuramancy3_5.isSelected = !btnAuramancy3_5.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnAuramancy3_5)

            skillUnlock3(
                btnAuramancy3_4, btnAuramancy3_8, btnAuramancy3_12,
                btnAuramancyPassive3_1, btnAuramancyPassive3_2, btnAuramancyPassive3_3,
                btnAuramancyPassive3_4, btnAuramancyPassive3_5, btnAuramancyPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnAuramancy3_5.isSelected = !btnAuramancy3_5.isSelected
        }

        btnAuramancy3_6.setOnClickListener {
            if (skillPoints <= 0){
                if (btnAuramancy3_6.isSelected) {
                    updateButtons3(btnAuramancy3_6)
                    btnAuramancy3_6.isSelected = !btnAuramancy3_6.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnAuramancy3_6)

            skillUnlock3(
                btnAuramancy3_4, btnAuramancy3_8, btnAuramancy3_12,
                btnAuramancyPassive3_1, btnAuramancyPassive3_2, btnAuramancyPassive3_3,
                btnAuramancyPassive3_4, btnAuramancyPassive3_5, btnAuramancyPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnAuramancy3_6.isSelected = !btnAuramancy3_6.isSelected
        }

        btnAuramancy3_7.setOnClickListener {
            if (skillPoints <= 0){
                if (btnAuramancy3_7.isSelected) {
                    updateButtons3(btnAuramancy3_7)
                    btnAuramancy3_7.isSelected = !btnAuramancy3_7.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnAuramancy3_7)

            skillUnlock3(
                btnAuramancy3_4, btnAuramancy3_8, btnAuramancy3_12,
                btnAuramancyPassive3_1, btnAuramancyPassive3_2, btnAuramancyPassive3_3,
                btnAuramancyPassive3_4, btnAuramancyPassive3_5, btnAuramancyPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnAuramancy3_7.isSelected = !btnAuramancy3_7.isSelected
        }

        btnAuramancy3_8.setOnClickListener {
            if (skillPoints <= 0){
                if (btnAuramancy3_8.isSelected) {
                    updateButtons3(btnAuramancy3_8)
                    btnAuramancy3_8.isSelected = !btnAuramancy3_8.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnAuramancy3_8)

            btnAuramancy3_8.isSelected = !btnAuramancy3_8.isSelected
            skillUnlock3(
                btnAuramancy3_4, btnAuramancy3_8, btnAuramancy3_12,
                btnAuramancyPassive3_1, btnAuramancyPassive3_2, btnAuramancyPassive3_3,
                btnAuramancyPassive3_4, btnAuramancyPassive3_5, btnAuramancyPassive3_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnAuramancy3_9.setOnClickListener {
            if (skillPoints <= 0){
                if (btnAuramancy3_9.isSelected) {
                    updateButtons3(btnAuramancy3_9)
                    btnAuramancy3_9.isSelected = !btnAuramancy3_9.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnAuramancy3_9)

            skillUnlock3(
                btnAuramancy3_4, btnAuramancy3_8, btnAuramancy3_12,
                btnAuramancyPassive3_1, btnAuramancyPassive3_2, btnAuramancyPassive3_3,
                btnAuramancyPassive3_4, btnAuramancyPassive3_5, btnAuramancyPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnAuramancy3_9.isSelected = !btnAuramancy3_9.isSelected
        }

        btnAuramancy3_10.setOnClickListener {
            if (skillPoints <= 0){
                if (btnAuramancy3_10.isSelected) {
                    updateButtons3(btnAuramancy3_10)
                    btnAuramancy3_10.isSelected = !btnAuramancy3_10.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnAuramancy3_10)

            skillUnlock3(
                btnAuramancy3_4, btnAuramancy3_8, btnAuramancy3_12,
                btnAuramancyPassive3_1, btnAuramancyPassive3_2, btnAuramancyPassive3_3,
                btnAuramancyPassive3_4, btnAuramancyPassive3_5, btnAuramancyPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnAuramancy3_10.isSelected = !btnAuramancy3_10.isSelected
        }

        btnAuramancy3_11.setOnClickListener {
            if (skillPoints <= 0){
                if (btnAuramancy3_11.isSelected) {
                    updateButtons3(btnAuramancy3_11)
                    btnAuramancy3_11.isSelected = !btnAuramancy3_11.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnAuramancy3_11)

            skillUnlock3(
                btnAuramancy3_4, btnAuramancy3_8, btnAuramancy3_12,
                btnAuramancyPassive3_1, btnAuramancyPassive3_2, btnAuramancyPassive3_3,
                btnAuramancyPassive3_4, btnAuramancyPassive3_5, btnAuramancyPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnAuramancy3_11.isSelected = !btnAuramancy3_11.isSelected
        }

        btnAuramancy3_12.setOnClickListener {
            if (skillPoints <= 0){
                if (btnAuramancy3_12.isSelected) {
                    updateButtons3(btnAuramancy3_12)
                    btnAuramancy3_12.isSelected = !btnAuramancy3_12.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnAuramancy3_12)

            btnAuramancy3_12.isSelected = !btnAuramancy3_12.isSelected
            skillUnlock3(
                btnAuramancy3_4, btnAuramancy3_8, btnAuramancy3_12,
                btnAuramancyPassive3_1, btnAuramancyPassive3_2, btnAuramancyPassive3_3,
                btnAuramancyPassive3_4, btnAuramancyPassive3_5, btnAuramancyPassive3_6,
                skillPoints2Text, skillTree2Points
            )
        }
//endregion
        

        //region Shadowplay1 Button Actions
        btnShadowplay1_1.setOnClickListener {
            if (skillPoints <= 0){
                if (btnShadowplay1_1.isSelected) {
                    updateButtons1(btnShadowplay1_1)
                    btnShadowplay1_1.isSelected = !btnShadowplay1_1.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnShadowplay1_1)

            skillUnlock1(
                btnShadowplay1_4, btnShadowplay1_8, btnShadowplay1_12,
                btnShadowplayPassive1_1, btnShadowplayPassive1_2, btnShadowplayPassive1_3,
                btnShadowplayPassive1_4, btnShadowplayPassive1_5, btnShadowplayPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnShadowplay1_1.isSelected = !btnShadowplay1_1.isSelected
        }

        btnShadowplay1_2.setOnClickListener {
            if (skillPoints <= 0){
                if (btnShadowplay1_2.isSelected) {
                    updateButtons1(btnShadowplay1_2)
                    btnShadowplay1_2.isSelected = !btnShadowplay1_2.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnShadowplay1_2)

            skillUnlock1(
                btnShadowplay1_4, btnShadowplay1_8, btnShadowplay1_12,
                btnShadowplayPassive1_1, btnShadowplayPassive1_2, btnShadowplayPassive1_3,
                btnShadowplayPassive1_4, btnShadowplayPassive1_5, btnShadowplayPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnShadowplay1_2.isSelected = !btnShadowplay1_2.isSelected
        }

        btnShadowplay1_3.setOnClickListener {
            if (skillPoints <= 0){
                if (btnShadowplay1_3.isSelected) {
                    updateButtons1(btnShadowplay1_3)
                    btnShadowplay1_3.isSelected = !btnShadowplay1_3.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnShadowplay1_3)

            skillUnlock1(
                btnShadowplay1_4, btnShadowplay1_8, btnShadowplay1_12,
                btnShadowplayPassive1_1, btnShadowplayPassive1_2, btnShadowplayPassive1_3,
                btnShadowplayPassive1_4, btnShadowplayPassive1_5, btnShadowplayPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnShadowplay1_3.isSelected = !btnShadowplay1_3.isSelected
        }

        btnShadowplay1_4.setOnClickListener {
            if (skillPoints <= 0){
                if (btnShadowplay1_4.isSelected) {
                    updateButtons1(btnShadowplay1_4)
                    btnShadowplay1_4.isSelected = !btnShadowplay1_4.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnShadowplay1_4)

            btnShadowplay1_4.isSelected = !btnShadowplay1_4.isSelected
            skillUnlock1(
                btnShadowplay1_4, btnShadowplay1_8, btnShadowplay1_12,
                btnShadowplayPassive1_1, btnShadowplayPassive1_2, btnShadowplayPassive1_3,
                btnShadowplayPassive1_4, btnShadowplayPassive1_5, btnShadowplayPassive1_6,
                skillPoints1Text, skillTree1Points
            )
        }

        btnShadowplay1_5.setOnClickListener {
            if (skillPoints <= 0){
                if (btnShadowplay1_5.isSelected) {
                    updateButtons1(btnShadowplay1_5)
                    btnShadowplay1_5.isSelected = !btnShadowplay1_5.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnShadowplay1_5)

            skillUnlock1(
                btnShadowplay1_4, btnShadowplay1_8, btnShadowplay1_12,
                btnShadowplayPassive1_1, btnShadowplayPassive1_2, btnShadowplayPassive1_3,
                btnShadowplayPassive1_4, btnShadowplayPassive1_5, btnShadowplayPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnShadowplay1_5.isSelected = !btnShadowplay1_5.isSelected
        }

        btnShadowplay1_6.setOnClickListener {
            if (skillPoints <= 0){
                if (btnShadowplay1_6.isSelected) {
                    updateButtons1(btnShadowplay1_6)
                    btnShadowplay1_6.isSelected = !btnShadowplay1_6.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnShadowplay1_6)

            skillUnlock1(
                btnShadowplay1_4, btnShadowplay1_8, btnShadowplay1_12,
                btnShadowplayPassive1_1, btnShadowplayPassive1_2, btnShadowplayPassive1_3,
                btnShadowplayPassive1_4, btnShadowplayPassive1_5, btnShadowplayPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnShadowplay1_6.isSelected = !btnShadowplay1_6.isSelected
        }

        btnShadowplay1_7.setOnClickListener {
            if (skillPoints <= 0){
                if (btnShadowplay1_7.isSelected) {
                    updateButtons1(btnShadowplay1_7)
                    btnShadowplay1_7.isSelected = !btnShadowplay1_7.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnShadowplay1_7)

            skillUnlock1(
                btnShadowplay1_4, btnShadowplay1_8, btnShadowplay1_12,
                btnShadowplayPassive1_1, btnShadowplayPassive1_2, btnShadowplayPassive1_3,
                btnShadowplayPassive1_4, btnShadowplayPassive1_5, btnShadowplayPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnShadowplay1_7.isSelected = !btnShadowplay1_7.isSelected
        }

        btnShadowplay1_8.setOnClickListener {
            if (skillPoints <= 0){
                if (btnShadowplay1_8.isSelected) {
                    updateButtons1(btnShadowplay1_8)
                    btnShadowplay1_8.isSelected = !btnShadowplay1_8.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnShadowplay1_8)

            btnShadowplay1_8.isSelected = !btnShadowplay1_8.isSelected
            skillUnlock1(
                btnShadowplay1_4, btnShadowplay1_8, btnShadowplay1_12,
                btnShadowplayPassive1_1, btnShadowplayPassive1_2, btnShadowplayPassive1_3,
                btnShadowplayPassive1_4, btnShadowplayPassive1_5, btnShadowplayPassive1_6,
                skillPoints1Text, skillTree1Points
            )
        }

        btnShadowplay1_9.setOnClickListener {
            if (skillPoints <= 0){
                if (btnShadowplay1_9.isSelected) {
                    updateButtons1(btnShadowplay1_9)
                    btnShadowplay1_9.isSelected = !btnShadowplay1_9.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnShadowplay1_9)

            skillUnlock1(
                btnShadowplay1_4, btnShadowplay1_8, btnShadowplay1_12,
                btnShadowplayPassive1_1, btnShadowplayPassive1_2, btnShadowplayPassive1_3,
                btnShadowplayPassive1_4, btnShadowplayPassive1_5, btnShadowplayPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnShadowplay1_9.isSelected = !btnShadowplay1_9.isSelected
        }

        btnShadowplay1_10.setOnClickListener {
            if (skillPoints <= 0){
                if (btnShadowplay1_10.isSelected) {
                    updateButtons1(btnShadowplay1_10)
                    btnShadowplay1_10.isSelected = !btnShadowplay1_10.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnShadowplay1_10)

            skillUnlock1(
                btnShadowplay1_4, btnShadowplay1_8, btnShadowplay1_12,
                btnShadowplayPassive1_1, btnShadowplayPassive1_2, btnShadowplayPassive1_3,
                btnShadowplayPassive1_4, btnShadowplayPassive1_5, btnShadowplayPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnShadowplay1_10.isSelected = !btnShadowplay1_10.isSelected
        }

        btnShadowplay1_11.setOnClickListener {
            if (skillPoints <= 0){
                if (btnShadowplay1_11.isSelected) {
                    updateButtons1(btnShadowplay1_11)
                    btnShadowplay1_11.isSelected = !btnShadowplay1_11.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnShadowplay1_11)

            skillUnlock1(
                btnShadowplay1_4, btnShadowplay1_8, btnShadowplay1_12,
                btnShadowplayPassive1_1, btnShadowplayPassive1_2, btnShadowplayPassive1_3,
                btnShadowplayPassive1_4, btnShadowplayPassive1_5, btnShadowplayPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnShadowplay1_11.isSelected = !btnShadowplay1_11.isSelected
        }

        btnShadowplay1_12.setOnClickListener {
            if (skillPoints <= 0){
                if (btnShadowplay1_12.isSelected) {
                    updateButtons1(btnShadowplay1_12)
                    btnShadowplay1_12.isSelected = !btnShadowplay1_12.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnShadowplay1_12)

            btnShadowplay1_12.isSelected = !btnShadowplay1_12.isSelected
            skillUnlock1(
                btnShadowplay1_4, btnShadowplay1_8, btnShadowplay1_12,
                btnShadowplayPassive1_1, btnShadowplayPassive1_2, btnShadowplayPassive1_3,
                btnShadowplayPassive1_4, btnShadowplayPassive1_5, btnShadowplayPassive1_6,
                skillPoints1Text, skillTree1Points
            )
        }
        //endregion

        //region Shadowplay2 Button Actions
        btnShadowplay2_1.setOnClickListener {
            if (skillPoints <= 0){
                if (btnShadowplay2_1.isSelected) {
                    updateButtons2(btnShadowplay2_1)
                    btnShadowplay2_1.isSelected = !btnShadowplay2_1.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnShadowplay2_1)

            skillUnlock2(
                btnShadowplay2_4, btnShadowplay2_8, btnShadowplay2_12,
                btnShadowplayPassive2_1, btnShadowplayPassive2_2, btnShadowplayPassive2_3,
                btnShadowplayPassive2_4, btnShadowplayPassive2_5, btnShadowplayPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnShadowplay2_1.isSelected = !btnShadowplay2_1.isSelected
        }

        btnShadowplay2_2.setOnClickListener {
            if (skillPoints <= 0){
                if (btnShadowplay2_2.isSelected) {
                    updateButtons2(btnShadowplay2_2)
                    btnShadowplay2_2.isSelected = !btnShadowplay2_2.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnShadowplay2_2)

            skillUnlock2(
                btnShadowplay2_4, btnShadowplay2_8, btnShadowplay2_12,
                btnShadowplayPassive2_1, btnShadowplayPassive2_2, btnShadowplayPassive2_3,
                btnShadowplayPassive2_4, btnShadowplayPassive2_5, btnShadowplayPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnShadowplay2_2.isSelected = !btnShadowplay2_2.isSelected
        }

        btnShadowplay2_3.setOnClickListener {
            if (skillPoints <= 0){
                if (btnShadowplay2_3.isSelected) {
                    updateButtons2(btnShadowplay2_3)
                    btnShadowplay2_3.isSelected = !btnShadowplay2_3.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnShadowplay2_3)

            skillUnlock2(
                btnShadowplay2_4, btnShadowplay2_8, btnShadowplay2_12,
                btnShadowplayPassive2_1, btnShadowplayPassive2_2, btnShadowplayPassive2_3,
                btnShadowplayPassive2_4, btnShadowplayPassive2_5, btnShadowplayPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnShadowplay2_3.isSelected = !btnShadowplay2_3.isSelected
        }

        btnShadowplay2_4.setOnClickListener {
            if (skillPoints <= 0){
                if (btnShadowplay2_4.isSelected) {
                    updateButtons2(btnShadowplay2_4)
                    btnShadowplay2_4.isSelected = !btnShadowplay2_4.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnShadowplay2_4)

            btnShadowplay2_4.isSelected = !btnShadowplay2_4.isSelected
            skillUnlock2(
                btnShadowplay2_4, btnShadowplay2_8, btnShadowplay2_12,
                btnShadowplayPassive2_1, btnShadowplayPassive2_2, btnShadowplayPassive2_3,
                btnShadowplayPassive2_4, btnShadowplayPassive2_5, btnShadowplayPassive2_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnShadowplay2_5.setOnClickListener {
            if (skillPoints <= 0){
                if (btnShadowplay2_5.isSelected) {
                    updateButtons2(btnShadowplay2_5)
                    btnShadowplay2_5.isSelected = !btnShadowplay2_5.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnShadowplay2_5)

            skillUnlock2(
                btnShadowplay2_4, btnShadowplay2_8, btnShadowplay2_12,
                btnShadowplayPassive2_1, btnShadowplayPassive2_2, btnShadowplayPassive2_3,
                btnShadowplayPassive2_4, btnShadowplayPassive2_5, btnShadowplayPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnShadowplay2_5.isSelected = !btnShadowplay2_5.isSelected
        }

        btnShadowplay2_6.setOnClickListener {
            if (skillPoints <= 0){
                if (btnShadowplay2_6.isSelected) {
                    updateButtons2(btnShadowplay2_6)
                    btnShadowplay2_6.isSelected = !btnShadowplay2_6.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnShadowplay2_6)

            skillUnlock2(
                btnShadowplay2_4, btnShadowplay2_8, btnShadowplay2_12,
                btnShadowplayPassive2_1, btnShadowplayPassive2_2, btnShadowplayPassive2_3,
                btnShadowplayPassive2_4, btnShadowplayPassive2_5, btnShadowplayPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnShadowplay2_6.isSelected = !btnShadowplay2_6.isSelected
        }

        btnShadowplay2_7.setOnClickListener {
            if (skillPoints <= 0){
                if (btnShadowplay2_7.isSelected) {
                    updateButtons2(btnShadowplay2_7)
                    btnShadowplay2_7.isSelected = !btnShadowplay2_7.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnShadowplay2_7)

            skillUnlock2(
                btnShadowplay2_4, btnShadowplay2_8, btnShadowplay2_12,
                btnShadowplayPassive2_1, btnShadowplayPassive2_2, btnShadowplayPassive2_3,
                btnShadowplayPassive2_4, btnShadowplayPassive2_5, btnShadowplayPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnShadowplay2_7.isSelected = !btnShadowplay2_7.isSelected
        }

        btnShadowplay2_8.setOnClickListener {
            if (skillPoints <= 0){
                if (btnShadowplay2_8.isSelected) {
                    updateButtons2(btnShadowplay2_8)
                    btnShadowplay2_8.isSelected = !btnShadowplay2_8.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnShadowplay2_8)

            btnShadowplay2_8.isSelected = !btnShadowplay2_8.isSelected
            skillUnlock2(
                btnShadowplay2_4, btnShadowplay2_8, btnShadowplay2_12,
                btnShadowplayPassive2_1, btnShadowplayPassive2_2, btnShadowplayPassive2_3,
                btnShadowplayPassive2_4, btnShadowplayPassive2_5, btnShadowplayPassive2_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnShadowplay2_9.setOnClickListener {
            if (skillPoints <= 0){
                if (btnShadowplay2_9.isSelected) {
                    updateButtons2(btnShadowplay2_9)
                    btnShadowplay2_9.isSelected = !btnShadowplay2_9.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnShadowplay2_9)

            skillUnlock2(
                btnShadowplay2_4, btnShadowplay2_8, btnShadowplay2_12,
                btnShadowplayPassive2_1, btnShadowplayPassive2_2, btnShadowplayPassive2_3,
                btnShadowplayPassive2_4, btnShadowplayPassive2_5, btnShadowplayPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnShadowplay2_9.isSelected = !btnShadowplay2_9.isSelected
        }

        btnShadowplay2_10.setOnClickListener {
            if (skillPoints <= 0){
                if (btnShadowplay2_10.isSelected) {
                    updateButtons2(btnShadowplay2_10)
                    btnShadowplay2_10.isSelected = !btnShadowplay2_10.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnShadowplay2_10)

            skillUnlock2(
                btnShadowplay2_4, btnShadowplay2_8, btnShadowplay2_12,
                btnShadowplayPassive2_1, btnShadowplayPassive2_2, btnShadowplayPassive2_3,
                btnShadowplayPassive2_4, btnShadowplayPassive2_5, btnShadowplayPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnShadowplay2_10.isSelected = !btnShadowplay2_10.isSelected
        }

        btnShadowplay2_11.setOnClickListener {
            if (skillPoints <= 0){
                if (btnShadowplay2_11.isSelected) {
                    updateButtons2(btnShadowplay2_11)
                    btnShadowplay2_11.isSelected = !btnShadowplay2_11.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnShadowplay2_11)

            skillUnlock2(
                btnShadowplay2_4, btnShadowplay2_8, btnShadowplay2_12,
                btnShadowplayPassive2_1, btnShadowplayPassive2_2, btnShadowplayPassive2_3,
                btnShadowplayPassive2_4, btnShadowplayPassive2_5, btnShadowplayPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnShadowplay2_11.isSelected = !btnShadowplay2_11.isSelected
        }

        btnShadowplay2_12.setOnClickListener {
            if (skillPoints <= 0){
                if (btnShadowplay2_12.isSelected) {
                    updateButtons2(btnShadowplay2_12)
                    btnShadowplay2_12.isSelected = !btnShadowplay2_12.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnShadowplay2_12)

            btnShadowplay2_12.isSelected = !btnShadowplay2_12.isSelected
            skillUnlock2(
                btnShadowplay2_4, btnShadowplay2_8, btnShadowplay2_12,
                btnShadowplayPassive2_1, btnShadowplayPassive2_2, btnShadowplayPassive2_3,
                btnShadowplayPassive2_4, btnShadowplayPassive2_5, btnShadowplayPassive2_6,
                skillPoints2Text, skillTree2Points
            )
        }
        //endregion

        //region Shadowplay3 Button Actions
        btnShadowplay3_1.setOnClickListener {
            if (skillPoints <= 0){
                if (btnShadowplay3_1.isSelected) {
                    updateButtons3(btnShadowplay3_1)
                    btnShadowplay3_1.isSelected = !btnShadowplay3_1.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnShadowplay3_1)

            skillUnlock3(
                btnShadowplay3_4, btnShadowplay3_8, btnShadowplay3_12,
                btnShadowplayPassive3_1, btnShadowplayPassive3_2, btnShadowplayPassive3_3,
                btnShadowplayPassive3_4, btnShadowplayPassive3_5, btnShadowplayPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnShadowplay3_1.isSelected = !btnShadowplay3_1.isSelected
        }

        btnShadowplay3_2.setOnClickListener {
            if (skillPoints <= 0){
                if (btnShadowplay3_2.isSelected) {
                    updateButtons3(btnShadowplay3_2)
                    btnShadowplay3_2.isSelected = !btnShadowplay3_2.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnShadowplay3_2)

            skillUnlock3(
                btnShadowplay3_4, btnShadowplay3_8, btnShadowplay3_12,
                btnShadowplayPassive3_1, btnShadowplayPassive3_2, btnShadowplayPassive3_3,
                btnShadowplayPassive3_4, btnShadowplayPassive3_5, btnShadowplayPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnShadowplay3_2.isSelected = !btnShadowplay3_2.isSelected
        }

        btnShadowplay3_3.setOnClickListener {
            if (skillPoints <= 0){
                if (btnShadowplay3_3.isSelected) {
                    updateButtons3(btnShadowplay3_3)
                    btnShadowplay3_3.isSelected = !btnShadowplay3_3.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnShadowplay3_3)

            skillUnlock3(
                btnShadowplay3_4, btnShadowplay3_8, btnShadowplay3_12,
                btnShadowplayPassive3_1, btnShadowplayPassive3_2, btnShadowplayPassive3_3,
                btnShadowplayPassive3_4, btnShadowplayPassive3_5, btnShadowplayPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnShadowplay3_3.isSelected = !btnShadowplay3_3.isSelected
        }

        btnShadowplay3_4.setOnClickListener {
            if (skillPoints <= 0){
                if (btnShadowplay3_4.isSelected) {
                    updateButtons3(btnShadowplay3_4)
                    btnShadowplay3_4.isSelected = !btnShadowplay3_4.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnShadowplay3_4)

            btnShadowplay3_4.isSelected = !btnShadowplay3_4.isSelected
            skillUnlock3(
                btnShadowplay3_4, btnShadowplay3_8, btnShadowplay3_12,
                btnShadowplayPassive3_1, btnShadowplayPassive3_2, btnShadowplayPassive3_3,
                btnShadowplayPassive3_4, btnShadowplayPassive3_5, btnShadowplayPassive3_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnShadowplay3_5.setOnClickListener {
            if (skillPoints <= 0){
                if (btnShadowplay3_5.isSelected) {
                    updateButtons3(btnShadowplay3_5)
                    btnShadowplay3_5.isSelected = !btnShadowplay3_5.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnShadowplay3_5)

            skillUnlock3(
                btnShadowplay3_4, btnShadowplay3_8, btnShadowplay3_12,
                btnShadowplayPassive3_1, btnShadowplayPassive3_2, btnShadowplayPassive3_3,
                btnShadowplayPassive3_4, btnShadowplayPassive3_5, btnShadowplayPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnShadowplay3_5.isSelected = !btnShadowplay3_5.isSelected
        }

        btnShadowplay3_6.setOnClickListener {
            if (skillPoints <= 0){
                if (btnShadowplay3_6.isSelected) {
                    updateButtons3(btnShadowplay3_6)
                    btnShadowplay3_6.isSelected = !btnShadowplay3_6.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnShadowplay3_6)

            skillUnlock3(
                btnShadowplay3_4, btnShadowplay3_8, btnShadowplay3_12,
                btnShadowplayPassive3_1, btnShadowplayPassive3_2, btnShadowplayPassive3_3,
                btnShadowplayPassive3_4, btnShadowplayPassive3_5, btnShadowplayPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnShadowplay3_6.isSelected = !btnShadowplay3_6.isSelected
        }

        btnShadowplay3_7.setOnClickListener {
            if (skillPoints <= 0){
                if (btnShadowplay3_7.isSelected) {
                    updateButtons3(btnShadowplay3_7)
                    btnShadowplay3_7.isSelected = !btnShadowplay3_7.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnShadowplay3_7)

            skillUnlock3(
                btnShadowplay3_4, btnShadowplay3_8, btnShadowplay3_12,
                btnShadowplayPassive3_1, btnShadowplayPassive3_2, btnShadowplayPassive3_3,
                btnShadowplayPassive3_4, btnShadowplayPassive3_5, btnShadowplayPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnShadowplay3_7.isSelected = !btnShadowplay3_7.isSelected
        }

        btnShadowplay3_8.setOnClickListener {
            if (skillPoints <= 0){
                if (btnShadowplay3_8.isSelected) {
                    updateButtons3(btnShadowplay3_8)
                    btnShadowplay3_8.isSelected = !btnShadowplay3_8.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnShadowplay3_8)

            btnShadowplay3_8.isSelected = !btnShadowplay3_8.isSelected
            skillUnlock3(
                btnShadowplay3_4, btnShadowplay3_8, btnShadowplay3_12,
                btnShadowplayPassive3_1, btnShadowplayPassive3_2, btnShadowplayPassive3_3,
                btnShadowplayPassive3_4, btnShadowplayPassive3_5, btnShadowplayPassive3_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnShadowplay3_9.setOnClickListener {
            if (skillPoints <= 0){
                if (btnShadowplay3_9.isSelected) {
                    updateButtons3(btnShadowplay3_9)
                    btnShadowplay3_9.isSelected = !btnShadowplay3_9.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnShadowplay3_9)

            skillUnlock3(
                btnShadowplay3_4, btnShadowplay3_8, btnShadowplay3_12,
                btnShadowplayPassive3_1, btnShadowplayPassive3_2, btnShadowplayPassive3_3,
                btnShadowplayPassive3_4, btnShadowplayPassive3_5, btnShadowplayPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnShadowplay3_9.isSelected = !btnShadowplay3_9.isSelected
        }

        btnShadowplay3_10.setOnClickListener {
            if (skillPoints <= 0){
                if (btnShadowplay3_10.isSelected) {
                    updateButtons3(btnShadowplay3_10)
                    btnShadowplay3_10.isSelected = !btnShadowplay3_10.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnShadowplay3_10)

            skillUnlock3(
                btnShadowplay3_4, btnShadowplay3_8, btnShadowplay3_12,
                btnShadowplayPassive3_1, btnShadowplayPassive3_2, btnShadowplayPassive3_3,
                btnShadowplayPassive3_4, btnShadowplayPassive3_5, btnShadowplayPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnShadowplay3_10.isSelected = !btnShadowplay3_10.isSelected
        }

        btnShadowplay3_11.setOnClickListener {
            if (skillPoints <= 0){
                if (btnShadowplay3_11.isSelected) {
                    updateButtons3(btnShadowplay3_11)
                    btnShadowplay3_11.isSelected = !btnShadowplay3_11.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnShadowplay3_11)

            skillUnlock3(
                btnShadowplay3_4, btnShadowplay3_8, btnShadowplay3_12,
                btnShadowplayPassive3_1, btnShadowplayPassive3_2, btnShadowplayPassive3_3,
                btnShadowplayPassive3_4, btnShadowplayPassive3_5, btnShadowplayPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnShadowplay3_11.isSelected = !btnShadowplay3_11.isSelected
        }

        btnShadowplay3_12.setOnClickListener {
            if (skillPoints <= 0){
                if (btnShadowplay3_12.isSelected) {
                    updateButtons3(btnShadowplay3_12)
                    btnShadowplay3_12.isSelected = !btnShadowplay3_12.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnShadowplay3_12)

            btnShadowplay3_12.isSelected = !btnShadowplay3_12.isSelected
            skillUnlock3(
                btnShadowplay3_4, btnShadowplay3_8, btnShadowplay3_12,
                btnShadowplayPassive3_1, btnShadowplayPassive3_2, btnShadowplayPassive3_3,
                btnShadowplayPassive3_4, btnShadowplayPassive3_5, btnShadowplayPassive3_6,
                skillPoints2Text, skillTree2Points
            )
        }
        //endregion
        

        //region Vitalism1 Button Actions
        btnVitalism1_1.setOnClickListener {
            if (skillPoints <= 0){
                if (btnVitalism1_1.isSelected) {
                    updateButtons1(btnVitalism1_1)
                    btnVitalism1_1.isSelected = !btnVitalism1_1.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnVitalism1_1)

            skillUnlock1(
                btnVitalism1_4, btnVitalism1_8, btnVitalism1_12,
                btnVitalismPassive1_1, btnVitalismPassive1_2, btnVitalismPassive1_3,
                btnVitalismPassive1_4, btnVitalismPassive1_5, btnVitalismPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnVitalism1_1.isSelected = !btnVitalism1_1.isSelected
        }

        btnVitalism1_2.setOnClickListener {
            if (skillPoints <= 0){
                if (btnVitalism1_2.isSelected) {
                    updateButtons1(btnVitalism1_2)
                    btnVitalism1_2.isSelected = !btnVitalism1_2.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnVitalism1_2)

            skillUnlock1(
                btnVitalism1_4, btnVitalism1_8, btnVitalism1_12,
                btnVitalismPassive1_1, btnVitalismPassive1_2, btnVitalismPassive1_3,
                btnVitalismPassive1_4, btnVitalismPassive1_5, btnVitalismPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnVitalism1_2.isSelected = !btnVitalism1_2.isSelected
        }

        btnVitalism1_3.setOnClickListener {
            if (skillPoints <= 0){
                if (btnVitalism1_3.isSelected) {
                    updateButtons1(btnVitalism1_3)
                    btnVitalism1_3.isSelected = !btnVitalism1_3.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnVitalism1_3)

            skillUnlock1(
                btnVitalism1_4, btnVitalism1_8, btnVitalism1_12,
                btnVitalismPassive1_1, btnVitalismPassive1_2, btnVitalismPassive1_3,
                btnVitalismPassive1_4, btnVitalismPassive1_5, btnVitalismPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnVitalism1_3.isSelected = !btnVitalism1_3.isSelected
        }

        btnVitalism1_4.setOnClickListener {
            if (skillPoints <= 0){
                if (btnVitalism1_4.isSelected) {
                    updateButtons1(btnVitalism1_4)
                    btnVitalism1_4.isSelected = !btnVitalism1_4.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnVitalism1_4)

            btnVitalism1_4.isSelected = !btnVitalism1_4.isSelected
            skillUnlock1(
                btnVitalism1_4, btnVitalism1_8, btnVitalism1_12,
                btnVitalismPassive1_1, btnVitalismPassive1_2, btnVitalismPassive1_3,
                btnVitalismPassive1_4, btnVitalismPassive1_5, btnVitalismPassive1_6,
                skillPoints1Text, skillTree1Points
            )
        }

        btnVitalism1_5.setOnClickListener {
            if (skillPoints <= 0){
                if (btnVitalism1_5.isSelected) {
                    updateButtons1(btnVitalism1_5)
                    btnVitalism1_5.isSelected = !btnVitalism1_5.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnVitalism1_5)

            skillUnlock1(
                btnVitalism1_4, btnVitalism1_8, btnVitalism1_12,
                btnVitalismPassive1_1, btnVitalismPassive1_2, btnVitalismPassive1_3,
                btnVitalismPassive1_4, btnVitalismPassive1_5, btnVitalismPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnVitalism1_5.isSelected = !btnVitalism1_5.isSelected
        }

        btnVitalism1_6.setOnClickListener {
            if (skillPoints <= 0){
                if (btnVitalism1_6.isSelected) {
                    updateButtons1(btnVitalism1_6)
                    btnVitalism1_6.isSelected = !btnVitalism1_6.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnVitalism1_6)

            skillUnlock1(
                btnVitalism1_4, btnVitalism1_8, btnVitalism1_12,
                btnVitalismPassive1_1, btnVitalismPassive1_2, btnVitalismPassive1_3,
                btnVitalismPassive1_4, btnVitalismPassive1_5, btnVitalismPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnVitalism1_6.isSelected = !btnVitalism1_6.isSelected
        }

        btnVitalism1_7.setOnClickListener {
            if (skillPoints <= 0){
                if (btnVitalism1_7.isSelected) {
                    updateButtons1(btnVitalism1_7)
                    btnVitalism1_7.isSelected = !btnVitalism1_7.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnVitalism1_7)

            skillUnlock1(
                btnVitalism1_4, btnVitalism1_8, btnVitalism1_12,
                btnVitalismPassive1_1, btnVitalismPassive1_2, btnVitalismPassive1_3,
                btnVitalismPassive1_4, btnVitalismPassive1_5, btnVitalismPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnVitalism1_7.isSelected = !btnVitalism1_7.isSelected
        }

        btnVitalism1_8.setOnClickListener {
            if (skillPoints <= 0){
                if (btnVitalism1_8.isSelected) {
                    updateButtons1(btnVitalism1_8)
                    btnVitalism1_8.isSelected = !btnVitalism1_8.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnVitalism1_8)

            btnVitalism1_8.isSelected = !btnVitalism1_8.isSelected
            skillUnlock1(
                btnVitalism1_4, btnVitalism1_8, btnVitalism1_12,
                btnVitalismPassive1_1, btnVitalismPassive1_2, btnVitalismPassive1_3,
                btnVitalismPassive1_4, btnVitalismPassive1_5, btnVitalismPassive1_6,
                skillPoints1Text, skillTree1Points
            )
        }

        btnVitalism1_9.setOnClickListener {
            if (skillPoints <= 0){
                if (btnVitalism1_9.isSelected) {
                    updateButtons1(btnVitalism1_9)
                    btnVitalism1_9.isSelected = !btnVitalism1_9.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnVitalism1_9)

            skillUnlock1(
                btnVitalism1_4, btnVitalism1_8, btnVitalism1_12,
                btnVitalismPassive1_1, btnVitalismPassive1_2, btnVitalismPassive1_3,
                btnVitalismPassive1_4, btnVitalismPassive1_5, btnVitalismPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnVitalism1_9.isSelected = !btnVitalism1_9.isSelected
        }

        btnVitalism1_10.setOnClickListener {
            if (skillPoints <= 0){
                if (btnVitalism1_10.isSelected) {
                    updateButtons1(btnVitalism1_10)
                    btnVitalism1_10.isSelected = !btnVitalism1_10.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnVitalism1_10)

            skillUnlock1(
                btnVitalism1_4, btnVitalism1_8, btnVitalism1_12,
                btnVitalismPassive1_1, btnVitalismPassive1_2, btnVitalismPassive1_3,
                btnVitalismPassive1_4, btnVitalismPassive1_5, btnVitalismPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnVitalism1_10.isSelected = !btnVitalism1_10.isSelected
        }

        btnVitalism1_11.setOnClickListener {
            if (skillPoints <= 0){
                if (btnVitalism1_11.isSelected) {
                    updateButtons1(btnVitalism1_11)
                    btnVitalism1_11.isSelected = !btnVitalism1_11.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnVitalism1_11)

            skillUnlock1(
                btnVitalism1_4, btnVitalism1_8, btnVitalism1_12,
                btnVitalismPassive1_1, btnVitalismPassive1_2, btnVitalismPassive1_3,
                btnVitalismPassive1_4, btnVitalismPassive1_5, btnVitalismPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnVitalism1_11.isSelected = !btnVitalism1_11.isSelected
        }

        btnVitalism1_12.setOnClickListener {
            if (skillPoints <= 0){
                if (btnVitalism1_12.isSelected) {
                    updateButtons1(btnVitalism1_12)
                    btnVitalism1_12.isSelected = !btnVitalism1_12.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnVitalism1_12)

            btnVitalism1_12.isSelected = !btnVitalism1_12.isSelected
            skillUnlock1(
                btnVitalism1_4, btnVitalism1_8, btnVitalism1_12,
                btnVitalismPassive1_1, btnVitalismPassive1_2, btnVitalismPassive1_3,
                btnVitalismPassive1_4, btnVitalismPassive1_5, btnVitalismPassive1_6,
                skillPoints1Text, skillTree1Points
            )
        }
        //endregion

        //region Vitalism2 Button Actions
        btnVitalism2_1.setOnClickListener {
            if (skillPoints <= 0){
                if (btnVitalism2_1.isSelected) {
                    updateButtons2(btnVitalism2_1)
                    btnVitalism2_1.isSelected = !btnVitalism2_1.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnVitalism2_1)

            skillUnlock2(
                btnVitalism2_4, btnVitalism2_8, btnVitalism2_12,
                btnVitalismPassive2_1, btnVitalismPassive2_2, btnVitalismPassive2_3,
                btnVitalismPassive2_4, btnVitalismPassive2_5, btnVitalismPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnVitalism2_1.isSelected = !btnVitalism2_1.isSelected
        }

        btnVitalism2_2.setOnClickListener {
            if (skillPoints <= 0){
                if (btnVitalism2_2.isSelected) {
                    updateButtons2(btnVitalism2_2)
                    btnVitalism2_2.isSelected = !btnVitalism2_2.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnVitalism2_2)

            skillUnlock2(
                btnVitalism2_4, btnVitalism2_8, btnVitalism2_12,
                btnVitalismPassive2_1, btnVitalismPassive2_2, btnVitalismPassive2_3,
                btnVitalismPassive2_4, btnVitalismPassive2_5, btnVitalismPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnVitalism2_2.isSelected = !btnVitalism2_2.isSelected
        }

        btnVitalism2_3.setOnClickListener {
            if (skillPoints <= 0){
                if (btnVitalism2_3.isSelected) {
                    updateButtons2(btnVitalism2_3)
                    btnVitalism2_3.isSelected = !btnVitalism2_3.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnVitalism2_3)

            skillUnlock2(
                btnVitalism2_4, btnVitalism2_8, btnVitalism2_12,
                btnVitalismPassive2_1, btnVitalismPassive2_2, btnVitalismPassive2_3,
                btnVitalismPassive2_4, btnVitalismPassive2_5, btnVitalismPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnVitalism2_3.isSelected = !btnVitalism2_3.isSelected
        }

        btnVitalism2_4.setOnClickListener {
            if (skillPoints <= 0){
                if (btnVitalism2_4.isSelected) {
                    updateButtons2(btnVitalism2_4)
                    btnVitalism2_4.isSelected = !btnVitalism2_4.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnVitalism2_4)

            btnVitalism2_4.isSelected = !btnVitalism2_4.isSelected
            skillUnlock2(
                btnVitalism2_4, btnVitalism2_8, btnVitalism2_12,
                btnVitalismPassive2_1, btnVitalismPassive2_2, btnVitalismPassive2_3,
                btnVitalismPassive2_4, btnVitalismPassive2_5, btnVitalismPassive2_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnVitalism2_5.setOnClickListener {
            if (skillPoints <= 0){
                if (btnVitalism2_5.isSelected) {
                    updateButtons2(btnVitalism2_5)
                    btnVitalism2_5.isSelected = !btnVitalism2_5.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnVitalism2_5)

            skillUnlock2(
                btnVitalism2_4, btnVitalism2_8, btnVitalism2_12,
                btnVitalismPassive2_1, btnVitalismPassive2_2, btnVitalismPassive2_3,
                btnVitalismPassive2_4, btnVitalismPassive2_5, btnVitalismPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnVitalism2_5.isSelected = !btnVitalism2_5.isSelected
        }

        btnVitalism2_6.setOnClickListener {
            if (skillPoints <= 0){
                if (btnVitalism2_6.isSelected) {
                    updateButtons2(btnVitalism2_6)
                    btnVitalism2_6.isSelected = !btnVitalism2_6.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnVitalism2_6)

            skillUnlock2(
                btnVitalism2_4, btnVitalism2_8, btnVitalism2_12,
                btnVitalismPassive2_1, btnVitalismPassive2_2, btnVitalismPassive2_3,
                btnVitalismPassive2_4, btnVitalismPassive2_5, btnVitalismPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnVitalism2_6.isSelected = !btnVitalism2_6.isSelected
        }

        btnVitalism2_7.setOnClickListener {
            if (skillPoints <= 0){
                if (btnVitalism2_7.isSelected) {
                    updateButtons2(btnVitalism2_7)
                    btnVitalism2_7.isSelected = !btnVitalism2_7.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnVitalism2_7)

            skillUnlock2(
                btnVitalism2_4, btnVitalism2_8, btnVitalism2_12,
                btnVitalismPassive2_1, btnVitalismPassive2_2, btnVitalismPassive2_3,
                btnVitalismPassive2_4, btnVitalismPassive2_5, btnVitalismPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnVitalism2_7.isSelected = !btnVitalism2_7.isSelected
        }

        btnVitalism2_8.setOnClickListener {
            if (skillPoints <= 0){
                if (btnVitalism2_8.isSelected) {
                    updateButtons2(btnVitalism2_8)
                    btnVitalism2_8.isSelected = !btnVitalism2_8.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnVitalism2_8)

            btnVitalism2_8.isSelected = !btnVitalism2_8.isSelected
            skillUnlock2(
                btnVitalism2_4, btnVitalism2_8, btnVitalism2_12,
                btnVitalismPassive2_1, btnVitalismPassive2_2, btnVitalismPassive2_3,
                btnVitalismPassive2_4, btnVitalismPassive2_5, btnVitalismPassive2_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnVitalism2_9.setOnClickListener {
            if (skillPoints <= 0){
                if (btnVitalism2_9.isSelected) {
                    updateButtons2(btnVitalism2_9)
                    btnVitalism2_9.isSelected = !btnVitalism2_9.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnVitalism2_9)

            skillUnlock2(
                btnVitalism2_4, btnVitalism2_8, btnVitalism2_12,
                btnVitalismPassive2_1, btnVitalismPassive2_2, btnVitalismPassive2_3,
                btnVitalismPassive2_4, btnVitalismPassive2_5, btnVitalismPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnVitalism2_9.isSelected = !btnVitalism2_9.isSelected
        }

        btnVitalism2_10.setOnClickListener {
            if (skillPoints <= 0){
                if (btnVitalism2_10.isSelected) {
                    updateButtons2(btnVitalism2_10)
                    btnVitalism2_10.isSelected = !btnVitalism2_10.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnVitalism2_10)

            skillUnlock2(
                btnVitalism2_4, btnVitalism2_8, btnVitalism2_12,
                btnVitalismPassive2_1, btnVitalismPassive2_2, btnVitalismPassive2_3,
                btnVitalismPassive2_4, btnVitalismPassive2_5, btnVitalismPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnVitalism2_10.isSelected = !btnVitalism2_10.isSelected
        }

        btnVitalism2_11.setOnClickListener {
            if (skillPoints <= 0){
                if (btnVitalism2_11.isSelected) {
                    updateButtons2(btnVitalism2_11)
                    btnVitalism2_11.isSelected = !btnVitalism2_11.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnVitalism2_11)

            skillUnlock2(
                btnVitalism2_4, btnVitalism2_8, btnVitalism2_12,
                btnVitalismPassive2_1, btnVitalismPassive2_2, btnVitalismPassive2_3,
                btnVitalismPassive2_4, btnVitalismPassive2_5, btnVitalismPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnVitalism2_11.isSelected = !btnVitalism2_11.isSelected
        }

        btnVitalism2_12.setOnClickListener {
            if (skillPoints <= 0){
                if (btnVitalism2_12.isSelected) {
                    updateButtons2(btnVitalism2_12)
                    btnVitalism2_12.isSelected = !btnVitalism2_12.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnVitalism2_12)

            btnVitalism2_12.isSelected = !btnVitalism2_12.isSelected
            skillUnlock2(
                btnVitalism2_4, btnVitalism2_8, btnVitalism2_12,
                btnVitalismPassive2_1, btnVitalismPassive2_2, btnVitalismPassive2_3,
                btnVitalismPassive2_4, btnVitalismPassive2_5, btnVitalismPassive2_6,
                skillPoints2Text, skillTree2Points
            )
        }
        //endregion
        
        //region Vitalism3 Button Actions
        btnVitalism3_1.setOnClickListener {
            if (skillPoints <= 0){
                if (btnVitalism3_1.isSelected) {
                    updateButtons3(btnVitalism3_1)
                    btnVitalism3_1.isSelected = !btnVitalism3_1.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnVitalism3_1)

            skillUnlock3(
                btnVitalism3_4, btnVitalism3_8, btnVitalism3_12,
                btnVitalismPassive3_1, btnVitalismPassive3_2, btnVitalismPassive3_3,
                btnVitalismPassive3_4, btnVitalismPassive3_5, btnVitalismPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnVitalism3_1.isSelected = !btnVitalism3_1.isSelected
        }

        btnVitalism3_2.setOnClickListener {
            if (skillPoints <= 0){
                if (btnVitalism3_2.isSelected) {
                    updateButtons3(btnVitalism3_2)
                    btnVitalism3_2.isSelected = !btnVitalism3_2.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnVitalism3_2)

            skillUnlock3(
                btnVitalism3_4, btnVitalism3_8, btnVitalism3_12,
                btnVitalismPassive3_1, btnVitalismPassive3_2, btnVitalismPassive3_3,
                btnVitalismPassive3_4, btnVitalismPassive3_5, btnVitalismPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnVitalism3_2.isSelected = !btnVitalism3_2.isSelected
        }

        btnVitalism3_3.setOnClickListener {
            if (skillPoints <= 0){
                if (btnVitalism3_3.isSelected) {
                    updateButtons3(btnVitalism3_3)
                    btnVitalism3_3.isSelected = !btnVitalism3_3.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnVitalism3_3)

            skillUnlock3(
                btnVitalism3_4, btnVitalism3_8, btnVitalism3_12,
                btnVitalismPassive3_1, btnVitalismPassive3_2, btnVitalismPassive3_3,
                btnVitalismPassive3_4, btnVitalismPassive3_5, btnVitalismPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnVitalism3_3.isSelected = !btnVitalism3_3.isSelected
        }

        btnVitalism3_4.setOnClickListener {
            if (skillPoints <= 0){
                if (btnVitalism3_4.isSelected) {
                    updateButtons3(btnVitalism3_4)
                    btnVitalism3_4.isSelected = !btnVitalism3_4.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnVitalism3_4)

            btnVitalism3_4.isSelected = !btnVitalism3_4.isSelected
            skillUnlock3(
                btnVitalism3_4, btnVitalism3_8, btnVitalism3_12,
                btnVitalismPassive3_1, btnVitalismPassive3_2, btnVitalismPassive3_3,
                btnVitalismPassive3_4, btnVitalismPassive3_5, btnVitalismPassive3_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnVitalism3_5.setOnClickListener {
            if (skillPoints <= 0){
                if (btnVitalism3_5.isSelected) {
                    updateButtons3(btnVitalism3_5)
                    btnVitalism3_5.isSelected = !btnVitalism3_5.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnVitalism3_5)

            skillUnlock3(
                btnVitalism3_4, btnVitalism3_8, btnVitalism3_12,
                btnVitalismPassive3_1, btnVitalismPassive3_2, btnVitalismPassive3_3,
                btnVitalismPassive3_4, btnVitalismPassive3_5, btnVitalismPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnVitalism3_5.isSelected = !btnVitalism3_5.isSelected
        }

        btnVitalism3_6.setOnClickListener {
            if (skillPoints <= 0){
                if (btnVitalism3_6.isSelected) {
                    updateButtons3(btnVitalism3_6)
                    btnVitalism3_6.isSelected = !btnVitalism3_6.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnVitalism3_6)

            skillUnlock3(
                btnVitalism3_4, btnVitalism3_8, btnVitalism3_12,
                btnVitalismPassive3_1, btnVitalismPassive3_2, btnVitalismPassive3_3,
                btnVitalismPassive3_4, btnVitalismPassive3_5, btnVitalismPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnVitalism3_6.isSelected = !btnVitalism3_6.isSelected
        }

        btnVitalism3_7.setOnClickListener {
            if (skillPoints <= 0){
                if (btnVitalism3_7.isSelected) {
                    updateButtons3(btnVitalism3_7)
                    btnVitalism3_7.isSelected = !btnVitalism3_7.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnVitalism3_7)

            skillUnlock3(
                btnVitalism3_4, btnVitalism3_8, btnVitalism3_12,
                btnVitalismPassive3_1, btnVitalismPassive3_2, btnVitalismPassive3_3,
                btnVitalismPassive3_4, btnVitalismPassive3_5, btnVitalismPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnVitalism3_7.isSelected = !btnVitalism3_7.isSelected
        }

        btnVitalism3_8.setOnClickListener {
            if (skillPoints <= 0){
                if (btnVitalism3_8.isSelected) {
                    updateButtons3(btnVitalism3_8)
                    btnVitalism3_8.isSelected = !btnVitalism3_8.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnVitalism3_8)

            btnVitalism3_8.isSelected = !btnVitalism3_8.isSelected
            skillUnlock3(
                btnVitalism3_4, btnVitalism3_8, btnVitalism3_12,
                btnVitalismPassive3_1, btnVitalismPassive3_2, btnVitalismPassive3_3,
                btnVitalismPassive3_4, btnVitalismPassive3_5, btnVitalismPassive3_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnVitalism3_9.setOnClickListener {
            if (skillPoints <= 0){
                if (btnVitalism3_9.isSelected) {
                    updateButtons3(btnVitalism3_9)
                    btnVitalism3_9.isSelected = !btnVitalism3_9.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnVitalism3_9)

            skillUnlock3(
                btnVitalism3_4, btnVitalism3_8, btnVitalism3_12,
                btnVitalismPassive3_1, btnVitalismPassive3_2, btnVitalismPassive3_3,
                btnVitalismPassive3_4, btnVitalismPassive3_5, btnVitalismPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnVitalism3_9.isSelected = !btnVitalism3_9.isSelected
        }

        btnVitalism3_10.setOnClickListener {
            if (skillPoints <= 0){
                if (btnVitalism3_10.isSelected) {
                    updateButtons3(btnVitalism3_10)
                    btnVitalism3_10.isSelected = !btnVitalism3_10.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnVitalism3_10)

            skillUnlock3(
                btnVitalism3_4, btnVitalism3_8, btnVitalism3_12,
                btnVitalismPassive3_1, btnVitalismPassive3_2, btnVitalismPassive3_3,
                btnVitalismPassive3_4, btnVitalismPassive3_5, btnVitalismPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnVitalism3_10.isSelected = !btnVitalism3_10.isSelected
        }

        btnVitalism3_11.setOnClickListener {
            if (skillPoints <= 0){
                if (btnVitalism3_11.isSelected) {
                    updateButtons3(btnVitalism3_11)
                    btnVitalism3_11.isSelected = !btnVitalism3_11.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnVitalism3_11)

            skillUnlock3(
                btnVitalism3_4, btnVitalism3_8, btnVitalism3_12,
                btnVitalismPassive3_1, btnVitalismPassive3_2, btnVitalismPassive3_3,
                btnVitalismPassive3_4, btnVitalismPassive3_5, btnVitalismPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnVitalism3_11.isSelected = !btnVitalism3_11.isSelected
        }

        btnVitalism3_12.setOnClickListener {
            if (skillPoints <= 0){
                if (btnVitalism3_12.isSelected) {
                    updateButtons3(btnVitalism3_12)
                    btnVitalism3_12.isSelected = !btnVitalism3_12.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnVitalism3_12)

            btnVitalism3_12.isSelected = !btnVitalism3_12.isSelected
            skillUnlock3(
                btnVitalism3_4, btnVitalism3_8, btnVitalism3_12,
                btnVitalismPassive3_1, btnVitalismPassive3_2, btnVitalismPassive3_3,
                btnVitalismPassive3_4, btnVitalismPassive3_5, btnVitalismPassive3_6,
                skillPoints2Text, skillTree2Points
            )
        }
        //endregion
        

        //region Malediction1 Button Actions
        btnMalediction1_1.setOnClickListener {
            if (skillPoints <= 0){
                if (btnMalediction1_1.isSelected) {
                    updateButtons1(btnMalediction1_1)
                    btnMalediction1_1.isSelected = !btnMalediction1_1.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnMalediction1_1)

            skillUnlock1(
                btnMalediction1_4, btnMalediction1_8, btnMalediction1_12,
                btnMaledictionPassive1_1, btnMaledictionPassive1_2, btnMaledictionPassive1_3,
                btnMaledictionPassive1_4, btnMaledictionPassive1_5, btnMaledictionPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnMalediction1_1.isSelected = !btnMalediction1_1.isSelected
        }

        btnMalediction1_2.setOnClickListener {
            if (skillPoints <= 0){
                if (btnMalediction1_2.isSelected) {
                    updateButtons1(btnMalediction1_2)
                    btnMalediction1_2.isSelected = !btnMalediction1_2.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnMalediction1_2)

            skillUnlock1(
                btnMalediction1_4, btnMalediction1_8, btnMalediction1_12,
                btnMaledictionPassive1_1, btnMaledictionPassive1_2, btnMaledictionPassive1_3,
                btnMaledictionPassive1_4, btnMaledictionPassive1_5, btnMaledictionPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnMalediction1_2.isSelected = !btnMalediction1_2.isSelected
        }

        btnMalediction1_3.setOnClickListener {
            if (skillPoints <= 0){
                if (btnMalediction1_3.isSelected) {
                    updateButtons1(btnMalediction1_3)
                    btnMalediction1_3.isSelected = !btnMalediction1_3.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnMalediction1_3)

            skillUnlock1(
                btnMalediction1_4, btnMalediction1_8, btnMalediction1_12,
                btnMaledictionPassive1_1, btnMaledictionPassive1_2, btnMaledictionPassive1_3,
                btnMaledictionPassive1_4, btnMaledictionPassive1_5, btnMaledictionPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnMalediction1_3.isSelected = !btnMalediction1_3.isSelected
        }

        btnMalediction1_4.setOnClickListener {
            if (skillPoints <= 0){
                if (btnMalediction1_4.isSelected) {
                    updateButtons1(btnMalediction1_4)
                    btnMalediction1_4.isSelected = !btnMalediction1_4.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnMalediction1_4)

            btnMalediction1_4.isSelected = !btnMalediction1_4.isSelected
            skillUnlock1(
                btnMalediction1_4, btnMalediction1_8, btnMalediction1_12,
                btnMaledictionPassive1_1, btnMaledictionPassive1_2, btnMaledictionPassive1_3,
                btnMaledictionPassive1_4, btnMaledictionPassive1_5, btnMaledictionPassive1_6,
                skillPoints1Text, skillTree1Points
            )
        }

        btnMalediction1_5.setOnClickListener {
            if (skillPoints <= 0){
                if (btnMalediction1_5.isSelected) {
                    updateButtons1(btnMalediction1_5)
                    btnMalediction1_5.isSelected = !btnMalediction1_5.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnMalediction1_5)

            skillUnlock1(
                btnMalediction1_4, btnMalediction1_8, btnMalediction1_12,
                btnMaledictionPassive1_1, btnMaledictionPassive1_2, btnMaledictionPassive1_3,
                btnMaledictionPassive1_4, btnMaledictionPassive1_5, btnMaledictionPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnMalediction1_5.isSelected = !btnMalediction1_5.isSelected
        }

        btnMalediction1_6.setOnClickListener {
            if (skillPoints <= 0){
                if (btnMalediction1_6.isSelected) {
                    updateButtons1(btnMalediction1_6)
                    btnMalediction1_6.isSelected = !btnMalediction1_6.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnMalediction1_6)

            skillUnlock1(
                btnMalediction1_4, btnMalediction1_8, btnMalediction1_12,
                btnMaledictionPassive1_1, btnMaledictionPassive1_2, btnMaledictionPassive1_3,
                btnMaledictionPassive1_4, btnMaledictionPassive1_5, btnMaledictionPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnMalediction1_6.isSelected = !btnMalediction1_6.isSelected
        }

        btnMalediction1_7.setOnClickListener {
            if (skillPoints <= 0){
                if (btnMalediction1_7.isSelected) {
                    updateButtons1(btnMalediction1_7)
                    btnMalediction1_7.isSelected = !btnMalediction1_7.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnMalediction1_7)

            skillUnlock1(
                btnMalediction1_4, btnMalediction1_8, btnMalediction1_12,
                btnMaledictionPassive1_1, btnMaledictionPassive1_2, btnMaledictionPassive1_3,
                btnMaledictionPassive1_4, btnMaledictionPassive1_5, btnMaledictionPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnMalediction1_7.isSelected = !btnMalediction1_7.isSelected
        }

        btnMalediction1_8.setOnClickListener {
            if (skillPoints <= 0){
                if (btnMalediction1_8.isSelected) {
                    updateButtons1(btnMalediction1_8)
                    btnMalediction1_8.isSelected = !btnMalediction1_8.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnMalediction1_8)

            btnMalediction1_8.isSelected = !btnMalediction1_8.isSelected
            skillUnlock1(
                btnMalediction1_4, btnMalediction1_8, btnMalediction1_12,
                btnMaledictionPassive1_1, btnMaledictionPassive1_2, btnMaledictionPassive1_3,
                btnMaledictionPassive1_4, btnMaledictionPassive1_5, btnMaledictionPassive1_6,
                skillPoints1Text, skillTree1Points
            )
        }

        btnMalediction1_9.setOnClickListener {
            if (skillPoints <= 0){
                if (btnMalediction1_9.isSelected) {
                    updateButtons1(btnMalediction1_9)
                    btnMalediction1_9.isSelected = !btnMalediction1_9.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnMalediction1_9)

            skillUnlock1(
                btnMalediction1_4, btnMalediction1_8, btnMalediction1_12,
                btnMaledictionPassive1_1, btnMaledictionPassive1_2, btnMaledictionPassive1_3,
                btnMaledictionPassive1_4, btnMaledictionPassive1_5, btnMaledictionPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnMalediction1_9.isSelected = !btnMalediction1_9.isSelected
        }

        btnMalediction1_10.setOnClickListener {
            if (skillPoints <= 0){
                if (btnMalediction1_10.isSelected) {
                    updateButtons1(btnMalediction1_10)
                    btnMalediction1_10.isSelected = !btnMalediction1_10.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnMalediction1_10)

            skillUnlock1(
                btnMalediction1_4, btnMalediction1_8, btnMalediction1_12,
                btnMaledictionPassive1_1, btnMaledictionPassive1_2, btnMaledictionPassive1_3,
                btnMaledictionPassive1_4, btnMaledictionPassive1_5, btnMaledictionPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnMalediction1_10.isSelected = !btnMalediction1_10.isSelected
        }

        btnMalediction1_11.setOnClickListener {
            if (skillPoints <= 0){
                if (btnMalediction1_11.isSelected) {
                    updateButtons1(btnMalediction1_11)
                    btnMalediction1_11.isSelected = !btnMalediction1_11.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnMalediction1_11)

            skillUnlock1(
                btnMalediction1_4, btnMalediction1_8, btnMalediction1_12,
                btnMaledictionPassive1_1, btnMaledictionPassive1_2, btnMaledictionPassive1_3,
                btnMaledictionPassive1_4, btnMaledictionPassive1_5, btnMaledictionPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnMalediction1_11.isSelected = !btnMalediction1_11.isSelected
        }

        btnMalediction1_12.setOnClickListener {
            if (skillPoints <= 0){
                if (btnMalediction1_12.isSelected) {
                    updateButtons1(btnMalediction1_12)
                    btnMalediction1_12.isSelected = !btnMalediction1_12.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnMalediction1_12)

            btnMalediction1_12.isSelected = !btnMalediction1_12.isSelected
            skillUnlock1(
                btnMalediction1_4, btnMalediction1_8, btnMalediction1_12,
                btnMaledictionPassive1_1, btnMaledictionPassive1_2, btnMaledictionPassive1_3,
                btnMaledictionPassive1_4, btnMaledictionPassive1_5, btnMaledictionPassive1_6,
                skillPoints1Text, skillTree1Points
            )
        }
        //endregion

        //region Malediction2 Button Actions
        btnMalediction2_1.setOnClickListener {
            if (skillPoints <= 0){
                if (btnMalediction2_1.isSelected) {
                    updateButtons2(btnMalediction2_1)
                    btnMalediction2_1.isSelected = !btnMalediction2_1.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnMalediction2_1)

            skillUnlock2(
                btnMalediction2_4, btnMalediction2_8, btnMalediction2_12,
                btnMaledictionPassive2_1, btnMaledictionPassive2_2, btnMaledictionPassive2_3,
                btnMaledictionPassive2_4, btnMaledictionPassive2_5, btnMaledictionPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnMalediction2_1.isSelected = !btnMalediction2_1.isSelected
        }

        btnMalediction2_2.setOnClickListener {
            if (skillPoints <= 0){
                if (btnMalediction2_2.isSelected) {
                    updateButtons2(btnMalediction2_2)
                    btnMalediction2_2.isSelected = !btnMalediction2_2.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnMalediction2_2)

            skillUnlock2(
                btnMalediction2_4, btnMalediction2_8, btnMalediction2_12,
                btnMaledictionPassive2_1, btnMaledictionPassive2_2, btnMaledictionPassive2_3,
                btnMaledictionPassive2_4, btnMaledictionPassive2_5, btnMaledictionPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnMalediction2_2.isSelected = !btnMalediction2_2.isSelected
        }

        btnMalediction2_3.setOnClickListener {
            if (skillPoints <= 0){
                if (btnMalediction2_3.isSelected) {
                    updateButtons2(btnMalediction2_3)
                    btnMalediction2_3.isSelected = !btnMalediction2_3.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnMalediction2_3)

            skillUnlock2(
                btnMalediction2_4, btnMalediction2_8, btnMalediction2_12,
                btnMaledictionPassive2_1, btnMaledictionPassive2_2, btnMaledictionPassive2_3,
                btnMaledictionPassive2_4, btnMaledictionPassive2_5, btnMaledictionPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnMalediction2_3.isSelected = !btnMalediction2_3.isSelected
        }

        btnMalediction2_4.setOnClickListener {
            if (skillPoints <= 0){
                if (btnMalediction2_4.isSelected) {
                    updateButtons2(btnMalediction2_4)
                    btnMalediction2_4.isSelected = !btnMalediction2_4.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnMalediction2_4)

            btnMalediction2_4.isSelected = !btnMalediction2_4.isSelected
            skillUnlock2(
                btnMalediction2_4, btnMalediction2_8, btnMalediction2_12,
                btnMaledictionPassive2_1, btnMaledictionPassive2_2, btnMaledictionPassive2_3,
                btnMaledictionPassive2_4, btnMaledictionPassive2_5, btnMaledictionPassive2_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnMalediction2_5.setOnClickListener {
            if (skillPoints <= 0){
                if (btnMalediction2_5.isSelected) {
                    updateButtons2(btnMalediction2_5)
                    btnMalediction2_5.isSelected = !btnMalediction2_5.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnMalediction2_5)

            skillUnlock2(
                btnMalediction2_4, btnMalediction2_8, btnMalediction2_12,
                btnMaledictionPassive2_1, btnMaledictionPassive2_2, btnMaledictionPassive2_3,
                btnMaledictionPassive2_4, btnMaledictionPassive2_5, btnMaledictionPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnMalediction2_5.isSelected = !btnMalediction2_5.isSelected
        }

        btnMalediction2_6.setOnClickListener {
            if (skillPoints <= 0){
                if (btnMalediction2_6.isSelected) {
                    updateButtons2(btnMalediction2_6)
                    btnMalediction2_6.isSelected = !btnMalediction2_6.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnMalediction2_6)

            skillUnlock2(
                btnMalediction2_4, btnMalediction2_8, btnMalediction2_12,
                btnMaledictionPassive2_1, btnMaledictionPassive2_2, btnMaledictionPassive2_3,
                btnMaledictionPassive2_4, btnMaledictionPassive2_5, btnMaledictionPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnMalediction2_6.isSelected = !btnMalediction2_6.isSelected
        }

        btnMalediction2_7.setOnClickListener {
            if (skillPoints <= 0){
                if (btnMalediction2_7.isSelected) {
                    updateButtons2(btnMalediction2_7)
                    btnMalediction2_7.isSelected = !btnMalediction2_7.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnMalediction2_7)

            skillUnlock2(
                btnMalediction2_4, btnMalediction2_8, btnMalediction2_12,
                btnMaledictionPassive2_1, btnMaledictionPassive2_2, btnMaledictionPassive2_3,
                btnMaledictionPassive2_4, btnMaledictionPassive2_5, btnMaledictionPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnMalediction2_7.isSelected = !btnMalediction2_7.isSelected
        }

        btnMalediction2_8.setOnClickListener {
            if (skillPoints <= 0){
                if (btnMalediction2_8.isSelected) {
                    updateButtons2(btnMalediction2_8)
                    btnMalediction2_8.isSelected = !btnMalediction2_8.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnMalediction2_8)

            btnMalediction2_8.isSelected = !btnMalediction2_8.isSelected
            skillUnlock2(
                btnMalediction2_4, btnMalediction2_8, btnMalediction2_12,
                btnMaledictionPassive2_1, btnMaledictionPassive2_2, btnMaledictionPassive2_3,
                btnMaledictionPassive2_4, btnMaledictionPassive2_5, btnMaledictionPassive2_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnMalediction2_9.setOnClickListener {
            if (skillPoints <= 0){
                if (btnMalediction2_9.isSelected) {
                    updateButtons2(btnMalediction2_9)
                    btnMalediction2_9.isSelected = !btnMalediction2_9.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnMalediction2_9)

            skillUnlock2(
                btnMalediction2_4, btnMalediction2_8, btnMalediction2_12,
                btnMaledictionPassive2_1, btnMaledictionPassive2_2, btnMaledictionPassive2_3,
                btnMaledictionPassive2_4, btnMaledictionPassive2_5, btnMaledictionPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnMalediction2_9.isSelected = !btnMalediction2_9.isSelected
        }

        btnMalediction2_10.setOnClickListener {
            if (skillPoints <= 0){
                if (btnMalediction2_10.isSelected) {
                    updateButtons2(btnMalediction2_10)
                    btnMalediction2_10.isSelected = !btnMalediction2_10.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnMalediction2_10)

            skillUnlock2(
                btnMalediction2_4, btnMalediction2_8, btnMalediction2_12,
                btnMaledictionPassive2_1, btnMaledictionPassive2_2, btnMaledictionPassive2_3,
                btnMaledictionPassive2_4, btnMaledictionPassive2_5, btnMaledictionPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnMalediction2_10.isSelected = !btnMalediction2_10.isSelected
        }

        btnMalediction2_11.setOnClickListener {
            if (skillPoints <= 0){
                if (btnMalediction2_11.isSelected) {
                    updateButtons2(btnMalediction2_11)
                    btnMalediction2_11.isSelected = !btnMalediction2_11.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnMalediction2_11)

            skillUnlock2(
                btnMalediction2_4, btnMalediction2_8, btnMalediction2_12,
                btnMaledictionPassive2_1, btnMaledictionPassive2_2, btnMaledictionPassive2_3,
                btnMaledictionPassive2_4, btnMaledictionPassive2_5, btnMaledictionPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnMalediction2_11.isSelected = !btnMalediction2_11.isSelected
        }

        btnMalediction2_12.setOnClickListener {
            if (skillPoints <= 0){
                if (btnMalediction2_12.isSelected) {
                    updateButtons2(btnMalediction2_12)
                    btnMalediction2_12.isSelected = !btnMalediction2_12.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnMalediction2_12)

            btnMalediction2_12.isSelected = !btnMalediction2_12.isSelected
            skillUnlock2(
                btnMalediction2_4, btnMalediction2_8, btnMalediction2_12,
                btnMaledictionPassive2_1, btnMaledictionPassive2_2, btnMaledictionPassive2_3,
                btnMaledictionPassive2_4, btnMaledictionPassive2_5, btnMaledictionPassive2_6,
                skillPoints2Text, skillTree2Points
            )
        }
        //endregion

        //region Malediction3 Button Actions
        btnMalediction3_1.setOnClickListener {
            if (skillPoints <= 0){
                if (btnMalediction3_1.isSelected) {
                    updateButtons3(btnMalediction3_1)
                    btnMalediction3_1.isSelected = !btnMalediction3_1.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnMalediction3_1)

            skillUnlock3(
                btnMalediction3_4, btnMalediction3_8, btnMalediction3_12,
                btnMaledictionPassive3_1, btnMaledictionPassive3_2, btnMaledictionPassive3_3,
                btnMaledictionPassive3_4, btnMaledictionPassive3_5, btnMaledictionPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnMalediction3_1.isSelected = !btnMalediction3_1.isSelected
        }

        btnMalediction3_2.setOnClickListener {
            if (skillPoints <= 0){
                if (btnMalediction3_2.isSelected) {
                    updateButtons3(btnMalediction3_2)
                    btnMalediction3_2.isSelected = !btnMalediction3_2.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnMalediction3_2)

            skillUnlock3(
                btnMalediction3_4, btnMalediction3_8, btnMalediction3_12,
                btnMaledictionPassive3_1, btnMaledictionPassive3_2, btnMaledictionPassive3_3,
                btnMaledictionPassive3_4, btnMaledictionPassive3_5, btnMaledictionPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnMalediction3_2.isSelected = !btnMalediction3_2.isSelected
        }

        btnMalediction3_3.setOnClickListener {
            if (skillPoints <= 0){
                if (btnMalediction3_3.isSelected) {
                    updateButtons3(btnMalediction3_3)
                    btnMalediction3_3.isSelected = !btnMalediction3_3.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnMalediction3_3)

            skillUnlock3(
                btnMalediction3_4, btnMalediction3_8, btnMalediction3_12,
                btnMaledictionPassive3_1, btnMaledictionPassive3_2, btnMaledictionPassive3_3,
                btnMaledictionPassive3_4, btnMaledictionPassive3_5, btnMaledictionPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnMalediction3_3.isSelected = !btnMalediction3_3.isSelected
        }

        btnMalediction3_4.setOnClickListener {
            if (skillPoints <= 0){
                if (btnMalediction3_4.isSelected) {
                    updateButtons3(btnMalediction3_4)
                    btnMalediction3_4.isSelected = !btnMalediction3_4.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnMalediction3_4)

            btnMalediction3_4.isSelected = !btnMalediction3_4.isSelected
            skillUnlock3(
                btnMalediction3_4, btnMalediction3_8, btnMalediction3_12,
                btnMaledictionPassive3_1, btnMaledictionPassive3_2, btnMaledictionPassive3_3,
                btnMaledictionPassive3_4, btnMaledictionPassive3_5, btnMaledictionPassive3_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnMalediction3_5.setOnClickListener {
            if (skillPoints <= 0){
                if (btnMalediction3_5.isSelected) {
                    updateButtons3(btnMalediction3_5)
                    btnMalediction3_5.isSelected = !btnMalediction3_5.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnMalediction3_5)

            skillUnlock3(
                btnMalediction3_4, btnMalediction3_8, btnMalediction3_12,
                btnMaledictionPassive3_1, btnMaledictionPassive3_2, btnMaledictionPassive3_3,
                btnMaledictionPassive3_4, btnMaledictionPassive3_5, btnMaledictionPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnMalediction3_5.isSelected = !btnMalediction3_5.isSelected
        }

        btnMalediction3_6.setOnClickListener {
            if (skillPoints <= 0){
                if (btnMalediction3_6.isSelected) {
                    updateButtons3(btnMalediction3_6)
                    btnMalediction3_6.isSelected = !btnMalediction3_6.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnMalediction3_6)

            skillUnlock3(
                btnMalediction3_4, btnMalediction3_8, btnMalediction3_12,
                btnMaledictionPassive3_1, btnMaledictionPassive3_2, btnMaledictionPassive3_3,
                btnMaledictionPassive3_4, btnMaledictionPassive3_5, btnMaledictionPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnMalediction3_6.isSelected = !btnMalediction3_6.isSelected
        }

        btnMalediction3_7.setOnClickListener {
            if (skillPoints <= 0){
                if (btnMalediction3_7.isSelected) {
                    updateButtons3(btnMalediction3_7)
                    btnMalediction3_7.isSelected = !btnMalediction3_7.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnMalediction3_7)

            skillUnlock3(
                btnMalediction3_4, btnMalediction3_8, btnMalediction3_12,
                btnMaledictionPassive3_1, btnMaledictionPassive3_2, btnMaledictionPassive3_3,
                btnMaledictionPassive3_4, btnMaledictionPassive3_5, btnMaledictionPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnMalediction3_7.isSelected = !btnMalediction3_7.isSelected
        }

        btnMalediction3_8.setOnClickListener {
            if (skillPoints <= 0){
                if (btnMalediction3_8.isSelected) {
                    updateButtons3(btnMalediction3_8)
                    btnMalediction3_8.isSelected = !btnMalediction3_8.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnMalediction3_8)

            btnMalediction3_8.isSelected = !btnMalediction3_8.isSelected
            skillUnlock3(
                btnMalediction3_4, btnMalediction3_8, btnMalediction3_12,
                btnMaledictionPassive3_1, btnMaledictionPassive3_2, btnMaledictionPassive3_3,
                btnMaledictionPassive3_4, btnMaledictionPassive3_5, btnMaledictionPassive3_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnMalediction3_9.setOnClickListener {
            if (skillPoints <= 0){
                if (btnMalediction3_9.isSelected) {
                    updateButtons3(btnMalediction3_9)
                    btnMalediction3_9.isSelected = !btnMalediction3_9.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnMalediction3_9)

            skillUnlock3(
                btnMalediction3_4, btnMalediction3_8, btnMalediction3_12,
                btnMaledictionPassive3_1, btnMaledictionPassive3_2, btnMaledictionPassive3_3,
                btnMaledictionPassive3_4, btnMaledictionPassive3_5, btnMaledictionPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnMalediction3_9.isSelected = !btnMalediction3_9.isSelected
        }

        btnMalediction3_10.setOnClickListener {
            if (skillPoints <= 0){
                if (btnMalediction3_10.isSelected) {
                    updateButtons3(btnMalediction3_10)
                    btnMalediction3_10.isSelected = !btnMalediction3_10.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnMalediction3_10)

            skillUnlock3(
                btnMalediction3_4, btnMalediction3_8, btnMalediction3_12,
                btnMaledictionPassive3_1, btnMaledictionPassive3_2, btnMaledictionPassive3_3,
                btnMaledictionPassive3_4, btnMaledictionPassive3_5, btnMaledictionPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnMalediction3_10.isSelected = !btnMalediction3_10.isSelected
        }

        btnMalediction3_11.setOnClickListener {
            if (skillPoints <= 0){
                if (btnMalediction3_11.isSelected) {
                    updateButtons3(btnMalediction3_11)
                    btnMalediction3_11.isSelected = !btnMalediction3_11.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnMalediction3_11)

            skillUnlock3(
                btnMalediction3_4, btnMalediction3_8, btnMalediction3_12,
                btnMaledictionPassive3_1, btnMaledictionPassive3_2, btnMaledictionPassive3_3,
                btnMaledictionPassive3_4, btnMaledictionPassive3_5, btnMaledictionPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnMalediction3_11.isSelected = !btnMalediction3_11.isSelected
        }

        btnMalediction3_12.setOnClickListener {
            if (skillPoints <= 0){
                if (btnMalediction3_12.isSelected) {
                    updateButtons3(btnMalediction3_12)
                    btnMalediction3_12.isSelected = !btnMalediction3_12.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnMalediction3_12)

            btnMalediction3_12.isSelected = !btnMalediction3_12.isSelected
            skillUnlock3(
                btnMalediction3_4, btnMalediction3_8, btnMalediction3_12,
                btnMaledictionPassive3_1, btnMaledictionPassive3_2, btnMaledictionPassive3_3,
                btnMaledictionPassive3_4, btnMaledictionPassive3_5, btnMaledictionPassive3_6,
                skillPoints2Text, skillTree2Points
            )
        }
        //endregion
        

        //region Swiftblade1 Button Actions
        btnSwiftblade1_1.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSwiftblade1_1.isSelected) {
                    updateButtons1(btnSwiftblade1_1)
                    btnSwiftblade1_1.isSelected = !btnSwiftblade1_1.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSwiftblade1_1)

            skillUnlock1(
                btnSwiftblade1_4, btnSwiftblade1_8, btnSwiftblade1_12,
                btnSwiftbladePassive1_1, btnSwiftbladePassive1_2, btnSwiftbladePassive1_3,
                btnSwiftbladePassive1_4, btnSwiftbladePassive1_5, btnSwiftbladePassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnSwiftblade1_1.isSelected = !btnSwiftblade1_1.isSelected
        }

        btnSwiftblade1_2.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSwiftblade1_2.isSelected) {
                    updateButtons1(btnSwiftblade1_2)
                    btnSwiftblade1_2.isSelected = !btnSwiftblade1_2.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSwiftblade1_2)

            skillUnlock1(
                btnSwiftblade1_4, btnSwiftblade1_8, btnSwiftblade1_12,
                btnSwiftbladePassive1_1, btnSwiftbladePassive1_2, btnSwiftbladePassive1_3,
                btnSwiftbladePassive1_4, btnSwiftbladePassive1_5, btnSwiftbladePassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnSwiftblade1_2.isSelected = !btnSwiftblade1_2.isSelected
        }

        btnSwiftblade1_3.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSwiftblade1_3.isSelected) {
                    updateButtons1(btnSwiftblade1_3)
                    btnSwiftblade1_3.isSelected = !btnSwiftblade1_3.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSwiftblade1_3)

            skillUnlock1(
                btnSwiftblade1_4, btnSwiftblade1_8, btnSwiftblade1_12,
                btnSwiftbladePassive1_1, btnSwiftbladePassive1_2, btnSwiftbladePassive1_3,
                btnSwiftbladePassive1_4, btnSwiftbladePassive1_5, btnSwiftbladePassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnSwiftblade1_3.isSelected = !btnSwiftblade1_3.isSelected
        }

        btnSwiftblade1_4.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSwiftblade1_4.isSelected) {
                    updateButtons1(btnSwiftblade1_4)
                    btnSwiftblade1_4.isSelected = !btnSwiftblade1_4.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSwiftblade1_4)

            btnSwiftblade1_4.isSelected = !btnSwiftblade1_4.isSelected
            skillUnlock1(
                btnSwiftblade1_4, btnSwiftblade1_8, btnSwiftblade1_12,
                btnSwiftbladePassive1_1, btnSwiftbladePassive1_2, btnSwiftbladePassive1_3,
                btnSwiftbladePassive1_4, btnSwiftbladePassive1_5, btnSwiftbladePassive1_6,
                skillPoints1Text, skillTree1Points
            )
        }

        btnSwiftblade1_5.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSwiftblade1_5.isSelected) {
                    updateButtons1(btnSwiftblade1_5)
                    btnSwiftblade1_5.isSelected = !btnSwiftblade1_5.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSwiftblade1_5)

            skillUnlock1(
                btnSwiftblade1_4, btnSwiftblade1_8, btnSwiftblade1_12,
                btnSwiftbladePassive1_1, btnSwiftbladePassive1_2, btnSwiftbladePassive1_3,
                btnSwiftbladePassive1_4, btnSwiftbladePassive1_5, btnSwiftbladePassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnSwiftblade1_5.isSelected = !btnSwiftblade1_5.isSelected
        }

        btnSwiftblade1_6.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSwiftblade1_6.isSelected) {
                    updateButtons1(btnSwiftblade1_6)
                    btnSwiftblade1_6.isSelected = !btnSwiftblade1_6.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSwiftblade1_6)

            skillUnlock1(
                btnSwiftblade1_4, btnSwiftblade1_8, btnSwiftblade1_12,
                btnSwiftbladePassive1_1, btnSwiftbladePassive1_2, btnSwiftbladePassive1_3,
                btnSwiftbladePassive1_4, btnSwiftbladePassive1_5, btnSwiftbladePassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnSwiftblade1_6.isSelected = !btnSwiftblade1_6.isSelected
        }

        btnSwiftblade1_7.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSwiftblade1_7.isSelected) {
                    updateButtons1(btnSwiftblade1_7)
                    btnSwiftblade1_7.isSelected = !btnSwiftblade1_7.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSwiftblade1_7)

            skillUnlock1(
                btnSwiftblade1_4, btnSwiftblade1_8, btnSwiftblade1_12,
                btnSwiftbladePassive1_1, btnSwiftbladePassive1_2, btnSwiftbladePassive1_3,
                btnSwiftbladePassive1_4, btnSwiftbladePassive1_5, btnSwiftbladePassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnSwiftblade1_7.isSelected = !btnSwiftblade1_7.isSelected
        }

        btnSwiftblade1_8.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSwiftblade1_8.isSelected) {
                    updateButtons1(btnSwiftblade1_8)
                    btnSwiftblade1_8.isSelected = !btnSwiftblade1_8.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSwiftblade1_8)

            btnSwiftblade1_8.isSelected = !btnSwiftblade1_8.isSelected
            skillUnlock1(
                btnSwiftblade1_4, btnSwiftblade1_8, btnSwiftblade1_12,
                btnSwiftbladePassive1_1, btnSwiftbladePassive1_2, btnSwiftbladePassive1_3,
                btnSwiftbladePassive1_4, btnSwiftbladePassive1_5, btnSwiftbladePassive1_6,
                skillPoints1Text, skillTree1Points
            )
        }

        btnSwiftblade1_9.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSwiftblade1_9.isSelected) {
                    updateButtons1(btnSwiftblade1_9)
                    btnSwiftblade1_9.isSelected = !btnSwiftblade1_9.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSwiftblade1_9)

            skillUnlock1(
                btnSwiftblade1_4, btnSwiftblade1_8, btnSwiftblade1_12,
                btnSwiftbladePassive1_1, btnSwiftbladePassive1_2, btnSwiftbladePassive1_3,
                btnSwiftbladePassive1_4, btnSwiftbladePassive1_5, btnSwiftbladePassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnSwiftblade1_9.isSelected = !btnSwiftblade1_9.isSelected
        }

        btnSwiftblade1_10.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSwiftblade1_10.isSelected) {
                    updateButtons1(btnSwiftblade1_10)
                    btnSwiftblade1_10.isSelected = !btnSwiftblade1_10.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSwiftblade1_10)

            skillUnlock1(
                btnSwiftblade1_4, btnSwiftblade1_8, btnSwiftblade1_12,
                btnSwiftbladePassive1_1, btnSwiftbladePassive1_2, btnSwiftbladePassive1_3,
                btnSwiftbladePassive1_4, btnSwiftbladePassive1_5, btnSwiftbladePassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnSwiftblade1_10.isSelected = !btnSwiftblade1_10.isSelected
        }

        btnSwiftblade1_11.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSwiftblade1_11.isSelected) {
                    updateButtons1(btnSwiftblade1_11)
                    btnSwiftblade1_11.isSelected = !btnSwiftblade1_11.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSwiftblade1_11)

            skillUnlock1(
                btnSwiftblade1_4, btnSwiftblade1_8, btnSwiftblade1_12,
                btnSwiftbladePassive1_1, btnSwiftbladePassive1_2, btnSwiftbladePassive1_3,
                btnSwiftbladePassive1_4, btnSwiftbladePassive1_5, btnSwiftbladePassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnSwiftblade1_11.isSelected = !btnSwiftblade1_11.isSelected
        }

        btnSwiftblade1_12.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSwiftblade1_12.isSelected) {
                    updateButtons1(btnSwiftblade1_12)
                    btnSwiftblade1_12.isSelected = !btnSwiftblade1_12.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSwiftblade1_12)

            btnSwiftblade1_12.isSelected = !btnSwiftblade1_12.isSelected
            skillUnlock1(
                btnSwiftblade1_4, btnSwiftblade1_8, btnSwiftblade1_12,
                btnSwiftbladePassive1_1, btnSwiftbladePassive1_2, btnSwiftbladePassive1_3,
                btnSwiftbladePassive1_4, btnSwiftbladePassive1_5, btnSwiftbladePassive1_6,
                skillPoints1Text, skillTree1Points
            )
        }
        //endregion

        //region Swiftblade2 Button Actions
        btnSwiftblade2_1.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSwiftblade2_1.isSelected) {
                    updateButtons2(btnSwiftblade2_1)
                    btnSwiftblade2_1.isSelected = !btnSwiftblade2_1.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSwiftblade2_1)

            skillUnlock2(
                btnSwiftblade2_4, btnSwiftblade2_8, btnSwiftblade2_12,
                btnSwiftbladePassive2_1, btnSwiftbladePassive2_2, btnSwiftbladePassive2_3,
                btnSwiftbladePassive2_4, btnSwiftbladePassive2_5, btnSwiftbladePassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnSwiftblade2_1.isSelected = !btnSwiftblade2_1.isSelected
        }

        btnSwiftblade2_2.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSwiftblade2_2.isSelected) {
                    updateButtons2(btnSwiftblade2_2)
                    btnSwiftblade2_2.isSelected = !btnSwiftblade2_2.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSwiftblade2_2)

            skillUnlock2(
                btnSwiftblade2_4, btnSwiftblade2_8, btnSwiftblade2_12,
                btnSwiftbladePassive2_1, btnSwiftbladePassive2_2, btnSwiftbladePassive2_3,
                btnSwiftbladePassive2_4, btnSwiftbladePassive2_5, btnSwiftbladePassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnSwiftblade2_2.isSelected = !btnSwiftblade2_2.isSelected
        }

        btnSwiftblade2_3.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSwiftblade2_3.isSelected) {
                    updateButtons2(btnSwiftblade2_3)
                    btnSwiftblade2_3.isSelected = !btnSwiftblade2_3.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSwiftblade2_3)

            skillUnlock2(
                btnSwiftblade2_4, btnSwiftblade2_8, btnSwiftblade2_12,
                btnSwiftbladePassive2_1, btnSwiftbladePassive2_2, btnSwiftbladePassive2_3,
                btnSwiftbladePassive2_4, btnSwiftbladePassive2_5, btnSwiftbladePassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnSwiftblade2_3.isSelected = !btnSwiftblade2_3.isSelected
        }

        btnSwiftblade2_4.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSwiftblade2_4.isSelected) {
                    updateButtons2(btnSwiftblade2_4)
                    btnSwiftblade2_4.isSelected = !btnSwiftblade2_4.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSwiftblade2_4)

            btnSwiftblade2_4.isSelected = !btnSwiftblade2_4.isSelected
            skillUnlock2(
                btnSwiftblade2_4, btnSwiftblade2_8, btnSwiftblade2_12,
                btnSwiftbladePassive2_1, btnSwiftbladePassive2_2, btnSwiftbladePassive2_3,
                btnSwiftbladePassive2_4, btnSwiftbladePassive2_5, btnSwiftbladePassive2_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnSwiftblade2_5.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSwiftblade2_5.isSelected) {
                    updateButtons2(btnSwiftblade2_5)
                    btnSwiftblade2_5.isSelected = !btnSwiftblade2_5.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSwiftblade2_5)

            skillUnlock2(
                btnSwiftblade2_4, btnSwiftblade2_8, btnSwiftblade2_12,
                btnSwiftbladePassive2_1, btnSwiftbladePassive2_2, btnSwiftbladePassive2_3,
                btnSwiftbladePassive2_4, btnSwiftbladePassive2_5, btnSwiftbladePassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnSwiftblade2_5.isSelected = !btnSwiftblade2_5.isSelected
        }

        btnSwiftblade2_6.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSwiftblade2_6.isSelected) {
                    updateButtons2(btnSwiftblade2_6)
                    btnSwiftblade2_6.isSelected = !btnSwiftblade2_6.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSwiftblade2_6)

            skillUnlock2(
                btnSwiftblade2_4, btnSwiftblade2_8, btnSwiftblade2_12,
                btnSwiftbladePassive2_1, btnSwiftbladePassive2_2, btnSwiftbladePassive2_3,
                btnSwiftbladePassive2_4, btnSwiftbladePassive2_5, btnSwiftbladePassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnSwiftblade2_6.isSelected = !btnSwiftblade2_6.isSelected
        }

        btnSwiftblade2_7.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSwiftblade2_7.isSelected) {
                    updateButtons2(btnSwiftblade2_7)
                    btnSwiftblade2_7.isSelected = !btnSwiftblade2_7.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSwiftblade2_7)

            skillUnlock2(
                btnSwiftblade2_4, btnSwiftblade2_8, btnSwiftblade2_12,
                btnSwiftbladePassive2_1, btnSwiftbladePassive2_2, btnSwiftbladePassive2_3,
                btnSwiftbladePassive2_4, btnSwiftbladePassive2_5, btnSwiftbladePassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnSwiftblade2_7.isSelected = !btnSwiftblade2_7.isSelected
        }

        btnSwiftblade2_8.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSwiftblade2_8.isSelected) {
                    updateButtons2(btnSwiftblade2_8)
                    btnSwiftblade2_8.isSelected = !btnSwiftblade2_8.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSwiftblade2_8)

            btnSwiftblade2_8.isSelected = !btnSwiftblade2_8.isSelected
            skillUnlock2(
                btnSwiftblade2_4, btnSwiftblade2_8, btnSwiftblade2_12,
                btnSwiftbladePassive2_1, btnSwiftbladePassive2_2, btnSwiftbladePassive2_3,
                btnSwiftbladePassive2_4, btnSwiftbladePassive2_5, btnSwiftbladePassive2_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnSwiftblade2_9.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSwiftblade2_9.isSelected) {
                    updateButtons2(btnSwiftblade2_9)
                    btnSwiftblade2_9.isSelected = !btnSwiftblade2_9.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSwiftblade2_9)

            skillUnlock2(
                btnSwiftblade2_4, btnSwiftblade2_8, btnSwiftblade2_12,
                btnSwiftbladePassive2_1, btnSwiftbladePassive2_2, btnSwiftbladePassive2_3,
                btnSwiftbladePassive2_4, btnSwiftbladePassive2_5, btnSwiftbladePassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnSwiftblade2_9.isSelected = !btnSwiftblade2_9.isSelected
        }

        btnSwiftblade2_10.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSwiftblade2_10.isSelected) {
                    updateButtons2(btnSwiftblade2_10)
                    btnSwiftblade2_10.isSelected = !btnSwiftblade2_10.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSwiftblade2_10)

            skillUnlock2(
                btnSwiftblade2_4, btnSwiftblade2_8, btnSwiftblade2_12,
                btnSwiftbladePassive2_1, btnSwiftbladePassive2_2, btnSwiftbladePassive2_3,
                btnSwiftbladePassive2_4, btnSwiftbladePassive2_5, btnSwiftbladePassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnSwiftblade2_10.isSelected = !btnSwiftblade2_10.isSelected
        }

        btnSwiftblade2_11.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSwiftblade2_11.isSelected) {
                    updateButtons2(btnSwiftblade2_11)
                    btnSwiftblade2_11.isSelected = !btnSwiftblade2_11.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSwiftblade2_11)

            skillUnlock2(
                btnSwiftblade2_4, btnSwiftblade2_8, btnSwiftblade2_12,
                btnSwiftbladePassive2_1, btnSwiftbladePassive2_2, btnSwiftbladePassive2_3,
                btnSwiftbladePassive2_4, btnSwiftbladePassive2_5, btnSwiftbladePassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnSwiftblade2_11.isSelected = !btnSwiftblade2_11.isSelected
        }

        btnSwiftblade2_12.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSwiftblade2_12.isSelected) {
                    updateButtons2(btnSwiftblade2_12)
                    btnSwiftblade2_12.isSelected = !btnSwiftblade2_12.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSwiftblade2_12)

            btnSwiftblade2_12.isSelected = !btnSwiftblade2_12.isSelected
            skillUnlock2(
                btnSwiftblade2_4, btnSwiftblade2_8, btnSwiftblade2_12,
                btnSwiftbladePassive2_1, btnSwiftbladePassive2_2, btnSwiftbladePassive2_3,
                btnSwiftbladePassive2_4, btnSwiftbladePassive2_5, btnSwiftbladePassive2_6,
                skillPoints2Text, skillTree2Points
            )
        }
        //endregion

        //region Swiftblade3 Button Actions
        btnSwiftblade3_1.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSwiftblade3_1.isSelected) {
                    updateButtons3(btnSwiftblade3_1)
                    btnSwiftblade3_1.isSelected = !btnSwiftblade3_1.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSwiftblade3_1)

            skillUnlock3(
                btnSwiftblade3_4, btnSwiftblade3_8, btnSwiftblade3_12,
                btnSwiftbladePassive3_1, btnSwiftbladePassive3_2, btnSwiftbladePassive3_3,
                btnSwiftbladePassive3_4, btnSwiftbladePassive3_5, btnSwiftbladePassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnSwiftblade3_1.isSelected = !btnSwiftblade3_1.isSelected
        }

        btnSwiftblade3_2.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSwiftblade3_2.isSelected) {
                    updateButtons3(btnSwiftblade3_2)
                    btnSwiftblade3_2.isSelected = !btnSwiftblade3_2.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSwiftblade3_2)

            skillUnlock3(
                btnSwiftblade3_4, btnSwiftblade3_8, btnSwiftblade3_12,
                btnSwiftbladePassive3_1, btnSwiftbladePassive3_2, btnSwiftbladePassive3_3,
                btnSwiftbladePassive3_4, btnSwiftbladePassive3_5, btnSwiftbladePassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnSwiftblade3_2.isSelected = !btnSwiftblade3_2.isSelected
        }

        btnSwiftblade3_3.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSwiftblade3_3.isSelected) {
                    updateButtons3(btnSwiftblade3_3)
                    btnSwiftblade3_3.isSelected = !btnSwiftblade3_3.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSwiftblade3_3)

            skillUnlock3(
                btnSwiftblade3_4, btnSwiftblade3_8, btnSwiftblade3_12,
                btnSwiftbladePassive3_1, btnSwiftbladePassive3_2, btnSwiftbladePassive3_3,
                btnSwiftbladePassive3_4, btnSwiftbladePassive3_5, btnSwiftbladePassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnSwiftblade3_3.isSelected = !btnSwiftblade3_3.isSelected
        }

        btnSwiftblade3_4.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSwiftblade3_4.isSelected) {
                    updateButtons3(btnSwiftblade3_4)
                    btnSwiftblade3_4.isSelected = !btnSwiftblade3_4.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSwiftblade3_4)

            btnSwiftblade3_4.isSelected = !btnSwiftblade3_4.isSelected
            skillUnlock3(
                btnSwiftblade3_4, btnSwiftblade3_8, btnSwiftblade3_12,
                btnSwiftbladePassive3_1, btnSwiftbladePassive3_2, btnSwiftbladePassive3_3,
                btnSwiftbladePassive3_4, btnSwiftbladePassive3_5, btnSwiftbladePassive3_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnSwiftblade3_5.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSwiftblade3_5.isSelected) {
                    updateButtons3(btnSwiftblade3_5)
                    btnSwiftblade3_5.isSelected = !btnSwiftblade3_5.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSwiftblade3_5)

            skillUnlock3(
                btnSwiftblade3_4, btnSwiftblade3_8, btnSwiftblade3_12,
                btnSwiftbladePassive3_1, btnSwiftbladePassive3_2, btnSwiftbladePassive3_3,
                btnSwiftbladePassive3_4, btnSwiftbladePassive3_5, btnSwiftbladePassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnSwiftblade3_5.isSelected = !btnSwiftblade3_5.isSelected
        }

        btnSwiftblade3_6.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSwiftblade3_6.isSelected) {
                    updateButtons3(btnSwiftblade3_6)
                    btnSwiftblade3_6.isSelected = !btnSwiftblade3_6.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSwiftblade3_6)

            skillUnlock3(
                btnSwiftblade3_4, btnSwiftblade3_8, btnSwiftblade3_12,
                btnSwiftbladePassive3_1, btnSwiftbladePassive3_2, btnSwiftbladePassive3_3,
                btnSwiftbladePassive3_4, btnSwiftbladePassive3_5, btnSwiftbladePassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnSwiftblade3_6.isSelected = !btnSwiftblade3_6.isSelected
        }

        btnSwiftblade3_7.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSwiftblade3_7.isSelected) {
                    updateButtons3(btnSwiftblade3_7)
                    btnSwiftblade3_7.isSelected = !btnSwiftblade3_7.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSwiftblade3_7)

            skillUnlock3(
                btnSwiftblade3_4, btnSwiftblade3_8, btnSwiftblade3_12,
                btnSwiftbladePassive3_1, btnSwiftbladePassive3_2, btnSwiftbladePassive3_3,
                btnSwiftbladePassive3_4, btnSwiftbladePassive3_5, btnSwiftbladePassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnSwiftblade3_7.isSelected = !btnSwiftblade3_7.isSelected
        }

        btnSwiftblade3_8.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSwiftblade3_8.isSelected) {
                    updateButtons3(btnSwiftblade3_8)
                    btnSwiftblade3_8.isSelected = !btnSwiftblade3_8.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSwiftblade3_8)

            btnSwiftblade3_8.isSelected = !btnSwiftblade3_8.isSelected
            skillUnlock3(
                btnSwiftblade3_4, btnSwiftblade3_8, btnSwiftblade3_12,
                btnSwiftbladePassive3_1, btnSwiftbladePassive3_2, btnSwiftbladePassive3_3,
                btnSwiftbladePassive3_4, btnSwiftbladePassive3_5, btnSwiftbladePassive3_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnSwiftblade3_9.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSwiftblade3_9.isSelected) {
                    updateButtons3(btnSwiftblade3_9)
                    btnSwiftblade3_9.isSelected = !btnSwiftblade3_9.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSwiftblade3_9)

            skillUnlock3(
                btnSwiftblade3_4, btnSwiftblade3_8, btnSwiftblade3_12,
                btnSwiftbladePassive3_1, btnSwiftbladePassive3_2, btnSwiftbladePassive3_3,
                btnSwiftbladePassive3_4, btnSwiftbladePassive3_5, btnSwiftbladePassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnSwiftblade3_9.isSelected = !btnSwiftblade3_9.isSelected
        }

        btnSwiftblade3_10.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSwiftblade3_10.isSelected) {
                    updateButtons3(btnSwiftblade3_10)
                    btnSwiftblade3_10.isSelected = !btnSwiftblade3_10.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSwiftblade3_10)

            skillUnlock3(
                btnSwiftblade3_4, btnSwiftblade3_8, btnSwiftblade3_12,
                btnSwiftbladePassive3_1, btnSwiftbladePassive3_2, btnSwiftbladePassive3_3,
                btnSwiftbladePassive3_4, btnSwiftbladePassive3_5, btnSwiftbladePassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnSwiftblade3_10.isSelected = !btnSwiftblade3_10.isSelected
        }

        btnSwiftblade3_11.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSwiftblade3_11.isSelected) {
                    updateButtons3(btnSwiftblade3_11)
                    btnSwiftblade3_11.isSelected = !btnSwiftblade3_11.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSwiftblade3_11)

            skillUnlock3(
                btnSwiftblade3_4, btnSwiftblade3_8, btnSwiftblade3_12,
                btnSwiftbladePassive3_1, btnSwiftbladePassive3_2, btnSwiftbladePassive3_3,
                btnSwiftbladePassive3_4, btnSwiftbladePassive3_5, btnSwiftbladePassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnSwiftblade3_11.isSelected = !btnSwiftblade3_11.isSelected
        }

        btnSwiftblade3_12.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSwiftblade3_12.isSelected) {
                    updateButtons3(btnSwiftblade3_12)
                    btnSwiftblade3_12.isSelected = !btnSwiftblade3_12.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSwiftblade3_12)

            btnSwiftblade3_12.isSelected = !btnSwiftblade3_12.isSelected
            skillUnlock3(
                btnSwiftblade3_4, btnSwiftblade3_8, btnSwiftblade3_12,
                btnSwiftbladePassive3_1, btnSwiftbladePassive3_2, btnSwiftbladePassive3_3,
                btnSwiftbladePassive3_4, btnSwiftbladePassive3_5, btnSwiftbladePassive3_6,
                skillPoints2Text, skillTree2Points
            )
        }
        //endregion
        

        //region Gunslinger1 Button Actions
        btnGunslinger1_1.setOnClickListener {
            if (skillPoints <= 0){
                if (btnGunslinger1_1.isSelected) {
                    updateButtons1(btnGunslinger1_1)
                    btnGunslinger1_1.isSelected = !btnGunslinger1_1.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnGunslinger1_1)

            skillUnlock1(
                btnGunslinger1_4, btnGunslinger1_8, btnGunslinger1_12,
                btnGunslingerPassive1_1, btnGunslingerPassive1_2, btnGunslingerPassive1_3,
                btnGunslingerPassive1_4, btnGunslingerPassive1_5, btnGunslingerPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnGunslinger1_1.isSelected = !btnGunslinger1_1.isSelected
        }

        btnGunslinger1_2.setOnClickListener {
            if (skillPoints <= 0){
                if (btnGunslinger1_2.isSelected) {
                    updateButtons1(btnGunslinger1_2)
                    btnGunslinger1_2.isSelected = !btnGunslinger1_2.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnGunslinger1_2)

            skillUnlock1(
                btnGunslinger1_4, btnGunslinger1_8, btnGunslinger1_12,
                btnGunslingerPassive1_1, btnGunslingerPassive1_2, btnGunslingerPassive1_3,
                btnGunslingerPassive1_4, btnGunslingerPassive1_5, btnGunslingerPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnGunslinger1_2.isSelected = !btnGunslinger1_2.isSelected
        }

        btnGunslinger1_3.setOnClickListener {
            if (skillPoints <= 0){
                if (btnGunslinger1_3.isSelected) {
                    updateButtons1(btnGunslinger1_3)
                    btnGunslinger1_3.isSelected = !btnGunslinger1_3.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnGunslinger1_3)

            skillUnlock1(
                btnGunslinger1_4, btnGunslinger1_8, btnGunslinger1_12,
                btnGunslingerPassive1_1, btnGunslingerPassive1_2, btnGunslingerPassive1_3,
                btnGunslingerPassive1_4, btnGunslingerPassive1_5, btnGunslingerPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnGunslinger1_3.isSelected = !btnGunslinger1_3.isSelected
        }

        btnGunslinger1_4.setOnClickListener {
            if (skillPoints <= 0){
                if (btnGunslinger1_4.isSelected) {
                    updateButtons1(btnGunslinger1_4)
                    btnGunslinger1_4.isSelected = !btnGunslinger1_4.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnGunslinger1_4)

            btnGunslinger1_4.isSelected = !btnGunslinger1_4.isSelected
            skillUnlock1(
                btnGunslinger1_4, btnGunslinger1_8, btnGunslinger1_12,
                btnGunslingerPassive1_1, btnGunslingerPassive1_2, btnGunslingerPassive1_3,
                btnGunslingerPassive1_4, btnGunslingerPassive1_5, btnGunslingerPassive1_6,
                skillPoints1Text, skillTree1Points
            )
        }

        btnGunslinger1_5.setOnClickListener {
            if (skillPoints <= 0){
                if (btnGunslinger1_5.isSelected) {
                    updateButtons1(btnGunslinger1_5)
                    btnGunslinger1_5.isSelected = !btnGunslinger1_5.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnGunslinger1_5)

            skillUnlock1(
                btnGunslinger1_4, btnGunslinger1_8, btnGunslinger1_12,
                btnGunslingerPassive1_1, btnGunslingerPassive1_2, btnGunslingerPassive1_3,
                btnGunslingerPassive1_4, btnGunslingerPassive1_5, btnGunslingerPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnGunslinger1_5.isSelected = !btnGunslinger1_5.isSelected
        }

        btnGunslinger1_6.setOnClickListener {
            if (skillPoints <= 0){
                if (btnGunslinger1_6.isSelected) {
                    updateButtons1(btnGunslinger1_6)
                    btnGunslinger1_6.isSelected = !btnGunslinger1_6.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnGunslinger1_6)

            skillUnlock1(
                btnGunslinger1_4, btnGunslinger1_8, btnGunslinger1_12,
                btnGunslingerPassive1_1, btnGunslingerPassive1_2, btnGunslingerPassive1_3,
                btnGunslingerPassive1_4, btnGunslingerPassive1_5, btnGunslingerPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnGunslinger1_6.isSelected = !btnGunslinger1_6.isSelected
        }

        btnGunslinger1_7.setOnClickListener {
            if (skillPoints <= 0){
                if (btnGunslinger1_7.isSelected) {
                    updateButtons1(btnGunslinger1_7)
                    btnGunslinger1_7.isSelected = !btnGunslinger1_7.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnGunslinger1_7)

            skillUnlock1(
                btnGunslinger1_4, btnGunslinger1_8, btnGunslinger1_12,
                btnGunslingerPassive1_1, btnGunslingerPassive1_2, btnGunslingerPassive1_3,
                btnGunslingerPassive1_4, btnGunslingerPassive1_5, btnGunslingerPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnGunslinger1_7.isSelected = !btnGunslinger1_7.isSelected
        }

        btnGunslinger1_8.setOnClickListener {
            if (skillPoints <= 0){
                if (btnGunslinger1_8.isSelected) {
                    updateButtons1(btnGunslinger1_8)
                    btnGunslinger1_8.isSelected = !btnGunslinger1_8.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnGunslinger1_8)

            btnGunslinger1_8.isSelected = !btnGunslinger1_8.isSelected
            skillUnlock1(
                btnGunslinger1_4, btnGunslinger1_8, btnGunslinger1_12,
                btnGunslingerPassive1_1, btnGunslingerPassive1_2, btnGunslingerPassive1_3,
                btnGunslingerPassive1_4, btnGunslingerPassive1_5, btnGunslingerPassive1_6,
                skillPoints1Text, skillTree1Points
            )
        }

        btnGunslinger1_9.setOnClickListener {
            if (skillPoints <= 0){
                if (btnGunslinger1_9.isSelected) {
                    updateButtons1(btnGunslinger1_9)
                    btnGunslinger1_9.isSelected = !btnGunslinger1_9.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnGunslinger1_9)

            skillUnlock1(
                btnGunslinger1_4, btnGunslinger1_8, btnGunslinger1_12,
                btnGunslingerPassive1_1, btnGunslingerPassive1_2, btnGunslingerPassive1_3,
                btnGunslingerPassive1_4, btnGunslingerPassive1_5, btnGunslingerPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnGunslinger1_9.isSelected = !btnGunslinger1_9.isSelected
        }

        btnGunslinger1_10.setOnClickListener {
            if (skillPoints <= 0){
                if (btnGunslinger1_10.isSelected) {
                    updateButtons1(btnGunslinger1_10)
                    btnGunslinger1_10.isSelected = !btnGunslinger1_10.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnGunslinger1_10)

            skillUnlock1(
                btnGunslinger1_4, btnGunslinger1_8, btnGunslinger1_12,
                btnGunslingerPassive1_1, btnGunslingerPassive1_2, btnGunslingerPassive1_3,
                btnGunslingerPassive1_4, btnGunslingerPassive1_5, btnGunslingerPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnGunslinger1_10.isSelected = !btnGunslinger1_10.isSelected
        }

        btnGunslinger1_11.setOnClickListener {
            if (skillPoints <= 0){
                if (btnGunslinger1_11.isSelected) {
                    updateButtons1(btnGunslinger1_11)
                    btnGunslinger1_11.isSelected = !btnGunslinger1_11.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnGunslinger1_11)

            skillUnlock1(
                btnGunslinger1_4, btnGunslinger1_8, btnGunslinger1_12,
                btnGunslingerPassive1_1, btnGunslingerPassive1_2, btnGunslingerPassive1_3,
                btnGunslingerPassive1_4, btnGunslingerPassive1_5, btnGunslingerPassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnGunslinger1_11.isSelected = !btnGunslinger1_11.isSelected
        }

        btnGunslinger1_12.setOnClickListener {
            if (skillPoints <= 0){
                if (btnGunslinger1_12.isSelected) {
                    updateButtons1(btnGunslinger1_12)
                    btnGunslinger1_12.isSelected = !btnGunslinger1_12.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnGunslinger1_12)

            btnGunslinger1_12.isSelected = !btnGunslinger1_12.isSelected
            skillUnlock1(
                btnGunslinger1_4, btnGunslinger1_8, btnGunslinger1_12,
                btnGunslingerPassive1_1, btnGunslingerPassive1_2, btnGunslingerPassive1_3,
                btnGunslingerPassive1_4, btnGunslingerPassive1_5, btnGunslingerPassive1_6,
                skillPoints1Text, skillTree1Points
            )
        }
        //endregion

        //region Gunslinger2 Button Actions
        btnGunslinger2_1.setOnClickListener {
            if (skillPoints <= 0){
                if (btnGunslinger2_1.isSelected) {
                    updateButtons2(btnGunslinger2_1)
                    btnGunslinger2_1.isSelected = !btnGunslinger2_1.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnGunslinger2_1)

            skillUnlock2(
                btnGunslinger2_4, btnGunslinger2_8, btnGunslinger2_12,
                btnGunslingerPassive2_1, btnGunslingerPassive2_2, btnGunslingerPassive2_3,
                btnGunslingerPassive2_4, btnGunslingerPassive2_5, btnGunslingerPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnGunslinger2_1.isSelected = !btnGunslinger2_1.isSelected
        }

        btnGunslinger2_2.setOnClickListener {
            if (skillPoints <= 0){
                if (btnGunslinger2_2.isSelected) {
                    updateButtons2(btnGunslinger2_2)
                    btnGunslinger2_2.isSelected = !btnGunslinger2_2.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnGunslinger2_2)

            skillUnlock2(
                btnGunslinger2_4, btnGunslinger2_8, btnGunslinger2_12,
                btnGunslingerPassive2_1, btnGunslingerPassive2_2, btnGunslingerPassive2_3,
                btnGunslingerPassive2_4, btnGunslingerPassive2_5, btnGunslingerPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnGunslinger2_2.isSelected = !btnGunslinger2_2.isSelected
        }

        btnGunslinger2_3.setOnClickListener {
            if (skillPoints <= 0){
                if (btnGunslinger2_3.isSelected) {
                    updateButtons2(btnGunslinger2_3)
                    btnGunslinger2_3.isSelected = !btnGunslinger2_3.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnGunslinger2_3)

            skillUnlock2(
                btnGunslinger2_4, btnGunslinger2_8, btnGunslinger2_12,
                btnGunslingerPassive2_1, btnGunslingerPassive2_2, btnGunslingerPassive2_3,
                btnGunslingerPassive2_4, btnGunslingerPassive2_5, btnGunslingerPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnGunslinger2_3.isSelected = !btnGunslinger2_3.isSelected
        }

        btnGunslinger2_4.setOnClickListener {
            if (skillPoints <= 0){
                if (btnGunslinger2_4.isSelected) {
                    updateButtons2(btnGunslinger2_4)
                    btnGunslinger2_4.isSelected = !btnGunslinger2_4.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnGunslinger2_4)

            btnGunslinger2_4.isSelected = !btnGunslinger2_4.isSelected
            skillUnlock2(
                btnGunslinger2_4, btnGunslinger2_8, btnGunslinger2_12,
                btnGunslingerPassive2_1, btnGunslingerPassive2_2, btnGunslingerPassive2_3,
                btnGunslingerPassive2_4, btnGunslingerPassive2_5, btnGunslingerPassive2_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnGunslinger2_5.setOnClickListener {
            if (skillPoints <= 0){
                if (btnGunslinger2_5.isSelected) {
                    updateButtons2(btnGunslinger2_5)
                    btnGunslinger2_5.isSelected = !btnGunslinger2_5.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnGunslinger2_5)

            skillUnlock2(
                btnGunslinger2_4, btnGunslinger2_8, btnGunslinger2_12,
                btnGunslingerPassive2_1, btnGunslingerPassive2_2, btnGunslingerPassive2_3,
                btnGunslingerPassive2_4, btnGunslingerPassive2_5, btnGunslingerPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnGunslinger2_5.isSelected = !btnGunslinger2_5.isSelected
        }

        btnGunslinger2_6.setOnClickListener {
            if (skillPoints <= 0){
                if (btnGunslinger2_6.isSelected) {
                    updateButtons2(btnGunslinger2_6)
                    btnGunslinger2_6.isSelected = !btnGunslinger2_6.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnGunslinger2_6)

            skillUnlock2(
                btnGunslinger2_4, btnGunslinger2_8, btnGunslinger2_12,
                btnGunslingerPassive2_1, btnGunslingerPassive2_2, btnGunslingerPassive2_3,
                btnGunslingerPassive2_4, btnGunslingerPassive2_5, btnGunslingerPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnGunslinger2_6.isSelected = !btnGunslinger2_6.isSelected
        }

        btnGunslinger2_7.setOnClickListener {
            if (skillPoints <= 0){
                if (btnGunslinger2_7.isSelected) {
                    updateButtons2(btnGunslinger2_7)
                    btnGunslinger2_7.isSelected = !btnGunslinger2_7.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnGunslinger2_7)

            skillUnlock2(
                btnGunslinger2_4, btnGunslinger2_8, btnGunslinger2_12,
                btnGunslingerPassive2_1, btnGunslingerPassive2_2, btnGunslingerPassive2_3,
                btnGunslingerPassive2_4, btnGunslingerPassive2_5, btnGunslingerPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnGunslinger2_7.isSelected = !btnGunslinger2_7.isSelected
        }

        btnGunslinger2_8.setOnClickListener {
            if (skillPoints <= 0){
                if (btnGunslinger2_8.isSelected) {
                    updateButtons2(btnGunslinger2_8)
                    btnGunslinger2_8.isSelected = !btnGunslinger2_8.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnGunslinger2_8)

            btnGunslinger2_8.isSelected = !btnGunslinger2_8.isSelected
            skillUnlock2(
                btnGunslinger2_4, btnGunslinger2_8, btnGunslinger2_12,
                btnGunslingerPassive2_1, btnGunslingerPassive2_2, btnGunslingerPassive2_3,
                btnGunslingerPassive2_4, btnGunslingerPassive2_5, btnGunslingerPassive2_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnGunslinger2_9.setOnClickListener {
            if (skillPoints <= 0){
                if (btnGunslinger2_9.isSelected) {
                    updateButtons2(btnGunslinger2_9)
                    btnGunslinger2_9.isSelected = !btnGunslinger2_9.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnGunslinger2_9)

            skillUnlock2(
                btnGunslinger2_4, btnGunslinger2_8, btnGunslinger2_12,
                btnGunslingerPassive2_1, btnGunslingerPassive2_2, btnGunslingerPassive2_3,
                btnGunslingerPassive2_4, btnGunslingerPassive2_5, btnGunslingerPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnGunslinger2_9.isSelected = !btnGunslinger2_9.isSelected
        }

        btnGunslinger2_10.setOnClickListener {
            if (skillPoints <= 0){
                if (btnGunslinger2_10.isSelected) {
                    updateButtons2(btnGunslinger2_10)
                    btnGunslinger2_10.isSelected = !btnGunslinger2_10.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnGunslinger2_10)

            skillUnlock2(
                btnGunslinger2_4, btnGunslinger2_8, btnGunslinger2_12,
                btnGunslingerPassive2_1, btnGunslingerPassive2_2, btnGunslingerPassive2_3,
                btnGunslingerPassive2_4, btnGunslingerPassive2_5, btnGunslingerPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnGunslinger2_10.isSelected = !btnGunslinger2_10.isSelected
        }

        btnGunslinger2_11.setOnClickListener {
            if (skillPoints <= 0){
                if (btnGunslinger2_11.isSelected) {
                    updateButtons2(btnGunslinger2_11)
                    btnGunslinger2_11.isSelected = !btnGunslinger2_11.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnGunslinger2_11)

            skillUnlock2(
                btnGunslinger2_4, btnGunslinger2_8, btnGunslinger2_12,
                btnGunslingerPassive2_1, btnGunslingerPassive2_2, btnGunslingerPassive2_3,
                btnGunslingerPassive2_4, btnGunslingerPassive2_5, btnGunslingerPassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnGunslinger2_11.isSelected = !btnGunslinger2_11.isSelected
        }

        btnGunslinger2_12.setOnClickListener {
            if (skillPoints <= 0){
                if (btnGunslinger2_12.isSelected) {
                    updateButtons2(btnGunslinger2_12)
                    btnGunslinger2_12.isSelected = !btnGunslinger2_12.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnGunslinger2_12)

            btnGunslinger2_12.isSelected = !btnGunslinger2_12.isSelected
            skillUnlock2(
                btnGunslinger2_4, btnGunslinger2_8, btnGunslinger2_12,
                btnGunslingerPassive2_1, btnGunslingerPassive2_2, btnGunslingerPassive2_3,
                btnGunslingerPassive2_4, btnGunslingerPassive2_5, btnGunslingerPassive2_6,
                skillPoints2Text, skillTree2Points
            )
        }
        //endregion

        //region Gunslinger3 Button Actions
        btnGunslinger3_1.setOnClickListener {
            if (skillPoints <= 0){
                if (btnGunslinger3_1.isSelected) {
                    updateButtons3(btnGunslinger3_1)
                    btnGunslinger3_1.isSelected = !btnGunslinger3_1.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnGunslinger3_1)

            skillUnlock3(
                btnGunslinger3_4, btnGunslinger3_8, btnGunslinger3_12,
                btnGunslingerPassive3_1, btnGunslingerPassive3_2, btnGunslingerPassive3_3,
                btnGunslingerPassive3_4, btnGunslingerPassive3_5, btnGunslingerPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnGunslinger3_1.isSelected = !btnGunslinger3_1.isSelected
        }

        btnGunslinger3_2.setOnClickListener {
            if (skillPoints <= 0){
                if (btnGunslinger3_2.isSelected) {
                    updateButtons3(btnGunslinger3_2)
                    btnGunslinger3_2.isSelected = !btnGunslinger3_2.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnGunslinger3_2)

            skillUnlock3(
                btnGunslinger3_4, btnGunslinger3_8, btnGunslinger3_12,
                btnGunslingerPassive3_1, btnGunslingerPassive3_2, btnGunslingerPassive3_3,
                btnGunslingerPassive3_4, btnGunslingerPassive3_5, btnGunslingerPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnGunslinger3_2.isSelected = !btnGunslinger3_2.isSelected
        }

        btnGunslinger3_3.setOnClickListener {
            if (skillPoints <= 0){
                if (btnGunslinger3_3.isSelected) {
                    updateButtons3(btnGunslinger3_3)
                    btnGunslinger3_3.isSelected = !btnGunslinger3_3.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnGunslinger3_3)

            skillUnlock3(
                btnGunslinger3_4, btnGunslinger3_8, btnGunslinger3_12,
                btnGunslingerPassive3_1, btnGunslingerPassive3_2, btnGunslingerPassive3_3,
                btnGunslingerPassive3_4, btnGunslingerPassive3_5, btnGunslingerPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnGunslinger3_3.isSelected = !btnGunslinger3_3.isSelected
        }

        btnGunslinger3_4.setOnClickListener {
            if (skillPoints <= 0){
                if (btnGunslinger3_4.isSelected) {
                    updateButtons3(btnGunslinger3_4)
                    btnGunslinger3_4.isSelected = !btnGunslinger3_4.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnGunslinger3_4)

            btnGunslinger3_4.isSelected = !btnGunslinger3_4.isSelected
            skillUnlock3(
                btnGunslinger3_4, btnGunslinger3_8, btnGunslinger3_12,
                btnGunslingerPassive3_1, btnGunslingerPassive3_2, btnGunslingerPassive3_3,
                btnGunslingerPassive3_4, btnGunslingerPassive3_5, btnGunslingerPassive3_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnGunslinger3_5.setOnClickListener {
            if (skillPoints <= 0){
                if (btnGunslinger3_5.isSelected) {
                    updateButtons3(btnGunslinger3_5)
                    btnGunslinger3_5.isSelected = !btnGunslinger3_5.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnGunslinger3_5)

            skillUnlock3(
                btnGunslinger3_4, btnGunslinger3_8, btnGunslinger3_12,
                btnGunslingerPassive3_1, btnGunslingerPassive3_2, btnGunslingerPassive3_3,
                btnGunslingerPassive3_4, btnGunslingerPassive3_5, btnGunslingerPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnGunslinger3_5.isSelected = !btnGunslinger3_5.isSelected
        }

        btnGunslinger3_6.setOnClickListener {
            if (skillPoints <= 0){
                if (btnGunslinger3_6.isSelected) {
                    updateButtons3(btnGunslinger3_6)
                    btnGunslinger3_6.isSelected = !btnGunslinger3_6.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnGunslinger3_6)

            skillUnlock3(
                btnGunslinger3_4, btnGunslinger3_8, btnGunslinger3_12,
                btnGunslingerPassive3_1, btnGunslingerPassive3_2, btnGunslingerPassive3_3,
                btnGunslingerPassive3_4, btnGunslingerPassive3_5, btnGunslingerPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnGunslinger3_6.isSelected = !btnGunslinger3_6.isSelected
        }

        btnGunslinger3_7.setOnClickListener {
            if (skillPoints <= 0){
                if (btnGunslinger3_7.isSelected) {
                    updateButtons3(btnGunslinger3_7)
                    btnGunslinger3_7.isSelected = !btnGunslinger3_7.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnGunslinger3_7)

            skillUnlock3(
                btnGunslinger3_4, btnGunslinger3_8, btnGunslinger3_12,
                btnGunslingerPassive3_1, btnGunslingerPassive3_2, btnGunslingerPassive3_3,
                btnGunslingerPassive3_4, btnGunslingerPassive3_5, btnGunslingerPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnGunslinger3_7.isSelected = !btnGunslinger3_7.isSelected
        }

        btnGunslinger3_8.setOnClickListener {
            if (skillPoints <= 0){
                if (btnGunslinger3_8.isSelected) {
                    updateButtons3(btnGunslinger3_8)
                    btnGunslinger3_8.isSelected = !btnGunslinger3_8.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnGunslinger3_8)

            btnGunslinger3_8.isSelected = !btnGunslinger3_8.isSelected
            skillUnlock3(
                btnGunslinger3_4, btnGunslinger3_8, btnGunslinger3_12,
                btnGunslingerPassive3_1, btnGunslingerPassive3_2, btnGunslingerPassive3_3,
                btnGunslingerPassive3_4, btnGunslingerPassive3_5, btnGunslingerPassive3_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnGunslinger3_9.setOnClickListener {
            if (skillPoints <= 0){
                if (btnGunslinger3_9.isSelected) {
                    updateButtons3(btnGunslinger3_9)
                    btnGunslinger3_9.isSelected = !btnGunslinger3_9.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnGunslinger3_9)

            skillUnlock3(
                btnGunslinger3_4, btnGunslinger3_8, btnGunslinger3_12,
                btnGunslingerPassive3_1, btnGunslingerPassive3_2, btnGunslingerPassive3_3,
                btnGunslingerPassive3_4, btnGunslingerPassive3_5, btnGunslingerPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnGunslinger3_9.isSelected = !btnGunslinger3_9.isSelected
        }

        btnGunslinger3_10.setOnClickListener {
            if (skillPoints <= 0){
                if (btnGunslinger3_10.isSelected) {
                    updateButtons3(btnGunslinger3_10)
                    btnGunslinger3_10.isSelected = !btnGunslinger3_10.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnGunslinger3_10)

            skillUnlock3(
                btnGunslinger3_4, btnGunslinger3_8, btnGunslinger3_12,
                btnGunslingerPassive3_1, btnGunslingerPassive3_2, btnGunslingerPassive3_3,
                btnGunslingerPassive3_4, btnGunslingerPassive3_5, btnGunslingerPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnGunslinger3_10.isSelected = !btnGunslinger3_10.isSelected
        }

        btnGunslinger3_11.setOnClickListener {
            if (skillPoints <= 0){
                if (btnGunslinger3_11.isSelected) {
                    updateButtons3(btnGunslinger3_11)
                    btnGunslinger3_11.isSelected = !btnGunslinger3_11.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnGunslinger3_11)

            skillUnlock3(
                btnGunslinger3_4, btnGunslinger3_8, btnGunslinger3_12,
                btnGunslingerPassive3_1, btnGunslingerPassive3_2, btnGunslingerPassive3_3,
                btnGunslingerPassive3_4, btnGunslingerPassive3_5, btnGunslingerPassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnGunslinger3_11.isSelected = !btnGunslinger3_11.isSelected
        }

        btnGunslinger3_12.setOnClickListener {
            if (skillPoints <= 0){
                if (btnGunslinger3_12.isSelected) {
                    updateButtons3(btnGunslinger3_12)
                    btnGunslinger3_12.isSelected = !btnGunslinger3_12.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnGunslinger3_12)

            btnGunslinger3_12.isSelected = !btnGunslinger3_12.isSelected
            skillUnlock3(
                btnGunslinger3_4, btnGunslinger3_8, btnGunslinger3_12,
                btnGunslingerPassive3_1, btnGunslingerPassive3_2, btnGunslingerPassive3_3,
                btnGunslingerPassive3_4, btnGunslingerPassive3_5, btnGunslingerPassive3_6,
                skillPoints2Text, skillTree2Points
            )
        }
        //endregion
        

        //region Spelldance1 Button Actions
        btnSpelldance1_1.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSpelldance1_1.isSelected) {
                    updateButtons1(btnSpelldance1_1)
                    btnSpelldance1_1.isSelected = !btnSpelldance1_1.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSpelldance1_1)

            skillUnlock1(
                btnSpelldance1_4, btnSpelldance1_8, btnSpelldance1_12,
                btnSpelldancePassive1_1, btnSpelldancePassive1_2, btnSpelldancePassive1_3,
                btnSpelldancePassive1_4, btnSpelldancePassive1_5, btnSpelldancePassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnSpelldance1_1.isSelected = !btnSpelldance1_1.isSelected
        }

        btnSpelldance1_2.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSpelldance1_2.isSelected) {
                    updateButtons1(btnSpelldance1_2)
                    btnSpelldance1_2.isSelected = !btnSpelldance1_2.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSpelldance1_2)

            skillUnlock1(
                btnSpelldance1_4, btnSpelldance1_8, btnSpelldance1_12,
                btnSpelldancePassive1_1, btnSpelldancePassive1_2, btnSpelldancePassive1_3,
                btnSpelldancePassive1_4, btnSpelldancePassive1_5, btnSpelldancePassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnSpelldance1_2.isSelected = !btnSpelldance1_2.isSelected
        }

        btnSpelldance1_3.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSpelldance1_3.isSelected) {
                    updateButtons1(btnSpelldance1_3)
                    btnSpelldance1_3.isSelected = !btnSpelldance1_3.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSpelldance1_3)

            skillUnlock1(
                btnSpelldance1_4, btnSpelldance1_8, btnSpelldance1_12,
                btnSpelldancePassive1_1, btnSpelldancePassive1_2, btnSpelldancePassive1_3,
                btnSpelldancePassive1_4, btnSpelldancePassive1_5, btnSpelldancePassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnSpelldance1_3.isSelected = !btnSpelldance1_3.isSelected
        }

        btnSpelldance1_4.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSpelldance1_4.isSelected) {
                    updateButtons1(btnSpelldance1_4)
                    btnSpelldance1_4.isSelected = !btnSpelldance1_4.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSpelldance1_4)

            btnSpelldance1_4.isSelected = !btnSpelldance1_4.isSelected
            skillUnlock1(
                btnSpelldance1_4, btnSpelldance1_8, btnSpelldance1_12,
                btnSpelldancePassive1_1, btnSpelldancePassive1_2, btnSpelldancePassive1_3,
                btnSpelldancePassive1_4, btnSpelldancePassive1_5, btnSpelldancePassive1_6,
                skillPoints1Text, skillTree1Points
            )
        }

        btnSpelldance1_5.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSpelldance1_5.isSelected) {
                    updateButtons1(btnSpelldance1_5)
                    btnSpelldance1_5.isSelected = !btnSpelldance1_5.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSpelldance1_5)

            skillUnlock1(
                btnSpelldance1_4, btnSpelldance1_8, btnSpelldance1_12,
                btnSpelldancePassive1_1, btnSpelldancePassive1_2, btnSpelldancePassive1_3,
                btnSpelldancePassive1_4, btnSpelldancePassive1_5, btnSpelldancePassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnSpelldance1_5.isSelected = !btnSpelldance1_5.isSelected
        }

        btnSpelldance1_6.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSpelldance1_6.isSelected) {
                    updateButtons1(btnSpelldance1_6)
                    btnSpelldance1_6.isSelected = !btnSpelldance1_6.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSpelldance1_6)

            skillUnlock1(
                btnSpelldance1_4, btnSpelldance1_8, btnSpelldance1_12,
                btnSpelldancePassive1_1, btnSpelldancePassive1_2, btnSpelldancePassive1_3,
                btnSpelldancePassive1_4, btnSpelldancePassive1_5, btnSpelldancePassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnSpelldance1_6.isSelected = !btnSpelldance1_6.isSelected
        }

        btnSpelldance1_7.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSpelldance1_7.isSelected) {
                    updateButtons1(btnSpelldance1_7)
                    btnSpelldance1_7.isSelected = !btnSpelldance1_7.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSpelldance1_7)

            skillUnlock1(
                btnSpelldance1_4, btnSpelldance1_8, btnSpelldance1_12,
                btnSpelldancePassive1_1, btnSpelldancePassive1_2, btnSpelldancePassive1_3,
                btnSpelldancePassive1_4, btnSpelldancePassive1_5, btnSpelldancePassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnSpelldance1_7.isSelected = !btnSpelldance1_7.isSelected
        }

        btnSpelldance1_8.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSpelldance1_8.isSelected) {
                    updateButtons1(btnSpelldance1_8)
                    btnSpelldance1_8.isSelected = !btnSpelldance1_8.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSpelldance1_8)

            btnSpelldance1_8.isSelected = !btnSpelldance1_8.isSelected
            skillUnlock1(
                btnSpelldance1_4, btnSpelldance1_8, btnSpelldance1_12,
                btnSpelldancePassive1_1, btnSpelldancePassive1_2, btnSpelldancePassive1_3,
                btnSpelldancePassive1_4, btnSpelldancePassive1_5, btnSpelldancePassive1_6,
                skillPoints1Text, skillTree1Points
            )
        }

        btnSpelldance1_9.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSpelldance1_9.isSelected) {
                    updateButtons1(btnSpelldance1_9)
                    btnSpelldance1_9.isSelected = !btnSpelldance1_9.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSpelldance1_9)

            skillUnlock1(
                btnSpelldance1_4, btnSpelldance1_8, btnSpelldance1_12,
                btnSpelldancePassive1_1, btnSpelldancePassive1_2, btnSpelldancePassive1_3,
                btnSpelldancePassive1_4, btnSpelldancePassive1_5, btnSpelldancePassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnSpelldance1_9.isSelected = !btnSpelldance1_9.isSelected
        }

        btnSpelldance1_10.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSpelldance1_10.isSelected) {
                    updateButtons1(btnSpelldance1_10)
                    btnSpelldance1_10.isSelected = !btnSpelldance1_10.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSpelldance1_10)

            skillUnlock1(
                btnSpelldance1_4, btnSpelldance1_8, btnSpelldance1_12,
                btnSpelldancePassive1_1, btnSpelldancePassive1_2, btnSpelldancePassive1_3,
                btnSpelldancePassive1_4, btnSpelldancePassive1_5, btnSpelldancePassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnSpelldance1_10.isSelected = !btnSpelldance1_10.isSelected
        }

        btnSpelldance1_11.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSpelldance1_11.isSelected) {
                    updateButtons1(btnSpelldance1_11)
                    btnSpelldance1_11.isSelected = !btnSpelldance1_11.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSpelldance1_11)

            skillUnlock1(
                btnSpelldance1_4, btnSpelldance1_8, btnSpelldance1_12,
                btnSpelldancePassive1_1, btnSpelldancePassive1_2, btnSpelldancePassive1_3,
                btnSpelldancePassive1_4, btnSpelldancePassive1_5, btnSpelldancePassive1_6,
                skillPoints1Text, skillTree1Points
            )
            btnSpelldance1_11.isSelected = !btnSpelldance1_11.isSelected
        }

        btnSpelldance1_12.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSpelldance1_12.isSelected) {
                    updateButtons1(btnSpelldance1_12)
                    btnSpelldance1_12.isSelected = !btnSpelldance1_12.isSelected
                }
                return@setOnClickListener
            }
            updateButtons1(btnSpelldance1_12)

            btnSpelldance1_12.isSelected = !btnSpelldance1_12.isSelected
            skillUnlock1(
                btnSpelldance1_4, btnSpelldance1_8, btnSpelldance1_12,
                btnSpelldancePassive1_1, btnSpelldancePassive1_2, btnSpelldancePassive1_3,
                btnSpelldancePassive1_4, btnSpelldancePassive1_5, btnSpelldancePassive1_6,
                skillPoints1Text, skillTree1Points
            )
        }
        //endregion

        //region Spelldance2 Button Actions
        btnSpelldance2_1.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSpelldance2_1.isSelected) {
                    updateButtons2(btnSpelldance2_1)
                    btnSpelldance2_1.isSelected = !btnSpelldance2_1.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSpelldance2_1)

            skillUnlock2(
                btnSpelldance2_4, btnSpelldance2_8, btnSpelldance2_12,
                btnSpelldancePassive2_1, btnSpelldancePassive2_2, btnSpelldancePassive2_3,
                btnSpelldancePassive2_4, btnSpelldancePassive2_5, btnSpelldancePassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnSpelldance2_1.isSelected = !btnSpelldance2_1.isSelected
        }

        btnSpelldance2_2.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSpelldance2_2.isSelected) {
                    updateButtons2(btnSpelldance2_2)
                    btnSpelldance2_2.isSelected = !btnSpelldance2_2.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSpelldance2_2)

            skillUnlock2(
                btnSpelldance2_4, btnSpelldance2_8, btnSpelldance2_12,
                btnSpelldancePassive2_1, btnSpelldancePassive2_2, btnSpelldancePassive2_3,
                btnSpelldancePassive2_4, btnSpelldancePassive2_5, btnSpelldancePassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnSpelldance2_2.isSelected = !btnSpelldance2_2.isSelected
        }

        btnSpelldance2_3.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSpelldance2_3.isSelected) {
                    updateButtons2(btnSpelldance2_3)
                    btnSpelldance2_3.isSelected = !btnSpelldance2_3.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSpelldance2_3)

            skillUnlock2(
                btnSpelldance2_4, btnSpelldance2_8, btnSpelldance2_12,
                btnSpelldancePassive2_1, btnSpelldancePassive2_2, btnSpelldancePassive2_3,
                btnSpelldancePassive2_4, btnSpelldancePassive2_5, btnSpelldancePassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnSpelldance2_3.isSelected = !btnSpelldance2_3.isSelected
        }

        btnSpelldance2_4.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSpelldance2_4.isSelected) {
                    updateButtons2(btnSpelldance2_4)
                    btnSpelldance2_4.isSelected = !btnSpelldance2_4.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSpelldance2_4)

            btnSpelldance2_4.isSelected = !btnSpelldance2_4.isSelected
            skillUnlock2(
                btnSpelldance2_4, btnSpelldance2_8, btnSpelldance2_12,
                btnSpelldancePassive2_1, btnSpelldancePassive2_2, btnSpelldancePassive2_3,
                btnSpelldancePassive2_4, btnSpelldancePassive2_5, btnSpelldancePassive2_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnSpelldance2_5.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSpelldance2_5.isSelected) {
                    updateButtons2(btnSpelldance2_5)
                    btnSpelldance2_5.isSelected = !btnSpelldance2_5.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSpelldance2_5)

            skillUnlock2(
                btnSpelldance2_4, btnSpelldance2_8, btnSpelldance2_12,
                btnSpelldancePassive2_1, btnSpelldancePassive2_2, btnSpelldancePassive2_3,
                btnSpelldancePassive2_4, btnSpelldancePassive2_5, btnSpelldancePassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnSpelldance2_5.isSelected = !btnSpelldance2_5.isSelected
        }

        btnSpelldance2_6.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSpelldance2_6.isSelected) {
                    updateButtons2(btnSpelldance2_6)
                    btnSpelldance2_6.isSelected = !btnSpelldance2_6.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSpelldance2_6)

            skillUnlock2(
                btnSpelldance2_4, btnSpelldance2_8, btnSpelldance2_12,
                btnSpelldancePassive2_1, btnSpelldancePassive2_2, btnSpelldancePassive2_3,
                btnSpelldancePassive2_4, btnSpelldancePassive2_5, btnSpelldancePassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnSpelldance2_6.isSelected = !btnSpelldance2_6.isSelected
        }

        btnSpelldance2_7.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSpelldance2_7.isSelected) {
                    updateButtons2(btnSpelldance2_7)
                    btnSpelldance2_7.isSelected = !btnSpelldance2_7.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSpelldance2_7)

            skillUnlock2(
                btnSpelldance2_4, btnSpelldance2_8, btnSpelldance2_12,
                btnSpelldancePassive2_1, btnSpelldancePassive2_2, btnSpelldancePassive2_3,
                btnSpelldancePassive2_4, btnSpelldancePassive2_5, btnSpelldancePassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnSpelldance2_7.isSelected = !btnSpelldance2_7.isSelected
        }

        btnSpelldance2_8.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSpelldance2_8.isSelected) {
                    updateButtons2(btnSpelldance2_8)
                    btnSpelldance2_8.isSelected = !btnSpelldance2_8.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSpelldance2_8)

            btnSpelldance2_8.isSelected = !btnSpelldance2_8.isSelected
            skillUnlock2(
                btnSpelldance2_4, btnSpelldance2_8, btnSpelldance2_12,
                btnSpelldancePassive2_1, btnSpelldancePassive2_2, btnSpelldancePassive2_3,
                btnSpelldancePassive2_4, btnSpelldancePassive2_5, btnSpelldancePassive2_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnSpelldance2_9.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSpelldance2_9.isSelected) {
                    updateButtons2(btnSpelldance2_9)
                    btnSpelldance2_9.isSelected = !btnSpelldance2_9.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSpelldance2_9)

            skillUnlock2(
                btnSpelldance2_4, btnSpelldance2_8, btnSpelldance2_12,
                btnSpelldancePassive2_1, btnSpelldancePassive2_2, btnSpelldancePassive2_3,
                btnSpelldancePassive2_4, btnSpelldancePassive2_5, btnSpelldancePassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnSpelldance2_9.isSelected = !btnSpelldance2_9.isSelected
        }

        btnSpelldance2_10.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSpelldance2_10.isSelected) {
                    updateButtons2(btnSpelldance2_10)
                    btnSpelldance2_10.isSelected = !btnSpelldance2_10.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSpelldance2_10)

            skillUnlock2(
                btnSpelldance2_4, btnSpelldance2_8, btnSpelldance2_12,
                btnSpelldancePassive2_1, btnSpelldancePassive2_2, btnSpelldancePassive2_3,
                btnSpelldancePassive2_4, btnSpelldancePassive2_5, btnSpelldancePassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnSpelldance2_10.isSelected = !btnSpelldance2_10.isSelected
        }

        btnSpelldance2_11.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSpelldance2_11.isSelected) {
                    updateButtons2(btnSpelldance2_11)
                    btnSpelldance2_11.isSelected = !btnSpelldance2_11.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSpelldance2_11)

            skillUnlock2(
                btnSpelldance2_4, btnSpelldance2_8, btnSpelldance2_12,
                btnSpelldancePassive2_1, btnSpelldancePassive2_2, btnSpelldancePassive2_3,
                btnSpelldancePassive2_4, btnSpelldancePassive2_5, btnSpelldancePassive2_6,
                skillPoints2Text, skillTree2Points
            )
            btnSpelldance2_11.isSelected = !btnSpelldance2_11.isSelected
        }

        btnSpelldance2_12.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSpelldance2_12.isSelected) {
                    updateButtons2(btnSpelldance2_12)
                    btnSpelldance2_12.isSelected = !btnSpelldance2_12.isSelected
                }
                return@setOnClickListener
            }
            updateButtons2(btnSpelldance2_12)

            btnSpelldance2_12.isSelected = !btnSpelldance2_12.isSelected
            skillUnlock2(
                btnSpelldance2_4, btnSpelldance2_8, btnSpelldance2_12,
                btnSpelldancePassive2_1, btnSpelldancePassive2_2, btnSpelldancePassive2_3,
                btnSpelldancePassive2_4, btnSpelldancePassive2_5, btnSpelldancePassive2_6,
                skillPoints2Text, skillTree2Points
            )
        }
        //endregion

        //region Spelldance3 Button Actions
        btnSpelldance3_1.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSpelldance3_1.isSelected) {
                    updateButtons3(btnSpelldance3_1)
                    btnSpelldance3_1.isSelected = !btnSpelldance3_1.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSpelldance3_1)

            skillUnlock3(
                btnSpelldance3_4, btnSpelldance3_8, btnSpelldance3_12,
                btnSpelldancePassive3_1, btnSpelldancePassive3_2, btnSpelldancePassive3_3,
                btnSpelldancePassive3_4, btnSpelldancePassive3_5, btnSpelldancePassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnSpelldance3_1.isSelected = !btnSpelldance3_1.isSelected
        }

        btnSpelldance3_2.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSpelldance3_2.isSelected) {
                    updateButtons3(btnSpelldance3_2)
                    btnSpelldance3_2.isSelected = !btnSpelldance3_2.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSpelldance3_2)

            skillUnlock3(
                btnSpelldance3_4, btnSpelldance3_8, btnSpelldance3_12,
                btnSpelldancePassive3_1, btnSpelldancePassive3_2, btnSpelldancePassive3_3,
                btnSpelldancePassive3_4, btnSpelldancePassive3_5, btnSpelldancePassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnSpelldance3_2.isSelected = !btnSpelldance3_2.isSelected
        }

        btnSpelldance3_3.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSpelldance3_3.isSelected) {
                    updateButtons3(btnSpelldance3_3)
                    btnSpelldance3_3.isSelected = !btnSpelldance3_3.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSpelldance3_3)

            skillUnlock3(
                btnSpelldance3_4, btnSpelldance3_8, btnSpelldance3_12,
                btnSpelldancePassive3_1, btnSpelldancePassive3_2, btnSpelldancePassive3_3,
                btnSpelldancePassive3_4, btnSpelldancePassive3_5, btnSpelldancePassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnSpelldance3_3.isSelected = !btnSpelldance3_3.isSelected
        }

        btnSpelldance3_4.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSpelldance3_4.isSelected) {
                    updateButtons3(btnSpelldance3_4)
                    btnSpelldance3_4.isSelected = !btnSpelldance3_4.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSpelldance3_4)

            btnSpelldance3_4.isSelected = !btnSpelldance3_4.isSelected
            skillUnlock3(
                btnSpelldance3_4, btnSpelldance3_8, btnSpelldance3_12,
                btnSpelldancePassive3_1, btnSpelldancePassive3_2, btnSpelldancePassive3_3,
                btnSpelldancePassive3_4, btnSpelldancePassive3_5, btnSpelldancePassive3_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnSpelldance3_5.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSpelldance3_5.isSelected) {
                    updateButtons3(btnSpelldance3_5)
                    btnSpelldance3_5.isSelected = !btnSpelldance3_5.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSpelldance3_5)

            skillUnlock3(
                btnSpelldance3_4, btnSpelldance3_8, btnSpelldance3_12,
                btnSpelldancePassive3_1, btnSpelldancePassive3_2, btnSpelldancePassive3_3,
                btnSpelldancePassive3_4, btnSpelldancePassive3_5, btnSpelldancePassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnSpelldance3_5.isSelected = !btnSpelldance3_5.isSelected
        }

        btnSpelldance3_6.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSpelldance3_6.isSelected) {
                    updateButtons3(btnSpelldance3_6)
                    btnSpelldance3_6.isSelected = !btnSpelldance3_6.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSpelldance3_6)

            skillUnlock3(
                btnSpelldance3_4, btnSpelldance3_8, btnSpelldance3_12,
                btnSpelldancePassive3_1, btnSpelldancePassive3_2, btnSpelldancePassive3_3,
                btnSpelldancePassive3_4, btnSpelldancePassive3_5, btnSpelldancePassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnSpelldance3_6.isSelected = !btnSpelldance3_6.isSelected
        }

        btnSpelldance3_7.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSpelldance3_7.isSelected) {
                    updateButtons3(btnSpelldance3_7)
                    btnSpelldance3_7.isSelected = !btnSpelldance3_7.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSpelldance3_7)

            skillUnlock3(
                btnSpelldance3_4, btnSpelldance3_8, btnSpelldance3_12,
                btnSpelldancePassive3_1, btnSpelldancePassive3_2, btnSpelldancePassive3_3,
                btnSpelldancePassive3_4, btnSpelldancePassive3_5, btnSpelldancePassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnSpelldance3_7.isSelected = !btnSpelldance3_7.isSelected
        }

        btnSpelldance3_8.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSpelldance3_8.isSelected) {
                    updateButtons3(btnSpelldance3_8)
                    btnSpelldance3_8.isSelected = !btnSpelldance3_8.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSpelldance3_8)

            btnSpelldance3_8.isSelected = !btnSpelldance3_8.isSelected
            skillUnlock3(
                btnSpelldance3_4, btnSpelldance3_8, btnSpelldance3_12,
                btnSpelldancePassive3_1, btnSpelldancePassive3_2, btnSpelldancePassive3_3,
                btnSpelldancePassive3_4, btnSpelldancePassive3_5, btnSpelldancePassive3_6,
                skillPoints2Text, skillTree2Points
            )
        }

        btnSpelldance3_9.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSpelldance3_9.isSelected) {
                    updateButtons3(btnSpelldance3_9)
                    btnSpelldance3_9.isSelected = !btnSpelldance3_9.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSpelldance3_9)

            skillUnlock3(
                btnSpelldance3_4, btnSpelldance3_8, btnSpelldance3_12,
                btnSpelldancePassive3_1, btnSpelldancePassive3_2, btnSpelldancePassive3_3,
                btnSpelldancePassive3_4, btnSpelldancePassive3_5, btnSpelldancePassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnSpelldance3_9.isSelected = !btnSpelldance3_9.isSelected
        }

        btnSpelldance3_10.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSpelldance3_10.isSelected) {
                    updateButtons3(btnSpelldance3_10)
                    btnSpelldance3_10.isSelected = !btnSpelldance3_10.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSpelldance3_10)

            skillUnlock3(
                btnSpelldance3_4, btnSpelldance3_8, btnSpelldance3_12,
                btnSpelldancePassive3_1, btnSpelldancePassive3_2, btnSpelldancePassive3_3,
                btnSpelldancePassive3_4, btnSpelldancePassive3_5, btnSpelldancePassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnSpelldance3_10.isSelected = !btnSpelldance3_10.isSelected
        }

        btnSpelldance3_11.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSpelldance3_11.isSelected) {
                    updateButtons3(btnSpelldance3_11)
                    btnSpelldance3_11.isSelected = !btnSpelldance3_11.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSpelldance3_11)

            skillUnlock3(
                btnSpelldance3_4, btnSpelldance3_8, btnSpelldance3_12,
                btnSpelldancePassive3_1, btnSpelldancePassive3_2, btnSpelldancePassive3_3,
                btnSpelldancePassive3_4, btnSpelldancePassive3_5, btnSpelldancePassive3_6,
                skillPoints2Text, skillTree2Points
            )
            btnSpelldance3_11.isSelected = !btnSpelldance3_11.isSelected
        }

        btnSpelldance3_12.setOnClickListener {
            if (skillPoints <= 0){
                if (btnSpelldance3_12.isSelected) {
                    updateButtons3(btnSpelldance3_12)
                    btnSpelldance3_12.isSelected = !btnSpelldance3_12.isSelected
                }
                return@setOnClickListener
            }
            updateButtons3(btnSpelldance3_12)

            btnSpelldance3_12.isSelected = !btnSpelldance3_12.isSelected
            skillUnlock3(
                btnSpelldance3_4, btnSpelldance3_8, btnSpelldance3_12,
                btnSpelldancePassive3_1, btnSpelldancePassive3_2, btnSpelldancePassive3_3,
                btnSpelldancePassive3_4, btnSpelldancePassive3_5, btnSpelldancePassive3_6,
                skillPoints2Text, skillTree2Points
            )
        }
        //endregion

    }




}
@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package com.tobianoapps.androidsdkversionutil

import android.annotation.SuppressLint
import android.os.Build

@SuppressLint("ObsoleteSdkInt")
object Version {

    /*** BASE / 1 ***/

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.BASE]
     */
    val isPreBase: Boolean
        get() = Build.VERSION.SDK_INT < Build.VERSION_CODES.BASE

    /**
     * @return `true` if the device is [Build.VERSION_CODES.BASE]
     */
    val isBase: Boolean
        get() = Build.VERSION.SDK_INT == Build.VERSION_CODES.BASE

    /**
     * @return `true` if the device is [Build.VERSION_CODES.BASE] or later
     */
    val isBaseOrLater: Boolean
        get() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.BASE

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.BASE]
     */
    val isLaterThanBase: Boolean
        get() = Build.VERSION.SDK_INT > Build.VERSION_CODES.BASE

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.BASE]
     */
    val isPre1: Boolean
        get() = isPreBase

    /**
     * @return `true` if the device is [Build.VERSION_CODES.BASE]
     */
    val is1: Boolean
        get() = isBase

    /**
     * @return `true` if the device is [Build.VERSION_CODES.BASE] or later
     */
    val is1OrLater: Boolean
        get() = isBaseOrLater

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.BASE]
     */
    val isLaterThan1: Boolean
        get() = isLaterThanBase


    /*** BASE_1_1 / 2 ***/

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.BASE_1_1]
     */
    val isPreBase11: Boolean
        get() = Build.VERSION.SDK_INT < Build.VERSION_CODES.BASE_1_1

    /**
     * @return `true` if the device is [Build.VERSION_CODES.BASE_1_1]
     */
    val isBase11: Boolean
        get() = Build.VERSION.SDK_INT == Build.VERSION_CODES.BASE_1_1

    /**
     * @return `true` if the device is [Build.VERSION_CODES.BASE_1_1] or later
     */
    val isBase11OrLater: Boolean
        get() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.BASE_1_1

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.BASE_1_1]
     */
    val isLaterThanBase11: Boolean
        get() = Build.VERSION.SDK_INT > Build.VERSION_CODES.BASE_1_1


    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.BASE_1_1]
     */
    val isPrePetitFour: Boolean
        get() = isPreBase11

    /**
     * @return `true` if the device is [Build.VERSION_CODES.BASE_1_1]
     */
    val isPetitFour: Boolean
        get() = isBase11

    /**
     * @return `true` if the device is [Build.VERSION_CODES.BASE_1_1] or later
     */
    val isPetitFourOrLater: Boolean
        get() = isBase11OrLater

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.BASE_1_1]
     */
    val isLaterThanPetitFour: Boolean
        get() = isLaterThanBase11

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.BASE_1_1]
     */
    val isPre2: Boolean
        get() = isPreBase11

    /**
     * @return `true` if the device is [Build.VERSION_CODES.BASE_1_1]
     */
    val is2: Boolean
        get() = isBase11

    /**
     * @return `true` if the device is [Build.VERSION_CODES.BASE_1_1] or later
     */
    val is2OrLater: Boolean
        get() = isBase11OrLater

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.BASE_1_1]
     */
    val isLaterThan2: Boolean
        get() = isLaterThanBase11


    /*** CUPCAKE / 3 ***/

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.CUPCAKE]
     */
    val isPreCupcake: Boolean
        get() = Build.VERSION.SDK_INT < Build.VERSION_CODES.CUPCAKE

    /**
     * @return `true` if the device is [Build.VERSION_CODES.CUPCAKE]
     */
    val isCupcake: Boolean
        get() = Build.VERSION.SDK_INT == Build.VERSION_CODES.CUPCAKE

    /**
     * @return `true` if the device is [Build.VERSION_CODES.CUPCAKE] or later
     */
    val isCupcakeOrLater: Boolean
        get() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.CUPCAKE

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.CUPCAKE]
     */
    val isLaterThanCupcake: Boolean
        get() = Build.VERSION.SDK_INT > Build.VERSION_CODES.CUPCAKE

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.CUPCAKE]
     */
    val isPre3: Boolean
        get() = isPreCupcake

    /**
     * @return `true` if the device is [Build.VERSION_CODES.CUPCAKE]
     */
    val is3: Boolean
        get() = isCupcake

    /**
     * @return `true` if the device is [Build.VERSION_CODES.CUPCAKE] or later
     */
    val is3OrLater: Boolean
        get() = isCupcakeOrLater

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.CUPCAKE]
     */
    val isLaterThan3: Boolean
        get() = isLaterThanCupcake

    

    /*** DONUT / 4 ***/

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.DONUT]
     */
    val isPreDonut: Boolean
        get() = Build.VERSION.SDK_INT < Build.VERSION_CODES.DONUT

    /**
     * @return `true` if the device is [Build.VERSION_CODES.DONUT]
     */
    val isDonut: Boolean
        get() = Build.VERSION.SDK_INT == Build.VERSION_CODES.DONUT

    /**
     * @return `true` if the device is [Build.VERSION_CODES.DONUT] or later
     */
    val isDonutOrLater: Boolean
        get() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.DONUT

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.DONUT]
     */
    val isLaterThanDonut: Boolean
        get() = Build.VERSION.SDK_INT > Build.VERSION_CODES.DONUT

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.DONUT]
     */
    val isPre4: Boolean
        get() = isPreDonut

    /**
     * @return `true` if the device is [Build.VERSION_CODES.DONUT]
     */
    val is4: Boolean
        get() = isDonut

    /**
     * @return `true` if the device is [Build.VERSION_CODES.DONUT] or later
     */
    val is4OrLater: Boolean
        get() = isDonutOrLater

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.DONUT]
     */
    val isLaterThan4: Boolean
        get() = isLaterThanDonut
    
    
    

    /*** ECLAIR / 5 ***/

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.ECLAIR]
     */
    val isPreEclair: Boolean
        get() = Build.VERSION.SDK_INT < Build.VERSION_CODES.ECLAIR

    /**
     * @return `true` if the device is [Build.VERSION_CODES.ECLAIR]
     */
    val isEclair: Boolean
        get() = Build.VERSION.SDK_INT == Build.VERSION_CODES.ECLAIR

    /**
     * @return `true` if the device is [Build.VERSION_CODES.ECLAIR] or later
     */
    val isEclairOrLater: Boolean
        get() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.ECLAIR

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.ECLAIR]
     */
    val isLaterThanEclair: Boolean
        get() = Build.VERSION.SDK_INT > Build.VERSION_CODES.ECLAIR

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.ECLAIR]
     */
    val isPre5: Boolean
        get() = isPreEclair

    /**
     * @return `true` if the device is [Build.VERSION_CODES.ECLAIR]
     */
    val is5: Boolean
        get() = isEclair

    /**
     * @return `true` if the device is [Build.VERSION_CODES.ECLAIR] or later
     */
    val is5OrLater: Boolean
        get() = isEclairOrLater

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.ECLAIR]
     */
    val isLaterThan5: Boolean
        get() = isLaterThanEclair




    /*** ECLAIR_0_1 / 6 ***/

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.ECLAIR_0_1]
     */
    val isPreEclair01: Boolean
        get() = Build.VERSION.SDK_INT < Build.VERSION_CODES.ECLAIR_0_1

    /**
     * @return `true` if the device is [Build.VERSION_CODES.ECLAIR_0_1]
     */
    val isEclair01: Boolean
        get() = Build.VERSION.SDK_INT == Build.VERSION_CODES.ECLAIR_0_1

    /**
     * @return `true` if the device is [Build.VERSION_CODES.ECLAIR_0_1] or later
     */
    val isEclair01OrLater: Boolean
        get() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.ECLAIR_0_1

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.ECLAIR_0_1]
     */
    val isLaterThanEclair01: Boolean
        get() = Build.VERSION.SDK_INT > Build.VERSION_CODES.ECLAIR_0_1

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.ECLAIR_0_1]
     */
    val isPre6: Boolean
        get() = isPreEclair01

    /**
     * @return `true` if the device is [Build.VERSION_CODES.ECLAIR_0_1]
     */
    val is6: Boolean
        get() = isEclair01

    /**
     * @return `true` if the device is [Build.VERSION_CODES.ECLAIR_0_1] or later
     */
    val is6OrLater: Boolean
        get() = isEclair01OrLater

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.ECLAIR_0_1]
     */
    val isLaterThan6: Boolean
        get() = isLaterThanEclair01


    /*** ECLAIR_MR1 / 7 ***/

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.ECLAIR_MR1]
     */
    val isPreEclairMR1: Boolean
        get() = Build.VERSION.SDK_INT < Build.VERSION_CODES.ECLAIR_MR1

    /**
     * @return `true` if the device is [Build.VERSION_CODES.ECLAIR_MR1]
     */
    val isEclairMR1: Boolean
        get() = Build.VERSION.SDK_INT == Build.VERSION_CODES.ECLAIR_MR1

    /**
     * @return `true` if the device is [Build.VERSION_CODES.ECLAIR_MR1] or later
     */
    val isEclairMR1OrLater: Boolean
        get() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.ECLAIR_MR1

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.ECLAIR_MR1]
     */
    val isLaterThanEclairMR1: Boolean
        get() = Build.VERSION.SDK_INT > Build.VERSION_CODES.ECLAIR_MR1

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.ECLAIR_MR1]
     */
    val isPre7: Boolean
        get() = isPreEclairMR1

    /**
     * @return `true` if the device is [Build.VERSION_CODES.ECLAIR_MR1]
     */
    val is7: Boolean
        get() = isEclairMR1

    /**
     * @return `true` if the device is [Build.VERSION_CODES.ECLAIR_MR1] or later
     */
    val is7OrLater: Boolean
        get() = isEclairMR1OrLater

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.ECLAIR_MR1]
     */
    val isLaterThan7: Boolean
        get() = isLaterThanEclairMR1


    /*** FROYO / 8 ***/

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.FROYO]
     */
    val isPreFroyo: Boolean
        get() = Build.VERSION.SDK_INT < Build.VERSION_CODES.FROYO

    /**
     * @return `true` if the device is [Build.VERSION_CODES.FROYO]
     */
    val isFroyo: Boolean
        get() = Build.VERSION.SDK_INT == Build.VERSION_CODES.FROYO

    /**
     * @return `true` if the device is [Build.VERSION_CODES.FROYO] or later
     */
    val isFroyoOrLater: Boolean
        get() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.FROYO

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.FROYO]
     */
    val isLaterThanFroyo: Boolean
        get() = Build.VERSION.SDK_INT > Build.VERSION_CODES.FROYO

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.FROYO]
     */
    val isPre8: Boolean
        get() = isPreFroyo

    /**
     * @return `true` if the device is [Build.VERSION_CODES.FROYO]
     */
    val is8: Boolean
        get() = isFroyo

    /**
     * @return `true` if the device is [Build.VERSION_CODES.FROYO] or later
     */
    val is8OrLater: Boolean
        get() = isFroyoOrLater

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.FROYO]
     */
    val isLaterThan8: Boolean
        get() = isLaterThanFroyo


    /*** GINGERBREAD / 9 ***/

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.GINGERBREAD]
     */
    val isPreGingerbread: Boolean
        get() = Build.VERSION.SDK_INT < Build.VERSION_CODES.GINGERBREAD

    /**
     * @return `true` if the device is [Build.VERSION_CODES.GINGERBREAD]
     */
    val isGingerbread: Boolean
        get() = Build.VERSION.SDK_INT == Build.VERSION_CODES.GINGERBREAD

    /**
     * @return `true` if the device is [Build.VERSION_CODES.GINGERBREAD] or later
     */
    val isGingerbreadOrLater: Boolean
        get() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.GINGERBREAD

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.GINGERBREAD]
     */
    val isLaterThanGingerbread: Boolean
        get() = Build.VERSION.SDK_INT > Build.VERSION_CODES.GINGERBREAD

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.GINGERBREAD]
     */
    val isPre9: Boolean
        get() = isPreGingerbread

    /**
     * @return `true` if the device is [Build.VERSION_CODES.GINGERBREAD]
     */
    val is9: Boolean
        get() = isGingerbread

    /**
     * @return `true` if the device is [Build.VERSION_CODES.GINGERBREAD] or later
     */
    val is9OrLater: Boolean
        get() = isGingerbreadOrLater

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.GINGERBREAD]
     */
    val isLaterThan9: Boolean
        get() = isLaterThanGingerbread

    /*** GINGERBREAD MR1  / 10 ***/

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.GINGERBREAD_MR1]
     */
    val isPreGingerbreadMR1: Boolean
        get() = Build.VERSION.SDK_INT < Build.VERSION_CODES.GINGERBREAD_MR1

    /**
     * @return `true` if the device is [Build.VERSION_CODES.GINGERBREAD_MR1]
     */
    val isGingerbreadMR1: Boolean
        get() = Build.VERSION.SDK_INT == Build.VERSION_CODES.GINGERBREAD_MR1

    /**
     * @return `true` if the device is [Build.VERSION_CODES.GINGERBREAD_MR1] or later
     */
    val isGingerbreadMR1OrLater: Boolean
        get() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.GINGERBREAD_MR1

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.GINGERBREAD_MR1]
     */
    val isLaterThanGingerbreadMR1: Boolean
        get() = Build.VERSION.SDK_INT > Build.VERSION_CODES.GINGERBREAD_MR1

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.GINGERBREAD_MR1]
     */
    val isPre10: Boolean
        get() = isPreGingerbreadMR1

    /**
     * @return `true` if the device is [Build.VERSION_CODES.GINGERBREAD_MR1]
     */
    val is10: Boolean
        get() = isGingerbreadMR1

    /**
     * @return `true` if the device is [Build.VERSION_CODES.GINGERBREAD_MR1] or later
     */
    val is10OrLater: Boolean
        get() = isGingerbreadMR1OrLater

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.GINGERBREAD_MR1]
     */
    val isLaterThan10: Boolean
        get() = isLaterThanGingerbreadMR1

    /*** HONEYCOMB / 11 ***/

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.HONEYCOMB]
     */
    val isPreHoneycomb: Boolean
        get() = Build.VERSION.SDK_INT < Build.VERSION_CODES.HONEYCOMB

    /**
     * @return `true` if the device is [Build.VERSION_CODES.HONEYCOMB]
     */
    val isHoneycomb: Boolean
        get() = Build.VERSION.SDK_INT == Build.VERSION_CODES.HONEYCOMB

    /**
     * @return `true` if the device is [Build.VERSION_CODES.HONEYCOMB] or later
     */
    val isHoneycombOrLater: Boolean
        get() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.HONEYCOMB]
     */
    val isLaterThanHoneycomb: Boolean
        get() = Build.VERSION.SDK_INT > Build.VERSION_CODES.HONEYCOMB

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.HONEYCOMB]
     */
    val isPre11: Boolean
        get() = isPreHoneycomb

    /**
     * @return `true` if the device is [Build.VERSION_CODES.HONEYCOMB]
     */
    val is11: Boolean
        get() = isHoneycomb

    /**
     * @return `true` if the device is [Build.VERSION_CODES.HONEYCOMB] or later
     */
    val is11OrLater: Boolean
        get() = isHoneycombOrLater

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.HONEYCOMB]
     */
    val isLaterThan11: Boolean
        get() = isLaterThanHoneycomb

    /*** HONEYCOMB MR1  / 12 ***/

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.HONEYCOMB_MR1]
     */
    val isPreHoneycombMR1: Boolean
        get() = Build.VERSION.SDK_INT < Build.VERSION_CODES.HONEYCOMB_MR1

    /**
     * @return `true` if the device is [Build.VERSION_CODES.HONEYCOMB_MR1]
     */
    val isHoneycombMR1: Boolean
        get() = Build.VERSION.SDK_INT == Build.VERSION_CODES.HONEYCOMB_MR1

    /**
     * @return `true` if the device is [Build.VERSION_CODES.HONEYCOMB_MR1] or later
     */
    val isHoneycombMR1OrLater: Boolean
        get() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR1

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.HONEYCOMB_MR1]
     */
    val isLaterThanHoneycombMR1: Boolean
        get() = Build.VERSION.SDK_INT > Build.VERSION_CODES.HONEYCOMB_MR1

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.HONEYCOMB_MR1]
     */
    val isPre12: Boolean
        get() = isPreHoneycombMR1

    /**
     * @return `true` if the device is [Build.VERSION_CODES.HONEYCOMB_MR1]
     */
    val is12: Boolean
        get() = isHoneycombMR1

    /**
     * @return `true` if the device is [Build.VERSION_CODES.HONEYCOMB_MR1] or later
     */
    val is12OrLater: Boolean
        get() = isHoneycombMR1OrLater

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.HONEYCOMB_MR1]
     */
    val isLaterThan12: Boolean
        get() = isLaterThanHoneycombMR1


    /*** HONEYCOMB MR2  / 13 ***/

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.HONEYCOMB_MR2]
     */
    val isPreHoneycombMR2: Boolean
        get() = Build.VERSION.SDK_INT < Build.VERSION_CODES.HONEYCOMB_MR2

    /**
     * @return `true` if the device is [Build.VERSION_CODES.HONEYCOMB_MR2]
     */
    val isHoneycombMR2: Boolean
        get() = Build.VERSION.SDK_INT == Build.VERSION_CODES.HONEYCOMB_MR2

    /**
     * @return `true` if the device is [Build.VERSION_CODES.HONEYCOMB_MR2] or later
     */
    val isHoneycombMR2OrLater: Boolean
        get() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR2

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.HONEYCOMB_MR2]
     */
    val isLaterThanHoneycombMR2: Boolean
        get() = Build.VERSION.SDK_INT > Build.VERSION_CODES.HONEYCOMB_MR2

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.HONEYCOMB_MR2]
     */
    val isPre13: Boolean
        get() = isPreHoneycombMR2

    /**
     * @return `true` if the device is [Build.VERSION_CODES.HONEYCOMB_MR2]
     */
    val is13: Boolean
        get() = isHoneycombMR2

    /**
     * @return `true` if the device is [Build.VERSION_CODES.HONEYCOMB_MR2] or later
     */
    val is13OrLater: Boolean
        get() = isHoneycombMR2OrLater

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.HONEYCOMB_MR2]
     */
    val isLaterThan13: Boolean
        get() = isLaterThanHoneycombMR2

    
    /*** ICE CREAM SANDWICH MR1   / 14 ***/

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.ICE_CREAM_SANDWICH]
     */
    val isPreIceCreamSandwich: Boolean
        get() = Build.VERSION.SDK_INT < Build.VERSION_CODES.ICE_CREAM_SANDWICH

    /**
     * @return `true` if the device is [Build.VERSION_CODES.ICE_CREAM_SANDWICH]
     */
    val isIceCreamSandwich: Boolean
        get() = Build.VERSION.SDK_INT == Build.VERSION_CODES.ICE_CREAM_SANDWICH

    /**
     * @return `true` if the device is [Build.VERSION_CODES.ICE_CREAM_SANDWICH] or later
     */
    val isIceCreamSandwichOrLater: Boolean
        get() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.ICE_CREAM_SANDWICH]
     */
    val isLaterThanIceCreamSandwich: Boolean
        get() = Build.VERSION.SDK_INT > Build.VERSION_CODES.ICE_CREAM_SANDWICH

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.ICE_CREAM_SANDWICH]
     */
    val isPre14: Boolean
        get() = isPreIceCreamSandwich

    /**
     * @return `true` if the device is [Build.VERSION_CODES.ICE_CREAM_SANDWICH]
     */
    val is14: Boolean
        get() = isIceCreamSandwich

    /**
     * @return `true` if the device is [Build.VERSION_CODES.ICE_CREAM_SANDWICH] or later
     */
    val is14OrLater: Boolean
        get() = isIceCreamSandwichOrLater

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.ICE_CREAM_SANDWICH]
     */
    val isLaterThan14: Boolean
        get() = isLaterThanIceCreamSandwich

    /*** ICE CREAM SANDWICH MR1   / 15 ***/

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1]
     */
    val isPreIceCreamSandwichMR1: Boolean
        get() = Build.VERSION.SDK_INT < Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1

    /**
     * @return `true` if the device is [Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1]
     */
    val isIceCreamSandwichMR1: Boolean
        get() = Build.VERSION.SDK_INT == Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1

    /**
     * @return `true` if the device is [Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1] or later
     */
    val isIceCreamSandwichMR1OrLater: Boolean
        get() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1]
     */
    val isLaterThanIceCreamSandwichMR1: Boolean
        get() = Build.VERSION.SDK_INT > Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1]
     */
    val isPre15: Boolean
        get() = isPreIceCreamSandwichMR1

    /**
     * @return `true` if the device is [Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1]
     */
    val is15: Boolean
        get() = isIceCreamSandwichMR1

    /**
     * @return `true` if the device is [Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1] or later
     */
    val is15OrLater: Boolean
        get() = isIceCreamSandwichMR1OrLater

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1]
     */
    val isLaterThan15: Boolean
        get() = isLaterThanIceCreamSandwichMR1


    /*** JELLY BEAN   / 16 ***/

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.JELLY_BEAN]
     */
    val isPreJellyBean: Boolean
        get() = Build.VERSION.SDK_INT < Build.VERSION_CODES.JELLY_BEAN

    /**
     * @return `true` if the device is [Build.VERSION_CODES.JELLY_BEAN]
     */
    val isJellyBean: Boolean
        get() = Build.VERSION.SDK_INT == Build.VERSION_CODES.JELLY_BEAN

    /**
     * @return `true` if the device is [Build.VERSION_CODES.JELLY_BEAN] or later
     */
    val isJellyBeanOrLater: Boolean
        get() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.JELLY_BEAN]
     */
    val isLaterThanJellyBean: Boolean
        get() = Build.VERSION.SDK_INT > Build.VERSION_CODES.JELLY_BEAN

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.JELLY_BEAN]
     */
    val isPre16: Boolean
        get() = isPreJellyBean

    /**
     * @return `true` if the device is [Build.VERSION_CODES.JELLY_BEAN]
     */
    val is16: Boolean
        get() = isJellyBean

    /**
     * @return `true` if the device is [Build.VERSION_CODES.JELLY_BEAN] or later
     */
    val is16OrLater: Boolean
        get() = isJellyBeanOrLater

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.JELLY_BEAN]
     */
    val isLaterThan16: Boolean
        get() = isLaterThanJellyBean

    /*** JELLY BEAN MR1  / 17 ***/

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.JELLY_BEAN_MR1]
     */
    val isPreJellyBeanMR1: Boolean
        get() = Build.VERSION.SDK_INT < Build.VERSION_CODES.JELLY_BEAN_MR1

    /**
     * @return `true` if the device is [Build.VERSION_CODES.JELLY_BEAN_MR1]
     */
    val isJellyBeanMR1: Boolean
        get() = Build.VERSION.SDK_INT == Build.VERSION_CODES.JELLY_BEAN_MR1

    /**
     * @return `true` if the device is [Build.VERSION_CODES.JELLY_BEAN_MR1] or later
     */
    val isJellyBeanMR1OrLater: Boolean
        get() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.JELLY_BEAN_MR1]
     */
    val isLaterThanJellyBeanMR1: Boolean
        get() = Build.VERSION.SDK_INT > Build.VERSION_CODES.JELLY_BEAN_MR1

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.JELLY_BEAN_MR1]
     */
    val isPre17: Boolean
        get() = isPreJellyBeanMR1

    /**
     * @return `true` if the device is [Build.VERSION_CODES.JELLY_BEAN_MR1]
     */
    val is17: Boolean
        get() = isJellyBeanMR1

    /**
     * @return `true` if the device is [Build.VERSION_CODES.JELLY_BEAN_MR1] or later
     */
    val is17OrLater: Boolean
        get() = isJellyBeanMR1OrLater

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.JELLY_BEAN_MR1]
     */
    val isLaterThan17: Boolean
        get() = isLaterThanJellyBeanMR1


    /*** JELLY BEAN MR2  / 18 ***/

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.JELLY_BEAN_MR2]
     */
    val isPreJellyBeanMR2: Boolean
        get() = Build.VERSION.SDK_INT < Build.VERSION_CODES.JELLY_BEAN_MR2

    /**
     * @return `true` if the device is [Build.VERSION_CODES.JELLY_BEAN_MR2]
     */
    val isJellyBeanMR2: Boolean
        get() = Build.VERSION.SDK_INT == Build.VERSION_CODES.JELLY_BEAN_MR2

    /**
     * @return `true` if the device is [Build.VERSION_CODES.JELLY_BEAN_MR2] or later
     */
    val isJellyBeanMR2OrLater: Boolean
        get() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR2

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.JELLY_BEAN_MR2]
     */
    val isLaterThanJellyBeanMR2: Boolean
        get() = Build.VERSION.SDK_INT > Build.VERSION_CODES.JELLY_BEAN_MR2

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.JELLY_BEAN_MR2]
     */
    val isPre18: Boolean
        get() = isPreJellyBeanMR2

    /**
     * @return `true` if the device is [Build.VERSION_CODES.JELLY_BEAN_MR2]
     */
    val is18: Boolean
        get() = isJellyBeanMR2

    /**
     * @return `true` if the device is [Build.VERSION_CODES.JELLY_BEAN_MR2] or later
     */
    val is18OrLater: Boolean
        get() = isJellyBeanMR2OrLater

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.JELLY_BEAN_MR2]
     */
    val isLaterThan18: Boolean
        get() = isLaterThanJellyBeanMR2

    /*** KITKAT WATCH / 19 ***/

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.KITKAT]
     */
    val isPreKitKat: Boolean
        get() = Build.VERSION.SDK_INT < Build.VERSION_CODES.KITKAT

    /**
     * @return `true` if the device is [Build.VERSION_CODES.KITKAT]
     */
    val isKitKat: Boolean
        get() = Build.VERSION.SDK_INT == Build.VERSION_CODES.KITKAT

    /**
     * @return `true` if the device is [Build.VERSION_CODES.KITKAT] or later
     */
    val isKitKatOrLater: Boolean
        get() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.KITKAT]
     */
    val isLaterThanKitKat: Boolean
        get() = Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.KITKAT]
     */
    val isPre19: Boolean
        get() = isPreKitKat

    /**
     * @return `true` if the device is [Build.VERSION_CODES.KITKAT]
     */
    val is19: Boolean
        get() = isKitKat

    /**
     * @return `true` if the device is [Build.VERSION_CODES.KITKAT] or later
     */
    val is19OrLater: Boolean
        get() = isKitKatOrLater

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.KITKAT]
     */
    val isLaterThan19: Boolean
        get() = isLaterThanKitKat


    /*** KITKAT WATCH / 20 ***/

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.KITKAT_WATCH]
     */
    val isPreKitKatWatch: Boolean
        get() = Build.VERSION.SDK_INT < Build.VERSION_CODES.KITKAT_WATCH

    /**
     * @return `true` if the device is [Build.VERSION_CODES.KITKAT_WATCH]
     */
    val isKitKatWatch: Boolean
        get() = Build.VERSION.SDK_INT == Build.VERSION_CODES.KITKAT_WATCH

    /**
     * @return `true` if the device is [Build.VERSION_CODES.KITKAT_WATCH] or later
     */
    val isKitKatWatchOrLater: Boolean
        get() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT_WATCH

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.KITKAT_WATCH]
     */
    val isLaterThanKitKatWatch: Boolean
        get() = Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT_WATCH

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.KITKAT_WATCH]
     */
    val isPre20: Boolean
        get() = isPreKitKatWatch

    /**
     * @return `true` if the device is [Build.VERSION_CODES.KITKAT_WATCH]
     */
    val is20: Boolean
        get() = isKitKatWatch

    /**
     * @return `true` if the device is [Build.VERSION_CODES.KITKAT_WATCH] or later
     */
    val is20OrLater: Boolean
        get() = isKitKatWatchOrLater

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.KITKAT_WATCH]
     */
    val isLaterThan20: Boolean
        get() = isLaterThanKitKatWatch


    /*** L / 21 ***/

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.LOLLIPOP]
     */
    val isPreLollipop: Boolean
        get() = Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP

    /**
     * @return `true` if the device is [Build.VERSION_CODES.LOLLIPOP]
     */
    val isLollipop: Boolean
        get() = Build.VERSION.SDK_INT == Build.VERSION_CODES.LOLLIPOP

    /**
     * @return `true` if the device is [Build.VERSION_CODES.LOLLIPOP] or later
     */
    val isLollipopOrLater: Boolean
        get() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.LOLLIPOP]
     */
    val isLaterThanLollipop: Boolean
        get() = Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.LOLLIPOP]
     */
    val isPre21: Boolean
        get() = isPreLollipop

    /**
     * @return `true` if the device is [Build.VERSION_CODES.LOLLIPOP]
     */
    val is21: Boolean
        get() = isLollipop

    /**
     * @return `true` if the device is [Build.VERSION_CODES.LOLLIPOP] or later
     */
    val is21OrLater: Boolean
        get() = isLollipopOrLater

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.LOLLIPOP]
     */
    val isLaterThan21: Boolean
        get() = isLaterThanLollipop

    /*** L / 22 ***/

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.LOLLIPOP_MR1]
     */
    val isPreLollipopMR1: Boolean
        get() = Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP_MR1

    /**
     * @return `true` if the device is [Build.VERSION_CODES.LOLLIPOP_MR1]
     */
    val isLollipopMR1: Boolean
        get() = Build.VERSION.SDK_INT == Build.VERSION_CODES.LOLLIPOP_MR1

    /**
     * @return `true` if the device is [Build.VERSION_CODES.LOLLIPOP_MR1] or later
     */
    val isLollipopMR1OrLater: Boolean
        get() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP_MR1

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.LOLLIPOP_MR1]
     */
    val isLaterThanLollipopMR1: Boolean
        get() = Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP_MR1

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.LOLLIPOP_MR1]
     */
    val isPre22: Boolean
        get() = isPreLollipopMR1

    /**
     * @return `true` if the device is [Build.VERSION_CODES.LOLLIPOP_MR1]
     */
    val is22: Boolean
        get() = isLollipopMR1

    /**
     * @return `true` if the device is [Build.VERSION_CODES.LOLLIPOP_MR1] or later
     */
    val is22OrLater: Boolean
        get() = isLollipopMR1OrLater

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.LOLLIPOP_MR1]
     */
    val isLaterThan22: Boolean
        get() = isLaterThanLollipopMR1


    /*** M / 23 ***/

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.M]
     */
    val isPreM: Boolean
        get() = Build.VERSION.SDK_INT < Build.VERSION_CODES.M

    /**
     * @return `true` if the device is [Build.VERSION_CODES.M]
     */
    val isM: Boolean
        get() = Build.VERSION.SDK_INT == Build.VERSION_CODES.M

    /**
     * @return `true` if the device is [Build.VERSION_CODES.M] or later
     */
    val isMOrLater: Boolean
        get() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.M

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.M]
     */
    val isLaterThanM: Boolean
        get() = Build.VERSION.SDK_INT > Build.VERSION_CODES.M


    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.M]
     */
    val isPreMarshmallow: Boolean
        get() = isPreM

    /**
     * @return `true` if the device is [Build.VERSION_CODES.M]
     */
    val isMarshmallow: Boolean
        get() = isM

    /**
     * @return `true` if the device is [Build.VERSION_CODES.M] or later
     */
    val isMarshmallowOrLater: Boolean
        get() = isMOrLater

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.M]
     */
    val isLaterThanMarshmallow: Boolean
        get() = isLaterThanM

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.M]
     */
    val isPre23: Boolean
        get() = isPreM

    /**
     * @return `true` if the device is [Build.VERSION_CODES.M]
     */
    val is23: Boolean
        get() = isM

    /**
     * @return `true` if the device is [Build.VERSION_CODES.M] or later
     */
    val is23OrLater: Boolean
        get() = isMOrLater

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.M]
     */
    val isLaterThan23: Boolean
        get() = isLaterThanM


    /*** N / 24 ***/

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.N]
     */
    val isPreN: Boolean
        get() = Build.VERSION.SDK_INT < Build.VERSION_CODES.N

    /**
     * @return `true` if the device is [Build.VERSION_CODES.N]
     */
    val isN: Boolean
        get() = Build.VERSION.SDK_INT == Build.VERSION_CODES.N

    /**
     * @return `true` if the device is [Build.VERSION_CODES.N] or later
     */
    val isNOrLater: Boolean
        get() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.N

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.N]
     */
    val isLaterThanN: Boolean
        get() = Build.VERSION.SDK_INT > Build.VERSION_CODES.N

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.N]
     */
    val isPre24: Boolean
        get() = isPreN

    /**
     * @return `true` if the device is [Build.VERSION_CODES.N]
     */
    val is24: Boolean
        get() = isN

    /**
     * @return `true` if the device is [Build.VERSION_CODES.N] or later
     */
    val is24OrLater: Boolean
        get() = isNOrLater

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.N]
     */
    val isLaterThan24: Boolean
        get() = isLaterThanN

    /*** N / 25 ***/

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.N_MR1]
     */
    val isPreNMR1: Boolean
        get() = Build.VERSION.SDK_INT < Build.VERSION_CODES.N_MR1

    /**
     * @return `true` if the device is [Build.VERSION_CODES.N_MR1]
     */
    val isNMR1: Boolean
        get() = Build.VERSION.SDK_INT == Build.VERSION_CODES.N_MR1

    /**
     * @return `true` if the device is [Build.VERSION_CODES.N_MR1] or later
     */
    val isNMR1OrLater: Boolean
        get() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.N_MR1

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.N_MR1]
     */
    val isLaterThanNMR1: Boolean
        get() = Build.VERSION.SDK_INT > Build.VERSION_CODES.N_MR1

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.N_MR1]
     */
    val isPre25: Boolean
        get() = isPreNMR1

    /**
     * @return `true` if the device is [Build.VERSION_CODES.N_MR1]
     */
    val is25: Boolean
        get() = isNMR1

    /**
     * @return `true` if the device is [Build.VERSION_CODES.N_MR1] or later
     */
    val is25OrLater: Boolean
        get() = isNMR1OrLater

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.N_MR1]
     */
    val isLaterThan25: Boolean
        get() = isLaterThanNMR1


    /*** O / 26 ***/

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.O]
     */
    val isPreO: Boolean
        get() = Build.VERSION.SDK_INT < Build.VERSION_CODES.O

    /**
     * @return `true` if the device is [Build.VERSION_CODES.O]
     */
    val isO: Boolean
        get() = Build.VERSION.SDK_INT == Build.VERSION_CODES.O

    /**
     * @return `true` if the device is [Build.VERSION_CODES.O] or later
     */
    val isOOrLater: Boolean
        get() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.O

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.O]
     */
    val isLaterThanO: Boolean
        get() = Build.VERSION.SDK_INT > Build.VERSION_CODES.O

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.O]
     */
    val isPre26: Boolean
        get() = isPreO

    /**
     * @return `true` if the device is [Build.VERSION_CODES.O]
     */
    val is26: Boolean
        get() = isO

    /**
     * @return `true` if the device is [Build.VERSION_CODES.O] or later
     */
    val is26OrLater: Boolean
        get() = isOOrLater

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.O]
     */
    val isLaterThan26: Boolean
        get() = isLaterThanO

    /*** O / 27 ***/

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.O_MR1]
     */
    val isPreOMR1: Boolean
        get() = Build.VERSION.SDK_INT < Build.VERSION_CODES.O_MR1

    /**
     * @return `true` if the device is [Build.VERSION_CODES.O_MR1]
     */
    val isOMR1: Boolean
        get() = Build.VERSION.SDK_INT == Build.VERSION_CODES.O_MR1

    /**
     * @return `true` if the device is [Build.VERSION_CODES.O_MR1] or later
     */
    val isOMR1OrLater: Boolean
        get() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.O_MR1

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.O_MR1]
     */
    val isLaterThanOMR1: Boolean
        get() = Build.VERSION.SDK_INT > Build.VERSION_CODES.O_MR1

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.O_MR1]
     */
    val isPre27: Boolean
        get() = isPreOMR1

    /**
     * @return `true` if the device is [Build.VERSION_CODES.O_MR1]
     */
    val is27: Boolean
        get() = isOMR1

    /**
     * @return `true` if the device is [Build.VERSION_CODES.O_MR1] or later
     */
    val is27OrLater: Boolean
        get() = isOMR1OrLater

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.O_MR1]
     */
    val isLaterThan27: Boolean
        get() = isLaterThanOMR1




    /*** P / 28 ***/

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.P]
     */
    val isPreP: Boolean
        get() = Build.VERSION.SDK_INT < Build.VERSION_CODES.P

    /**
     * @return `true` if the device is [Build.VERSION_CODES.P]
     */
    val isP: Boolean
        get() = Build.VERSION.SDK_INT == Build.VERSION_CODES.P

    /**
     * @return `true` if the device is [Build.VERSION_CODES.P] or later
     */
    val isPOrLater: Boolean
        get() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.P

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.P]
     */
    val isLaterThanP: Boolean
        get() = Build.VERSION.SDK_INT > Build.VERSION_CODES.P

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.P]
     */
    val isPre28: Boolean
        get() = isPreP

    /**
     * @return `true` if the device is [Build.VERSION_CODES.P]
     */
    val is28: Boolean
        get() = isP

    /**
     * @return `true` if the device is [Build.VERSION_CODES.P] or later
     */
    val is28OrLater: Boolean
        get() = isPOrLater

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.P]
     */
    val isLaterThan28: Boolean
        get() = isLaterThanP


    /*** Q / 29 ***/

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.Q]
     */
    val isPreQ: Boolean
        get() = Build.VERSION.SDK_INT < Build.VERSION_CODES.Q

    /**
     * @return `true` if the device is [Build.VERSION_CODES.Q]
     */
    val isQ: Boolean
        get() = Build.VERSION.SDK_INT == Build.VERSION_CODES.Q

    /**
     * @return `true` if the device is [Build.VERSION_CODES.Q] or later
     */
    val isQOrLater: Boolean
        get() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.Q]
     */
    val isLaterThanQ: Boolean
        get() = Build.VERSION.SDK_INT > Build.VERSION_CODES.Q

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.Q]
     */
    val isPre29: Boolean
        get() = isPreQ

    /**
     * @return `true` if the device is [Build.VERSION_CODES.Q]
     */
    val is29: Boolean
        get() = isQ

    /**
     * @return `true` if the device is [Build.VERSION_CODES.Q] or later
     */
    val is29OrLater: Boolean
        get() = isQOrLater

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.Q]
     */
    val isLaterThan29: Boolean
        get() = isLaterThanQ

    /*** R / 30 ***/

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.R]
     */
    val isPreR: Boolean
        get() = Build.VERSION.SDK_INT < Build.VERSION_CODES.R

    /**
     * @return `true` if the device is [Build.VERSION_CODES.R]
     */
    val isR: Boolean
        get() = Build.VERSION.SDK_INT == Build.VERSION_CODES.R

    /**
     * @return `true` if the device is [Build.VERSION_CODES.R] or later
     */
    val isROrLater: Boolean
        get() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.R

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.R]
     */
    val isLaterThanR: Boolean
        get() = Build.VERSION.SDK_INT > Build.VERSION_CODES.R

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.R]
     */
    val isPre30: Boolean
        get() = isPreR

    /**
     * @return `true` if the device is [Build.VERSION_CODES.R]
     */
    val is30: Boolean
        get() = isR

    /**
     * @return `true` if the device is [Build.VERSION_CODES.R] or later
     */
    val is30OrLater: Boolean
        get() = isROrLater

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.R]
     */
    val isLaterThan30: Boolean
        get() = isLaterThanR




    /*** UNRELEASED STILL UNDER DEVELOPMENT VERSION ***/

    /**
     * @return `true` if the device is prior to [Build.VERSION_CODES.CUR_DEVELOPMENT]
     */
    val isPreCurrentDevelopment: Boolean
        get() = Build.VERSION.SDK_INT < Build.VERSION_CODES.CUR_DEVELOPMENT

    /**
     * @return `true` if the device is [Build.VERSION_CODES.CUR_DEVELOPMENT]
     */
    val isCurrentDevelopment: Boolean
        get() = Build.VERSION.SDK_INT == Build.VERSION_CODES.CUR_DEVELOPMENT

    /**
     * @return `true` if the device is [Build.VERSION_CODES.CUR_DEVELOPMENT] or later
     */
    val isCurrentDevelopmentOrLater: Boolean
        get() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.CUR_DEVELOPMENT

    /**
     * @return `true` if the device is later than [Build.VERSION_CODES.CUR_DEVELOPMENT]
     */
    val isLaterThanCurrentDevelopment: Boolean
        get() = Build.VERSION.SDK_INT > Build.VERSION_CODES.CUR_DEVELOPMENT



    /**
     * Simple wrapper function around `Build.VERSION.SDK_INT`. Useful when checking
     * version range. Example:
     * ```
     *  when (Version.sdkVersionNumber) {
     *      in 24..28 -> {...}
     *      else -> {...}
     *  }
     * ```
     * @return the build version of the device.
     */
    val sdkVersionNumber: Int
        get() = Build.VERSION.SDK_INT

}
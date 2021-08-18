package com.tobianoapps.androidsdkversionutil

import android.os.Build
import android.os.Build.VERSION
import com.google.common.truth.Truth.assertThat
import com.tobianoapps.androidsdkversionutil.Version.is1
import com.tobianoapps.androidsdkversionutil.Version.is10
import com.tobianoapps.androidsdkversionutil.Version.is10OrLater
import com.tobianoapps.androidsdkversionutil.Version.is11
import com.tobianoapps.androidsdkversionutil.Version.is11OrLater
import com.tobianoapps.androidsdkversionutil.Version.is12
import com.tobianoapps.androidsdkversionutil.Version.is12OrLater
import com.tobianoapps.androidsdkversionutil.Version.is13
import com.tobianoapps.androidsdkversionutil.Version.is13OrLater
import com.tobianoapps.androidsdkversionutil.Version.is14
import com.tobianoapps.androidsdkversionutil.Version.is14OrLater
import com.tobianoapps.androidsdkversionutil.Version.is15
import com.tobianoapps.androidsdkversionutil.Version.is15OrLater
import com.tobianoapps.androidsdkversionutil.Version.is16
import com.tobianoapps.androidsdkversionutil.Version.is16OrLater
import com.tobianoapps.androidsdkversionutil.Version.is17
import com.tobianoapps.androidsdkversionutil.Version.is17OrLater
import com.tobianoapps.androidsdkversionutil.Version.is18
import com.tobianoapps.androidsdkversionutil.Version.is18OrLater
import com.tobianoapps.androidsdkversionutil.Version.is19
import com.tobianoapps.androidsdkversionutil.Version.is19OrLater
import com.tobianoapps.androidsdkversionutil.Version.is1OrLater
import com.tobianoapps.androidsdkversionutil.Version.is2
import com.tobianoapps.androidsdkversionutil.Version.is20
import com.tobianoapps.androidsdkversionutil.Version.is20OrLater
import com.tobianoapps.androidsdkversionutil.Version.is21
import com.tobianoapps.androidsdkversionutil.Version.is21OrLater
import com.tobianoapps.androidsdkversionutil.Version.is22
import com.tobianoapps.androidsdkversionutil.Version.is22OrLater
import com.tobianoapps.androidsdkversionutil.Version.is23
import com.tobianoapps.androidsdkversionutil.Version.is23OrLater
import com.tobianoapps.androidsdkversionutil.Version.is24
import com.tobianoapps.androidsdkversionutil.Version.is24OrLater
import com.tobianoapps.androidsdkversionutil.Version.is25
import com.tobianoapps.androidsdkversionutil.Version.is25OrLater
import com.tobianoapps.androidsdkversionutil.Version.is26
import com.tobianoapps.androidsdkversionutil.Version.is26OrLater
import com.tobianoapps.androidsdkversionutil.Version.is27
import com.tobianoapps.androidsdkversionutil.Version.is27OrLater
import com.tobianoapps.androidsdkversionutil.Version.is28
import com.tobianoapps.androidsdkversionutil.Version.is28OrLater
import com.tobianoapps.androidsdkversionutil.Version.is29
import com.tobianoapps.androidsdkversionutil.Version.is29OrLater
import com.tobianoapps.androidsdkversionutil.Version.is2OrLater
import com.tobianoapps.androidsdkversionutil.Version.is3
import com.tobianoapps.androidsdkversionutil.Version.is30
import com.tobianoapps.androidsdkversionutil.Version.is30OrLater
import com.tobianoapps.androidsdkversionutil.Version.is31
import com.tobianoapps.androidsdkversionutil.Version.is31OrLater
import com.tobianoapps.androidsdkversionutil.Version.is3OrLater
import com.tobianoapps.androidsdkversionutil.Version.is4
import com.tobianoapps.androidsdkversionutil.Version.is4OrLater
import com.tobianoapps.androidsdkversionutil.Version.is5
import com.tobianoapps.androidsdkversionutil.Version.is5OrLater
import com.tobianoapps.androidsdkversionutil.Version.is6
import com.tobianoapps.androidsdkversionutil.Version.is6OrLater
import com.tobianoapps.androidsdkversionutil.Version.is7
import com.tobianoapps.androidsdkversionutil.Version.is7OrLater
import com.tobianoapps.androidsdkversionutil.Version.is8
import com.tobianoapps.androidsdkversionutil.Version.is8OrLater
import com.tobianoapps.androidsdkversionutil.Version.is9
import com.tobianoapps.androidsdkversionutil.Version.is9OrLater
import com.tobianoapps.androidsdkversionutil.Version.isBase
import com.tobianoapps.androidsdkversionutil.Version.isBase11
import com.tobianoapps.androidsdkversionutil.Version.isBase11OrLater
import com.tobianoapps.androidsdkversionutil.Version.isBaseOrLater
import com.tobianoapps.androidsdkversionutil.Version.isCupcake
import com.tobianoapps.androidsdkversionutil.Version.isCupcakeOrLater
import com.tobianoapps.androidsdkversionutil.Version.isCurrentDevelopment
import com.tobianoapps.androidsdkversionutil.Version.isCurrentDevelopmentOrLater
import com.tobianoapps.androidsdkversionutil.Version.isDonut
import com.tobianoapps.androidsdkversionutil.Version.isDonutOrLater
import com.tobianoapps.androidsdkversionutil.Version.isEclair
import com.tobianoapps.androidsdkversionutil.Version.isEclair01
import com.tobianoapps.androidsdkversionutil.Version.isEclair01OrLater
import com.tobianoapps.androidsdkversionutil.Version.isEclairMR1
import com.tobianoapps.androidsdkversionutil.Version.isEclairMR1OrLater
import com.tobianoapps.androidsdkversionutil.Version.isEclairOrLater
import com.tobianoapps.androidsdkversionutil.Version.isFroyo
import com.tobianoapps.androidsdkversionutil.Version.isFroyoOrLater
import com.tobianoapps.androidsdkversionutil.Version.isGingerbread
import com.tobianoapps.androidsdkversionutil.Version.isGingerbreadMR1
import com.tobianoapps.androidsdkversionutil.Version.isGingerbreadMR1OrLater
import com.tobianoapps.androidsdkversionutil.Version.isGingerbreadOrLater
import com.tobianoapps.androidsdkversionutil.Version.isHoneycomb
import com.tobianoapps.androidsdkversionutil.Version.isHoneycombMR1
import com.tobianoapps.androidsdkversionutil.Version.isHoneycombMR1OrLater
import com.tobianoapps.androidsdkversionutil.Version.isHoneycombMR2
import com.tobianoapps.androidsdkversionutil.Version.isHoneycombMR2OrLater
import com.tobianoapps.androidsdkversionutil.Version.isHoneycombOrLater
import com.tobianoapps.androidsdkversionutil.Version.isIceCreamSandwich
import com.tobianoapps.androidsdkversionutil.Version.isIceCreamSandwichMR1
import com.tobianoapps.androidsdkversionutil.Version.isIceCreamSandwichMR1OrLater
import com.tobianoapps.androidsdkversionutil.Version.isIceCreamSandwichOrLater
import com.tobianoapps.androidsdkversionutil.Version.isJellyBean
import com.tobianoapps.androidsdkversionutil.Version.isJellyBeanMR1
import com.tobianoapps.androidsdkversionutil.Version.isJellyBeanMR1OrLater
import com.tobianoapps.androidsdkversionutil.Version.isJellyBeanMR2
import com.tobianoapps.androidsdkversionutil.Version.isJellyBeanMR2OrLater
import com.tobianoapps.androidsdkversionutil.Version.isJellyBeanOrLater
import com.tobianoapps.androidsdkversionutil.Version.isKitKat
import com.tobianoapps.androidsdkversionutil.Version.isKitKatOrLater
import com.tobianoapps.androidsdkversionutil.Version.isKitKatWatch
import com.tobianoapps.androidsdkversionutil.Version.isKitKatWatchOrLater
import com.tobianoapps.androidsdkversionutil.Version.isLaterThan1
import com.tobianoapps.androidsdkversionutil.Version.isLaterThan10
import com.tobianoapps.androidsdkversionutil.Version.isLaterThan11
import com.tobianoapps.androidsdkversionutil.Version.isLaterThan12
import com.tobianoapps.androidsdkversionutil.Version.isLaterThan13
import com.tobianoapps.androidsdkversionutil.Version.isLaterThan14
import com.tobianoapps.androidsdkversionutil.Version.isLaterThan15
import com.tobianoapps.androidsdkversionutil.Version.isLaterThan16
import com.tobianoapps.androidsdkversionutil.Version.isLaterThan17
import com.tobianoapps.androidsdkversionutil.Version.isLaterThan18
import com.tobianoapps.androidsdkversionutil.Version.isLaterThan19
import com.tobianoapps.androidsdkversionutil.Version.isLaterThan2
import com.tobianoapps.androidsdkversionutil.Version.isLaterThan20
import com.tobianoapps.androidsdkversionutil.Version.isLaterThan21
import com.tobianoapps.androidsdkversionutil.Version.isLaterThan22
import com.tobianoapps.androidsdkversionutil.Version.isLaterThan23
import com.tobianoapps.androidsdkversionutil.Version.isLaterThan24
import com.tobianoapps.androidsdkversionutil.Version.isLaterThan25
import com.tobianoapps.androidsdkversionutil.Version.isLaterThan26
import com.tobianoapps.androidsdkversionutil.Version.isLaterThan27
import com.tobianoapps.androidsdkversionutil.Version.isLaterThan28
import com.tobianoapps.androidsdkversionutil.Version.isLaterThan29
import com.tobianoapps.androidsdkversionutil.Version.isLaterThan3
import com.tobianoapps.androidsdkversionutil.Version.isLaterThan30
import com.tobianoapps.androidsdkversionutil.Version.isLaterThan31
import com.tobianoapps.androidsdkversionutil.Version.isLaterThan4
import com.tobianoapps.androidsdkversionutil.Version.isLaterThan5
import com.tobianoapps.androidsdkversionutil.Version.isLaterThan6
import com.tobianoapps.androidsdkversionutil.Version.isLaterThan7
import com.tobianoapps.androidsdkversionutil.Version.isLaterThan8
import com.tobianoapps.androidsdkversionutil.Version.isLaterThan9
import com.tobianoapps.androidsdkversionutil.Version.isLaterThanBase
import com.tobianoapps.androidsdkversionutil.Version.isLaterThanBase11
import com.tobianoapps.androidsdkversionutil.Version.isLaterThanCupcake
import com.tobianoapps.androidsdkversionutil.Version.isLaterThanCurrentDevelopment
import com.tobianoapps.androidsdkversionutil.Version.isLaterThanDonut
import com.tobianoapps.androidsdkversionutil.Version.isLaterThanEclair
import com.tobianoapps.androidsdkversionutil.Version.isLaterThanEclair01
import com.tobianoapps.androidsdkversionutil.Version.isLaterThanEclairMR1
import com.tobianoapps.androidsdkversionutil.Version.isLaterThanFroyo
import com.tobianoapps.androidsdkversionutil.Version.isLaterThanGingerbread
import com.tobianoapps.androidsdkversionutil.Version.isLaterThanGingerbreadMR1
import com.tobianoapps.androidsdkversionutil.Version.isLaterThanHoneycomb
import com.tobianoapps.androidsdkversionutil.Version.isLaterThanHoneycombMR1
import com.tobianoapps.androidsdkversionutil.Version.isLaterThanHoneycombMR2
import com.tobianoapps.androidsdkversionutil.Version.isLaterThanIceCreamSandwich
import com.tobianoapps.androidsdkversionutil.Version.isLaterThanIceCreamSandwichMR1
import com.tobianoapps.androidsdkversionutil.Version.isLaterThanJellyBean
import com.tobianoapps.androidsdkversionutil.Version.isLaterThanJellyBeanMR1
import com.tobianoapps.androidsdkversionutil.Version.isLaterThanJellyBeanMR2
import com.tobianoapps.androidsdkversionutil.Version.isLaterThanKitKat
import com.tobianoapps.androidsdkversionutil.Version.isLaterThanKitKatWatch
import com.tobianoapps.androidsdkversionutil.Version.isLaterThanLollipop
import com.tobianoapps.androidsdkversionutil.Version.isLaterThanLollipopMR1
import com.tobianoapps.androidsdkversionutil.Version.isLaterThanM
import com.tobianoapps.androidsdkversionutil.Version.isLaterThanMarshmallow
import com.tobianoapps.androidsdkversionutil.Version.isLaterThanN
import com.tobianoapps.androidsdkversionutil.Version.isLaterThanNMR1
import com.tobianoapps.androidsdkversionutil.Version.isLaterThanNougat
import com.tobianoapps.androidsdkversionutil.Version.isLaterThanNougatMR1
import com.tobianoapps.androidsdkversionutil.Version.isLaterThanO
import com.tobianoapps.androidsdkversionutil.Version.isLaterThanOMR1
import com.tobianoapps.androidsdkversionutil.Version.isLaterThanOreo
import com.tobianoapps.androidsdkversionutil.Version.isLaterThanOreoMR1
import com.tobianoapps.androidsdkversionutil.Version.isLaterThanP
import com.tobianoapps.androidsdkversionutil.Version.isLaterThanPetitFour
import com.tobianoapps.androidsdkversionutil.Version.isLaterThanPie
import com.tobianoapps.androidsdkversionutil.Version.isLaterThanQ
import com.tobianoapps.androidsdkversionutil.Version.isLaterThanR
import com.tobianoapps.androidsdkversionutil.Version.isLaterThanS
import com.tobianoapps.androidsdkversionutil.Version.isLollipop
import com.tobianoapps.androidsdkversionutil.Version.isLollipopMR1
import com.tobianoapps.androidsdkversionutil.Version.isLollipopMR1OrLater
import com.tobianoapps.androidsdkversionutil.Version.isLollipopOrLater
import com.tobianoapps.androidsdkversionutil.Version.isM
import com.tobianoapps.androidsdkversionutil.Version.isMOrLater
import com.tobianoapps.androidsdkversionutil.Version.isMarshmallow
import com.tobianoapps.androidsdkversionutil.Version.isMarshmallowOrLater
import com.tobianoapps.androidsdkversionutil.Version.isN
import com.tobianoapps.androidsdkversionutil.Version.isNMR1
import com.tobianoapps.androidsdkversionutil.Version.isNMR1OrLater
import com.tobianoapps.androidsdkversionutil.Version.isNOrLater
import com.tobianoapps.androidsdkversionutil.Version.isNougat
import com.tobianoapps.androidsdkversionutil.Version.isNougatMR1
import com.tobianoapps.androidsdkversionutil.Version.isNougatMR1OrLater
import com.tobianoapps.androidsdkversionutil.Version.isNougatOrLater
import com.tobianoapps.androidsdkversionutil.Version.isO
import com.tobianoapps.androidsdkversionutil.Version.isOMR1
import com.tobianoapps.androidsdkversionutil.Version.isOMR1OrLater
import com.tobianoapps.androidsdkversionutil.Version.isOOrLater
import com.tobianoapps.androidsdkversionutil.Version.isOreo
import com.tobianoapps.androidsdkversionutil.Version.isOreoMR1
import com.tobianoapps.androidsdkversionutil.Version.isOreoMR1OrLater
import com.tobianoapps.androidsdkversionutil.Version.isOreoOrLater
import com.tobianoapps.androidsdkversionutil.Version.isP
import com.tobianoapps.androidsdkversionutil.Version.isPOrLater
import com.tobianoapps.androidsdkversionutil.Version.isPetitFour
import com.tobianoapps.androidsdkversionutil.Version.isPetitFourOrLater
import com.tobianoapps.androidsdkversionutil.Version.isPie
import com.tobianoapps.androidsdkversionutil.Version.isPieOrLater
import com.tobianoapps.androidsdkversionutil.Version.isPre1
import com.tobianoapps.androidsdkversionutil.Version.isPre10
import com.tobianoapps.androidsdkversionutil.Version.isPre11
import com.tobianoapps.androidsdkversionutil.Version.isPre12
import com.tobianoapps.androidsdkversionutil.Version.isPre13
import com.tobianoapps.androidsdkversionutil.Version.isPre14
import com.tobianoapps.androidsdkversionutil.Version.isPre15
import com.tobianoapps.androidsdkversionutil.Version.isPre16
import com.tobianoapps.androidsdkversionutil.Version.isPre17
import com.tobianoapps.androidsdkversionutil.Version.isPre18
import com.tobianoapps.androidsdkversionutil.Version.isPre19
import com.tobianoapps.androidsdkversionutil.Version.isPre2
import com.tobianoapps.androidsdkversionutil.Version.isPre20
import com.tobianoapps.androidsdkversionutil.Version.isPre21
import com.tobianoapps.androidsdkversionutil.Version.isPre22
import com.tobianoapps.androidsdkversionutil.Version.isPre23
import com.tobianoapps.androidsdkversionutil.Version.isPre24
import com.tobianoapps.androidsdkversionutil.Version.isPre25
import com.tobianoapps.androidsdkversionutil.Version.isPre26
import com.tobianoapps.androidsdkversionutil.Version.isPre27
import com.tobianoapps.androidsdkversionutil.Version.isPre28
import com.tobianoapps.androidsdkversionutil.Version.isPre29
import com.tobianoapps.androidsdkversionutil.Version.isPre3
import com.tobianoapps.androidsdkversionutil.Version.isPre30
import com.tobianoapps.androidsdkversionutil.Version.isPre31
import com.tobianoapps.androidsdkversionutil.Version.isPre4
import com.tobianoapps.androidsdkversionutil.Version.isPre5
import com.tobianoapps.androidsdkversionutil.Version.isPre6
import com.tobianoapps.androidsdkversionutil.Version.isPre7
import com.tobianoapps.androidsdkversionutil.Version.isPre8
import com.tobianoapps.androidsdkversionutil.Version.isPre9
import com.tobianoapps.androidsdkversionutil.Version.isPreBase
import com.tobianoapps.androidsdkversionutil.Version.isPreBase11
import com.tobianoapps.androidsdkversionutil.Version.isPreCupcake
import com.tobianoapps.androidsdkversionutil.Version.isPreCurrentDevelopment
import com.tobianoapps.androidsdkversionutil.Version.isPreDonut
import com.tobianoapps.androidsdkversionutil.Version.isPreEclair
import com.tobianoapps.androidsdkversionutil.Version.isPreEclair01
import com.tobianoapps.androidsdkversionutil.Version.isPreEclairMR1
import com.tobianoapps.androidsdkversionutil.Version.isPreFroyo
import com.tobianoapps.androidsdkversionutil.Version.isPreGingerbread
import com.tobianoapps.androidsdkversionutil.Version.isPreGingerbreadMR1
import com.tobianoapps.androidsdkversionutil.Version.isPreHoneycomb
import com.tobianoapps.androidsdkversionutil.Version.isPreHoneycombMR1
import com.tobianoapps.androidsdkversionutil.Version.isPreHoneycombMR2
import com.tobianoapps.androidsdkversionutil.Version.isPreIceCreamSandwich
import com.tobianoapps.androidsdkversionutil.Version.isPreIceCreamSandwichMR1
import com.tobianoapps.androidsdkversionutil.Version.isPreJellyBean
import com.tobianoapps.androidsdkversionutil.Version.isPreJellyBeanMR1
import com.tobianoapps.androidsdkversionutil.Version.isPreJellyBeanMR2
import com.tobianoapps.androidsdkversionutil.Version.isPreKitKat
import com.tobianoapps.androidsdkversionutil.Version.isPreKitKatWatch
import com.tobianoapps.androidsdkversionutil.Version.isPreLollipop
import com.tobianoapps.androidsdkversionutil.Version.isPreLollipopMR1
import com.tobianoapps.androidsdkversionutil.Version.isPreM
import com.tobianoapps.androidsdkversionutil.Version.isPreMarshmallow
import com.tobianoapps.androidsdkversionutil.Version.isPreN
import com.tobianoapps.androidsdkversionutil.Version.isPreNMR1
import com.tobianoapps.androidsdkversionutil.Version.isPreNougat
import com.tobianoapps.androidsdkversionutil.Version.isPreNougatMR1
import com.tobianoapps.androidsdkversionutil.Version.isPreO
import com.tobianoapps.androidsdkversionutil.Version.isPreOMR1
import com.tobianoapps.androidsdkversionutil.Version.isPreOreo
import com.tobianoapps.androidsdkversionutil.Version.isPreOreoMR1
import com.tobianoapps.androidsdkversionutil.Version.isPreP
import com.tobianoapps.androidsdkversionutil.Version.isPrePetitFour
import com.tobianoapps.androidsdkversionutil.Version.isPrePie
import com.tobianoapps.androidsdkversionutil.Version.isPreQ
import com.tobianoapps.androidsdkversionutil.Version.isPreR
import com.tobianoapps.androidsdkversionutil.Version.isPreS
import com.tobianoapps.androidsdkversionutil.Version.isQ
import com.tobianoapps.androidsdkversionutil.Version.isQOrLater
import com.tobianoapps.androidsdkversionutil.Version.isR
import com.tobianoapps.androidsdkversionutil.Version.isROrLater
import com.tobianoapps.androidsdkversionutil.Version.isS
import com.tobianoapps.androidsdkversionutil.Version.isSOrLater
import com.tobianoapps.androidsdkversionutil.Version.sdkVersionNumber
import org.junit.After
import org.junit.Test
import java.lang.reflect.Field
import java.lang.reflect.Modifier


class VersionTest {

    @After
    fun tearDown() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), 0)
    }


    /**
     * Use Reflection to modify the `SDK_INT` field.
     */
    @Throws(Exception::class)
    fun setFinalStatic(field: Field, newValue: Any) {
        field.isAccessible = true

        val modifiersField = Field::class.java.getDeclaredField("modifiers")
        modifiersField.isAccessible = true
        modifiersField.setInt(field, field.modifiers and Modifier.FINAL.inv())

        field.set(null, newValue)
    }


    @Test
    fun `isPreBase sdk lower than BASE returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE - 1)
        val result = isPreBase
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPreBase sdk equals BASE returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE)
        val result = isPreBase
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreBase sdk greater than BASE returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE + 1)
        val result = isPreBase
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isBase sdk equals BASE returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE)
        val result = isBase
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isBase sdk greater than BASE returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE + 1)
        val result = isBase
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isBase sdk lower than BASE returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE - 1)
        val result = isBase
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isBaseOrLater sdk equals BASE returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE)
        val result = isBaseOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isBaseOrLater sdk greater than BASE returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE + 1)
        val result = isBaseOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isBaseOrLater sdk lower than BASE returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE - 1)
        val result = isBaseOrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanBase sdk greater than BASE returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE + 1)
        val result = isLaterThanBase
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThanBase sdk equals BASE returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE)
        val result = isLaterThanBase
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanBase sdk lower than BASE returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE - 1)
        val result = isLaterThanBase
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre1 sdk lower than BASE returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE - 1)
        val result = isPre1
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPre1 sdk equals BASE returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE)
        val result = isPre1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre1 sdk greater than BASE returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE + 1)
        val result = isPre1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is1 sdk equals BASE returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE)
        val result = is1
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is1 sdk greater than BASE returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE + 1)
        val result = is1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is1 sdk lower than BASE returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE - 1)
        val result = is1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is1OrLater sdk equals BASE returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE)
        val result = is1OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is1OrLater sdk greater than BASE returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE + 1)
        val result = is1OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is1OrLater sdk lower than BASE returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE - 1)
        val result = is1OrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan1 sdk greater than BASE returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE + 1)
        val result = isLaterThan1
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThan1 sdk equals BASE returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE)
        val result = isLaterThan1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan1 sdk lower than BASE returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE - 1)
        val result = isLaterThan1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreBase11 sdk lower than BASE_1_1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE_1_1 - 1)
        val result = isPreBase11
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPreBase11 sdk equals BASE_1_1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE_1_1)
        val result = isPreBase11
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreBase11 sdk greater than BASE_1_1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE_1_1 + 1)
        val result = isPreBase11
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isBase11 sdk equals BASE_1_1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE_1_1)
        val result = isBase11
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isBase11 sdk greater than BASE_1_1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE_1_1 + 1)
        val result = isBase11
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isBase11 sdk lower than BASE_1_1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE_1_1 - 1)
        val result = isBase11
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isBase11OrLater sdk equals BASE_1_1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE_1_1)
        val result = isBase11OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isBase11OrLater sdk greater than BASE_1_1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE_1_1 + 1)
        val result = isBase11OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isBase11OrLater sdk lower than BASE_1_1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE_1_1 - 1)
        val result = isBase11OrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanBase11 sdk greater than BASE_1_1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE_1_1 + 1)
        val result = isLaterThanBase11
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThanBase11 sdk equals BASE_1_1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE_1_1)
        val result = isLaterThanBase11
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanBase11 sdk lower than BASE_1_1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE_1_1 - 1)
        val result = isLaterThanBase11
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPrePetitFour sdk lower than BASE_1_1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE_1_1 - 1)
        val result = isPrePetitFour
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPrePetitFour sdk equals BASE_1_1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE_1_1)
        val result = isPrePetitFour
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPrePetitFour sdk greater than BASE_1_1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE_1_1 + 1)
        val result = isPrePetitFour
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPetitFour sdk equals BASE_1_1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE_1_1)
        val result = isPetitFour
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isPetitFour sdk greater than BASE_1_1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE_1_1 + 1)
        val result = isPetitFour
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPetitFour sdk lower than BASE_1_1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE_1_1 - 1)
        val result = isPetitFour
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPetitFourOrLater sdk equals BASE_1_1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE_1_1)
        val result = isPetitFourOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isPetitFourOrLater sdk greater than BASE_1_1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE_1_1 + 1)
        val result = isPetitFourOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isPetitFourOrLater sdk lower than BASE_1_1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE_1_1 - 1)
        val result = isPetitFourOrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanPetitFour sdk greater than BASE_1_1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE_1_1 + 1)
        val result = isLaterThanPetitFour
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThanPetitFour sdk equals BASE_1_1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE_1_1)
        val result = isLaterThanPetitFour
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanPetitFour sdk lower than BASE_1_1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE_1_1 - 1)
        val result = isLaterThanPetitFour
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre2 sdk lower than BASE_1_1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE_1_1 - 1)
        val result = isPre2
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPre2 sdk equals BASE_1_1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE_1_1)
        val result = isPre2
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre2 sdk greater than BASE_1_1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE_1_1 + 1)
        val result = isPre2
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is2 sdk equals BASE_1_1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE_1_1)
        val result = is2
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is2 sdk greater than BASE_1_1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE_1_1 + 1)
        val result = is2
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is2 sdk lower than BASE_1_1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE_1_1 - 1)
        val result = is2
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is2OrLater sdk equals BASE_1_1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE_1_1)
        val result = is2OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is2OrLater sdk greater than BASE_1_1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE_1_1 + 1)
        val result = is2OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is2OrLater sdk lower than BASE_1_1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE_1_1 - 1)
        val result = is2OrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan2 sdk greater than BASE_1_1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE_1_1 + 1)
        val result = isLaterThan2
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThan2 sdk equals BASE_1_1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE_1_1)
        val result = isLaterThan2
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan2 sdk lower than BASE_1_1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.BASE_1_1 - 1)
        val result = isLaterThan2
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreCupcake sdk lower than CUPCAKE returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.CUPCAKE - 1)
        val result = isPreCupcake
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPreCupcake sdk equals CUPCAKE returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.CUPCAKE)
        val result = isPreCupcake
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreCupcake sdk greater than CUPCAKE returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.CUPCAKE + 1)
        val result = isPreCupcake
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isCupcake sdk equals CUPCAKE returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.CUPCAKE)
        val result = isCupcake
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isCupcake sdk greater than CUPCAKE returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.CUPCAKE + 1)
        val result = isCupcake
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isCupcake sdk lower than CUPCAKE returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.CUPCAKE - 1)
        val result = isCupcake
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isCupcakeOrLater sdk equals CUPCAKE returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.CUPCAKE)
        val result = isCupcakeOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isCupcakeOrLater sdk greater than CUPCAKE returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.CUPCAKE + 1)
        val result = isCupcakeOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isCupcakeOrLater sdk lower than CUPCAKE returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.CUPCAKE - 1)
        val result = isCupcakeOrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanCupcake sdk greater than CUPCAKE returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.CUPCAKE + 1)
        val result = isLaterThanCupcake
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThanCupcake sdk equals CUPCAKE returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.CUPCAKE)
        val result = isLaterThanCupcake
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanCupcake sdk lower than CUPCAKE returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.CUPCAKE - 1)
        val result = isLaterThanCupcake
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre3 sdk lower than CUPCAKE returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.CUPCAKE - 1)
        val result = isPre3
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPre3 sdk equals CUPCAKE returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.CUPCAKE)
        val result = isPre3
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre3 sdk greater than CUPCAKE returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.CUPCAKE + 1)
        val result = isPre3
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is3 sdk equals CUPCAKE returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.CUPCAKE)
        val result = is3
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is3 sdk greater than CUPCAKE returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.CUPCAKE + 1)
        val result = is3
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is3 sdk lower than CUPCAKE returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.CUPCAKE - 1)
        val result = is3
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is3OrLater sdk equals CUPCAKE returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.CUPCAKE)
        val result = is3OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is3OrLater sdk greater than CUPCAKE returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.CUPCAKE + 1)
        val result = is3OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is3OrLater sdk lower than CUPCAKE returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.CUPCAKE - 1)
        val result = is3OrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan3 sdk greater than CUPCAKE returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.CUPCAKE + 1)
        val result = isLaterThan3
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThan3 sdk equals CUPCAKE returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.CUPCAKE)
        val result = isLaterThan3
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan3 sdk lower than CUPCAKE returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.CUPCAKE - 1)
        val result = isLaterThan3
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreDonut sdk lower than DONUT returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.DONUT - 1)
        val result = isPreDonut
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPreDonut sdk equals DONUT returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.DONUT)
        val result = isPreDonut
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreDonut sdk greater than DONUT returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.DONUT + 1)
        val result = isPreDonut
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isDonut sdk equals DONUT returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.DONUT)
        val result = isDonut
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isDonut sdk greater than DONUT returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.DONUT + 1)
        val result = isDonut
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isDonut sdk lower than DONUT returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.DONUT - 1)
        val result = isDonut
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isDonutOrLater sdk equals DONUT returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.DONUT)
        val result = isDonutOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isDonutOrLater sdk greater than DONUT returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.DONUT + 1)
        val result = isDonutOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isDonutOrLater sdk lower than DONUT returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.DONUT - 1)
        val result = isDonutOrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanDonut sdk greater than DONUT returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.DONUT + 1)
        val result = isLaterThanDonut
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThanDonut sdk equals DONUT returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.DONUT)
        val result = isLaterThanDonut
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanDonut sdk lower than DONUT returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.DONUT - 1)
        val result = isLaterThanDonut
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre4 sdk lower than DONUT returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.DONUT - 1)
        val result = isPre4
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPre4 sdk equals DONUT returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.DONUT)
        val result = isPre4
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre4 sdk greater than DONUT returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.DONUT + 1)
        val result = isPre4
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is4 sdk equals DONUT returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.DONUT)
        val result = is4
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is4 sdk greater than DONUT returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.DONUT + 1)
        val result = is4
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is4 sdk lower than DONUT returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.DONUT - 1)
        val result = is4
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is4OrLater sdk equals DONUT returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.DONUT)
        val result = is4OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is4OrLater sdk greater than DONUT returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.DONUT + 1)
        val result = is4OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is4OrLater sdk lower than DONUT returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.DONUT - 1)
        val result = is4OrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan4 sdk greater than DONUT returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.DONUT + 1)
        val result = isLaterThan4
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThan4 sdk equals DONUT returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.DONUT)
        val result = isLaterThan4
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan4 sdk lower than DONUT returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.DONUT - 1)
        val result = isLaterThan4
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreEclair sdk lower than ECLAIR returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR - 1)
        val result = isPreEclair
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPreEclair sdk equals ECLAIR returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR)
        val result = isPreEclair
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreEclair sdk greater than ECLAIR returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR + 1)
        val result = isPreEclair
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isEclair sdk equals ECLAIR returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR)
        val result = isEclair
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isEclair sdk greater than ECLAIR returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR + 1)
        val result = isEclair
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isEclair sdk lower than ECLAIR returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR - 1)
        val result = isEclair
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isEclairOrLater sdk equals ECLAIR returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR)
        val result = isEclairOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isEclairOrLater sdk greater than ECLAIR returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR + 1)
        val result = isEclairOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isEclairOrLater sdk lower than ECLAIR returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR - 1)
        val result = isEclairOrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanEclair sdk greater than ECLAIR returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR + 1)
        val result = isLaterThanEclair
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThanEclair sdk equals ECLAIR returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR)
        val result = isLaterThanEclair
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanEclair sdk lower than ECLAIR returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR - 1)
        val result = isLaterThanEclair
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre5 sdk lower than ECLAIR returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR - 1)
        val result = isPre5
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPre5 sdk equals ECLAIR returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR)
        val result = isPre5
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre5 sdk greater than ECLAIR returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR + 1)
        val result = isPre5
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is5 sdk equals ECLAIR returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR)
        val result = is5
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is5 sdk greater than ECLAIR returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR + 1)
        val result = is5
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is5 sdk lower than ECLAIR returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR - 1)
        val result = is5
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is5OrLater sdk equals ECLAIR returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR)
        val result = is5OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is5OrLater sdk greater than ECLAIR returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR + 1)
        val result = is5OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is5OrLater sdk lower than ECLAIR returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR - 1)
        val result = is5OrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan5 sdk greater than ECLAIR returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR + 1)
        val result = isLaterThan5
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThan5 sdk equals ECLAIR returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR)
        val result = isLaterThan5
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan5 sdk lower than ECLAIR returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR - 1)
        val result = isLaterThan5
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreEclair01 sdk lower than ECLAIR_0_1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_0_1 - 1)
        val result = isPreEclair01
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPreEclair01 sdk equals ECLAIR_0_1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_0_1)
        val result = isPreEclair01
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreEclair01 sdk greater than ECLAIR_0_1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_0_1 + 1)
        val result = isPreEclair01
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isEclair01 sdk equals ECLAIR_0_1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_0_1)
        val result = isEclair01
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isEclair01 sdk greater than ECLAIR_0_1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_0_1 + 1)
        val result = isEclair01
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isEclair01 sdk lower than ECLAIR_0_1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_0_1 - 1)
        val result = isEclair01
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isEclair01OrLater sdk equals ECLAIR_0_1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_0_1)
        val result = isEclair01OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isEclair01OrLater sdk greater than ECLAIR_0_1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_0_1 + 1)
        val result = isEclair01OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isEclair01OrLater sdk lower than ECLAIR_0_1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_0_1 - 1)
        val result = isEclair01OrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanEclair01 sdk greater than ECLAIR_0_1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_0_1 + 1)
        val result = isLaterThanEclair01
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThanEclair01 sdk equals ECLAIR_0_1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_0_1)
        val result = isLaterThanEclair01
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanEclair01 sdk lower than ECLAIR_0_1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_0_1 - 1)
        val result = isLaterThanEclair01
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre6 sdk lower than ECLAIR_0_1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_0_1 - 1)
        val result = isPre6
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPre6 sdk equals ECLAIR_0_1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_0_1)
        val result = isPre6
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre6 sdk greater than ECLAIR_0_1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_0_1 + 1)
        val result = isPre6
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is6 sdk equals ECLAIR_0_1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_0_1)
        val result = is6
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is6 sdk greater than ECLAIR_0_1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_0_1 + 1)
        val result = is6
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is6 sdk lower than ECLAIR_0_1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_0_1 - 1)
        val result = is6
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is6OrLater sdk equals ECLAIR_0_1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_0_1)
        val result = is6OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is6OrLater sdk greater than ECLAIR_0_1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_0_1 + 1)
        val result = is6OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is6OrLater sdk lower than ECLAIR_0_1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_0_1 - 1)
        val result = is6OrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan6 sdk greater than ECLAIR_0_1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_0_1 + 1)
        val result = isLaterThan6
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThan6 sdk equals ECLAIR_0_1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_0_1)
        val result = isLaterThan6
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan6 sdk lower than ECLAIR_0_1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_0_1 - 1)
        val result = isLaterThan6
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreEclairMR1 sdk lower than ECLAIR_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_MR1 - 1)
        val result = isPreEclairMR1
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPreEclairMR1 sdk equals ECLAIR_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_MR1)
        val result = isPreEclairMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreEclairMR1 sdk greater than ECLAIR_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_MR1 + 1)
        val result = isPreEclairMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isEclairMR1 sdk equals ECLAIR_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_MR1)
        val result = isEclairMR1
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isEclairMR1 sdk greater than ECLAIR_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_MR1 + 1)
        val result = isEclairMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isEclairMR1 sdk lower than ECLAIR_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_MR1 - 1)
        val result = isEclairMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isEclairMR1OrLater sdk equals ECLAIR_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_MR1)
        val result = isEclairMR1OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isEclairMR1OrLater sdk greater than ECLAIR_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_MR1 + 1)
        val result = isEclairMR1OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isEclairMR1OrLater sdk lower than ECLAIR_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_MR1 - 1)
        val result = isEclairMR1OrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanEclairMR1 sdk greater than ECLAIR_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_MR1 + 1)
        val result = isLaterThanEclairMR1
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThanEclairMR1 sdk equals ECLAIR_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_MR1)
        val result = isLaterThanEclairMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanEclairMR1 sdk lower than ECLAIR_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_MR1 - 1)
        val result = isLaterThanEclairMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre7 sdk lower than ECLAIR_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_MR1 - 1)
        val result = isPre7
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPre7 sdk equals ECLAIR_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_MR1)
        val result = isPre7
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre7 sdk greater than ECLAIR_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_MR1 + 1)
        val result = isPre7
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is7 sdk equals ECLAIR_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_MR1)
        val result = is7
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is7 sdk greater than ECLAIR_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_MR1 + 1)
        val result = is7
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is7 sdk lower than ECLAIR_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_MR1 - 1)
        val result = is7
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is7OrLater sdk equals ECLAIR_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_MR1)
        val result = is7OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is7OrLater sdk greater than ECLAIR_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_MR1 + 1)
        val result = is7OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is7OrLater sdk lower than ECLAIR_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_MR1 - 1)
        val result = is7OrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan7 sdk greater than ECLAIR_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_MR1 + 1)
        val result = isLaterThan7
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThan7 sdk equals ECLAIR_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_MR1)
        val result = isLaterThan7
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan7 sdk lower than ECLAIR_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ECLAIR_MR1 - 1)
        val result = isLaterThan7
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreFroyo sdk lower than FROYO returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.FROYO - 1)
        val result = isPreFroyo
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPreFroyo sdk equals FROYO returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.FROYO)
        val result = isPreFroyo
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreFroyo sdk greater than FROYO returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.FROYO + 1)
        val result = isPreFroyo
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isFroyo sdk equals FROYO returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.FROYO)
        val result = isFroyo
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isFroyo sdk greater than FROYO returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.FROYO + 1)
        val result = isFroyo
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isFroyo sdk lower than FROYO returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.FROYO - 1)
        val result = isFroyo
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isFroyoOrLater sdk equals FROYO returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.FROYO)
        val result = isFroyoOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isFroyoOrLater sdk greater than FROYO returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.FROYO + 1)
        val result = isFroyoOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isFroyoOrLater sdk lower than FROYO returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.FROYO - 1)
        val result = isFroyoOrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanFroyo sdk greater than FROYO returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.FROYO + 1)
        val result = isLaterThanFroyo
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThanFroyo sdk equals FROYO returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.FROYO)
        val result = isLaterThanFroyo
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanFroyo sdk lower than FROYO returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.FROYO - 1)
        val result = isLaterThanFroyo
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre8 sdk lower than FROYO returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.FROYO - 1)
        val result = isPre8
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPre8 sdk equals FROYO returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.FROYO)
        val result = isPre8
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre8 sdk greater than FROYO returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.FROYO + 1)
        val result = isPre8
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is8 sdk equals FROYO returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.FROYO)
        val result = is8
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is8 sdk greater than FROYO returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.FROYO + 1)
        val result = is8
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is8 sdk lower than FROYO returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.FROYO - 1)
        val result = is8
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is8OrLater sdk equals FROYO returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.FROYO)
        val result = is8OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is8OrLater sdk greater than FROYO returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.FROYO + 1)
        val result = is8OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is8OrLater sdk lower than FROYO returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.FROYO - 1)
        val result = is8OrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan8 sdk greater than FROYO returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.FROYO + 1)
        val result = isLaterThan8
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThan8 sdk equals FROYO returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.FROYO)
        val result = isLaterThan8
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan8 sdk lower than FROYO returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.FROYO - 1)
        val result = isLaterThan8
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreGingerbread sdk lower than GINGERBREAD returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD - 1)
        val result = isPreGingerbread
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPreGingerbread sdk equals GINGERBREAD returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD)
        val result = isPreGingerbread
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreGingerbread sdk greater than GINGERBREAD returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD + 1)
        val result = isPreGingerbread
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isGingerbread sdk equals GINGERBREAD returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD)
        val result = isGingerbread
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isGingerbread sdk greater than GINGERBREAD returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD + 1)
        val result = isGingerbread
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isGingerbread sdk lower than GINGERBREAD returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD - 1)
        val result = isGingerbread
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isGingerbreadOrLater sdk equals GINGERBREAD returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD)
        val result = isGingerbreadOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isGingerbreadOrLater sdk greater than GINGERBREAD returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD + 1)
        val result = isGingerbreadOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isGingerbreadOrLater sdk lower than GINGERBREAD returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD - 1)
        val result = isGingerbreadOrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanGingerbread sdk greater than GINGERBREAD returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD + 1)
        val result = isLaterThanGingerbread
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThanGingerbread sdk equals GINGERBREAD returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD)
        val result = isLaterThanGingerbread
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanGingerbread sdk lower than GINGERBREAD returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD - 1)
        val result = isLaterThanGingerbread
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre9 sdk lower than GINGERBREAD returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD - 1)
        val result = isPre9
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPre9 sdk equals GINGERBREAD returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD)
        val result = isPre9
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre9 sdk greater than GINGERBREAD returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD + 1)
        val result = isPre9
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is9 sdk equals GINGERBREAD returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD)
        val result = is9
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is9 sdk greater than GINGERBREAD returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD + 1)
        val result = is9
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is9 sdk lower than GINGERBREAD returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD - 1)
        val result = is9
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is9OrLater sdk equals GINGERBREAD returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD)
        val result = is9OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is9OrLater sdk greater than GINGERBREAD returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD + 1)
        val result = is9OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is9OrLater sdk lower than GINGERBREAD returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD - 1)
        val result = is9OrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan9 sdk greater than GINGERBREAD returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD + 1)
        val result = isLaterThan9
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThan9 sdk equals GINGERBREAD returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD)
        val result = isLaterThan9
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan9 sdk lower than GINGERBREAD returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD - 1)
        val result = isLaterThan9
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreGingerbreadMR1 sdk lower than GINGERBREAD_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD_MR1 - 1)
        val result = isPreGingerbreadMR1
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPreGingerbreadMR1 sdk equals GINGERBREAD_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD_MR1)
        val result = isPreGingerbreadMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreGingerbreadMR1 sdk greater than GINGERBREAD_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD_MR1 + 1)
        val result = isPreGingerbreadMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isGingerbreadMR1 sdk equals GINGERBREAD_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD_MR1)
        val result = isGingerbreadMR1
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isGingerbreadMR1 sdk greater than GINGERBREAD_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD_MR1 + 1)
        val result = isGingerbreadMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isGingerbreadMR1 sdk lower than GINGERBREAD_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD_MR1 - 1)
        val result = isGingerbreadMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isGingerbreadMR1OrLater sdk equals GINGERBREAD_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD_MR1)
        val result = isGingerbreadMR1OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isGingerbreadMR1OrLater sdk greater than GINGERBREAD_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD_MR1 + 1)
        val result = isGingerbreadMR1OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isGingerbreadMR1OrLater sdk lower than GINGERBREAD_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD_MR1 - 1)
        val result = isGingerbreadMR1OrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanGingerbreadMR1 sdk greater than GINGERBREAD_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD_MR1 + 1)
        val result = isLaterThanGingerbreadMR1
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThanGingerbreadMR1 sdk equals GINGERBREAD_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD_MR1)
        val result = isLaterThanGingerbreadMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanGingerbreadMR1 sdk lower than GINGERBREAD_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD_MR1 - 1)
        val result = isLaterThanGingerbreadMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre10 sdk lower than GINGERBREAD_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD_MR1 - 1)
        val result = isPre10
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPre10 sdk equals GINGERBREAD_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD_MR1)
        val result = isPre10
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre10 sdk greater than GINGERBREAD_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD_MR1 + 1)
        val result = isPre10
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is10 sdk equals GINGERBREAD_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD_MR1)
        val result = is10
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is10 sdk greater than GINGERBREAD_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD_MR1 + 1)
        val result = is10
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is10 sdk lower than GINGERBREAD_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD_MR1 - 1)
        val result = is10
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is10OrLater sdk equals GINGERBREAD_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD_MR1)
        val result = is10OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is10OrLater sdk greater than GINGERBREAD_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD_MR1 + 1)
        val result = is10OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is10OrLater sdk lower than GINGERBREAD_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD_MR1 - 1)
        val result = is10OrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan10 sdk greater than GINGERBREAD_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD_MR1 + 1)
        val result = isLaterThan10
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThan10 sdk equals GINGERBREAD_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD_MR1)
        val result = isLaterThan10
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan10 sdk lower than GINGERBREAD_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.GINGERBREAD_MR1 - 1)
        val result = isLaterThan10
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreHoneycomb sdk lower than HONEYCOMB returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB - 1)
        val result = isPreHoneycomb
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPreHoneycomb sdk equals HONEYCOMB returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB)
        val result = isPreHoneycomb
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreHoneycomb sdk greater than HONEYCOMB returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB + 1)
        val result = isPreHoneycomb
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isHoneycomb sdk equals HONEYCOMB returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB)
        val result = isHoneycomb
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isHoneycomb sdk greater than HONEYCOMB returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB + 1)
        val result = isHoneycomb
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isHoneycomb sdk lower than HONEYCOMB returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB - 1)
        val result = isHoneycomb
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isHoneycombOrLater sdk equals HONEYCOMB returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB)
        val result = isHoneycombOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isHoneycombOrLater sdk greater than HONEYCOMB returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB + 1)
        val result = isHoneycombOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isHoneycombOrLater sdk lower than HONEYCOMB returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB - 1)
        val result = isHoneycombOrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanHoneycomb sdk greater than HONEYCOMB returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB + 1)
        val result = isLaterThanHoneycomb
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThanHoneycomb sdk equals HONEYCOMB returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB)
        val result = isLaterThanHoneycomb
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanHoneycomb sdk lower than HONEYCOMB returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB - 1)
        val result = isLaterThanHoneycomb
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre11 sdk lower than HONEYCOMB returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB - 1)
        val result = isPre11
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPre11 sdk equals HONEYCOMB returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB)
        val result = isPre11
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre11 sdk greater than HONEYCOMB returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB + 1)
        val result = isPre11
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is11 sdk equals HONEYCOMB returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB)
        val result = is11
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is11 sdk greater than HONEYCOMB returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB + 1)
        val result = is11
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is11 sdk lower than HONEYCOMB returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB - 1)
        val result = is11
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is11OrLater sdk equals HONEYCOMB returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB)
        val result = is11OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is11OrLater sdk greater than HONEYCOMB returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB + 1)
        val result = is11OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is11OrLater sdk lower than HONEYCOMB returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB - 1)
        val result = is11OrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan11 sdk greater than HONEYCOMB returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB + 1)
        val result = isLaterThan11
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThan11 sdk equals HONEYCOMB returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB)
        val result = isLaterThan11
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan11 sdk lower than HONEYCOMB returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB - 1)
        val result = isLaterThan11
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreHoneycombMR1 sdk lower than HONEYCOMB_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR1 - 1)
        val result = isPreHoneycombMR1
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPreHoneycombMR1 sdk equals HONEYCOMB_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR1)
        val result = isPreHoneycombMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreHoneycombMR1 sdk greater than HONEYCOMB_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR1 + 1)
        val result = isPreHoneycombMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isHoneycombMR1 sdk equals HONEYCOMB_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR1)
        val result = isHoneycombMR1
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isHoneycombMR1 sdk greater than HONEYCOMB_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR1 + 1)
        val result = isHoneycombMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isHoneycombMR1 sdk lower than HONEYCOMB_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR1 - 1)
        val result = isHoneycombMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isHoneycombMR1OrLater sdk equals HONEYCOMB_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR1)
        val result = isHoneycombMR1OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isHoneycombMR1OrLater sdk greater than HONEYCOMB_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR1 + 1)
        val result = isHoneycombMR1OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isHoneycombMR1OrLater sdk lower than HONEYCOMB_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR1 - 1)
        val result = isHoneycombMR1OrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanHoneycombMR1 sdk greater than HONEYCOMB_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR1 + 1)
        val result = isLaterThanHoneycombMR1
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThanHoneycombMR1 sdk equals HONEYCOMB_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR1)
        val result = isLaterThanHoneycombMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanHoneycombMR1 sdk lower than HONEYCOMB_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR1 - 1)
        val result = isLaterThanHoneycombMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre12 sdk lower than HONEYCOMB_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR1 - 1)
        val result = isPre12
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPre12 sdk equals HONEYCOMB_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR1)
        val result = isPre12
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre12 sdk greater than HONEYCOMB_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR1 + 1)
        val result = isPre12
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is12 sdk equals HONEYCOMB_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR1)
        val result = is12
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is12 sdk greater than HONEYCOMB_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR1 + 1)
        val result = is12
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is12 sdk lower than HONEYCOMB_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR1 - 1)
        val result = is12
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is12OrLater sdk equals HONEYCOMB_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR1)
        val result = is12OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is12OrLater sdk greater than HONEYCOMB_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR1 + 1)
        val result = is12OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is12OrLater sdk lower than HONEYCOMB_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR1 - 1)
        val result = is12OrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan12 sdk greater than HONEYCOMB_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR1 + 1)
        val result = isLaterThan12
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThan12 sdk equals HONEYCOMB_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR1)
        val result = isLaterThan12
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan12 sdk lower than HONEYCOMB_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR1 - 1)
        val result = isLaterThan12
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreHoneycombMR2 sdk lower than HONEYCOMB_MR2 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR2 - 1)
        val result = isPreHoneycombMR2
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPreHoneycombMR2 sdk equals HONEYCOMB_MR2 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR2)
        val result = isPreHoneycombMR2
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreHoneycombMR2 sdk greater than HONEYCOMB_MR2 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR2 + 1)
        val result = isPreHoneycombMR2
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isHoneycombMR2 sdk equals HONEYCOMB_MR2 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR2)
        val result = isHoneycombMR2
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isHoneycombMR2 sdk greater than HONEYCOMB_MR2 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR2 + 1)
        val result = isHoneycombMR2
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isHoneycombMR2 sdk lower than HONEYCOMB_MR2 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR2 - 1)
        val result = isHoneycombMR2
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isHoneycombMR2OrLater sdk equals HONEYCOMB_MR2 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR2)
        val result = isHoneycombMR2OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isHoneycombMR2OrLater sdk greater than HONEYCOMB_MR2 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR2 + 1)
        val result = isHoneycombMR2OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isHoneycombMR2OrLater sdk lower than HONEYCOMB_MR2 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR2 - 1)
        val result = isHoneycombMR2OrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanHoneycombMR2 sdk greater than HONEYCOMB_MR2 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR2 + 1)
        val result = isLaterThanHoneycombMR2
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThanHoneycombMR2 sdk equals HONEYCOMB_MR2 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR2)
        val result = isLaterThanHoneycombMR2
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanHoneycombMR2 sdk lower than HONEYCOMB_MR2 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR2 - 1)
        val result = isLaterThanHoneycombMR2
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre13 sdk lower than HONEYCOMB_MR2 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR2 - 1)
        val result = isPre13
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPre13 sdk equals HONEYCOMB_MR2 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR2)
        val result = isPre13
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre13 sdk greater than HONEYCOMB_MR2 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR2 + 1)
        val result = isPre13
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is13 sdk equals HONEYCOMB_MR2 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR2)
        val result = is13
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is13 sdk greater than HONEYCOMB_MR2 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR2 + 1)
        val result = is13
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is13 sdk lower than HONEYCOMB_MR2 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR2 - 1)
        val result = is13
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is13OrLater sdk equals HONEYCOMB_MR2 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR2)
        val result = is13OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is13OrLater sdk greater than HONEYCOMB_MR2 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR2 + 1)
        val result = is13OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is13OrLater sdk lower than HONEYCOMB_MR2 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR2 - 1)
        val result = is13OrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan13 sdk greater than HONEYCOMB_MR2 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR2 + 1)
        val result = isLaterThan13
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThan13 sdk equals HONEYCOMB_MR2 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR2)
        val result = isLaterThan13
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan13 sdk lower than HONEYCOMB_MR2 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.HONEYCOMB_MR2 - 1)
        val result = isLaterThan13
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreIceCreamSandwich sdk lower than ICE_CREAM_SANDWICH returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH - 1)
        val result = isPreIceCreamSandwich
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPreIceCreamSandwich sdk equals ICE_CREAM_SANDWICH returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH)
        val result = isPreIceCreamSandwich
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreIceCreamSandwich sdk greater than ICE_CREAM_SANDWICH returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH + 1)
        val result = isPreIceCreamSandwich
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isIceCreamSandwich sdk equals ICE_CREAM_SANDWICH returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH)
        val result = isIceCreamSandwich
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isIceCreamSandwich sdk greater than ICE_CREAM_SANDWICH returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH + 1)
        val result = isIceCreamSandwich
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isIceCreamSandwich sdk lower than ICE_CREAM_SANDWICH returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH - 1)
        val result = isIceCreamSandwich
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isIceCreamSandwichOrLater sdk equals ICE_CREAM_SANDWICH returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH)
        val result = isIceCreamSandwichOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isIceCreamSandwichOrLater sdk greater than ICE_CREAM_SANDWICH returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH + 1)
        val result = isIceCreamSandwichOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isIceCreamSandwichOrLater sdk lower than ICE_CREAM_SANDWICH returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH - 1)
        val result = isIceCreamSandwichOrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanIceCreamSandwich sdk greater than ICE_CREAM_SANDWICH returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH + 1)
        val result = isLaterThanIceCreamSandwich
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThanIceCreamSandwich sdk equals ICE_CREAM_SANDWICH returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH)
        val result = isLaterThanIceCreamSandwich
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanIceCreamSandwich sdk lower than ICE_CREAM_SANDWICH returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH - 1)
        val result = isLaterThanIceCreamSandwich
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre14 sdk lower than ICE_CREAM_SANDWICH returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH - 1)
        val result = isPre14
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPre14 sdk equals ICE_CREAM_SANDWICH returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH)
        val result = isPre14
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre14 sdk greater than ICE_CREAM_SANDWICH returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH + 1)
        val result = isPre14
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is14 sdk equals ICE_CREAM_SANDWICH returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH)
        val result = is14
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is14 sdk greater than ICE_CREAM_SANDWICH returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH + 1)
        val result = is14
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is14 sdk lower than ICE_CREAM_SANDWICH returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH - 1)
        val result = is14
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is14OrLater sdk equals ICE_CREAM_SANDWICH returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH)
        val result = is14OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is14OrLater sdk greater than ICE_CREAM_SANDWICH returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH + 1)
        val result = is14OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is14OrLater sdk lower than ICE_CREAM_SANDWICH returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH - 1)
        val result = is14OrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan14 sdk greater than ICE_CREAM_SANDWICH returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH + 1)
        val result = isLaterThan14
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThan14 sdk equals ICE_CREAM_SANDWICH returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH)
        val result = isLaterThan14
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan14 sdk lower than ICE_CREAM_SANDWICH returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH - 1)
        val result = isLaterThan14
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreIceCreamSandwichMR1 sdk lower than ICE_CREAM_SANDWICH_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1 - 1)
        val result = isPreIceCreamSandwichMR1
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPreIceCreamSandwichMR1 sdk equals ICE_CREAM_SANDWICH_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1)
        val result = isPreIceCreamSandwichMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreIceCreamSandwichMR1 sdk greater than ICE_CREAM_SANDWICH_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1 + 1)
        val result = isPreIceCreamSandwichMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isIceCreamSandwichMR1 sdk equals ICE_CREAM_SANDWICH_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1)
        val result = isIceCreamSandwichMR1
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isIceCreamSandwichMR1 sdk greater than ICE_CREAM_SANDWICH_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1 + 1)
        val result = isIceCreamSandwichMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isIceCreamSandwichMR1 sdk lower than ICE_CREAM_SANDWICH_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1 - 1)
        val result = isIceCreamSandwichMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isIceCreamSandwichMR1OrLater sdk equals ICE_CREAM_SANDWICH_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1)
        val result = isIceCreamSandwichMR1OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isIceCreamSandwichMR1OrLater sdk greater than ICE_CREAM_SANDWICH_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1 + 1)
        val result = isIceCreamSandwichMR1OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isIceCreamSandwichMR1OrLater sdk lower than ICE_CREAM_SANDWICH_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1 - 1)
        val result = isIceCreamSandwichMR1OrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanIceCreamSandwichMR1 sdk greater than ICE_CREAM_SANDWICH_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1 + 1)
        val result = isLaterThanIceCreamSandwichMR1
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThanIceCreamSandwichMR1 sdk equals ICE_CREAM_SANDWICH_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1)
        val result = isLaterThanIceCreamSandwichMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanIceCreamSandwichMR1 sdk lower than ICE_CREAM_SANDWICH_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1 - 1)
        val result = isLaterThanIceCreamSandwichMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre15 sdk lower than ICE_CREAM_SANDWICH_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1 - 1)
        val result = isPre15
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPre15 sdk equals ICE_CREAM_SANDWICH_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1)
        val result = isPre15
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre15 sdk greater than ICE_CREAM_SANDWICH_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1 + 1)
        val result = isPre15
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is15 sdk equals ICE_CREAM_SANDWICH_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1)
        val result = is15
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is15 sdk greater than ICE_CREAM_SANDWICH_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1 + 1)
        val result = is15
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is15 sdk lower than ICE_CREAM_SANDWICH_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1 - 1)
        val result = is15
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is15OrLater sdk equals ICE_CREAM_SANDWICH_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1)
        val result = is15OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is15OrLater sdk greater than ICE_CREAM_SANDWICH_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1 + 1)
        val result = is15OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is15OrLater sdk lower than ICE_CREAM_SANDWICH_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1 - 1)
        val result = is15OrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan15 sdk greater than ICE_CREAM_SANDWICH_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1 + 1)
        val result = isLaterThan15
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThan15 sdk equals ICE_CREAM_SANDWICH_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1)
        val result = isLaterThan15
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan15 sdk lower than ICE_CREAM_SANDWICH_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1 - 1)
        val result = isLaterThan15
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreJellyBean sdk lower than JELLY_BEAN returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN - 1)
        val result = isPreJellyBean
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPreJellyBean sdk equals JELLY_BEAN returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN)
        val result = isPreJellyBean
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreJellyBean sdk greater than JELLY_BEAN returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN + 1)
        val result = isPreJellyBean
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isJellyBean sdk equals JELLY_BEAN returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN)
        val result = isJellyBean
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isJellyBean sdk greater than JELLY_BEAN returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN + 1)
        val result = isJellyBean
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isJellyBean sdk lower than JELLY_BEAN returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN - 1)
        val result = isJellyBean
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isJellyBeanOrLater sdk equals JELLY_BEAN returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN)
        val result = isJellyBeanOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isJellyBeanOrLater sdk greater than JELLY_BEAN returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN + 1)
        val result = isJellyBeanOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isJellyBeanOrLater sdk lower than JELLY_BEAN returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN - 1)
        val result = isJellyBeanOrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanJellyBean sdk greater than JELLY_BEAN returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN + 1)
        val result = isLaterThanJellyBean
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThanJellyBean sdk equals JELLY_BEAN returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN)
        val result = isLaterThanJellyBean
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanJellyBean sdk lower than JELLY_BEAN returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN - 1)
        val result = isLaterThanJellyBean
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre16 sdk lower than JELLY_BEAN returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN - 1)
        val result = isPre16
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPre16 sdk equals JELLY_BEAN returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN)
        val result = isPre16
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre16 sdk greater than JELLY_BEAN returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN + 1)
        val result = isPre16
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is16 sdk equals JELLY_BEAN returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN)
        val result = is16
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is16 sdk greater than JELLY_BEAN returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN + 1)
        val result = is16
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is16 sdk lower than JELLY_BEAN returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN - 1)
        val result = is16
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is16OrLater sdk equals JELLY_BEAN returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN)
        val result = is16OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is16OrLater sdk greater than JELLY_BEAN returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN + 1)
        val result = is16OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is16OrLater sdk lower than JELLY_BEAN returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN - 1)
        val result = is16OrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan16 sdk greater than JELLY_BEAN returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN + 1)
        val result = isLaterThan16
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThan16 sdk equals JELLY_BEAN returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN)
        val result = isLaterThan16
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan16 sdk lower than JELLY_BEAN returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN - 1)
        val result = isLaterThan16
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreJellyBeanMR1 sdk lower than JELLY_BEAN_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR1 - 1)
        val result = isPreJellyBeanMR1
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPreJellyBeanMR1 sdk equals JELLY_BEAN_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR1)
        val result = isPreJellyBeanMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreJellyBeanMR1 sdk greater than JELLY_BEAN_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR1 + 1)
        val result = isPreJellyBeanMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isJellyBeanMR1 sdk equals JELLY_BEAN_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR1)
        val result = isJellyBeanMR1
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isJellyBeanMR1 sdk greater than JELLY_BEAN_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR1 + 1)
        val result = isJellyBeanMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isJellyBeanMR1 sdk lower than JELLY_BEAN_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR1 - 1)
        val result = isJellyBeanMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isJellyBeanMR1OrLater sdk equals JELLY_BEAN_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR1)
        val result = isJellyBeanMR1OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isJellyBeanMR1OrLater sdk greater than JELLY_BEAN_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR1 + 1)
        val result = isJellyBeanMR1OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isJellyBeanMR1OrLater sdk lower than JELLY_BEAN_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR1 - 1)
        val result = isJellyBeanMR1OrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanJellyBeanMR1 sdk greater than JELLY_BEAN_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR1 + 1)
        val result = isLaterThanJellyBeanMR1
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThanJellyBeanMR1 sdk equals JELLY_BEAN_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR1)
        val result = isLaterThanJellyBeanMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanJellyBeanMR1 sdk lower than JELLY_BEAN_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR1 - 1)
        val result = isLaterThanJellyBeanMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre17 sdk lower than JELLY_BEAN_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR1 - 1)
        val result = isPre17
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPre17 sdk equals JELLY_BEAN_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR1)
        val result = isPre17
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre17 sdk greater than JELLY_BEAN_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR1 + 1)
        val result = isPre17
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is17 sdk equals JELLY_BEAN_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR1)
        val result = is17
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is17 sdk greater than JELLY_BEAN_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR1 + 1)
        val result = is17
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is17 sdk lower than JELLY_BEAN_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR1 - 1)
        val result = is17
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is17OrLater sdk equals JELLY_BEAN_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR1)
        val result = is17OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is17OrLater sdk greater than JELLY_BEAN_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR1 + 1)
        val result = is17OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is17OrLater sdk lower than JELLY_BEAN_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR1 - 1)
        val result = is17OrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan17 sdk greater than JELLY_BEAN_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR1 + 1)
        val result = isLaterThan17
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThan17 sdk equals JELLY_BEAN_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR1)
        val result = isLaterThan17
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan17 sdk lower than JELLY_BEAN_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR1 - 1)
        val result = isLaterThan17
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreJellyBeanMR2 sdk lower than JELLY_BEAN_MR2 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR2 - 1)
        val result = isPreJellyBeanMR2
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPreJellyBeanMR2 sdk equals JELLY_BEAN_MR2 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR2)
        val result = isPreJellyBeanMR2
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreJellyBeanMR2 sdk greater than JELLY_BEAN_MR2 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR2 + 1)
        val result = isPreJellyBeanMR2
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isJellyBeanMR2 sdk equals JELLY_BEAN_MR2 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR2)
        val result = isJellyBeanMR2
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isJellyBeanMR2 sdk greater than JELLY_BEAN_MR2 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR2 + 1)
        val result = isJellyBeanMR2
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isJellyBeanMR2 sdk lower than JELLY_BEAN_MR2 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR2 - 1)
        val result = isJellyBeanMR2
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isJellyBeanMR2OrLater sdk equals JELLY_BEAN_MR2 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR2)
        val result = isJellyBeanMR2OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isJellyBeanMR2OrLater sdk greater than JELLY_BEAN_MR2 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR2 + 1)
        val result = isJellyBeanMR2OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isJellyBeanMR2OrLater sdk lower than JELLY_BEAN_MR2 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR2 - 1)
        val result = isJellyBeanMR2OrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanJellyBeanMR2 sdk greater than JELLY_BEAN_MR2 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR2 + 1)
        val result = isLaterThanJellyBeanMR2
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThanJellyBeanMR2 sdk equals JELLY_BEAN_MR2 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR2)
        val result = isLaterThanJellyBeanMR2
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanJellyBeanMR2 sdk lower than JELLY_BEAN_MR2 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR2 - 1)
        val result = isLaterThanJellyBeanMR2
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre18 sdk lower than JELLY_BEAN_MR2 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR2 - 1)
        val result = isPre18
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPre18 sdk equals JELLY_BEAN_MR2 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR2)
        val result = isPre18
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre18 sdk greater than JELLY_BEAN_MR2 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR2 + 1)
        val result = isPre18
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is18 sdk equals JELLY_BEAN_MR2 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR2)
        val result = is18
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is18 sdk greater than JELLY_BEAN_MR2 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR2 + 1)
        val result = is18
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is18 sdk lower than JELLY_BEAN_MR2 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR2 - 1)
        val result = is18
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is18OrLater sdk equals JELLY_BEAN_MR2 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR2)
        val result = is18OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is18OrLater sdk greater than JELLY_BEAN_MR2 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR2 + 1)
        val result = is18OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is18OrLater sdk lower than JELLY_BEAN_MR2 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR2 - 1)
        val result = is18OrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan18 sdk greater than JELLY_BEAN_MR2 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR2 + 1)
        val result = isLaterThan18
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThan18 sdk equals JELLY_BEAN_MR2 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR2)
        val result = isLaterThan18
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan18 sdk lower than JELLY_BEAN_MR2 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.JELLY_BEAN_MR2 - 1)
        val result = isLaterThan18
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreKitKat sdk lower than KITKAT returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT - 1)
        val result = isPreKitKat
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPreKitKat sdk equals KITKAT returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT)
        val result = isPreKitKat
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreKitKat sdk greater than KITKAT returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT + 1)
        val result = isPreKitKat
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isKitKat sdk equals KITKAT returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT)
        val result = isKitKat
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isKitKat sdk greater than KITKAT returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT + 1)
        val result = isKitKat
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isKitKat sdk lower than KITKAT returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT - 1)
        val result = isKitKat
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isKitKatOrLater sdk equals KITKAT returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT)
        val result = isKitKatOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isKitKatOrLater sdk greater than KITKAT returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT + 1)
        val result = isKitKatOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isKitKatOrLater sdk lower than KITKAT returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT - 1)
        val result = isKitKatOrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanKitKat sdk greater than KITKAT returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT + 1)
        val result = isLaterThanKitKat
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThanKitKat sdk equals KITKAT returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT)
        val result = isLaterThanKitKat
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanKitKat sdk lower than KITKAT returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT - 1)
        val result = isLaterThanKitKat
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre19 sdk lower than KITKAT returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT - 1)
        val result = isPre19
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPre19 sdk equals KITKAT returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT)
        val result = isPre19
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre19 sdk greater than KITKAT returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT + 1)
        val result = isPre19
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is19 sdk equals KITKAT returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT)
        val result = is19
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is19 sdk greater than KITKAT returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT + 1)
        val result = is19
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is19 sdk lower than KITKAT returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT - 1)
        val result = is19
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is19OrLater sdk equals KITKAT returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT)
        val result = is19OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is19OrLater sdk greater than KITKAT returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT + 1)
        val result = is19OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is19OrLater sdk lower than KITKAT returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT - 1)
        val result = is19OrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan19 sdk greater than KITKAT returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT + 1)
        val result = isLaterThan19
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThan19 sdk equals KITKAT returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT)
        val result = isLaterThan19
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan19 sdk lower than KITKAT returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT - 1)
        val result = isLaterThan19
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreKitKatWatch sdk lower than KITKAT_WATCH returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT_WATCH - 1)
        val result = isPreKitKatWatch
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPreKitKatWatch sdk equals KITKAT_WATCH returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT_WATCH)
        val result = isPreKitKatWatch
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreKitKatWatch sdk greater than KITKAT_WATCH returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT_WATCH + 1)
        val result = isPreKitKatWatch
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isKitKatWatch sdk equals KITKAT_WATCH returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT_WATCH)
        val result = isKitKatWatch
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isKitKatWatch sdk greater than KITKAT_WATCH returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT_WATCH + 1)
        val result = isKitKatWatch
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isKitKatWatch sdk lower than KITKAT_WATCH returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT_WATCH - 1)
        val result = isKitKatWatch
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isKitKatWatchOrLater sdk equals KITKAT_WATCH returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT_WATCH)
        val result = isKitKatWatchOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isKitKatWatchOrLater sdk greater than KITKAT_WATCH returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT_WATCH + 1)
        val result = isKitKatWatchOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isKitKatWatchOrLater sdk lower than KITKAT_WATCH returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT_WATCH - 1)
        val result = isKitKatWatchOrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanKitKatWatch sdk greater than KITKAT_WATCH returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT_WATCH + 1)
        val result = isLaterThanKitKatWatch
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThanKitKatWatch sdk equals KITKAT_WATCH returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT_WATCH)
        val result = isLaterThanKitKatWatch
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanKitKatWatch sdk lower than KITKAT_WATCH returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT_WATCH - 1)
        val result = isLaterThanKitKatWatch
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre20 sdk lower than KITKAT_WATCH returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT_WATCH - 1)
        val result = isPre20
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPre20 sdk equals KITKAT_WATCH returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT_WATCH)
        val result = isPre20
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre20 sdk greater than KITKAT_WATCH returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT_WATCH + 1)
        val result = isPre20
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is20 sdk equals KITKAT_WATCH returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT_WATCH)
        val result = is20
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is20 sdk greater than KITKAT_WATCH returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT_WATCH + 1)
        val result = is20
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is20 sdk lower than KITKAT_WATCH returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT_WATCH - 1)
        val result = is20
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is20OrLater sdk equals KITKAT_WATCH returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT_WATCH)
        val result = is20OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is20OrLater sdk greater than KITKAT_WATCH returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT_WATCH + 1)
        val result = is20OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is20OrLater sdk lower than KITKAT_WATCH returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT_WATCH - 1)
        val result = is20OrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan20 sdk greater than KITKAT_WATCH returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT_WATCH + 1)
        val result = isLaterThan20
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThan20 sdk equals KITKAT_WATCH returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT_WATCH)
        val result = isLaterThan20
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan20 sdk lower than KITKAT_WATCH returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.KITKAT_WATCH - 1)
        val result = isLaterThan20
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreLollipop sdk lower than LOLLIPOP returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP - 1)
        val result = isPreLollipop
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPreLollipop sdk equals LOLLIPOP returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP)
        val result = isPreLollipop
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreLollipop sdk greater than LOLLIPOP returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP + 1)
        val result = isPreLollipop
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLollipop sdk equals LOLLIPOP returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP)
        val result = isLollipop
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLollipop sdk greater than LOLLIPOP returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP + 1)
        val result = isLollipop
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLollipop sdk lower than LOLLIPOP returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP - 1)
        val result = isLollipop
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLollipopOrLater sdk equals LOLLIPOP returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP)
        val result = isLollipopOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLollipopOrLater sdk greater than LOLLIPOP returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP + 1)
        val result = isLollipopOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLollipopOrLater sdk lower than LOLLIPOP returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP - 1)
        val result = isLollipopOrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanLollipop sdk greater than LOLLIPOP returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP + 1)
        val result = isLaterThanLollipop
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThanLollipop sdk equals LOLLIPOP returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP)
        val result = isLaterThanLollipop
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanLollipop sdk lower than LOLLIPOP returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP - 1)
        val result = isLaterThanLollipop
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre21 sdk lower than LOLLIPOP returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP - 1)
        val result = isPre21
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPre21 sdk equals LOLLIPOP returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP)
        val result = isPre21
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre21 sdk greater than LOLLIPOP returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP + 1)
        val result = isPre21
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is21 sdk equals LOLLIPOP returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP)
        val result = is21
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is21 sdk greater than LOLLIPOP returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP + 1)
        val result = is21
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is21 sdk lower than LOLLIPOP returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP - 1)
        val result = is21
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is21OrLater sdk equals LOLLIPOP returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP)
        val result = is21OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is21OrLater sdk greater than LOLLIPOP returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP + 1)
        val result = is21OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is21OrLater sdk lower than LOLLIPOP returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP - 1)
        val result = is21OrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan21 sdk greater than LOLLIPOP returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP + 1)
        val result = isLaterThan21
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThan21 sdk equals LOLLIPOP returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP)
        val result = isLaterThan21
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan21 sdk lower than LOLLIPOP returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP - 1)
        val result = isLaterThan21
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreLollipopMR1 sdk lower than LOLLIPOP_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP_MR1 - 1)
        val result = isPreLollipopMR1
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPreLollipopMR1 sdk equals LOLLIPOP_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP_MR1)
        val result = isPreLollipopMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreLollipopMR1 sdk greater than LOLLIPOP_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP_MR1 + 1)
        val result = isPreLollipopMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLollipopMR1 sdk equals LOLLIPOP_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP_MR1)
        val result = isLollipopMR1
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLollipopMR1 sdk greater than LOLLIPOP_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP_MR1 + 1)
        val result = isLollipopMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLollipopMR1 sdk lower than LOLLIPOP_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP_MR1 - 1)
        val result = isLollipopMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLollipopMR1OrLater sdk equals LOLLIPOP_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP_MR1)
        val result = isLollipopMR1OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLollipopMR1OrLater sdk greater than LOLLIPOP_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP_MR1 + 1)
        val result = isLollipopMR1OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLollipopMR1OrLater sdk lower than LOLLIPOP_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP_MR1 - 1)
        val result = isLollipopMR1OrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanLollipopMR1 sdk greater than LOLLIPOP_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP_MR1 + 1)
        val result = isLaterThanLollipopMR1
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThanLollipopMR1 sdk equals LOLLIPOP_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP_MR1)
        val result = isLaterThanLollipopMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanLollipopMR1 sdk lower than LOLLIPOP_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP_MR1 - 1)
        val result = isLaterThanLollipopMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre22 sdk lower than LOLLIPOP_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP_MR1 - 1)
        val result = isPre22
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPre22 sdk equals LOLLIPOP_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP_MR1)
        val result = isPre22
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre22 sdk greater than LOLLIPOP_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP_MR1 + 1)
        val result = isPre22
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is22 sdk equals LOLLIPOP_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP_MR1)
        val result = is22
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is22 sdk greater than LOLLIPOP_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP_MR1 + 1)
        val result = is22
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is22 sdk lower than LOLLIPOP_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP_MR1 - 1)
        val result = is22
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is22OrLater sdk equals LOLLIPOP_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP_MR1)
        val result = is22OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is22OrLater sdk greater than LOLLIPOP_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP_MR1 + 1)
        val result = is22OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is22OrLater sdk lower than LOLLIPOP_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP_MR1 - 1)
        val result = is22OrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan22 sdk greater than LOLLIPOP_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP_MR1 + 1)
        val result = isLaterThan22
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThan22 sdk equals LOLLIPOP_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP_MR1)
        val result = isLaterThan22
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan22 sdk lower than LOLLIPOP_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.LOLLIPOP_MR1 - 1)
        val result = isLaterThan22
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreM sdk lower than M returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.M - 1)
        val result = isPreM
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPreM sdk equals M returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.M)
        val result = isPreM
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreM sdk greater than M returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.M + 1)
        val result = isPreM
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isM sdk equals M returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.M)
        val result = isM
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isM sdk greater than M returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.M + 1)
        val result = isM
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isM sdk lower than M returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.M - 1)
        val result = isM
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isMOrLater sdk equals M returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.M)
        val result = isMOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isMOrLater sdk greater than M returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.M + 1)
        val result = isMOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isMOrLater sdk lower than M returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.M - 1)
        val result = isMOrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanM sdk greater than M returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.M + 1)
        val result = isLaterThanM
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThanM sdk equals M returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.M)
        val result = isLaterThanM
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanM sdk lower than M returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.M - 1)
        val result = isLaterThanM
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreMarshmallow sdk lower than M returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.M - 1)
        val result = isPreMarshmallow
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPreMarshmallow sdk equals M returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.M)
        val result = isPreMarshmallow
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreMarshmallow sdk greater than M returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.M + 1)
        val result = isPreMarshmallow
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isMarshmallow sdk equals M returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.M)
        val result = isMarshmallow
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isMarshmallow sdk greater than M returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.M + 1)
        val result = isMarshmallow
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isMarshmallow sdk lower than M returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.M - 1)
        val result = isMarshmallow
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isMarshmallowOrLater sdk equals M returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.M)
        val result = isMarshmallowOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isMarshmallowOrLater sdk greater than M returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.M + 1)
        val result = isMarshmallowOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isMarshmallowOrLater sdk lower than M returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.M - 1)
        val result = isMarshmallowOrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanMarshmallow sdk greater than M returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.M + 1)
        val result = isLaterThanMarshmallow
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThanMarshmallow sdk equals M returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.M)
        val result = isLaterThanMarshmallow
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanMarshmallow sdk lower than M returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.M - 1)
        val result = isLaterThanMarshmallow
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre23 sdk lower than M returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.M - 1)
        val result = isPre23
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPre23 sdk equals M returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.M)
        val result = isPre23
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre23 sdk greater than M returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.M + 1)
        val result = isPre23
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is23 sdk equals M returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.M)
        val result = is23
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is23 sdk greater than M returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.M + 1)
        val result = is23
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is23 sdk lower than M returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.M - 1)
        val result = is23
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is23OrLater sdk equals M returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.M)
        val result = is23OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is23OrLater sdk greater than M returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.M + 1)
        val result = is23OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is23OrLater sdk lower than M returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.M - 1)
        val result = is23OrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan23 sdk greater than M returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.M + 1)
        val result = isLaterThan23
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThan23 sdk equals M returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.M)
        val result = isLaterThan23
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan23 sdk lower than M returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.M - 1)
        val result = isLaterThan23
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreN sdk lower than N returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N - 1)
        val result = isPreN
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPreN sdk equals N returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N)
        val result = isPreN
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreN sdk greater than N returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N + 1)
        val result = isPreN
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isN sdk equals N returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N)
        val result = isN
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isN sdk greater than N returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N + 1)
        val result = isN
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isN sdk lower than N returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N - 1)
        val result = isN
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isNOrLater sdk equals N returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N)
        val result = isNOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isNOrLater sdk greater than N returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N + 1)
        val result = isNOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isNOrLater sdk lower than N returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N - 1)
        val result = isNOrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanN sdk greater than N returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N + 1)
        val result = isLaterThanN
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThanN sdk equals N returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N)
        val result = isLaterThanN
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanN sdk lower than N returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N - 1)
        val result = isLaterThanN
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreNougat sdk lower than N returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N - 1)
        val result = isPreNougat
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPreNougat sdk equals N returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N)
        val result = isPreNougat
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreNougat sdk greater than N returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N + 1)
        val result = isPreNougat
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isNougat sdk equals N returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N)
        val result = isNougat
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isNougat sdk greater than N returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N + 1)
        val result = isNougat
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isNougat sdk lower than N returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N - 1)
        val result = isNougat
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isNougatOrLater sdk equals N returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N)
        val result = isNougatOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isNougatOrLater sdk greater than N returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N + 1)
        val result = isNougatOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isNougatOrLater sdk lower than N returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N - 1)
        val result = isNougatOrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanNougat sdk greater than N returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N + 1)
        val result = isLaterThanNougat
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThanNougat sdk equals N returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N)
        val result = isLaterThanNougat
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanNougat sdk lower than N returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N - 1)
        val result = isLaterThanNougat
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre24 sdk lower than N returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N - 1)
        val result = isPre24
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPre24 sdk equals N returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N)
        val result = isPre24
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre24 sdk greater than N returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N + 1)
        val result = isPre24
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is24 sdk equals N returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N)
        val result = is24
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is24 sdk greater than N returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N + 1)
        val result = is24
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is24 sdk lower than N returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N - 1)
        val result = is24
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is24OrLater sdk equals N returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N)
        val result = is24OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is24OrLater sdk greater than N returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N + 1)
        val result = is24OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is24OrLater sdk lower than N returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N - 1)
        val result = is24OrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan24 sdk greater than N returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N + 1)
        val result = isLaterThan24
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThan24 sdk equals N returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N)
        val result = isLaterThan24
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan24 sdk lower than N returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N - 1)
        val result = isLaterThan24
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreNMR1 sdk lower than NMR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N_MR1 - 1)
        val result = isPreNMR1
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPreNMR1 sdk equals NMR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N_MR1)
        val result = isPreNMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreNMR1 sdk greater than NMR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N_MR1 + 1)
        val result = isPreNMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isNMR1 sdk equals NMR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N_MR1)
        val result = isNMR1
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isNMR1 sdk greater than NMR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N_MR1 + 1)
        val result = isNMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isNMR1 sdk lower than NMR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N_MR1 - 1)
        val result = isNMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isNMR1OrLater sdk equals NMR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N_MR1)
        val result = isNMR1OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isNMR1OrLater sdk greater than NMR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N_MR1 + 1)
        val result = isNMR1OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isNMR1OrLater sdk lower than NMR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N_MR1 - 1)
        val result = isNMR1OrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanNMR1 sdk greater than NMR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N_MR1 + 1)
        val result = isLaterThanNMR1
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThanNMR1 sdk equals NMR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N_MR1)
        val result = isLaterThanNMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanNMR1 sdk lower than NMR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N_MR1 - 1)
        val result = isLaterThanNMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreNougatMR1 sdk lower than NMR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N_MR1 - 1)
        val result = isPreNougatMR1
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPreNougatMR1 sdk equals NMR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N_MR1)
        val result = isPreNougatMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreNougatMR1 sdk greater than NMR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N_MR1 + 1)
        val result = isPreNougatMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isNougatMR1 sdk equals NMR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N_MR1)
        val result = isNougatMR1
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isNougatMR1 sdk greater than NMR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N_MR1 + 1)
        val result = isNougatMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isNougatMR1 sdk lower than NMR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N_MR1 - 1)
        val result = isNougatMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isNougatMR1OrLater sdk equals NMR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N_MR1)
        val result = isNougatMR1OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isNougatMR1OrLater sdk greater than NMR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N_MR1 + 1)
        val result = isNougatMR1OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isNougatMR1OrLater sdk lower than NMR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N_MR1 - 1)
        val result = isNougatMR1OrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanNougatMR1 sdk greater than NMR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N_MR1 + 1)
        val result = isLaterThanNougatMR1
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThanNougatMR1 sdk equals NMR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N_MR1)
        val result = isLaterThanNougatMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanNougatMR1 sdk lower than NMR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N_MR1 - 1)
        val result = isLaterThanNougatMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre25 sdk lower than NMR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N_MR1 - 1)
        val result = isPre25
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPre25 sdk equals NMR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N_MR1)
        val result = isPre25
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre25 sdk greater than NMR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N_MR1 + 1)
        val result = isPre25
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is25 sdk equals NMR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N_MR1)
        val result = is25
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is25 sdk greater than NMR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N_MR1 + 1)
        val result = is25
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is25 sdk lower than NMR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N_MR1 - 1)
        val result = is25
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is25OrLater sdk equals NMR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N_MR1)
        val result = is25OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is25OrLater sdk greater than NMR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N_MR1 + 1)
        val result = is25OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is25OrLater sdk lower than NMR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N_MR1 - 1)
        val result = is25OrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan25 sdk greater than NMR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N_MR1 + 1)
        val result = isLaterThan25
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThan25 sdk equals NMR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N_MR1)
        val result = isLaterThan25
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan25 sdk lower than NMR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.N_MR1 - 1)
        val result = isLaterThan25
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreO sdk lower than O returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O - 1)
        val result = isPreO
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPreO sdk equals O returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O)
        val result = isPreO
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreO sdk greater than O returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O + 1)
        val result = isPreO
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isO sdk equals O returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O)
        val result = isO
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isO sdk greater than O returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O + 1)
        val result = isO
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isO sdk lower than O returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O - 1)
        val result = isO
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isOOrLater sdk equals O returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O)
        val result = isOOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isOOrLater sdk greater than O returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O + 1)
        val result = isOOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isOOrLater sdk lower than O returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O - 1)
        val result = isOOrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanO sdk greater than O returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O + 1)
        val result = isLaterThanO
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThanO sdk equals O returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O)
        val result = isLaterThanO
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanO sdk lower than O returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O - 1)
        val result = isLaterThanO
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreOreo sdk lower than O returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O - 1)
        val result = isPreOreo
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPreOreo sdk equals O returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O)
        val result = isPreOreo
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreOreo sdk greater than O returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O + 1)
        val result = isPreOreo
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isOreo sdk equals O returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O)
        val result = isOreo
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isOreo sdk greater than O returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O + 1)
        val result = isOreo
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isOreo sdk lower than O returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O - 1)
        val result = isOreo
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isOreoOrLater sdk equals O returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O)
        val result = isOreoOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isOreoOrLater sdk greater than O returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O + 1)
        val result = isOreoOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isOreoOrLater sdk lower than O returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O - 1)
        val result = isOreoOrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanOreo sdk greater than O returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O + 1)
        val result = isLaterThanOreo
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThanOreo sdk equals O returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O)
        val result = isLaterThanOreo
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanOreo sdk lower than O returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O - 1)
        val result = isLaterThanOreo
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre26 sdk lower than O returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O - 1)
        val result = isPre26
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPre26 sdk equals O returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O)
        val result = isPre26
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre26 sdk greater than O returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O + 1)
        val result = isPre26
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is26 sdk equals O returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O)
        val result = is26
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is26 sdk greater than O returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O + 1)
        val result = is26
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is26 sdk lower than O returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O - 1)
        val result = is26
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is26OrLater sdk equals O returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O)
        val result = is26OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is26OrLater sdk greater than O returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O + 1)
        val result = is26OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is26OrLater sdk lower than O returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O - 1)
        val result = is26OrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan26 sdk greater than O returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O + 1)
        val result = isLaterThan26
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThan26 sdk equals O returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O)
        val result = isLaterThan26
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan26 sdk lower than O returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O - 1)
        val result = isLaterThan26
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreOMR1 sdk lower than O_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O_MR1 - 1)
        val result = isPreOMR1
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPreOMR1 sdk equals O_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O_MR1)
        val result = isPreOMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreOMR1 sdk greater than O_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O_MR1 + 1)
        val result = isPreOMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isOMR1 sdk equals O_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O_MR1)
        val result = isOMR1
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isOMR1 sdk greater than O_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O_MR1 + 1)
        val result = isOMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isOMR1 sdk lower than O_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O_MR1 - 1)
        val result = isOMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isOMR1OrLater sdk equals O_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O_MR1)
        val result = isOMR1OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isOMR1OrLater sdk greater than O_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O_MR1 + 1)
        val result = isOMR1OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isOMR1OrLater sdk lower than O_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O_MR1 - 1)
        val result = isOMR1OrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanOMR1 sdk greater than O_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O_MR1 + 1)
        val result = isLaterThanOMR1
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThanOMR1 sdk equals O_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O_MR1)
        val result = isLaterThanOMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanOMR1 sdk lower than O_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O_MR1 - 1)
        val result = isLaterThanOMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreOreoMR1 sdk lower than O_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O_MR1 - 1)
        val result = isPreOreoMR1
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPreOreoMR1 sdk equals O_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O_MR1)
        val result = isPreOreoMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreOreoMR1 sdk greater than O_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O_MR1 + 1)
        val result = isPreOreoMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isOreoMR1 sdk equals O_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O_MR1)
        val result = isOreoMR1
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isOreoMR1 sdk greater than O_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O_MR1 + 1)
        val result = isOreoMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isOreoMR1 sdk lower than O_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O_MR1 - 1)
        val result = isOreoMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isOreoMR1OrLater sdk equals O_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O_MR1)
        val result = isOreoMR1OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isOreoMR1OrLater sdk greater than O_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O_MR1 + 1)
        val result = isOreoMR1OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isOreoMR1OrLater sdk lower than O_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O_MR1 - 1)
        val result = isOreoMR1OrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanOreoMR1 sdk greater than O_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O_MR1 + 1)
        val result = isLaterThanOreoMR1
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThanOreoMR1 sdk equals O_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O_MR1)
        val result = isLaterThanOreoMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanOreoMR1 sdk lower than O_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O_MR1 - 1)
        val result = isLaterThanOreoMR1
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre27 sdk lower than O_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O_MR1 - 1)
        val result = isPre27
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPre27 sdk equals O_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O_MR1)
        val result = isPre27
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre27 sdk greater than O_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O_MR1 + 1)
        val result = isPre27
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is27 sdk equals O_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O_MR1)
        val result = is27
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is27 sdk greater than O_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O_MR1 + 1)
        val result = is27
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is27 sdk lower than O_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O_MR1 - 1)
        val result = is27
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is27OrLater sdk equals O_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O_MR1)
        val result = is27OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is27OrLater sdk greater than O_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O_MR1 + 1)
        val result = is27OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is27OrLater sdk lower than O_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O_MR1 - 1)
        val result = is27OrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan27 sdk greater than O_MR1 returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O_MR1 + 1)
        val result = isLaterThan27
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThan27 sdk equals O_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O_MR1)
        val result = isLaterThan27
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan27 sdk lower than O_MR1 returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.O_MR1 - 1)
        val result = isLaterThan27
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreP sdk lower than P returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.P - 1)
        val result = isPreP
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPreP sdk equals P returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.P)
        val result = isPreP
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreP sdk greater than P returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.P + 1)
        val result = isPreP
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isP sdk equals P returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.P)
        val result = isP
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isP sdk greater than P returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.P + 1)
        val result = isP
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isP sdk lower than P returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.P - 1)
        val result = isP
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPOrLater sdk equals P returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.P)
        val result = isPOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isPOrLater sdk greater than P returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.P + 1)
        val result = isPOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isPOrLater sdk lower than P returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.P - 1)
        val result = isPOrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanP sdk greater than P returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.P + 1)
        val result = isLaterThanP
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThanP sdk equals P returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.P)
        val result = isLaterThanP
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanP sdk lower than P returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.P - 1)
        val result = isLaterThanP
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPrePie sdk lower than P returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.P - 1)
        val result = isPrePie
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPrePie sdk equals P returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.P)
        val result = isPrePie
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPrePie sdk greater than P returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.P + 1)
        val result = isPrePie
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPie sdk equals P returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.P)
        val result = isPie
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isPie sdk greater than P returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.P + 1)
        val result = isPie
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPie sdk lower than P returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.P - 1)
        val result = isPie
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPieOrLater sdk equals P returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.P)
        val result = isPieOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isPieOrLater sdk greater than P returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.P + 1)
        val result = isPieOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isPieOrLater sdk lower than P returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.P - 1)
        val result = isPieOrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanPie sdk greater than P returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.P + 1)
        val result = isLaterThanPie
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThanPie sdk equals P returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.P)
        val result = isLaterThanPie
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanPie sdk lower than P returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.P - 1)
        val result = isLaterThanPie
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre28 sdk lower than P returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.P - 1)
        val result = isPre28
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPre28 sdk equals P returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.P)
        val result = isPre28
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre28 sdk greater than P returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.P + 1)
        val result = isPre28
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is28 sdk equals P returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.P)
        val result = is28
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is28 sdk greater than P returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.P + 1)
        val result = is28
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is28 sdk lower than P returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.P - 1)
        val result = is28
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is28OrLater sdk equals P returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.P)
        val result = is28OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is28OrLater sdk greater than P returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.P + 1)
        val result = is28OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is28OrLater sdk lower than P returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.P - 1)
        val result = is28OrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan28 sdk greater than P returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.P + 1)
        val result = isLaterThan28
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThan28 sdk equals P returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.P)
        val result = isLaterThan28
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan28 sdk lower than P returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.P - 1)
        val result = isLaterThan28
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreQ sdk lower than Q returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.Q - 1)
        val result = isPreQ
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPreQ sdk equals Q returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.Q)
        val result = isPreQ
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreQ sdk greater than Q returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.Q + 1)
        val result = isPreQ
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isQ sdk equals Q returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.Q)
        val result = isQ
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isQ sdk greater than Q returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.Q + 1)
        val result = isQ
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isQ sdk lower than Q returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.Q - 1)
        val result = isQ
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isQOrLater sdk equals Q returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.Q)
        val result = isQOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isQOrLater sdk greater than Q returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.Q + 1)
        val result = isQOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isQOrLater sdk lower than Q returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.Q - 1)
        val result = isQOrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanQ sdk greater than Q returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.Q + 1)
        val result = isLaterThanQ
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThanQ sdk equals Q returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.Q)
        val result = isLaterThanQ
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanQ sdk lower than Q returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.Q - 1)
        val result = isLaterThanQ
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre29 sdk lower than Q returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.Q - 1)
        val result = isPre29
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPre29 sdk equals Q returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.Q)
        val result = isPre29
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre29 sdk greater than Q returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.Q + 1)
        val result = isPre29
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is29 sdk equals Q returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.Q)
        val result = is29
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is29 sdk greater than Q returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.Q + 1)
        val result = is29
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is29 sdk lower than Q returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.Q - 1)
        val result = is29
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is29OrLater sdk equals Q returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.Q)
        val result = is29OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is29OrLater sdk greater than Q returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.Q + 1)
        val result = is29OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is29OrLater sdk lower than Q returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.Q - 1)
        val result = is29OrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan29 sdk greater than Q returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.Q + 1)
        val result = isLaterThan29
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThan29 sdk equals Q returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.Q)
        val result = isLaterThan29
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan29 sdk lower than Q returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.Q - 1)
        val result = isLaterThan29
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreR sdk lower than R returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.R - 1)
        val result = isPreR
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPreR sdk equals R returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.R)
        val result = isPreR
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreR sdk greater than R returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.R + 1)
        val result = isPreR
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isR sdk equals R returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.R)
        val result = isR
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isR sdk greater than R returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.R + 1)
        val result = isR
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isR sdk lower than R returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.R - 1)
        val result = isR
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isROrLater sdk equals R returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.R)
        val result = isROrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isROrLater sdk greater than R returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.R + 1)
        val result = isROrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isROrLater sdk lower than R returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.R - 1)
        val result = isROrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanR sdk greater than R returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.R + 1)
        val result = isLaterThanR
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThanR sdk equals R returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.R)
        val result = isLaterThanR
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanR sdk lower than R returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.R - 1)
        val result = isLaterThanR
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre30 sdk lower than R returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.R - 1)
        val result = isPre30
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPre30 sdk equals R returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.R)
        val result = isPre30
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre30 sdk greater than R returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.R + 1)
        val result = isPre30
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is30 sdk equals R returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.R)
        val result = is30
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is30 sdk greater than R returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.R + 1)
        val result = is30
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is30 sdk lower than R returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.R - 1)
        val result = is30
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is30OrLater sdk equals R returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.R)
        val result = is30OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is30OrLater sdk greater than R returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.R + 1)
        val result = is30OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is30OrLater sdk lower than R returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.R - 1)
        val result = is30OrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan30 sdk greater than R returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.R + 1)
        val result = isLaterThan30
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThan30 sdk equals R returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.R)
        val result = isLaterThan30
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan30 sdk lower than R returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.R - 1)
        val result = isLaterThan30
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreS sdk lower than S returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.S - 1)
        val result = isPreS
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isPreS sdk equals R returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.S)
        val result = isPreS
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreS sdk greater than S returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.S + 1)
        val result = isPreS
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isS sdk equals S returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.S)
        val result = isS
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isS sdk greater than S returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.S + 1)
        val result = isS
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isS sdk lower than S returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.S - 1)
        val result = isS
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isSOrLater sdk equals S returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.S)
        val result = isSOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isSOrLater sdk greater than S returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.S + 1)
        val result = isSOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isSOrLater sdk lower than S returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.S - 1)
        val result = isSOrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanS sdk greater than S returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.S + 1)
        val result = isLaterThanS
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThanS sdk equals S returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.S)
        val result = isLaterThanS
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanS sdk lower than S returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.S - 1)
        val result = isLaterThanS
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre31 sdk lower than S returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.S - 1)
        val result = isPre31
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPre31 sdk equals S returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.S)
        val result = isPre31
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPre31 sdk greater than S returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.S + 1)
        val result = isPre31
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is31 sdk equals S returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.S)
        val result = is31
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is31 sdk greater than S returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.S + 1)
        val result = is31
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is31 sdk lower than S returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.S - 1)
        val result = is31
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `is31OrLater sdk equals S returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.S)
        val result = is31OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is31OrLater sdk greater than S returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.S + 1)
        val result = is31OrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `is31OrLater sdk lower than S returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.S - 1)
        val result = is31OrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan31 sdk greater than S returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.S + 1)
        val result = isLaterThan31
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThan31 sdk equals S returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.S)
        val result = isLaterThan31
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThan31 sdk lower than S returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.S - 1)
        val result = isLaterThan31
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreCurrentDevelopment sdk lower than CurrentDevelopment returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.CUR_DEVELOPMENT - 1)
        val result = isPreCurrentDevelopment
        assertThat(result).isEqualTo(true)
    }


    @Test
    fun `isPreCurrentDevelopment sdk equals Q returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.CUR_DEVELOPMENT)
        val result = isPreCurrentDevelopment
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isPreCurrentDevelopment sdk greater than CurrentDevelopment returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.CUR_DEVELOPMENT + 1)
        val result = isPreCurrentDevelopment
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isCurrentDevelopment sdk equals Q returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.CUR_DEVELOPMENT)
        val result = isCurrentDevelopment
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isCurrentDevelopment sdk greater than CurrentDevelopment returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.CUR_DEVELOPMENT + 1)
        val result = isCurrentDevelopment
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isCurrentDevelopment sdk lower than CurrentDevelopment returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.CUR_DEVELOPMENT - 1)
        val result = isCurrentDevelopment
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isCurrentDevelopmentOrLater sdk equals Q returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.CUR_DEVELOPMENT)
        val result = isCurrentDevelopmentOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isCurrentDevelopmentOrLater sdk greater than CurrentDevelopment returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.CUR_DEVELOPMENT + 1)
        val result = isCurrentDevelopmentOrLater
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isCurrentDevelopmentOrLater sdk lower than CurrentDevelopment returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.CUR_DEVELOPMENT - 1)
        val result = isCurrentDevelopmentOrLater
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanCurrentDevelopment sdk greater than CurrentDevelopment returns true`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.CUR_DEVELOPMENT + 1)
        val result = isLaterThanCurrentDevelopment
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun `isLaterThanCurrentDevelopment sdk equals Q returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.CUR_DEVELOPMENT)
        val result = isLaterThanCurrentDevelopment
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `isLaterThanCurrentDevelopment sdk lower than CurrentDevelopment returns false`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.CUR_DEVELOPMENT - 1)
        val result = isLaterThanCurrentDevelopment
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun `sdkVersionNumber returns correct sdk version number`() {
        setFinalStatic(VERSION::class.java.getField("SDK_INT"), Build.VERSION_CODES.R)
        val result = sdkVersionNumber
        assertThat(result).isEqualTo(Build.VERSION_CODES.R)
    }



    
}
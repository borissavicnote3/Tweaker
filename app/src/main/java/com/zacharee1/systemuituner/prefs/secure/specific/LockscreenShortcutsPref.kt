package com.zacharee1.systemuituner.prefs.secure.specific

import android.content.Context
import android.os.Build
import android.util.AttributeSet
import androidx.core.content.ContextCompat
import com.zacharee1.systemuituner.R
import com.zacharee1.systemuituner.prefs.secure.base.BaseSecurePreference
import com.zacharee1.systemuituner.interfaces.ISpecificPreference
import com.zacharee1.systemuituner.util.SettingsType

class LockscreenShortcutsPref(context: Context, attrs: AttributeSet) : BaseSecurePreference(context, attrs),
    ISpecificPreference {
    override var type: SettingsType = SettingsType.SECURE
    override val keys: Array<String> = arrayOf(
        "sysui_keyguard_left",
        "sysui_keyguard_right"
    )

    init {
        key = "lockscreen_shortcuts"

        setTitle(R.string.feature_lockscreen_shortcuts)
        setSummary(R.string.feature_lockscreen_shortcuts_desc)

        dialogTitle = title
        dialogMessage = summary
        setIcon(R.drawable.lock_open)

        lowApi = Build.VERSION_CODES.O
//        highApi = Build.VERSION_CODES.O_MR1
        iconColor = ContextCompat.getColor(context, R.color.pref_color_3)
    }
}
package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class zig {
    public final PackageInfo a;
    public final String b;
    public String c;

    public zig(Context context) {
        try {
            this.a = context.getPackageManager().getPackageInfo(context.getPackageName(), IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            this.b = "5.12.0";
        } catch (PackageManager.NameNotFoundException unused) {
            throw null;
        }
    }

    public final String a() {
        String str = this.c;
        if (str != null) {
            return str;
        }
        PackageInfo packageInfo = this.a;
        String str2 = packageInfo == null ? "UNK" : packageInfo.packageName;
        String str3 = packageInfo != null ? packageInfo.versionName : "UNK";
        Locale locale = Locale.getDefault();
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("/");
        sb.append(str3);
        sb.append(" ChannelSDK/");
        sb.append(this.b);
        sb.append(" (Linux; U; Android ");
        sb.append(Build.VERSION.RELEASE);
        sb.append("; ");
        sb.append(locale.getLanguage());
        sb.append("-");
        sb.append(locale.getCountry());
        sb.append("; ");
        sb.append(Build.MODEL);
        sb.append(" Build/");
        String strI = l6.i(sb, Build.ID, ")");
        this.c = strI;
        return strI;
    }
}

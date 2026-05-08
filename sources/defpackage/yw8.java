package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes3.dex */
public final class yw8 {
    public final int a;
    public final int b;
    public final int c;

    public yw8(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static yw8 a(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo("jp.naver.line.android", IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT).versionName;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            return new yw8(Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken()));
        } catch (PackageManager.NameNotFoundException | NullPointerException | NumberFormatException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yw8.class != obj.getClass()) {
            return false;
        }
        yw8 yw8Var = (yw8) obj;
        return this.a == yw8Var.a && this.b == yw8Var.b && this.c == yw8Var.c;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }
}

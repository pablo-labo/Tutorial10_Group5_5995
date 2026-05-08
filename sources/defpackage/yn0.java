package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class yn0 extends mj8 implements Function1<zf7, j6g> {
    final /* synthetic */ Context $context;
    final /* synthetic */ zn0 $event;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn0(zn0 zn0Var, Context context) {
        super(1);
        this.$event = zn0Var;
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(zf7 zf7Var) {
        zf7 zf7Var2 = zf7Var;
        if (zf7Var2 != null) {
            this.$event.a.add(zf7Var2);
        }
        HashMap map = new HashMap();
        map.put("event", this.$event);
        lla.b("SnowplowInstallTracking", map);
        Context context = this.$context;
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(context.getPackageName() + "_preferences", 0).edit();
        if (editorEdit != null) {
            editorEdit.putString("installed_before", "YES");
        }
        if (editorEdit != null) {
            editorEdit.apply();
        }
        return j6g.a;
    }
}

package com.wlappdebug;

import android.text.SpannableStringBuilder;
import defpackage.h5;
import defpackage.j6g;
import defpackage.mj8;
import defpackage.t40;
import defpackage.wve;
import defpackage.z92;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends mj8 implements Function1<SpannableStringBuilder, j6g> {
    final /* synthetic */ DebugActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(DebugActivity debugActivity) {
        super(1);
        this.this$0 = debugActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(SpannableStringBuilder spannableStringBuilder) throws IOException {
        String string;
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        spannableStringBuilder2.getClass();
        Map<String, ?> all = DebugActivity.A(this.this$0).c().getAll();
        all.getClass();
        ArrayList arrayList = new ArrayList(all.size());
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                string = t40.k(key, " = null");
            } else {
                key.getClass();
                Object obj = (wve.D(key, "Token", false) || wve.D(key, "token", false)) ? "(redacted)" : value;
                StringBuilder sbG = h5.g(key, " = (");
                sbG.append(value.getClass().getSimpleName());
                sbG.append(") ");
                sbG.append(obj);
                string = sbG.toString();
            }
            arrayList.add(string);
        }
        String strW0 = z92.W0(z92.o1(arrayList), "\n", null, null, null, 62);
        if (strW0.length() > 0) {
            spannableStringBuilder2.append((CharSequence) strW0);
        } else {
            spannableStringBuilder2.append((CharSequence) "No items");
        }
        return j6g.a;
    }
}

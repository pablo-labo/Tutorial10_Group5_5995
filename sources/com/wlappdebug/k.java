package com.wlappdebug;

import android.text.SpannableStringBuilder;
import com.wlappdebug.r;
import defpackage.j6g;
import defpackage.mj8;
import defpackage.z92;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends mj8 implements Function1<SpannableStringBuilder, j6g> {
    final /* synthetic */ DebugActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(DebugActivity debugActivity) {
        super(1);
        this.this$0 = debugActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(SpannableStringBuilder spannableStringBuilder) throws IOException {
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        spannableStringBuilder2.getClass();
        List listA = r.a();
        DebugActivity debugActivity = this.this$0;
        ArrayList arrayList = new ArrayList();
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((r.b) debugActivity.s0.getValue()).a((r.a) it.next());
        }
        String strW0 = z92.W0(arrayList, "\n", null, null, new j(this.this$0), 30);
        if (strW0.length() > 0) {
            spannableStringBuilder2.append((CharSequence) strW0);
        } else {
            spannableStringBuilder2.append((CharSequence) "No items");
        }
        return j6g.a;
    }
}

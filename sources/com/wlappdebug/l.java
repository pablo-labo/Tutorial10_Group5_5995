package com.wlappdebug;

import android.text.SpannableStringBuilder;
import defpackage.a32;
import defpackage.hb5;
import defpackage.j6g;
import defpackage.mj8;
import defpackage.zve;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends mj8 implements Function1<SpannableStringBuilder, j6g> {
    final /* synthetic */ DebugActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(DebugActivity debugActivity) {
        super(1);
        this.this$0 = debugActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(SpannableStringBuilder spannableStringBuilder) {
        String string;
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        spannableStringBuilder2.getClass();
        try {
            string = zve.s0(hb5.T(new File(this.this$0.getFilesDir(), "debug_last_exception_dump.txt"), a32.b)).toString();
        } catch (IOException unused) {
            string = null;
        }
        spannableStringBuilder2.append((CharSequence) string);
        return j6g.a;
    }
}

package com.wlappdebug;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import defpackage.j6g;
import defpackage.kc9;
import defpackage.mj8;
import defpackage.t92;
import defpackage.vn1;
import defpackage.ybf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends mj8 implements Function1<SpannableStringBuilder, j6g> {
    final /* synthetic */ DebugActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(DebugActivity debugActivity) {
        super(1);
        this.this$0 = debugActivity;
    }

    public final void a(SpannableStringBuilder spannableStringBuilder) {
        Object next;
        spannableStringBuilder.getClass();
        List<ybf> listD = DebugActivity.B(this.this$0).a().d();
        ArrayList arrayListA = DebugActivity.B(this.this$0).a().a();
        int iV = kc9.V(t92.r0(arrayListA, 10));
        if (iV < 16) {
            iV = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iV);
        for (Object obj : arrayListA) {
            linkedHashMap.put(((vn1) obj).getTest().name(), obj);
        }
        for (ybf ybfVar : listD) {
            Integer numC = DebugActivity.B(this.this$0).c(ybfVar.getName());
            List<vn1<?>> listC = DebugActivity.B(this.this$0).a().c(ybfVar);
            if (numC != null) {
                Iterator<T> it = listC.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((vn1) next).getValue() == numC.intValue()) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                vn1 vn1Var = (vn1) next;
                StyleSpan styleSpan = new StyleSpan(1);
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) (ybfVar.getName() + " = "));
                if (vn1Var != null) {
                    spannableStringBuilder.append((CharSequence) (vn1Var.getName() + " (" + vn1Var.getValue() + ')'));
                } else {
                    spannableStringBuilder.append((CharSequence) ("custom (" + numC + ')'));
                }
                spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
            } else {
                vn1 vn1Var2 = (vn1) linkedHashMap.get(ybfVar.getName());
                spannableStringBuilder.append((CharSequence) (ybfVar.getName() + " = "));
                if (vn1Var2 != null) {
                    spannableStringBuilder.append((CharSequence) (vn1Var2.getName() + " (" + vn1Var2.getValue() + ')'));
                } else {
                    spannableStringBuilder.append((CharSequence) ("fallback bucket (" + ybfVar.c() + ')'));
                }
            }
            spannableStringBuilder.append("\n");
        }
        if (listD.isEmpty()) {
            spannableStringBuilder.append("No items");
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ j6g invoke(SpannableStringBuilder spannableStringBuilder) {
        a(spannableStringBuilder);
        return j6g.a;
    }
}

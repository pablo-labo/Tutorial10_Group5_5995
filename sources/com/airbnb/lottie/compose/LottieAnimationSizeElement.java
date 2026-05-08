package com.airbnb.lottie.compose;

import androidx.compose.ui.e;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.o69;
import defpackage.qx9;
import defpackage.w40;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;", "Lqx9;", "Lo69;", "lottie-compose_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public final /* data */ class LottieAnimationSizeElement extends qx9<o69> {
    public final int b;
    public final int c;

    public LottieAnimationSizeElement(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        o69 o69Var = new o69();
        o69Var.d0 = this.b;
        o69Var.e0 = this.c;
        return o69Var;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        o69 o69Var = (o69) cVar;
        o69Var.getClass();
        o69Var.d0 = this.b;
        o69Var.e0 = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LottieAnimationSizeElement)) {
            return false;
        }
        LottieAnimationSizeElement lottieAnimationSizeElement = (LottieAnimationSizeElement) obj;
        return this.b == lottieAnimationSizeElement.b && this.c == lottieAnimationSizeElement.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        return w40.e("LottieAnimationSizeElement(width=", this.b, ", height=", this.c, ")");
    }
}

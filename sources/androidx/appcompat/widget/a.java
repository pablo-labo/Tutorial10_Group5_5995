package androidx.appcompat.widget;

import androidx.appcompat.widget.AppCompatSpinner;
import defpackage.vee;
import defpackage.yp5;

/* JADX INFO: loaded from: classes.dex */
public final class a extends yp5 {
    public final /* synthetic */ AppCompatSpinner.e Y;
    public final /* synthetic */ AppCompatSpinner Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AppCompatSpinner appCompatSpinner, AppCompatSpinner appCompatSpinner2, AppCompatSpinner.e eVar) {
        super(appCompatSpinner2);
        this.Z = appCompatSpinner;
        this.Y = eVar;
    }

    @Override // defpackage.yp5
    public final vee b() {
        return this.Y;
    }

    @Override // defpackage.yp5
    public final boolean c() {
        AppCompatSpinner appCompatSpinner = this.Z;
        if (appCompatSpinner.getInternalPopup().a()) {
            return true;
        }
        appCompatSpinner.f.k(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
        return true;
    }
}

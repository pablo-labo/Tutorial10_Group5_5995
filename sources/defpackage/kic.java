package defpackage;

import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.RangeDateSelector;
import com.google.android.material.datepicker.a;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.af9;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes2.dex */
public final class kic extends a {
    public final /* synthetic */ TextInputLayout V;
    public final /* synthetic */ TextInputLayout W;
    public final /* synthetic */ af9.a X;
    public final /* synthetic */ RangeDateSelector Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kic(RangeDateSelector rangeDateSelector, String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, af9.a aVar) {
        super(str, simpleDateFormat, textInputLayout, calendarConstraints);
        this.Y = rangeDateSelector;
        this.V = textInputLayout2;
        this.W = textInputLayout3;
        this.X = aVar;
    }

    @Override // com.google.android.material.datepicker.a
    public final void a() {
        RangeDateSelector rangeDateSelector = this.Y;
        rangeDateSelector.d = null;
        RangeDateSelector.a(rangeDateSelector, this.V, this.W, this.X);
    }

    @Override // com.google.android.material.datepicker.a
    public final void b(Long l) {
        RangeDateSelector rangeDateSelector = this.Y;
        rangeDateSelector.d = l;
        RangeDateSelector.a(rangeDateSelector, this.V, this.W, this.X);
    }
}

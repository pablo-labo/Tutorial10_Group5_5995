package defpackage;

import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.SingleDateSelector;
import com.google.android.material.datepicker.a;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.af9;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes2.dex */
public final class rge extends a {
    public final /* synthetic */ af9.a V;
    public final /* synthetic */ SingleDateSelector W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rge(SingleDateSelector singleDateSelector, String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, af9.a aVar) {
        super(str, simpleDateFormat, textInputLayout, calendarConstraints);
        this.W = singleDateSelector;
        this.V = aVar;
    }

    @Override // com.google.android.material.datepicker.a
    public final void a() {
        this.V.a();
    }

    @Override // com.google.android.material.datepicker.a
    public final void b(Long l) {
        SingleDateSelector singleDateSelector = this.W;
        if (l == null) {
            singleDateSelector.a = null;
        } else {
            singleDateSelector.a = l;
        }
        this.V.b(singleDateSelector.a);
    }
}

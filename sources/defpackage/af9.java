package defpackage;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class af9<S> extends dab<S> {
    public int b;
    public DateSelector<S> c;
    public CalendarConstraints d;

    public class a extends ira<S> {
        public a() {
        }

        @Override // defpackage.ira
        public final void a() {
            Iterator<ira<S>> it = af9.this.a.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }

        @Override // defpackage.ira
        public final void b(S s) {
            Iterator<ira<S>> it = af9.this.a.iterator();
            while (it.hasNext()) {
                it.next().b(s);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.b = bundle.getInt("THEME_RES_ID_KEY");
        this.c = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.d = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.c.w1(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.b)), viewGroup, this.d, new a());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.b);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.c);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.d);
    }
}

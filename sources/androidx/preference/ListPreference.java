package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
import com.indeed.android.jobsearch.R;
import defpackage.gac;
import defpackage.syf;

/* JADX INFO: loaded from: classes.dex */
public class ListPreference extends DialogPreference {
    public final CharSequence[] W;
    public final String X;

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public final String a;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a);
        }
    }

    public static final class a implements Preference.a<ListPreference> {
        public static a a;

        @Override // androidx.preference.Preference.a
        public final CharSequence a(Preference preference) {
            ListPreference listPreference = (ListPreference) preference;
            if (TextUtils.isEmpty(null)) {
                return listPreference.a.getString(R.string.not_set);
            }
            return null;
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gac.d, i, 0);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.W = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        if (typedArrayObtainStyledAttributes.getTextArray(3) == null) {
            typedArrayObtainStyledAttributes.getTextArray(1);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(4, typedArrayObtainStyledAttributes.getBoolean(4, false))) {
            if (a.a == null) {
                a.a = new a();
            }
            this.V = a.a;
            c();
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, gac.f, i, 0);
        String string = typedArrayObtainStyledAttributes2.getString(33);
        this.X = string == null ? typedArrayObtainStyledAttributes2.getString(7) : string;
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public final CharSequence a() {
        Preference.a aVar = this.V;
        if (aVar != null) {
            return aVar.a(this);
        }
        CharSequence charSequenceA = super.a();
        String str = this.X;
        if (str != null) {
            String str2 = String.format(str, "");
            if (!TextUtils.equals(str2, charSequenceA)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return str2;
            }
        }
        return charSequenceA;
    }

    @Override // androidx.preference.Preference
    public final Object e(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, syf.a(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}

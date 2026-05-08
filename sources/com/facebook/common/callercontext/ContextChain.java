package com.facebook.common.callercontext;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class ContextChain implements Parcelable {
    public static final Parcelable.Creator<ContextChain> CREATOR = new a();
    public final String a;
    public final String b;
    public final ContextChain c;
    public String d;
    public final String e;

    public class a implements Parcelable.Creator<ContextChain> {
        @Override // android.os.Parcelable.Creator
        public final ContextChain createFromParcel(Parcel parcel) {
            return new ContextChain(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ContextChain[] newArray(int i) {
            return new ContextChain[i];
        }
    }

    public ContextChain(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.e = parcel.readString();
        this.c = (ContextChain) parcel.readParcelable(ContextChain.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ContextChain contextChain = (ContextChain) obj;
            if (Objects.equals(this.e, contextChain.e) && Objects.equals(this.c, contextChain.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.e);
    }

    public final String toString() {
        if (this.d == null) {
            this.d = this.e;
            ContextChain contextChain = this.c;
            if (contextChain != null) {
                this.d = contextChain.toString() + '/' + this.d;
            }
        }
        return this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.e);
        parcel.writeParcelable(this.c, i);
    }
}

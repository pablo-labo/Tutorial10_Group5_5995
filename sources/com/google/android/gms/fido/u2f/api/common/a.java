package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;
import defpackage.l5;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return ChannelIdValue.s0(parcel.readInt());
        } catch (ChannelIdValue.UnsupportedChannelIdValueTypeException e) {
            l5.r(e);
            return null;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ChannelIdValue.ChannelIdValueType[i];
    }
}

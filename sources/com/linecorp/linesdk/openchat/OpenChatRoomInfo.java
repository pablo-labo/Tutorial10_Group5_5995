package com.linecorp.linesdk.openchat;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.w40;
import defpackage.wl7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/linecorp/linesdk/openchat/OpenChatRoomInfo;", "Landroid/os/Parcelable;", "line-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class OpenChatRoomInfo implements Parcelable {
    public static final Parcelable.Creator<OpenChatRoomInfo> CREATOR = new a();
    public final String a;
    public final String b;

    public static final class a implements Parcelable.Creator<OpenChatRoomInfo> {
        @Override // android.os.Parcelable.Creator
        public final OpenChatRoomInfo createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new OpenChatRoomInfo(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OpenChatRoomInfo[] newArray(int i) {
            return new OpenChatRoomInfo[i];
        }
    }

    public OpenChatRoomInfo(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenChatRoomInfo)) {
            return false;
        }
        OpenChatRoomInfo openChatRoomInfo = (OpenChatRoomInfo) obj;
        return wl7.b(this.a, openChatRoomInfo.a) && wl7.b(this.b, openChatRoomInfo.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenChatRoomInfo(roomId=");
        sb.append(this.a);
        sb.append(", landingPageUrl=");
        return w40.f(sb, this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}

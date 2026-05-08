package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.myjobs.data.model.APIError;
import com.indeed.android.myjobs.data.model.dto.BrandedAdsDto;
import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class old implements xo6 {
    public final List<SavedJobsDto> a;
    public final List<SavedJobsDto> b;
    public final boolean c;
    public final int d;
    public final Long e;
    public final List<String> f;
    public final boolean g;
    public final APIError h;
    public final boolean i;
    public final BrandedAdsDto j;
    public final boolean k;
    public final s9 l;
    public final String m;
    public final boolean n;
    public final boolean o;
    public final int p;

    public old(List list, List list2, boolean z, int i, Long l, List list3, boolean z2, APIError aPIError, boolean z3, BrandedAdsDto brandedAdsDto, boolean z4, s9 s9Var, String str, boolean z5, boolean z6, int i2) {
        this.a = list;
        this.b = list2;
        this.c = z;
        this.d = i;
        this.e = l;
        this.f = list3;
        this.g = z2;
        this.h = aPIError;
        this.i = z3;
        this.j = brandedAdsDto;
        this.k = z4;
        this.l = s9Var;
        this.m = str;
        this.n = z5;
        this.o = z6;
        this.p = i2;
    }

    public static old a(old oldVar, List list, ArrayList arrayList, boolean z, int i, Long l, ArrayList arrayList2, boolean z2, APIError aPIError, boolean z3, BrandedAdsDto brandedAdsDto, boolean z4, s9 s9Var, String str, boolean z5, boolean z6, int i2, int i3) {
        List list2 = (i3 & 1) != 0 ? oldVar.a : list;
        List<SavedJobsDto> list3 = (i3 & 2) != 0 ? oldVar.b : arrayList;
        oldVar.getClass();
        boolean z7 = (i3 & 8) != 0 ? oldVar.c : z;
        int i4 = (i3 & 16) != 0 ? oldVar.d : i;
        Long l2 = (i3 & 32) != 0 ? oldVar.e : l;
        List<String> list4 = (i3 & 64) != 0 ? oldVar.f : arrayList2;
        boolean z8 = (i3 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? oldVar.g : z2;
        APIError aPIError2 = (i3 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? oldVar.h : aPIError;
        oldVar.getClass();
        boolean z9 = (i3 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? oldVar.i : z3;
        BrandedAdsDto brandedAdsDto2 = (i3 & 2048) != 0 ? oldVar.j : brandedAdsDto;
        boolean z10 = (i3 & 4096) != 0 ? oldVar.k : z4;
        s9 s9Var2 = (i3 & 8192) != 0 ? oldVar.l : s9Var;
        String str2 = (i3 & 16384) != 0 ? oldVar.m : str;
        boolean z11 = (32768 & i3) != 0 ? oldVar.n : z5;
        boolean z12 = (i3 & 65536) != 0 ? oldVar.o : z6;
        int i5 = (i3 & 131072) != 0 ? oldVar.p : i2;
        oldVar.getClass();
        list3.getClass();
        list4.getClass();
        return new old(list2, list3, z7, i4, l2, list4, z8, aPIError2, z9, brandedAdsDto2, z10, s9Var2, str2, z11, z12, i5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof old)) {
            return false;
        }
        old oldVar = (old) obj;
        return wl7.b(this.a, oldVar.a) && wl7.b(this.b, oldVar.b) && this.c == oldVar.c && this.d == oldVar.d && wl7.b(this.e, oldVar.e) && wl7.b(this.f, oldVar.f) && this.g == oldVar.g && wl7.b(this.h, oldVar.h) && this.i == oldVar.i && wl7.b(this.j, oldVar.j) && this.k == oldVar.k && wl7.b(this.l, oldVar.l) && wl7.b(this.m, oldVar.m) && this.n == oldVar.n && this.o == oldVar.o && this.p == oldVar.p;
    }

    public final int hashCode() {
        List<SavedJobsDto> list = this.a;
        int iC = w40.c(this.d, ia.f(w40.c(0, ia.g(this.b, (list == null ? 0 : list.hashCode()) * 31, 31), 31), 31, this.c), 31);
        Long l = this.e;
        int iF = ia.f(ia.g(this.f, (iC + (l == null ? 0 : l.hashCode())) * 31, 31), 31, this.g);
        APIError aPIError = this.h;
        int iF2 = ia.f(w40.c(0, (iF + (aPIError == null ? 0 : aPIError.hashCode())) * 31, 31), 31, this.i);
        BrandedAdsDto brandedAdsDto = this.j;
        int iF3 = ia.f((iF2 + (brandedAdsDto == null ? 0 : brandedAdsDto.hashCode())) * 31, 31, this.k);
        s9 s9Var = this.l;
        int iHashCode = (iF3 + (s9Var == null ? 0 : s9Var.hashCode())) * 31;
        String str = this.m;
        return Integer.hashCode(this.p) + ia.f(ia.f((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.n), 31, this.o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SavedTabState(savedJobs=");
        sb.append(this.a);
        sb.append(", visitedJobs=");
        sb.append(this.b);
        sb.append(", count=0, isPro=");
        sb.append(this.c);
        sb.append(", remainingTopChoiceAmount=");
        sb.append(this.d);
        sb.append(", nextAvailableTopChoiceTimestamp=");
        sb.append(this.e);
        sb.append(", topChoiceJobKeys=");
        sb.append(this.f);
        sb.append(", isLoading=");
        sb.append(this.g);
        sb.append(", error=");
        sb.append(this.h);
        sb.append(", state=0, shouldShowBadge=");
        sb.append(this.i);
        sb.append(", brandedAd=");
        sb.append(this.j);
        sb.append(", isAdTransparencyVisible=");
        sb.append(this.k);
        sb.append(", currentAdCardData=");
        sb.append(this.l);
        sb.append(", currentAdCreativeKey=");
        akb.q(this.m, ", isAdViewed=", ", isAdVisible=", sb, this.n);
        sb.append(this.o);
        sb.append(", hasActionableNextStep=");
        sb.append(this.p);
        sb.append(")");
        return sb.toString();
    }

    public old() {
        this(0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ old(int i) {
        zr4 zr4Var = zr4.a;
        this(zr4Var, zr4Var, false, 0, 0L, zr4Var, false, null, false, null, false, null, null, false, false, 0);
    }
}

package com.google.android.recaptcha.internal;

import defpackage.ia;
import defpackage.l;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzaek implements zzahy {
    private final zzaej zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzaek(zzaej zzaejVar) {
        byte[] bArr = zzago.zzb;
        this.zza = zzaejVar;
        zzaejVar.zzd = this;
    }

    private final void zzP(Object obj, zzahz zzahzVar, zzafr zzafrVar) {
        int i = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzahzVar.zzh(obj, this, zzafrVar);
            if (this.zzb == this.zzc) {
            } else {
                throw new zzagq("Failed to parse the message.");
            }
        } finally {
            this.zzc = i;
        }
    }

    private final void zzQ(Object obj, zzahz zzahzVar, zzafr zzafrVar) throws zzagq {
        zzaej zzaejVar = this.zza;
        int iZzn = zzaejVar.zzn();
        zzaejVar.zzI();
        int iZze = zzaejVar.zze(iZzn);
        zzaejVar.zza++;
        zzahzVar.zzh(obj, this, zzafrVar);
        zzaejVar.zzz(0);
        zzaejVar.zza--;
        zzaejVar.zzA(iZze);
    }

    private final void zzR(int i) throws zzagq {
        if (this.zza.zzd() == i) {
            return;
        }
        ia.p("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    private final void zzS(int i) throws zzagp {
        if ((this.zzb & 7) == i) {
            return;
        }
        l.k();
    }

    private static final void zzT(int i) throws zzagq {
        if ((i & 3) == 0) {
            return;
        }
        ia.p("Failed to parse the message.");
    }

    private static final void zzU(int i) throws zzagq {
        if ((i & 7) == 0) {
            return;
        }
        ia.p("Failed to parse the message.");
    }

    public static zzaek zzq(zzaej zzaejVar) {
        Object obj = zzaejVar.zzd;
        return obj != null ? (zzaek) obj : new zzaek(zzaejVar);
    }

    @Override // com.google.android.recaptcha.internal.zzahy
    public final void zzA(List list) throws zzagq {
        int iZzm;
        int iZzm2;
        boolean z = list instanceof zzaha;
        int i = this.zzb;
        if (z) {
            zzaha zzahaVar = (zzaha) list;
            int i2 = i & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    l.k();
                    return;
                }
                zzaej zzaejVar = this.zza;
                int iZzn = zzaejVar.zzn();
                zzU(iZzn);
                int iZzd = zzaejVar.zzd() + iZzn;
                do {
                    zzahaVar.zzg(zzaejVar.zzo());
                } while (zzaejVar.zzd() < iZzd);
                return;
            }
            do {
                zzaej zzaejVar2 = this.zza;
                zzahaVar.zzg(zzaejVar2.zzo());
                if (zzaejVar2.zzC()) {
                    return;
                } else {
                    iZzm2 = zzaejVar2.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i3 = i & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    l.k();
                    return;
                }
                zzaej zzaejVar3 = this.zza;
                int iZzn2 = zzaejVar3.zzn();
                zzU(iZzn2);
                int iZzd2 = zzaejVar3.zzd() + iZzn2;
                do {
                    list.add(Long.valueOf(zzaejVar3.zzo()));
                } while (zzaejVar3.zzd() < iZzd2);
                return;
            }
            do {
                zzaej zzaejVar4 = this.zza;
                list.add(Long.valueOf(zzaejVar4.zzo()));
                if (zzaejVar4.zzC()) {
                    return;
                } else {
                    iZzm = zzaejVar4.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzahy
    public final void zzB(List list) throws zzagq {
        int iZzm;
        int iZzm2;
        boolean z = list instanceof zzafy;
        int i = this.zzb;
        if (z) {
            zzafy zzafyVar = (zzafy) list;
            int i2 = i & 7;
            if (i2 == 2) {
                zzaej zzaejVar = this.zza;
                int iZzn = zzaejVar.zzn();
                zzT(iZzn);
                int iZzd = zzaejVar.zzd() + iZzn;
                do {
                    zzafyVar.zzf(zzaejVar.zzc());
                } while (zzaejVar.zzd() < iZzd);
                return;
            }
            if (i2 != 5) {
                l.k();
                return;
            }
            do {
                zzaej zzaejVar2 = this.zza;
                zzafyVar.zzf(zzaejVar2.zzc());
                if (zzaejVar2.zzC()) {
                    return;
                } else {
                    iZzm2 = zzaejVar2.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i3 = i & 7;
            if (i3 == 2) {
                zzaej zzaejVar3 = this.zza;
                int iZzn2 = zzaejVar3.zzn();
                zzT(iZzn2);
                int iZzd2 = zzaejVar3.zzd() + iZzn2;
                do {
                    list.add(Float.valueOf(zzaejVar3.zzc()));
                } while (zzaejVar3.zzd() < iZzd2);
                return;
            }
            if (i3 != 5) {
                l.k();
                return;
            }
            do {
                zzaej zzaejVar4 = this.zza;
                list.add(Float.valueOf(zzaejVar4.zzc()));
                if (zzaejVar4.zzC()) {
                    return;
                } else {
                    iZzm = zzaejVar4.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzahy
    @Deprecated
    public final void zzC(List list, zzahz zzahzVar, zzafr zzafrVar) throws zzagp {
        int iZzm;
        int i = this.zzb;
        if ((i & 7) != 3) {
            l.k();
            return;
        }
        do {
            Object objZze = zzahzVar.zze();
            zzP(objZze, zzahzVar, zzafrVar);
            zzahzVar.zzf(objZze);
            list.add(objZze);
            zzaej zzaejVar = this.zza;
            if (zzaejVar.zzC() || this.zzd != 0) {
                return;
            } else {
                iZzm = zzaejVar.zzm();
            }
        } while (iZzm == i);
        this.zzd = iZzm;
    }

    @Override // com.google.android.recaptcha.internal.zzahy
    public final void zzD(List list) throws zzagq {
        int iZzm;
        int iZzm2;
        boolean z = list instanceof zzagh;
        int i = this.zzb;
        if (z) {
            zzagh zzaghVar = (zzagh) list;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    l.k();
                    return;
                }
                zzaej zzaejVar = this.zza;
                int iZzd = zzaejVar.zzd() + zzaejVar.zzn();
                do {
                    zzaghVar.zzh(zzaejVar.zzh());
                } while (zzaejVar.zzd() < iZzd);
                zzR(iZzd);
                return;
            }
            do {
                zzaej zzaejVar2 = this.zza;
                zzaghVar.zzh(zzaejVar2.zzh());
                if (zzaejVar2.zzC()) {
                    return;
                } else {
                    iZzm2 = zzaejVar2.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    l.k();
                    return;
                }
                zzaej zzaejVar3 = this.zza;
                int iZzd2 = zzaejVar3.zzd() + zzaejVar3.zzn();
                do {
                    list.add(Integer.valueOf(zzaejVar3.zzh()));
                } while (zzaejVar3.zzd() < iZzd2);
                zzR(iZzd2);
                return;
            }
            do {
                zzaej zzaejVar4 = this.zza;
                list.add(Integer.valueOf(zzaejVar4.zzh()));
                if (zzaejVar4.zzC()) {
                    return;
                } else {
                    iZzm = zzaejVar4.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzahy
    public final void zzE(List list) throws zzagq {
        int iZzm;
        int iZzm2;
        boolean z = list instanceof zzaha;
        int i = this.zzb;
        if (z) {
            zzaha zzahaVar = (zzaha) list;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    l.k();
                    return;
                }
                zzaej zzaejVar = this.zza;
                int iZzd = zzaejVar.zzd() + zzaejVar.zzn();
                do {
                    zzahaVar.zzg(zzaejVar.zzp());
                } while (zzaejVar.zzd() < iZzd);
                zzR(iZzd);
                return;
            }
            do {
                zzaej zzaejVar2 = this.zza;
                zzahaVar.zzg(zzaejVar2.zzp());
                if (zzaejVar2.zzC()) {
                    return;
                } else {
                    iZzm2 = zzaejVar2.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    l.k();
                    return;
                }
                zzaej zzaejVar3 = this.zza;
                int iZzd2 = zzaejVar3.zzd() + zzaejVar3.zzn();
                do {
                    list.add(Long.valueOf(zzaejVar3.zzp()));
                } while (zzaejVar3.zzd() < iZzd2);
                zzR(iZzd2);
                return;
            }
            do {
                zzaej zzaejVar4 = this.zza;
                list.add(Long.valueOf(zzaejVar4.zzp()));
                if (zzaejVar4.zzC()) {
                    return;
                } else {
                    iZzm = zzaejVar4.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzahy
    public final void zzF(List list, zzahz zzahzVar, zzafr zzafrVar) throws zzagq {
        int iZzm;
        int i = this.zzb;
        if ((i & 7) != 2) {
            l.k();
            return;
        }
        do {
            Object objZze = zzahzVar.zze();
            zzQ(objZze, zzahzVar, zzafrVar);
            zzahzVar.zzf(objZze);
            list.add(objZze);
            zzaej zzaejVar = this.zza;
            if (zzaejVar.zzC() || this.zzd != 0) {
                return;
            } else {
                iZzm = zzaejVar.zzm();
            }
        } while (iZzm == i);
        this.zzd = iZzm;
    }

    @Override // com.google.android.recaptcha.internal.zzahy
    public final void zzG(List list) throws zzagq {
        int iZzm;
        int iZzm2;
        boolean z = list instanceof zzagh;
        int i = this.zzb;
        if (z) {
            zzagh zzaghVar = (zzagh) list;
            int i2 = i & 7;
            if (i2 == 2) {
                zzaej zzaejVar = this.zza;
                int iZzn = zzaejVar.zzn();
                zzT(iZzn);
                int iZzd = zzaejVar.zzd() + iZzn;
                do {
                    zzaghVar.zzh(zzaejVar.zzk());
                } while (zzaejVar.zzd() < iZzd);
                return;
            }
            if (i2 != 5) {
                l.k();
                return;
            }
            do {
                zzaej zzaejVar2 = this.zza;
                zzaghVar.zzh(zzaejVar2.zzk());
                if (zzaejVar2.zzC()) {
                    return;
                } else {
                    iZzm2 = zzaejVar2.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i3 = i & 7;
            if (i3 == 2) {
                zzaej zzaejVar3 = this.zza;
                int iZzn2 = zzaejVar3.zzn();
                zzT(iZzn2);
                int iZzd2 = zzaejVar3.zzd() + iZzn2;
                do {
                    list.add(Integer.valueOf(zzaejVar3.zzk()));
                } while (zzaejVar3.zzd() < iZzd2);
                return;
            }
            if (i3 != 5) {
                l.k();
                return;
            }
            do {
                zzaej zzaejVar4 = this.zza;
                list.add(Integer.valueOf(zzaejVar4.zzk()));
                if (zzaejVar4.zzC()) {
                    return;
                } else {
                    iZzm = zzaejVar4.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzahy
    public final void zzH(List list) throws zzagq {
        int iZzm;
        int iZzm2;
        boolean z = list instanceof zzaha;
        int i = this.zzb;
        if (z) {
            zzaha zzahaVar = (zzaha) list;
            int i2 = i & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    l.k();
                    return;
                }
                zzaej zzaejVar = this.zza;
                int iZzn = zzaejVar.zzn();
                zzU(iZzn);
                int iZzd = zzaejVar.zzd() + iZzn;
                do {
                    zzahaVar.zzg(zzaejVar.zzt());
                } while (zzaejVar.zzd() < iZzd);
                return;
            }
            do {
                zzaej zzaejVar2 = this.zza;
                zzahaVar.zzg(zzaejVar2.zzt());
                if (zzaejVar2.zzC()) {
                    return;
                } else {
                    iZzm2 = zzaejVar2.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i3 = i & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    l.k();
                    return;
                }
                zzaej zzaejVar3 = this.zza;
                int iZzn2 = zzaejVar3.zzn();
                zzU(iZzn2);
                int iZzd2 = zzaejVar3.zzd() + iZzn2;
                do {
                    list.add(Long.valueOf(zzaejVar3.zzt()));
                } while (zzaejVar3.zzd() < iZzd2);
                return;
            }
            do {
                zzaej zzaejVar4 = this.zza;
                list.add(Long.valueOf(zzaejVar4.zzt()));
                if (zzaejVar4.zzC()) {
                    return;
                } else {
                    iZzm = zzaejVar4.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzahy
    public final void zzI(List list) throws zzagq {
        int iZzm;
        int iZzm2;
        boolean z = list instanceof zzagh;
        int i = this.zzb;
        if (z) {
            zzagh zzaghVar = (zzagh) list;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    l.k();
                    return;
                }
                zzaej zzaejVar = this.zza;
                int iZzd = zzaejVar.zzd() + zzaejVar.zzn();
                do {
                    zzaghVar.zzh(zzaejVar.zzl());
                } while (zzaejVar.zzd() < iZzd);
                zzR(iZzd);
                return;
            }
            do {
                zzaej zzaejVar2 = this.zza;
                zzaghVar.zzh(zzaejVar2.zzl());
                if (zzaejVar2.zzC()) {
                    return;
                } else {
                    iZzm2 = zzaejVar2.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    l.k();
                    return;
                }
                zzaej zzaejVar3 = this.zza;
                int iZzd2 = zzaejVar3.zzd() + zzaejVar3.zzn();
                do {
                    list.add(Integer.valueOf(zzaejVar3.zzl()));
                } while (zzaejVar3.zzd() < iZzd2);
                zzR(iZzd2);
                return;
            }
            do {
                zzaej zzaejVar4 = this.zza;
                list.add(Integer.valueOf(zzaejVar4.zzl()));
                if (zzaejVar4.zzC()) {
                    return;
                } else {
                    iZzm = zzaejVar4.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzahy
    public final void zzJ(List list) throws zzagq {
        int iZzm;
        int iZzm2;
        boolean z = list instanceof zzaha;
        int i = this.zzb;
        if (z) {
            zzaha zzahaVar = (zzaha) list;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    l.k();
                    return;
                }
                zzaej zzaejVar = this.zza;
                int iZzd = zzaejVar.zzd() + zzaejVar.zzn();
                do {
                    zzahaVar.zzg(zzaejVar.zzu());
                } while (zzaejVar.zzd() < iZzd);
                zzR(iZzd);
                return;
            }
            do {
                zzaej zzaejVar2 = this.zza;
                zzahaVar.zzg(zzaejVar2.zzu());
                if (zzaejVar2.zzC()) {
                    return;
                } else {
                    iZzm2 = zzaejVar2.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    l.k();
                    return;
                }
                zzaej zzaejVar3 = this.zza;
                int iZzd2 = zzaejVar3.zzd() + zzaejVar3.zzn();
                do {
                    list.add(Long.valueOf(zzaejVar3.zzu()));
                } while (zzaejVar3.zzd() < iZzd2);
                zzR(iZzd2);
                return;
            }
            do {
                zzaej zzaejVar4 = this.zza;
                list.add(Long.valueOf(zzaejVar4.zzu()));
                if (zzaejVar4.zzC()) {
                    return;
                } else {
                    iZzm = zzaejVar4.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    public final void zzK(List list, boolean z) throws zzagp {
        int iZzm;
        int iZzm2;
        if ((this.zzb & 7) != 2) {
            l.k();
            return;
        }
        if ((list instanceof zzagx) && !z) {
            zzagx zzagxVar = (zzagx) list;
            do {
                zzp();
                zzagxVar.zzb();
                zzaej zzaejVar = this.zza;
                if (zzaejVar.zzC()) {
                    return;
                } else {
                    iZzm2 = zzaejVar.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            do {
                list.add(z ? zzs() : zzr());
                zzaej zzaejVar2 = this.zza;
                if (zzaejVar2.zzC()) {
                    return;
                } else {
                    iZzm = zzaejVar2.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzahy
    public final void zzL(List list) throws zzagq {
        int iZzm;
        int iZzm2;
        boolean z = list instanceof zzagh;
        int i = this.zzb;
        if (z) {
            zzagh zzaghVar = (zzagh) list;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    l.k();
                    return;
                }
                zzaej zzaejVar = this.zza;
                int iZzd = zzaejVar.zzd() + zzaejVar.zzn();
                do {
                    zzaghVar.zzh(zzaejVar.zzn());
                } while (zzaejVar.zzd() < iZzd);
                zzR(iZzd);
                return;
            }
            do {
                zzaej zzaejVar2 = this.zza;
                zzaghVar.zzh(zzaejVar2.zzn());
                if (zzaejVar2.zzC()) {
                    return;
                } else {
                    iZzm2 = zzaejVar2.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    l.k();
                    return;
                }
                zzaej zzaejVar3 = this.zza;
                int iZzd2 = zzaejVar3.zzd() + zzaejVar3.zzn();
                do {
                    list.add(Integer.valueOf(zzaejVar3.zzn()));
                } while (zzaejVar3.zzd() < iZzd2);
                zzR(iZzd2);
                return;
            }
            do {
                zzaej zzaejVar4 = this.zza;
                list.add(Integer.valueOf(zzaejVar4.zzn()));
                if (zzaejVar4.zzC()) {
                    return;
                } else {
                    iZzm = zzaejVar4.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzahy
    public final void zzM(List list) throws zzagq {
        int iZzm;
        int iZzm2;
        boolean z = list instanceof zzaha;
        int i = this.zzb;
        if (z) {
            zzaha zzahaVar = (zzaha) list;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    l.k();
                    return;
                }
                zzaej zzaejVar = this.zza;
                int iZzd = zzaejVar.zzd() + zzaejVar.zzn();
                do {
                    zzahaVar.zzg(zzaejVar.zzv());
                } while (zzaejVar.zzd() < iZzd);
                zzR(iZzd);
                return;
            }
            do {
                zzaej zzaejVar2 = this.zza;
                zzahaVar.zzg(zzaejVar2.zzv());
                if (zzaejVar2.zzC()) {
                    return;
                } else {
                    iZzm2 = zzaejVar2.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    l.k();
                    return;
                }
                zzaej zzaejVar3 = this.zza;
                int iZzd2 = zzaejVar3.zzd() + zzaejVar3.zzn();
                do {
                    list.add(Long.valueOf(zzaejVar3.zzv()));
                } while (zzaejVar3.zzd() < iZzd2);
                zzR(iZzd2);
                return;
            }
            do {
                zzaej zzaejVar4 = this.zza;
                list.add(Long.valueOf(zzaejVar4.zzv()));
                if (zzaejVar4.zzC()) {
                    return;
                } else {
                    iZzm = zzaejVar4.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzahy
    public final boolean zzN() throws zzagp {
        zzS(0);
        return this.zza.zzD();
    }

    @Override // com.google.android.recaptcha.internal.zzahy
    public final boolean zzO() {
        int i;
        zzaej zzaejVar = this.zza;
        if (zzaejVar.zzC() || (i = this.zzb) == this.zzc) {
            return false;
        }
        return zzaejVar.zzE(i);
    }

    @Override // com.google.android.recaptcha.internal.zzahy
    public final double zza() throws zzagp {
        zzS(1);
        return this.zza.zzb();
    }

    @Override // com.google.android.recaptcha.internal.zzahy
    public final float zzb() throws zzagp {
        zzS(5);
        return this.zza.zzc();
    }

    @Override // com.google.android.recaptcha.internal.zzahy
    public final int zzc() {
        int iZzm = this.zzd;
        if (iZzm != 0) {
            this.zzb = iZzm;
            this.zzd = 0;
        } else {
            iZzm = this.zza.zzm();
            this.zzb = iZzm;
        }
        if (iZzm == 0 || iZzm == this.zzc) {
            return Integer.MAX_VALUE;
        }
        return iZzm >>> 3;
    }

    @Override // com.google.android.recaptcha.internal.zzahy
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzahy
    public final int zze() throws zzagp {
        zzS(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.recaptcha.internal.zzahy
    public final int zzf() throws zzagp {
        zzS(5);
        return this.zza.zzg();
    }

    @Override // com.google.android.recaptcha.internal.zzahy
    public final int zzg() throws zzagp {
        zzS(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.recaptcha.internal.zzahy
    public final int zzh() throws zzagp {
        zzS(5);
        return this.zza.zzk();
    }

    @Override // com.google.android.recaptcha.internal.zzahy
    public final int zzi() throws zzagp {
        zzS(0);
        return this.zza.zzl();
    }

    @Override // com.google.android.recaptcha.internal.zzahy
    public final int zzj() throws zzagp {
        zzS(0);
        return this.zza.zzn();
    }

    @Override // com.google.android.recaptcha.internal.zzahy
    public final long zzk() throws zzagp {
        zzS(1);
        return this.zza.zzo();
    }

    @Override // com.google.android.recaptcha.internal.zzahy
    public final long zzl() throws zzagp {
        zzS(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.recaptcha.internal.zzahy
    public final long zzm() throws zzagp {
        zzS(1);
        return this.zza.zzt();
    }

    @Override // com.google.android.recaptcha.internal.zzahy
    public final long zzn() throws zzagp {
        zzS(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.recaptcha.internal.zzahy
    public final long zzo() throws zzagp {
        zzS(0);
        return this.zza.zzv();
    }

    @Override // com.google.android.recaptcha.internal.zzahy
    public final zzaef zzp() throws zzagp {
        zzS(2);
        return this.zza.zzw();
    }

    @Override // com.google.android.recaptcha.internal.zzahy
    public final String zzr() throws zzagp {
        zzS(2);
        return this.zza.zzx();
    }

    @Override // com.google.android.recaptcha.internal.zzahy
    public final String zzs() throws zzagp {
        zzS(2);
        return this.zza.zzy();
    }

    @Override // com.google.android.recaptcha.internal.zzahy
    public final void zzt(Object obj, zzahz zzahzVar, zzafr zzafrVar) throws zzagp {
        zzS(3);
        zzP(obj, zzahzVar, zzafrVar);
    }

    @Override // com.google.android.recaptcha.internal.zzahy
    public final void zzu(Object obj, zzahz zzahzVar, zzafr zzafrVar) throws zzagq {
        zzS(2);
        zzQ(obj, zzahzVar, zzafrVar);
    }

    @Override // com.google.android.recaptcha.internal.zzahy
    public final void zzv(List list) throws zzagq {
        int iZzm;
        int iZzm2;
        boolean z = list instanceof zzadw;
        int i = this.zzb;
        if (z) {
            zzadw zzadwVar = (zzadw) list;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    l.k();
                    return;
                }
                zzaej zzaejVar = this.zza;
                int iZzd = zzaejVar.zzd() + zzaejVar.zzn();
                do {
                    zzadwVar.zze(zzaejVar.zzD());
                } while (zzaejVar.zzd() < iZzd);
                zzR(iZzd);
                return;
            }
            do {
                zzaej zzaejVar2 = this.zza;
                zzadwVar.zze(zzaejVar2.zzD());
                if (zzaejVar2.zzC()) {
                    return;
                } else {
                    iZzm2 = zzaejVar2.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    l.k();
                    return;
                }
                zzaej zzaejVar3 = this.zza;
                int iZzd2 = zzaejVar3.zzd() + zzaejVar3.zzn();
                do {
                    list.add(Boolean.valueOf(zzaejVar3.zzD()));
                } while (zzaejVar3.zzd() < iZzd2);
                zzR(iZzd2);
                return;
            }
            do {
                zzaej zzaejVar4 = this.zza;
                list.add(Boolean.valueOf(zzaejVar4.zzD()));
                if (zzaejVar4.zzC()) {
                    return;
                } else {
                    iZzm = zzaejVar4.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzahy
    public final void zzw(List list) throws zzagp {
        int iZzm;
        if ((this.zzb & 7) != 2) {
            l.k();
            return;
        }
        do {
            list.add(zzp());
            zzaej zzaejVar = this.zza;
            if (zzaejVar.zzC()) {
                return;
            } else {
                iZzm = zzaejVar.zzm();
            }
        } while (iZzm == this.zzb);
        this.zzd = iZzm;
    }

    @Override // com.google.android.recaptcha.internal.zzahy
    public final void zzx(List list) throws zzagq {
        int iZzm;
        int iZzm2;
        boolean z = list instanceof zzafl;
        int i = this.zzb;
        if (z) {
            zzafl zzaflVar = (zzafl) list;
            int i2 = i & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    l.k();
                    return;
                }
                zzaej zzaejVar = this.zza;
                int iZzn = zzaejVar.zzn();
                zzU(iZzn);
                int iZzd = zzaejVar.zzd() + iZzn;
                do {
                    zzaflVar.zzf(zzaejVar.zzb());
                } while (zzaejVar.zzd() < iZzd);
                return;
            }
            do {
                zzaej zzaejVar2 = this.zza;
                zzaflVar.zzf(zzaejVar2.zzb());
                if (zzaejVar2.zzC()) {
                    return;
                } else {
                    iZzm2 = zzaejVar2.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i3 = i & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    l.k();
                    return;
                }
                zzaej zzaejVar3 = this.zza;
                int iZzn2 = zzaejVar3.zzn();
                zzU(iZzn2);
                int iZzd2 = zzaejVar3.zzd() + iZzn2;
                do {
                    list.add(Double.valueOf(zzaejVar3.zzb()));
                } while (zzaejVar3.zzd() < iZzd2);
                return;
            }
            do {
                zzaej zzaejVar4 = this.zza;
                list.add(Double.valueOf(zzaejVar4.zzb()));
                if (zzaejVar4.zzC()) {
                    return;
                } else {
                    iZzm = zzaejVar4.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzahy
    public final void zzy(List list) throws zzagq {
        int iZzm;
        int iZzm2;
        boolean z = list instanceof zzagh;
        int i = this.zzb;
        if (z) {
            zzagh zzaghVar = (zzagh) list;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    l.k();
                    return;
                }
                zzaej zzaejVar = this.zza;
                int iZzd = zzaejVar.zzd() + zzaejVar.zzn();
                do {
                    zzaghVar.zzh(zzaejVar.zzf());
                } while (zzaejVar.zzd() < iZzd);
                zzR(iZzd);
                return;
            }
            do {
                zzaej zzaejVar2 = this.zza;
                zzaghVar.zzh(zzaejVar2.zzf());
                if (zzaejVar2.zzC()) {
                    return;
                } else {
                    iZzm2 = zzaejVar2.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    l.k();
                    return;
                }
                zzaej zzaejVar3 = this.zza;
                int iZzd2 = zzaejVar3.zzd() + zzaejVar3.zzn();
                do {
                    list.add(Integer.valueOf(zzaejVar3.zzf()));
                } while (zzaejVar3.zzd() < iZzd2);
                zzR(iZzd2);
                return;
            }
            do {
                zzaej zzaejVar4 = this.zza;
                list.add(Integer.valueOf(zzaejVar4.zzf()));
                if (zzaejVar4.zzC()) {
                    return;
                } else {
                    iZzm = zzaejVar4.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }

    @Override // com.google.android.recaptcha.internal.zzahy
    public final void zzz(List list) throws zzagq {
        int iZzm;
        int iZzm2;
        boolean z = list instanceof zzagh;
        int i = this.zzb;
        if (z) {
            zzagh zzaghVar = (zzagh) list;
            int i2 = i & 7;
            if (i2 == 2) {
                zzaej zzaejVar = this.zza;
                int iZzn = zzaejVar.zzn();
                zzT(iZzn);
                int iZzd = zzaejVar.zzd() + iZzn;
                do {
                    zzaghVar.zzh(zzaejVar.zzg());
                } while (zzaejVar.zzd() < iZzd);
                return;
            }
            if (i2 != 5) {
                l.k();
                return;
            }
            do {
                zzaej zzaejVar2 = this.zza;
                zzaghVar.zzh(zzaejVar2.zzg());
                if (zzaejVar2.zzC()) {
                    return;
                } else {
                    iZzm2 = zzaejVar2.zzm();
                }
            } while (iZzm2 == this.zzb);
        } else {
            int i3 = i & 7;
            if (i3 == 2) {
                zzaej zzaejVar3 = this.zza;
                int iZzn2 = zzaejVar3.zzn();
                zzT(iZzn2);
                int iZzd2 = zzaejVar3.zzd() + iZzn2;
                do {
                    list.add(Integer.valueOf(zzaejVar3.zzg()));
                } while (zzaejVar3.zzd() < iZzd2);
                return;
            }
            if (i3 != 5) {
                l.k();
                return;
            }
            do {
                zzaej zzaejVar4 = this.zza;
                list.add(Integer.valueOf(zzaejVar4.zzg()));
                if (zzaejVar4.zzC()) {
                    return;
                } else {
                    iZzm = zzaejVar4.zzm();
                }
            } while (iZzm == this.zzb);
            iZzm2 = iZzm;
        }
        this.zzd = iZzm2;
    }
}

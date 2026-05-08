package com.google.android.recaptcha.internal;

import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.core.integrity.model.StandardIntegrityErrorCode;
import defpackage.c1f;
import defpackage.e13;
import defpackage.ewa;
import defpackage.g13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.luc;
import defpackage.r7d;
import defpackage.xd2;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzcs extends c1f implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzda zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcs(zzda zzdaVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzc = zzdaVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzcs(this.zzc, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcs) create((e13) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v29, types: [j6g, java.lang.Object] */
    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws zzeg {
        zzed zzedVar;
        luc lucVar;
        try {
            if (this.zzb != 0) {
                lucVar = (luc) this.zza;
                r7d.b(obj);
            } else {
                r7d.b(obj);
                lucVar = new luc();
                zzcr zzcrVar = new zzcr(this.zzc, lucVar, null);
                this.zza = lucVar;
                this.zzb = 1;
                Object objO = ewa.O(60000L, zzcrVar, this);
                g13 g13Var = g13.a;
                if (objO == g13Var) {
                    return g13Var;
                }
            }
            this = j6g.a;
            return this;
        } catch (Exception e) {
            zzda zzdaVar = this.zzc;
            xd2 xd2VarZze = zzdaVar.zze();
            Throwable th = (Throwable) lucVar.element;
            if (th == null) {
                th = e;
            }
            xd2VarZze.h0(th);
            zzdaVar.zzc = zzdb.zza;
            zzee zzeeVar = zzee.zzb;
            Throwable th2 = (Throwable) lucVar.element;
            if (th2 == null) {
                th2 = e;
            }
            if (th2 instanceof StandardIntegrityException) {
                int errorCode = ((StandardIntegrityException) th2).getErrorCode();
                if (errorCode == -100) {
                    zzedVar = zzed.zzaU;
                } else if (errorCode == -12) {
                    zzedVar = zzed.zzaN;
                } else if (errorCode == -3) {
                    zzedVar = zzed.zzaH;
                } else if (errorCode == -2) {
                    zzedVar = zzed.zzaG;
                } else if (errorCode != -1) {
                    switch (errorCode) {
                        case StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                            zzedVar = zzed.zzaT;
                            break;
                        case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                            zzedVar = zzed.zzaS;
                            break;
                        case -17:
                            zzedVar = zzed.zzaR;
                            break;
                        case -16:
                            zzedVar = zzed.zzaQ;
                            break;
                        case -15:
                            zzedVar = zzed.zzaP;
                            break;
                        case -14:
                            zzedVar = zzed.zzaO;
                            break;
                        default:
                            switch (errorCode) {
                                case -9:
                                    zzedVar = zzed.zzaM;
                                    break;
                                case -8:
                                    zzedVar = zzed.zzaL;
                                    break;
                                case -7:
                                    zzedVar = zzed.zzaK;
                                    break;
                                case -6:
                                    zzedVar = zzed.zzaJ;
                                    break;
                                case -5:
                                    zzedVar = zzed.zzaI;
                                    break;
                                default:
                                    zzedVar = zzed.zza;
                                    break;
                            }
                            break;
                    }
                } else {
                    zzedVar = zzed.zzaF;
                }
            } else {
                zzedVar = zzed.zza;
            }
            throw new zzeg(zzeeVar, zzedVar, e.getMessage(), null, 8, null);
        }
    }
}

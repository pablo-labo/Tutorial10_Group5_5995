package com.google.android.recaptcha.internal;

import defpackage.wg2;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;

/* JADX INFO: loaded from: classes2.dex */
public final class zziv {
    private final HttpURLConnection zza;

    public zziv(HttpURLConnection httpURLConnection) {
        this.zza = httpURLConnection;
    }

    private final InputStream zzf() throws zzeg {
        try {
            return this.zza.getInputStream();
        } catch (UnknownServiceException e) {
            throw new zzeg(zzee.zzc, zzed.zzaf, e.getMessage(), null, 8, null);
        } catch (IOException e2) {
            throw new zzeg(zzee.zzc, zzed.zzae, e2.getMessage(), null, 8, null);
        } catch (Exception e3) {
            throw new zzeg(zzee.zzc, zzed.zzak, e3.getMessage(), null, 8, null);
        }
    }

    private final OutputStream zzg() throws zzeg {
        try {
            return this.zza.getOutputStream();
        } catch (UnknownServiceException e) {
            throw new zzeg(zzee.zzc, zzed.zzaf, e.getMessage(), null, 8, null);
        } catch (IOException e2) {
            throw new zzeg(zzee.zzc, zzed.zzae, e2.getMessage(), null, 8, null);
        } catch (Exception e3) {
            throw new zzeg(zzee.zzc, zzed.zzak, e3.getMessage(), null, 8, null);
        }
    }

    public final zzahl zza(zzahl zzahlVar) throws IOException, zzeg {
        try {
            int responseCode = this.zza.getResponseCode();
            if (responseCode != 200) {
                if (responseCode == 400) {
                    throw new zzeg(zzee.zzc, zzed.zzax, null, null, 12, null);
                }
                if (responseCode != 503 && responseCode != 403) {
                    if (responseCode != 404) {
                        throw new zzeg(zzee.zzc, zzed.zzK, null, null, 12, null);
                    }
                    throw new zzeg(zzee.zzc, zzed.zzi, null, null, 12, null);
                }
                throw new zzeg(zzee.zzi, zzed.zzJ, null, null, 12, null);
            }
            byte[] bArrU = wg2.U(zzf());
            if (bArrU.length == 0) {
                throw new zzeg(zzee.zzc, zzed.zzaw, null, null, 12, null);
            }
            try {
                Object objZzb = zzahlVar.zzT().zzb(bArrU);
                objZzb.getClass();
                return (zzahl) objZzb;
            } catch (Exception e) {
                throw new zzeg(zzee.zzc, zzed.zzG, e.getMessage(), null, 8, null);
            }
        } catch (Exception e2) {
            throw new zzeg(zzee.zzc, zzed.zzah, e2.getMessage(), null, 8, null);
        }
    }

    public final HttpURLConnection zzb() {
        return this.zza;
    }

    public final void zzc() throws zzeg {
        try {
            this.zza.connect();
        } catch (SocketTimeoutException e) {
            throw new zzeg(zzee.zzc, zzed.zzac, e.getMessage(), null, 8, null);
        } catch (IOException e2) {
            throw new zzeg(zzee.zzc, zzed.zzad, e2.getMessage(), null, 8, null);
        } catch (Exception e3) {
            throw new zzeg(zzee.zzc, zzed.zzaj, e3.getMessage(), null, 8, null);
        }
    }

    public final void zzd() {
        this.zza.disconnect();
    }

    public final void zze(byte[] bArr) throws zzeg {
        try {
            zzg().write(bArr);
        } catch (zzeg e) {
            throw e;
        } catch (IOException e2) {
            throw new zzeg(zzee.zzc, zzed.zzag, e2.getMessage(), null, 8, null);
        } catch (Exception e3) {
            throw new zzeg(zzee.zzc, zzed.zzal, e3.getMessage(), null, 8, null);
        }
    }
}

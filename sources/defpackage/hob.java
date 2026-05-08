package defpackage;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import com.google.android.gms.internal.common.zzy;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class hob {
    public static String a;
    public static int b;
    public static Boolean c;

    public static String a() throws Throwable {
        BufferedReader bufferedReader;
        String string;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads;
        if (a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                a = Application.getProcessName();
            } else {
                int iMyPid = b;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    b = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                strTrim = null;
                try {
                    if (iMyPid > 0) {
                        try {
                            StringBuilder sb = new StringBuilder(String.valueOf(iMyPid).length() + 14);
                            sb.append("/proc/");
                            sb.append(iMyPid);
                            sb.append("/cmdline");
                            string = sb.toString();
                            threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        } catch (IOException unused) {
                            bufferedReader = null;
                        } catch (Throwable th) {
                            th = th;
                        }
                        try {
                            bufferedReader = new BufferedReader(new FileReader(string));
                            try {
                                String line = bufferedReader.readLine();
                                fib.i(line);
                                strTrim = line.trim();
                                bufferedReader.close();
                            } catch (IOException unused2) {
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                                a = strTrim;
                                return a;
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedReader2 = bufferedReader;
                                if (bufferedReader2 != null) {
                                    try {
                                        bufferedReader2.close();
                                    } catch (IOException unused3) {
                                    }
                                }
                                throw th;
                            }
                        } finally {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        }
                    }
                } catch (IOException unused4) {
                }
                a = strTrim;
            }
        }
        return a;
    }

    public static boolean b() {
        Boolean boolValueOf = c;
        if (boolValueOf == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                boolValueOf = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object objInvoke = Process.class.getDeclaredMethod("isIsolated", null).invoke(null, null);
                    Object[] objArr = new Object[0];
                    if (objInvoke == null) {
                        throw new zzy(lmi.a("expected a non-null reference", objArr));
                    }
                    boolValueOf = (Boolean) objInvoke;
                } catch (ReflectiveOperationException unused) {
                    boolValueOf = Boolean.FALSE;
                }
            }
            c = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }
}

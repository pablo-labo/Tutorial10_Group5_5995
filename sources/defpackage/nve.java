package defpackage;

import android.util.Log;
import java.util.Map;
import org.webrtc.RTCStats;
import org.webrtc.RTCStatsReport;

/* JADX INFO: loaded from: classes3.dex */
public final class nve {
    public static void a(StringBuilder sb, Object obj) {
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            sb.append("[");
            for (int i = 0; i < objArr.length; i++) {
                if (i != 0) {
                    sb.append(",");
                }
                a(sb, objArr[i]);
            }
            sb.append("]");
            return;
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof String)) {
                sb.append(obj);
                return;
            }
            sb.append("\"");
            sb.append(obj);
            sb.append("\"");
            return;
        }
        try {
            sb.append("{");
            boolean z = true;
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                if (z) {
                    z = false;
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append((String) entry.getKey());
                sb.append("\":");
                a(sb, entry.getValue());
            }
            sb.append("}");
        } catch (ClassCastException unused) {
            Log.e("nve", "Error parsing stats value " + obj);
        }
    }

    public static String b(RTCStatsReport rTCStatsReport) {
        StringBuilder sb = new StringBuilder("[");
        Map<String, RTCStats> statsMap = rTCStatsReport.getStatsMap();
        boolean z = true;
        for (String str : rTCStatsReport.getStatsMap().keySet()) {
            if (z) {
                z = false;
            } else {
                sb.append(",");
            }
            sb.append("[\"");
            sb.append(str);
            sb.append("\",{");
            RTCStats rTCStats = statsMap.get(str);
            sb.append("\"timestamp\":");
            sb.append(rTCStats.getTimestampUs() / 1000.0d);
            sb.append(",\"type\":\"");
            sb.append(rTCStats.getType());
            sb.append("\",\"id\":\"");
            sb.append(rTCStats.getId());
            sb.append("\"");
            for (Map.Entry<String, Object> entry : rTCStats.getMembers().entrySet()) {
                sb.append(",");
                sb.append("\"");
                sb.append(entry.getKey());
                sb.append("\":");
                a(sb, entry.getValue());
            }
            sb.append("}]");
        }
        sb.append("]");
        return sb.toString();
    }
}

package com.fasterxml.jackson.core.json;

import com.datadog.android.rum.internal.domain.scope.RumViewScope;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.exc.StreamConstraintsException;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import defpackage.r40;
import defpackage.w20;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class UTF8StreamJsonParser extends JsonParserBase {
    protected boolean _bufferRecyclable;
    protected byte[] _inputBuffer;
    protected InputStream _inputStream;
    protected int _nameStartCol;
    protected int _nameStartOffset;
    protected int _nameStartRow;
    private int _quad1;
    protected int[] _quadBuffer;
    protected final ByteQuadsCanonicalizer _symbols;
    protected boolean _tokenIncomplete;

    public UTF8StreamJsonParser(IOContext iOContext, int i, InputStream inputStream, ObjectCodec objectCodec, ByteQuadsCanonicalizer byteQuadsCanonicalizer, byte[] bArr, int i2, int i3, int i4, boolean z) {
        super(iOContext, i, objectCodec);
        this._quadBuffer = new int[16];
        this._inputStream = inputStream;
        this._symbols = byteQuadsCanonicalizer;
        this._inputBuffer = bArr;
        this._inputPtr = i2;
        this._inputEnd = i3;
        this._currInputRowStart = i2 - i4;
        this._currInputProcessed = (-i2) + i4;
        this._bufferRecyclable = z;
    }

    private final void _checkMatchEnd(String str, int i, int i2) {
        if (Character.isJavaIdentifierPart((char) _decodeCharForError(i2))) {
            _reportInvalidToken(str.substring(0, i));
        }
    }

    private final void _closeArrayScope() {
        _updateLocation();
        if (!this._parsingContext.inArray()) {
            _reportMismatchedEndMarker(93, '}');
        }
        this._parsingContext = this._parsingContext.clearAndGetParent();
    }

    private final void _closeObjectScope() {
        _updateLocation();
        if (!this._parsingContext.inObject()) {
            _reportMismatchedEndMarker(125, ']');
        }
        this._parsingContext = this._parsingContext.clearAndGetParent();
    }

    private final JsonToken _closeScope(int i) {
        if (i == 125) {
            _closeObjectScope();
            JsonToken jsonToken = JsonToken.END_OBJECT;
            this._currToken = jsonToken;
            return jsonToken;
        }
        _closeArrayScope();
        JsonToken jsonToken2 = JsonToken.END_ARRAY;
        this._currToken = jsonToken2;
        return jsonToken2;
    }

    private final int _decodeUtf8_2(int i) {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        int i3 = i2 + 1;
        this._inputPtr = i3;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & 255, i3);
        }
        return ((i & 31) << 6) | (b & 63);
    }

    private final int _decodeUtf8_3(int i) {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        int i2 = i & 15;
        byte[] bArr = this._inputBuffer;
        int i3 = this._inputPtr;
        int i4 = i3 + 1;
        this._inputPtr = i4;
        byte b = bArr[i3];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & 255, i4);
        }
        int i5 = (i2 << 6) | (b & 63);
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr2 = this._inputBuffer;
        int i6 = this._inputPtr;
        int i7 = i6 + 1;
        this._inputPtr = i7;
        byte b2 = bArr2[i6];
        if ((b2 & 192) != 128) {
            _reportInvalidOther(b2 & 255, i7);
        }
        return (i5 << 6) | (b2 & 63);
    }

    private final int _decodeUtf8_3fast(int i) {
        int i2 = i & 15;
        byte[] bArr = this._inputBuffer;
        int i3 = this._inputPtr;
        int i4 = i3 + 1;
        this._inputPtr = i4;
        byte b = bArr[i3];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & 255, i4);
        }
        int i5 = (i2 << 6) | (b & 63);
        byte[] bArr2 = this._inputBuffer;
        int i6 = this._inputPtr;
        int i7 = i6 + 1;
        this._inputPtr = i7;
        byte b2 = bArr2[i6];
        if ((b2 & 192) != 128) {
            _reportInvalidOther(b2 & 255, i7);
        }
        return (i5 << 6) | (b2 & 63);
    }

    private final int _decodeUtf8_4(int i) {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        int i3 = i2 + 1;
        this._inputPtr = i3;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & 255, i3);
        }
        int i4 = ((i & 7) << 6) | (b & 63);
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr2 = this._inputBuffer;
        int i5 = this._inputPtr;
        int i6 = i5 + 1;
        this._inputPtr = i6;
        byte b2 = bArr2[i5];
        if ((b2 & 192) != 128) {
            _reportInvalidOther(b2 & 255, i6);
        }
        int i7 = (i4 << 6) | (b2 & 63);
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr3 = this._inputBuffer;
        int i8 = this._inputPtr;
        int i9 = i8 + 1;
        this._inputPtr = i9;
        byte b3 = bArr3[i8];
        if ((b3 & 192) != 128) {
            _reportInvalidOther(b3 & 255, i9);
        }
        return ((i7 << 6) | (b3 & 63)) - 65536;
    }

    private final void _finishString2(char[] cArr, int i) {
        int[] iArr = JsonParserBase.INPUT_CODES_UTF8;
        byte[] bArr = this._inputBuffer;
        while (true) {
            int i2 = this._inputPtr;
            if (i2 >= this._inputEnd) {
                _loadMoreGuaranteed();
                i2 = this._inputPtr;
            }
            int i3 = 0;
            if (i >= cArr.length) {
                cArr = this._textBuffer.finishCurrentSegment();
                i = 0;
            }
            int iMin = Math.min(this._inputEnd, (cArr.length - i) + i2);
            while (true) {
                if (i2 >= iMin) {
                    this._inputPtr = i2;
                    break;
                }
                int i4 = i2 + 1;
                int i_decodeEscaped = bArr[i2] & 255;
                int i5 = iArr[i_decodeEscaped];
                if (i5 != 0) {
                    this._inputPtr = i4;
                    if (i_decodeEscaped == 34) {
                        this._textBuffer.setCurrentLength(i);
                        return;
                    }
                    if (i5 == 1) {
                        i_decodeEscaped = _decodeEscaped();
                    } else if (i5 == 2) {
                        i_decodeEscaped = _decodeUtf8_2(i_decodeEscaped);
                    } else if (i5 == 3) {
                        i_decodeEscaped = this._inputEnd - i4 >= 2 ? _decodeUtf8_3fast(i_decodeEscaped) : _decodeUtf8_3(i_decodeEscaped);
                    } else if (i5 == 4) {
                        int i_decodeUtf8_4 = _decodeUtf8_4(i_decodeEscaped);
                        int i6 = i + 1;
                        cArr[i] = (char) ((i_decodeUtf8_4 >> 10) | 55296);
                        if (i6 >= cArr.length) {
                            cArr = this._textBuffer.finishCurrentSegment();
                            i = 0;
                        } else {
                            i = i6;
                        }
                        i_decodeEscaped = (i_decodeUtf8_4 & 1023) | 56320;
                    } else if (i_decodeEscaped < 32) {
                        _throwUnquotedSpace(i_decodeEscaped, "string value");
                    } else {
                        _reportInvalidChar(i_decodeEscaped);
                    }
                    if (i >= cArr.length) {
                        cArr = this._textBuffer.finishCurrentSegment();
                    } else {
                        i3 = i;
                    }
                    i = i3 + 1;
                    cArr[i3] = (char) i_decodeEscaped;
                } else {
                    cArr[i] = (char) i_decodeEscaped;
                    i2 = i4;
                    i++;
                }
            }
        }
    }

    private final void _matchToken2(String str, int i) {
        int i2;
        int i3;
        int length = str.length();
        do {
            if ((this._inputPtr >= this._inputEnd && !_loadMore()) || this._inputBuffer[this._inputPtr] != str.charAt(i)) {
                _reportInvalidToken(str.substring(0, i));
            }
            i2 = this._inputPtr + 1;
            this._inputPtr = i2;
            i++;
        } while (i < length);
        if ((i2 < this._inputEnd || _loadMore()) && (i3 = this._inputBuffer[this._inputPtr] & 255) >= 48 && i3 != 93 && i3 != 125) {
            _checkMatchEnd(str, i, i3);
        }
    }

    private final JsonToken _nextAfterName() {
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        if (jsonToken == JsonToken.START_ARRAY) {
            createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
        }
        this._currToken = jsonToken;
        return jsonToken;
    }

    private final JsonToken _nextTokenNotInObject(int i) {
        if (i == 34) {
            this._tokenIncomplete = true;
            JsonToken jsonToken = JsonToken.VALUE_STRING;
            this._currToken = jsonToken;
            return jsonToken;
        }
        if (i == 43) {
            if (isEnabled(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
                JsonToken jsonToken_parseSignedNumber = _parseSignedNumber(false);
                this._currToken = jsonToken_parseSignedNumber;
                return jsonToken_parseSignedNumber;
            }
            JsonToken jsonToken_handleUnexpectedValue = _handleUnexpectedValue(i);
            this._currToken = jsonToken_handleUnexpectedValue;
            return jsonToken_handleUnexpectedValue;
        }
        if (i == 91) {
            createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            this._currToken = jsonToken2;
            return jsonToken2;
        }
        if (i == 102) {
            _matchFalse();
            JsonToken jsonToken3 = JsonToken.VALUE_FALSE;
            this._currToken = jsonToken3;
            return jsonToken3;
        }
        if (i == 110) {
            _matchNull();
            JsonToken jsonToken4 = JsonToken.VALUE_NULL;
            this._currToken = jsonToken4;
            return jsonToken4;
        }
        if (i == 116) {
            _matchTrue();
            JsonToken jsonToken5 = JsonToken.VALUE_TRUE;
            this._currToken = jsonToken5;
            return jsonToken5;
        }
        if (i == 123) {
            createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
            JsonToken jsonToken6 = JsonToken.START_OBJECT;
            this._currToken = jsonToken6;
            return jsonToken6;
        }
        if (i == 45) {
            JsonToken jsonToken_parseSignedNumber2 = _parseSignedNumber(true);
            this._currToken = jsonToken_parseSignedNumber2;
            return jsonToken_parseSignedNumber2;
        }
        if (i == 46) {
            JsonToken jsonToken_parseFloatThatStartsWithPeriod = _parseFloatThatStartsWithPeriod(false, false);
            this._currToken = jsonToken_parseFloatThatStartsWithPeriod;
            return jsonToken_parseFloatThatStartsWithPeriod;
        }
        switch (i) {
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case RumViewScope.SLOW_RENDERED_THRESHOLD_FPS /* 55 */:
            case 56:
            case 57:
                JsonToken jsonToken_parseUnsignedNumber = _parseUnsignedNumber(i);
                this._currToken = jsonToken_parseUnsignedNumber;
                return jsonToken_parseUnsignedNumber;
            default:
                JsonToken jsonToken_handleUnexpectedValue2 = _handleUnexpectedValue(i);
                this._currToken = jsonToken_handleUnexpectedValue2;
                return jsonToken_handleUnexpectedValue2;
        }
    }

    private static final int _padLastQuad(int i, int i2) {
        return i2 == 4 ? i : i | ((-1) << (i2 << 3));
    }

    private final JsonToken _parseFloat(char[] cArr, int i, int i2, boolean z, int i3) {
        int i4;
        boolean z2;
        int i5 = 0;
        if (i2 == 46) {
            if (i >= cArr.length) {
                cArr = this._textBuffer.finishCurrentSegment();
                i = 0;
            }
            cArr[i] = (char) i2;
            i++;
            i4 = 0;
            while (true) {
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    z2 = true;
                    break;
                }
                byte[] bArr = this._inputBuffer;
                int i6 = this._inputPtr;
                this._inputPtr = i6 + 1;
                i2 = bArr[i6] & 255;
                if (i2 < 48 || i2 > 57) {
                    break;
                }
                i4++;
                if (i >= cArr.length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    i = 0;
                }
                cArr[i] = (char) i2;
                i++;
            }
            z2 = false;
            if (i4 == 0 && !isEnabled(JsonReadFeature.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
                _reportUnexpectedNumberChar(i2, "Decimal point not followed by a digit");
            }
        } else {
            i4 = 0;
            z2 = false;
        }
        if ((i2 | 32) == 101) {
            if (i >= cArr.length) {
                cArr = this._textBuffer.finishCurrentSegment();
                i = 0;
            }
            int i7 = i + 1;
            cArr[i] = (char) i2;
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr2 = this._inputBuffer;
            int i8 = this._inputPtr;
            this._inputPtr = i8 + 1;
            int i9 = bArr2[i8] & 255;
            if (i9 == 45 || i9 == 43) {
                if (i7 >= cArr.length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    i7 = 0;
                }
                int i10 = i7 + 1;
                cArr[i7] = (char) i9;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr3 = this._inputBuffer;
                int i11 = this._inputPtr;
                this._inputPtr = i11 + 1;
                i9 = bArr3[i11] & 255;
                i7 = i10;
            }
            i2 = i9;
            int i12 = 0;
            while (i2 >= 48 && i2 <= 57) {
                i12++;
                if (i7 >= cArr.length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    i7 = 0;
                }
                int i13 = i7 + 1;
                cArr[i7] = (char) i2;
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    i5 = i12;
                    z2 = true;
                    i = i13;
                    break;
                }
                byte[] bArr4 = this._inputBuffer;
                int i14 = this._inputPtr;
                this._inputPtr = i14 + 1;
                i2 = bArr4[i14] & 255;
                i7 = i13;
            }
            i5 = i12;
            i = i7;
            if (i5 == 0) {
                _reportUnexpectedNumberChar(i2, "Exponent indicator not followed by a digit");
            }
        }
        if (!z2) {
            this._inputPtr--;
            if (this._parsingContext.inRoot()) {
                _verifyRootSpace(i2);
            }
        }
        this._textBuffer.setCurrentLength(i);
        return resetFloat(z, i3, i4, i5);
    }

    private final JsonToken _parseNumber2(char[] cArr, int i, boolean z, int i2) {
        int i3;
        int i4;
        char[] cArrFinishCurrentSegment = cArr;
        int i5 = i;
        int i6 = i2;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                this._textBuffer.setCurrentLength(i5);
                return resetInt(z, i6);
            }
            byte[] bArr = this._inputBuffer;
            i3 = this._inputPtr;
            this._inputPtr = i3 + 1;
            i4 = bArr[i3] & 255;
            if (i4 > 57 || i4 < 48) {
                break;
            }
            if (i5 >= cArrFinishCurrentSegment.length) {
                i5 = 0;
                cArrFinishCurrentSegment = this._textBuffer.finishCurrentSegment();
            }
            cArrFinishCurrentSegment[i5] = (char) i4;
            i6++;
            i5++;
        }
        if (i4 == 46 || (i4 | 32) == 101) {
            return _parseFloat(cArrFinishCurrentSegment, i5, i4, z, i6);
        }
        this._inputPtr = i3;
        this._textBuffer.setCurrentLength(i5);
        if (this._parsingContext.inRoot()) {
            _verifyRootSpace(this._inputBuffer[this._inputPtr] & 255);
        }
        return resetInt(z, i6);
    }

    private final JsonToken _parseSignedNumber(boolean z) {
        int i;
        int i2;
        int i3;
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int i4 = 1;
        int i5 = 0;
        if (z) {
            cArrEmptyAndGetCurrentSegment[0] = '-';
            i5 = 1;
        }
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i6 = this._inputPtr;
        this._inputPtr = i6 + 1;
        int i_verifyNoLeadingZeroes = bArr[i6] & 255;
        if (i_verifyNoLeadingZeroes <= 48) {
            if (i_verifyNoLeadingZeroes != 48) {
                return i_verifyNoLeadingZeroes == 46 ? _parseFloatThatStartsWithPeriod(z, true) : _handleInvalidNumberStart(i_verifyNoLeadingZeroes, z, true);
            }
            i_verifyNoLeadingZeroes = _verifyNoLeadingZeroes();
        } else if (i_verifyNoLeadingZeroes > 57) {
            return _handleInvalidNumberStart(i_verifyNoLeadingZeroes, z, true);
        }
        int i7 = i5 + 1;
        cArrEmptyAndGetCurrentSegment[i5] = (char) i_verifyNoLeadingZeroes;
        int iMin = Math.min(this._inputEnd, (this._inputPtr + cArrEmptyAndGetCurrentSegment.length) - i7);
        while (true) {
            i = i7;
            i2 = this._inputPtr;
            if (i2 >= iMin) {
                return _parseNumber2(cArrEmptyAndGetCurrentSegment, i, z, i4);
            }
            byte[] bArr2 = this._inputBuffer;
            this._inputPtr = i2 + 1;
            i3 = bArr2[i2] & 255;
            if (i3 < 48 || i3 > 57) {
                break;
            }
            i4++;
            i7 = i + 1;
            cArrEmptyAndGetCurrentSegment[i] = (char) i3;
        }
        if (i3 == 46 || (i3 | 32) == 101) {
            return _parseFloat(cArrEmptyAndGetCurrentSegment, i, i3, z, i4);
        }
        this._inputPtr = i2;
        this._textBuffer.setCurrentLength(i);
        if (this._parsingContext.inRoot()) {
            _verifyRootSpace(i3);
        }
        return resetInt(z, i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
    
        _reportInvalidEOF(" in a comment", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0049, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void _skipCComment() {
        /*
            r5 = this;
            int[] r0 = com.fasterxml.jackson.core.io.CharTypes.getInputCodeComment()
        L4:
            int r1 = r5._inputPtr
            int r2 = r5._inputEnd
            if (r1 < r2) goto L10
            boolean r1 = r5._loadMore()
            if (r1 == 0) goto L43
        L10:
            byte[] r1 = r5._inputBuffer
            int r2 = r5._inputPtr
            int r3 = r2 + 1
            r5._inputPtr = r3
            r1 = r1[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = r0[r1]
            if (r2 == 0) goto L4
            r4 = 2
            if (r2 == r4) goto L6e
            r4 = 3
            if (r2 == r4) goto L6a
            r4 = 4
            if (r2 == r4) goto L66
            r4 = 10
            if (r2 == r4) goto L5d
            r4 = 13
            if (r2 == r4) goto L59
            r4 = 42
            if (r2 == r4) goto L39
            r5._reportInvalidChar(r1)
            goto L4
        L39:
            int r1 = r5._inputEnd
            if (r3 < r1) goto L4a
            boolean r1 = r5._loadMore()
            if (r1 != 0) goto L4a
        L43:
            java.lang.String r0 = " in a comment"
            r1 = 0
            r5._reportInvalidEOF(r0, r1)
            return
        L4a:
            byte[] r1 = r5._inputBuffer
            int r2 = r5._inputPtr
            r1 = r1[r2]
            r3 = 47
            if (r1 != r3) goto L4
            int r2 = r2 + 1
            r5._inputPtr = r2
            return
        L59:
            r5._skipCR()
            goto L4
        L5d:
            int r1 = r5._currInputRow
            int r1 = r1 + 1
            r5._currInputRow = r1
            r5._currInputRowStart = r3
            goto L4
        L66:
            r5._skipUtf8_4(r1)
            goto L4
        L6a:
            r5._skipUtf8_3()
            goto L4
        L6e:
            r5._skipUtf8_2()
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipCComment():void");
    }

    private final int _skipColon() {
        int i = this._inputPtr;
        if (i + 4 >= this._inputEnd) {
            return _skipColon2(false);
        }
        byte[] bArr = this._inputBuffer;
        byte b = bArr[i];
        if (b == 58) {
            int i2 = i + 1;
            this._inputPtr = i2;
            byte b2 = bArr[i2];
            if (b2 > 32) {
                if (b2 == 47 || b2 == 35) {
                    return _skipColon2(true);
                }
                this._inputPtr = i + 2;
                return b2;
            }
            if (b2 == 32 || b2 == 9) {
                int i3 = i + 2;
                this._inputPtr = i3;
                byte b3 = bArr[i3];
                if (b3 > 32) {
                    if (b3 == 47 || b3 == 35) {
                        return _skipColon2(true);
                    }
                    this._inputPtr = i + 3;
                    return b3;
                }
            }
            return _skipColon2(true);
        }
        if (b == 32 || b == 9) {
            int i4 = i + 1;
            this._inputPtr = i4;
            b = bArr[i4];
        }
        if (b != 58) {
            return _skipColon2(false);
        }
        int i5 = this._inputPtr;
        int i6 = i5 + 1;
        this._inputPtr = i6;
        byte b4 = bArr[i6];
        if (b4 > 32) {
            if (b4 == 47 || b4 == 35) {
                return _skipColon2(true);
            }
            this._inputPtr = i5 + 2;
            return b4;
        }
        if (b4 == 32 || b4 == 9) {
            int i7 = i5 + 2;
            this._inputPtr = i7;
            byte b5 = bArr[i7];
            if (b5 > 32) {
                if (b5 == 47 || b5 == 35) {
                    return _skipColon2(true);
                }
                this._inputPtr = i5 + 3;
                return b5;
            }
        }
        return _skipColon2(true);
    }

    private final int _skipColon2(boolean z) {
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" within/between " + this._parsingContext.typeDesc() + " entries", null);
                return -1;
            }
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            int i2 = i + 1;
            this._inputPtr = i2;
            int i3 = bArr[i] & 255;
            if (i3 > 32) {
                if (i3 == 47) {
                    _skipComment();
                } else if (i3 != 35 || !_skipYAMLComment()) {
                    if (z) {
                        return i3;
                    }
                    if (i3 != 58) {
                        _reportUnexpectedChar(i3, "was expecting a colon to separate field name and value");
                    }
                    z = true;
                }
            } else if (i3 != 32) {
                if (i3 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i2;
                } else if (i3 == 13) {
                    _skipCR();
                } else if (i3 != 9) {
                    _throwInvalidSpace(i3);
                }
            }
        }
    }

    private final void _skipComment() {
        if ((this._features & JsonParserBase.FEAT_MASK_ALLOW_JAVA_COMMENTS) == 0) {
            _reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(" in a comment", null);
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        int i2 = bArr[i] & 255;
        if (i2 == 47) {
            _skipLine();
        } else if (i2 == 42) {
            _skipCComment();
        } else {
            _reportUnexpectedChar(i2, "was expecting either '*' or '/' for a comment");
        }
    }

    private final void _skipLine() {
        int[] inputCodeComment = CharTypes.getInputCodeComment();
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                return;
            }
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            int i2 = i + 1;
            this._inputPtr = i2;
            int i3 = bArr[i] & 255;
            int i4 = inputCodeComment[i3];
            if (i4 != 0) {
                if (i4 == 2) {
                    _skipUtf8_2();
                } else if (i4 == 3) {
                    _skipUtf8_3();
                } else if (i4 == 4) {
                    _skipUtf8_4(i3);
                } else if (i4 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i2;
                    return;
                } else if (i4 == 13) {
                    _skipCR();
                    return;
                } else if (i4 != 42 && i4 < 0) {
                    _reportInvalidChar(i3);
                }
            }
        }
    }

    private final void _skipUtf8_2() {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        int i2 = i + 1;
        this._inputPtr = i2;
        byte b = bArr[i];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & 255, i2);
        }
    }

    private final void _skipUtf8_3() {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        int i2 = i + 1;
        this._inputPtr = i2;
        byte b = bArr[i];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & 255, i2);
        }
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr2 = this._inputBuffer;
        int i3 = this._inputPtr;
        int i4 = i3 + 1;
        this._inputPtr = i4;
        byte b2 = bArr2[i3];
        if ((b2 & 192) != 128) {
            _reportInvalidOther(b2 & 255, i4);
        }
    }

    private final void _skipUtf8_4(int i) {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        int i3 = i2 + 1;
        this._inputPtr = i3;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & 255, i3);
        }
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr2 = this._inputBuffer;
        int i4 = this._inputPtr;
        int i5 = i4 + 1;
        this._inputPtr = i5;
        byte b2 = bArr2[i4];
        if ((b2 & 192) != 128) {
            _reportInvalidOther(b2 & 255, i5);
        }
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr3 = this._inputBuffer;
        int i6 = this._inputPtr;
        int i7 = i6 + 1;
        this._inputPtr = i7;
        byte b3 = bArr3[i6];
        if ((b3 & 192) != 128) {
            _reportInvalidOther(b3 & 255, i7);
        }
    }

    private final int _skipWS() {
        while (true) {
            int i = this._inputPtr;
            if (i >= this._inputEnd) {
                return _skipWS2();
            }
            byte[] bArr = this._inputBuffer;
            int i2 = i + 1;
            this._inputPtr = i2;
            int i3 = bArr[i] & 255;
            if (i3 > 32) {
                if (i3 != 47 && i3 != 35) {
                    return i3;
                }
                this._inputPtr = i;
                return _skipWS2();
            }
            if (i3 != 32) {
                if (i3 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i2;
                } else if (i3 == 13) {
                    _skipCR();
                } else if (i3 != 9) {
                    _throwInvalidSpace(i3);
                }
            }
        }
    }

    private final int _skipWS2() throws JsonParseException {
        int i;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                throw _constructError("Unexpected end-of-input within/between " + this._parsingContext.typeDesc() + " entries");
            }
            byte[] bArr = this._inputBuffer;
            int i2 = this._inputPtr;
            int i3 = i2 + 1;
            this._inputPtr = i3;
            i = bArr[i2] & 255;
            if (i > 32) {
                if (i == 47) {
                    _skipComment();
                } else if (i != 35 || !_skipYAMLComment()) {
                    break;
                }
            } else if (i != 32) {
                if (i == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i3;
                } else if (i == 13) {
                    _skipCR();
                } else if (i != 9) {
                    _throwInvalidSpace(i);
                }
            }
        }
        return i;
    }

    private final int _skipWSOrEnd() {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            return _eofAsNextChar();
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        int i2 = i + 1;
        this._inputPtr = i2;
        int i3 = bArr[i] & 255;
        if (i3 > 32) {
            if (i3 != 47 && i3 != 35) {
                return i3;
            }
            this._inputPtr = i;
            return _skipWSOrEnd2();
        }
        if (i3 != 32) {
            if (i3 == 10) {
                this._currInputRow++;
                this._currInputRowStart = i2;
            } else if (i3 == 13) {
                _skipCR();
            } else if (i3 != 9) {
                _throwInvalidSpace(i3);
            }
        }
        while (true) {
            int i4 = this._inputPtr;
            if (i4 >= this._inputEnd) {
                return _skipWSOrEnd2();
            }
            byte[] bArr2 = this._inputBuffer;
            int i5 = i4 + 1;
            this._inputPtr = i5;
            int i6 = bArr2[i4] & 255;
            if (i6 > 32) {
                if (i6 != 47 && i6 != 35) {
                    return i6;
                }
                this._inputPtr = i4;
                return _skipWSOrEnd2();
            }
            if (i6 != 32) {
                if (i6 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i5;
                } else if (i6 == 13) {
                    _skipCR();
                } else if (i6 != 9) {
                    _throwInvalidSpace(i6);
                }
            }
        }
    }

    private final int _skipWSOrEnd2() {
        int i;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                return _eofAsNextChar();
            }
            byte[] bArr = this._inputBuffer;
            int i2 = this._inputPtr;
            int i3 = i2 + 1;
            this._inputPtr = i3;
            i = bArr[i2] & 255;
            if (i > 32) {
                if (i == 47) {
                    _skipComment();
                } else if (i != 35 || !_skipYAMLComment()) {
                    break;
                }
            } else if (i != 32) {
                if (i == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i3;
                } else if (i == 13) {
                    _skipCR();
                } else if (i != 9) {
                    _throwInvalidSpace(i);
                }
            }
        }
        return i;
    }

    private final boolean _skipYAMLComment() {
        if ((this._features & JsonParserBase.FEAT_MASK_ALLOW_YAML_COMMENTS) == 0) {
            return false;
        }
        _skipLine();
        return true;
    }

    private final void _updateLocation() {
        this._tokenInputRow = this._currInputRow;
        int i = this._inputPtr;
        this._tokenInputTotal = this._currInputProcessed + ((long) i);
        this._tokenInputCol = i - this._currInputRowStart;
    }

    private final void _updateNameLocation() {
        this._nameStartRow = this._currInputRow;
        int i = this._inputPtr;
        this._nameStartOffset = i;
        this._nameStartCol = i - this._currInputRowStart;
    }

    private final int _verifyNoLeadingZeroes() {
        int i;
        if ((this._inputPtr >= this._inputEnd && !_loadMore()) || (i = this._inputBuffer[this._inputPtr] & 255) < 48 || i > 57) {
            return 48;
        }
        if ((this._features & JsonParserBase.FEAT_MASK_LEADING_ZEROS) == 0) {
            reportInvalidNumber("Leading zeroes not allowed");
        }
        this._inputPtr++;
        if (i != 48) {
            return i;
        }
        do {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                return i;
            }
            byte[] bArr = this._inputBuffer;
            int i2 = this._inputPtr;
            i = bArr[i2] & 255;
            if (i < 48 || i > 57) {
                return 48;
            }
            this._inputPtr = i2 + 1;
        } while (i == 48);
        return i;
    }

    private final void _verifyRootSpace(int i) {
        int i2 = this._inputPtr;
        int i3 = i2 + 1;
        this._inputPtr = i3;
        if (i != 9) {
            if (i == 10) {
                this._currInputRow++;
                this._currInputRowStart = i3;
            } else if (i == 13) {
                this._inputPtr = i2;
            } else if (i != 32) {
                _reportMissingRootWS(i);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String addName(int[] r18, int r19, int r20) throws com.fasterxml.jackson.core.exc.StreamConstraintsException {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser.addName(int[], int, int):java.lang.String");
    }

    private final String findName(int i, int i2, int i3, int i4) {
        int i_padLastQuad = _padLastQuad(i3, i4);
        String strFindName = this._symbols.findName(i, i2, i_padLastQuad);
        if (strFindName != null) {
            return strFindName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = _padLastQuad(i_padLastQuad, i4);
        return addName(iArr, 3, i4);
    }

    private int nextByte() {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        return bArr[i] & 255;
    }

    private final String parseName(int i, int i2, int i3, int i4) {
        int[] iArr = this._quadBuffer;
        iArr[0] = i;
        return parseEscapedName(iArr, 1, i2, i3, i4);
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _closeInput() throws IOException {
        if (this._inputStream != null) {
            if (this._ioContext.isResourceManaged() || isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
                this._inputStream.close();
            }
            this._inputStream = null;
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase
    public JsonLocation _currentLocationMinusOne() {
        int i = this._inputPtr - 1;
        return new JsonLocation(_contentReference(), this._currInputProcessed + ((long) i), -1L, this._currInputRow, (i - this._currInputRowStart) + 1);
    }

    public final byte[] _decodeBase64(Base64Variant base64Variant) {
        ByteArrayBuilder byteArrayBuilder_getByteArrayBuilder = _getByteArrayBuilder();
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            int i2 = bArr[i] & 255;
            if (i2 > 32) {
                int iDecodeBase64Char = base64Variant.decodeBase64Char(i2);
                if (iDecodeBase64Char < 0) {
                    if (i2 == 34) {
                        return byteArrayBuilder_getByteArrayBuilder.toByteArray();
                    }
                    iDecodeBase64Char = _decodeBase64Escape(base64Variant, i2, 0);
                    if (iDecodeBase64Char < 0) {
                        continue;
                    }
                }
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr2 = this._inputBuffer;
                int i3 = this._inputPtr;
                this._inputPtr = i3 + 1;
                int i4 = bArr2[i3] & 255;
                int iDecodeBase64Char2 = base64Variant.decodeBase64Char(i4);
                if (iDecodeBase64Char2 < 0) {
                    iDecodeBase64Char2 = _decodeBase64Escape(base64Variant, i4, 1);
                }
                int i5 = (iDecodeBase64Char << 6) | iDecodeBase64Char2;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr3 = this._inputBuffer;
                int i6 = this._inputPtr;
                this._inputPtr = i6 + 1;
                int i7 = bArr3[i6] & 255;
                int iDecodeBase64Char3 = base64Variant.decodeBase64Char(i7);
                if (iDecodeBase64Char3 < 0) {
                    if (iDecodeBase64Char3 != -2) {
                        if (i7 == 34) {
                            byteArrayBuilder_getByteArrayBuilder.append(i5 >> 4);
                            if (base64Variant.requiresPaddingOnRead()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            return byteArrayBuilder_getByteArrayBuilder.toByteArray();
                        }
                        iDecodeBase64Char3 = _decodeBase64Escape(base64Variant, i7, 2);
                    }
                    if (iDecodeBase64Char3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        byte[] bArr4 = this._inputBuffer;
                        int i8 = this._inputPtr;
                        this._inputPtr = i8 + 1;
                        int i9 = bArr4[i8] & 255;
                        if (!base64Variant.usesPaddingChar(i9) && _decodeBase64Escape(base64Variant, i9, 3) != -2) {
                            throw reportInvalidBase64Char(base64Variant, i9, 3, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                        }
                        byteArrayBuilder_getByteArrayBuilder.append(i5 >> 4);
                    }
                }
                int i10 = (i5 << 6) | iDecodeBase64Char3;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr5 = this._inputBuffer;
                int i11 = this._inputPtr;
                this._inputPtr = i11 + 1;
                int i12 = bArr5[i11] & 255;
                int iDecodeBase64Char4 = base64Variant.decodeBase64Char(i12);
                if (iDecodeBase64Char4 < 0) {
                    if (iDecodeBase64Char4 != -2) {
                        if (i12 == 34) {
                            byteArrayBuilder_getByteArrayBuilder.appendTwoBytes(i10 >> 2);
                            if (base64Variant.requiresPaddingOnRead()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            return byteArrayBuilder_getByteArrayBuilder.toByteArray();
                        }
                        iDecodeBase64Char4 = _decodeBase64Escape(base64Variant, i12, 3);
                    }
                    if (iDecodeBase64Char4 == -2) {
                        byteArrayBuilder_getByteArrayBuilder.appendTwoBytes(i10 >> 2);
                    }
                }
                byteArrayBuilder_getByteArrayBuilder.appendThreeBytes((i10 << 6) | iDecodeBase64Char4);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int _decodeCharForError(int r7) {
        /*
            r6 = this;
            r0 = r7 & 255(0xff, float:3.57E-43)
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 <= r1) goto L69
            r1 = r7 & 224(0xe0, float:3.14E-43)
            r2 = 2
            r3 = 1
            r4 = 192(0xc0, float:2.69E-43)
            if (r1 != r4) goto L12
            r0 = r7 & 31
        L10:
            r7 = r3
            goto L2c
        L12:
            r1 = r7 & 240(0xf0, float:3.36E-43)
            r4 = 224(0xe0, float:3.14E-43)
            if (r1 != r4) goto L1c
            r0 = r7 & 15
            r7 = r2
            goto L2c
        L1c:
            r1 = r7 & 248(0xf8, float:3.48E-43)
            r4 = 240(0xf0, float:3.36E-43)
            if (r1 != r4) goto L26
            r0 = r7 & 7
            r7 = 3
            goto L2c
        L26:
            r7 = r7 & 255(0xff, float:3.57E-43)
            r6._reportInvalidInitial(r7)
            goto L10
        L2c:
            int r1 = r6.nextByte()
            r4 = r1 & 192(0xc0, float:2.69E-43)
            r5 = 128(0x80, float:1.794E-43)
            if (r4 == r5) goto L3b
            r4 = r1 & 255(0xff, float:3.57E-43)
            r6._reportInvalidOther(r4)
        L3b:
            int r0 = r0 << 6
            r1 = r1 & 63
            r0 = r0 | r1
            if (r7 <= r3) goto L69
            int r1 = r6.nextByte()
            r3 = r1 & 192(0xc0, float:2.69E-43)
            if (r3 == r5) goto L4f
            r3 = r1 & 255(0xff, float:3.57E-43)
            r6._reportInvalidOther(r3)
        L4f:
            int r0 = r0 << 6
            r1 = r1 & 63
            r0 = r0 | r1
            if (r7 <= r2) goto L69
            int r7 = r6.nextByte()
            r1 = r7 & 192(0xc0, float:2.69E-43)
            if (r1 == r5) goto L63
            r1 = r7 & 255(0xff, float:3.57E-43)
            r6._reportInvalidOther(r1)
        L63:
            int r6 = r0 << 6
            r7 = r7 & 63
            r6 = r6 | r7
            return r6
        L69:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser._decodeCharForError(int):int");
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public char _decodeEscaped() {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        byte b = bArr[i];
        if (b == 34 || b == 47 || b == 92) {
            return (char) b;
        }
        if (b == 98) {
            return '\b';
        }
        if (b == 102) {
            return '\f';
        }
        if (b == 110) {
            return '\n';
        }
        if (b == 114) {
            return '\r';
        }
        if (b == 116) {
            return '\t';
        }
        if (b != 117) {
            return _handleUnrecognizedCharacterEscape((char) _decodeCharForError(b));
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
            }
            byte[] bArr2 = this._inputBuffer;
            int i4 = this._inputPtr;
            this._inputPtr = i4 + 1;
            byte b2 = bArr2[i4];
            int iCharToHex = CharTypes.charToHex(b2);
            if (iCharToHex < 0) {
                _reportUnexpectedChar(b2 & 255, "expected a hex-digit for character escape sequence");
            }
            i2 = (i2 << 4) | iCharToHex;
        }
        return (char) i2;
    }

    public String _finishAndReturnString() {
        int i = this._inputPtr;
        if (i >= this._inputEnd) {
            _loadMoreGuaranteed();
            i = this._inputPtr;
        }
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = JsonParserBase.INPUT_CODES_UTF8;
        int iMin = Math.min(this._inputEnd, cArrEmptyAndGetCurrentSegment.length + i);
        byte[] bArr = this._inputBuffer;
        int i2 = 0;
        while (true) {
            if (i >= iMin) {
                break;
            }
            int i3 = bArr[i] & 255;
            if (iArr[i3] == 0) {
                i++;
                cArrEmptyAndGetCurrentSegment[i2] = (char) i3;
                i2++;
            } else if (i3 == 34) {
                this._inputPtr = i + 1;
                return this._textBuffer.setCurrentAndReturn(i2);
            }
        }
        this._inputPtr = i;
        _finishString2(cArrEmptyAndGetCurrentSegment, i2);
        return this._textBuffer.contentsAsString();
    }

    public void _finishString() {
        int i = this._inputPtr;
        if (i >= this._inputEnd) {
            _loadMoreGuaranteed();
            i = this._inputPtr;
        }
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = JsonParserBase.INPUT_CODES_UTF8;
        int iMin = Math.min(this._inputEnd, cArrEmptyAndGetCurrentSegment.length + i);
        byte[] bArr = this._inputBuffer;
        int i2 = 0;
        while (true) {
            if (i >= iMin) {
                break;
            }
            int i3 = bArr[i] & 255;
            if (iArr[i3] == 0) {
                i++;
                cArrEmptyAndGetCurrentSegment[i2] = (char) i3;
                i2++;
            } else if (i3 == 34) {
                this._inputPtr = i + 1;
                this._textBuffer.setCurrentLength(i2);
                return;
            }
        }
        this._inputPtr = i;
        _finishString2(cArrEmptyAndGetCurrentSegment, i2);
    }

    public final String _getText2(JsonToken jsonToken) {
        if (jsonToken == null) {
            return null;
        }
        int iId = jsonToken.id();
        return iId != 5 ? (iId == 6 || iId == 7 || iId == 8) ? this._textBuffer.contentsAsString() : jsonToken.asString() : this._parsingContext.getCurrentName();
    }

    public JsonToken _handleApos() {
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = JsonParserBase.INPUT_CODES_UTF8;
        byte[] bArr = this._inputBuffer;
        int i = 0;
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            if (i >= cArrEmptyAndGetCurrentSegment.length) {
                cArrEmptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                i = 0;
            }
            int i2 = this._inputEnd;
            int length = (cArrEmptyAndGetCurrentSegment.length - i) + this._inputPtr;
            if (length < i2) {
                i2 = length;
            }
            while (true) {
                int i3 = this._inputPtr;
                if (i3 < i2) {
                    int i4 = i3 + 1;
                    this._inputPtr = i4;
                    int i_decodeEscaped = bArr[i3] & 255;
                    if (i_decodeEscaped == 39) {
                        this._textBuffer.setCurrentLength(i);
                        return JsonToken.VALUE_STRING;
                    }
                    int i5 = iArr[i_decodeEscaped];
                    if (i5 == 0 || i_decodeEscaped == 34) {
                        cArrEmptyAndGetCurrentSegment[i] = (char) i_decodeEscaped;
                        i++;
                    } else {
                        if (i5 == 1) {
                            i_decodeEscaped = _decodeEscaped();
                        } else if (i5 == 2) {
                            i_decodeEscaped = _decodeUtf8_2(i_decodeEscaped);
                        } else if (i5 == 3) {
                            i_decodeEscaped = this._inputEnd - i4 >= 2 ? _decodeUtf8_3fast(i_decodeEscaped) : _decodeUtf8_3(i_decodeEscaped);
                        } else if (i5 != 4) {
                            if (i_decodeEscaped < 32) {
                                _throwUnquotedSpace(i_decodeEscaped, "string value");
                            }
                            _reportInvalidChar(i_decodeEscaped);
                        } else {
                            int i_decodeUtf8_4 = _decodeUtf8_4(i_decodeEscaped);
                            int i6 = i + 1;
                            cArrEmptyAndGetCurrentSegment[i] = (char) ((i_decodeUtf8_4 >> 10) | 55296);
                            if (i6 >= cArrEmptyAndGetCurrentSegment.length) {
                                cArrEmptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                                i = 0;
                            } else {
                                i = i6;
                            }
                            i_decodeEscaped = 56320 | (i_decodeUtf8_4 & 1023);
                        }
                        if (i >= cArrEmptyAndGetCurrentSegment.length) {
                            cArrEmptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                            i = 0;
                        }
                        cArrEmptyAndGetCurrentSegment[i] = (char) i_decodeEscaped;
                        i++;
                    }
                }
            }
        }
    }

    public JsonToken _handleInvalidNumberStart(int i, boolean z, boolean z2) throws JsonParseException {
        String str;
        while (i == 73) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOFInValue(JsonToken.VALUE_NUMBER_FLOAT);
            }
            byte[] bArr = this._inputBuffer;
            int i2 = this._inputPtr;
            this._inputPtr = i2 + 1;
            i = bArr[i2];
            if (i != 78) {
                if (i != 110) {
                    break;
                }
                str = z ? "-Infinity" : "+Infinity";
            } else {
                str = z ? "-INF" : "+INF";
            }
            _matchToken(str, 3);
            if ((this._features & JsonParserBase.FEAT_MASK_NON_NUM_NUMBERS) != 0) {
                return resetAsNaN(str, z ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY);
            }
            _reportError("Non-standard token '%s': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow", str);
        }
        if (!isEnabled(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature()) && z2 && !z) {
            _reportUnexpectedNumberChar(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
        }
        _reportUnexpectedNumberChar(i, z ? "expected digit (0-9) to follow minus sign, for valid numeric value" : "expected digit (0-9) for valid numeric value");
        return null;
    }

    public String _handleOddName(int i) throws StreamConstraintsException {
        if (i == 39 && (this._features & JsonParserBase.FEAT_MASK_ALLOW_SINGLE_QUOTES) != 0) {
            return _parseAposName();
        }
        if ((this._features & JsonParserBase.FEAT_MASK_ALLOW_UNQUOTED_NAMES) == 0) {
            _reportUnexpectedChar((char) _decodeCharForError(i), "was expecting double-quote to start field name");
        }
        int[] inputCodeUtf8JsNames = CharTypes.getInputCodeUtf8JsNames();
        if (inputCodeUtf8JsNames[i] != 0) {
            _reportUnexpectedChar(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int[] iArr_growNameDecodeBuffer = this._quadBuffer;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i2 < 4) {
                i2++;
                i |= i4 << 8;
            } else {
                if (i3 >= iArr_growNameDecodeBuffer.length) {
                    iArr_growNameDecodeBuffer = _growNameDecodeBuffer(iArr_growNameDecodeBuffer, iArr_growNameDecodeBuffer.length);
                    this._quadBuffer = iArr_growNameDecodeBuffer;
                }
                iArr_growNameDecodeBuffer[i3] = i4;
                i3++;
                i2 = 1;
            }
            i4 = i;
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
            }
            byte[] bArr = this._inputBuffer;
            int i5 = this._inputPtr;
            i = bArr[i5] & 255;
            if (inputCodeUtf8JsNames[i] != 0) {
                break;
            }
            this._inputPtr = i5 + 1;
        }
        if (i2 > 0) {
            if (i3 >= iArr_growNameDecodeBuffer.length) {
                int[] iArr_growNameDecodeBuffer2 = _growNameDecodeBuffer(iArr_growNameDecodeBuffer, iArr_growNameDecodeBuffer.length);
                this._quadBuffer = iArr_growNameDecodeBuffer2;
                iArr_growNameDecodeBuffer = iArr_growNameDecodeBuffer2;
            }
            iArr_growNameDecodeBuffer[i3] = i4;
            i3++;
        }
        String strFindName = this._symbols.findName(iArr_growNameDecodeBuffer, i3);
        return strFindName == null ? addName(iArr_growNameDecodeBuffer, i3, i2) : strFindName;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        if (r4 != 44) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        if (r3._parsingContext.inArray() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0051, code lost:
    
        if (r3._parsingContext.inRoot() != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
    
        if ((r3._features & com.fasterxml.jackson.core.json.JsonParserBase.FEAT_MASK_ALLOW_MISSING) == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
    
        r3._inputPtr--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0061, code lost:
    
        return com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.core.JsonToken _handleUnexpectedValue(int r4) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser._handleUnexpectedValue(int):com.fasterxml.jackson.core.JsonToken");
    }

    public final boolean _loadMore() throws IOException {
        int length;
        if (this._inputStream == null || (length = this._inputBuffer.length) == 0) {
            return false;
        }
        int i = this._inputEnd;
        this._currInputProcessed += (long) i;
        this._currInputRowStart -= i;
        streamReadConstraints().validateDocumentLength(this._currInputProcessed);
        int i2 = this._inputStream.read(this._inputBuffer, 0, length);
        if (i2 > 0) {
            this._nameStartOffset -= i;
            this._inputPtr = 0;
            this._inputEnd = i2;
            return true;
        }
        this._inputEnd = 0;
        this._inputPtr = 0;
        _closeInput();
        if (i2 == 0) {
            r40.h(w20.k(new StringBuilder("InputStream.read() returned 0 characters when trying to read "), this._inputBuffer.length, " bytes"));
            return false;
        }
        return false;
    }

    public void _loadMoreGuaranteed() {
        if (_loadMore()) {
            return;
        }
        _reportInvalidEOF();
    }

    public final void _matchFalse() {
        int i;
        int i2 = this._inputPtr;
        if (i2 + 4 < this._inputEnd) {
            byte[] bArr = this._inputBuffer;
            int i3 = i2 + 1;
            if (bArr[i2] == 97) {
                int i4 = i2 + 2;
                if (bArr[i3] == 108) {
                    int i5 = i2 + 3;
                    if (bArr[i4] == 115) {
                        int i6 = i2 + 4;
                        if (bArr[i5] == 101 && ((i = bArr[i6] & 255) < 48 || (i | 32) == 125)) {
                            this._inputPtr = i6;
                            return;
                        }
                    }
                }
            }
        }
        _matchToken2("false", 1);
    }

    public final void _matchNull() {
        int i;
        int i2 = this._inputPtr;
        if (i2 + 3 < this._inputEnd) {
            byte[] bArr = this._inputBuffer;
            int i3 = i2 + 1;
            if (bArr[i2] == 117) {
                int i4 = i2 + 2;
                if (bArr[i3] == 108) {
                    int i5 = i2 + 3;
                    if (bArr[i4] == 108 && ((i = bArr[i5] & 255) < 48 || (i | 32) == 125)) {
                        this._inputPtr = i5;
                        return;
                    }
                }
            }
        }
        _matchToken2("null", 1);
    }

    public final void _matchToken(String str, int i) {
        int i2;
        int length = str.length();
        if (this._inputPtr + length >= this._inputEnd) {
            _matchToken2(str, i);
            return;
        }
        do {
            if (this._inputBuffer[this._inputPtr] != str.charAt(i)) {
                _reportInvalidToken(str.substring(0, i));
            }
            i2 = this._inputPtr + 1;
            this._inputPtr = i2;
            i++;
        } while (i < length);
        int i3 = this._inputBuffer[i2] & 255;
        if (i3 < 48 || i3 == 93 || i3 == 125) {
            return;
        }
        _checkMatchEnd(str, i, i3);
    }

    public final void _matchTrue() {
        int i;
        int i2 = this._inputPtr;
        if (i2 + 3 < this._inputEnd) {
            byte[] bArr = this._inputBuffer;
            int i3 = i2 + 1;
            if (bArr[i2] == 114) {
                int i4 = i2 + 2;
                if (bArr[i3] == 117) {
                    int i5 = i2 + 3;
                    if (bArr[i4] == 101 && ((i = bArr[i5] & 255) < 48 || (i | 32) == 125)) {
                        this._inputPtr = i5;
                        return;
                    }
                }
            }
        }
        _matchToken2("true", 1);
    }

    public String _parseAposName() throws StreamConstraintsException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(": was expecting closing ''' for field name", JsonToken.FIELD_NAME);
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        int i_decodeEscaped = bArr[i] & 255;
        if (i_decodeEscaped == 39) {
            return "";
        }
        int[] iArr_growNameDecodeBuffer = this._quadBuffer;
        int[] iArr = JsonParserBase.INPUT_CODES_LATIN1;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i_decodeEscaped != 39) {
            if (iArr[i_decodeEscaped] != 0 && i_decodeEscaped != 34) {
                if (i_decodeEscaped != 92) {
                    _throwUnquotedSpace(i_decodeEscaped, "name");
                } else {
                    i_decodeEscaped = _decodeEscaped();
                }
                if (i_decodeEscaped > 127) {
                    if (i2 >= 4) {
                        if (i3 >= iArr_growNameDecodeBuffer.length) {
                            iArr_growNameDecodeBuffer = _growNameDecodeBuffer(iArr_growNameDecodeBuffer, iArr_growNameDecodeBuffer.length);
                            this._quadBuffer = iArr_growNameDecodeBuffer;
                        }
                        iArr_growNameDecodeBuffer[i3] = i4;
                        i4 = 0;
                        i3++;
                        i2 = 0;
                    }
                    if (i_decodeEscaped < 2048) {
                        i4 = (i4 << 8) | (i_decodeEscaped >> 6) | 192;
                        i2++;
                    } else {
                        int i5 = (i4 << 8) | (i_decodeEscaped >> 12) | 224;
                        int i6 = i2 + 1;
                        if (i6 >= 4) {
                            if (i3 >= iArr_growNameDecodeBuffer.length) {
                                iArr_growNameDecodeBuffer = _growNameDecodeBuffer(iArr_growNameDecodeBuffer, iArr_growNameDecodeBuffer.length);
                                this._quadBuffer = iArr_growNameDecodeBuffer;
                            }
                            iArr_growNameDecodeBuffer[i3] = i5;
                            i5 = 0;
                            i3++;
                            i6 = 0;
                        }
                        i4 = (i5 << 8) | ((i_decodeEscaped >> 6) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        i2 = i6 + 1;
                    }
                    i_decodeEscaped = (i_decodeEscaped & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                }
            }
            if (i2 < 4) {
                i2++;
                i_decodeEscaped |= i4 << 8;
            } else {
                if (i3 >= iArr_growNameDecodeBuffer.length) {
                    iArr_growNameDecodeBuffer = _growNameDecodeBuffer(iArr_growNameDecodeBuffer, iArr_growNameDecodeBuffer.length);
                    this._quadBuffer = iArr_growNameDecodeBuffer;
                }
                iArr_growNameDecodeBuffer[i3] = i4;
                i3++;
                i2 = 1;
            }
            i4 = i_decodeEscaped;
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
            }
            byte[] bArr2 = this._inputBuffer;
            int i7 = this._inputPtr;
            this._inputPtr = i7 + 1;
            i_decodeEscaped = bArr2[i7] & 255;
        }
        if (i2 > 0) {
            if (i3 >= iArr_growNameDecodeBuffer.length) {
                int[] iArr_growNameDecodeBuffer2 = _growNameDecodeBuffer(iArr_growNameDecodeBuffer, iArr_growNameDecodeBuffer.length);
                this._quadBuffer = iArr_growNameDecodeBuffer2;
                iArr_growNameDecodeBuffer = iArr_growNameDecodeBuffer2;
            }
            iArr_growNameDecodeBuffer[i3] = _padLastQuad(i4, i2);
            i3++;
        }
        String strFindName = this._symbols.findName(iArr_growNameDecodeBuffer, i3);
        return strFindName == null ? addName(iArr_growNameDecodeBuffer, i3, i2) : strFindName;
    }

    public final JsonToken _parseFloatThatStartsWithPeriod(boolean z, boolean z2) {
        if (!isEnabled(JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
            return _handleUnexpectedValue(46);
        }
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int i = 0;
        if (z) {
            cArrEmptyAndGetCurrentSegment[0] = '-';
            i = 1;
        }
        return _parseFloat(cArrEmptyAndGetCurrentSegment, i, 46, z, 0);
    }

    public final String _parseName(int i) {
        if (i != 34) {
            return _handleOddName(i);
        }
        int i2 = this._inputPtr;
        if (i2 + 13 > this._inputEnd) {
            return slowParseName();
        }
        byte[] bArr = this._inputBuffer;
        int[] iArr = JsonParserBase.INPUT_CODES_LATIN1;
        int i3 = i2 + 1;
        this._inputPtr = i3;
        int i4 = bArr[i2] & 255;
        if (iArr[i4] != 0) {
            return i4 == 34 ? "" : parseName(0, i4, 0);
        }
        int i5 = i2 + 2;
        this._inputPtr = i5;
        int i6 = bArr[i3] & 255;
        if (iArr[i6] != 0) {
            return i6 == 34 ? findName(i4, 1) : parseName(i4, i6, 1);
        }
        int i7 = i6 | (i4 << 8);
        int i8 = i2 + 3;
        this._inputPtr = i8;
        int i9 = bArr[i5] & 255;
        if (iArr[i9] != 0) {
            return i9 == 34 ? findName(i7, 2) : parseName(i7, i9, 2);
        }
        int i10 = (i7 << 8) | i9;
        int i11 = i2 + 4;
        this._inputPtr = i11;
        int i12 = bArr[i8] & 255;
        if (iArr[i12] != 0) {
            return i12 == 34 ? findName(i10, 3) : parseName(i10, i12, 3);
        }
        int i13 = (i10 << 8) | i12;
        this._inputPtr = i2 + 5;
        int i14 = bArr[i11] & 255;
        if (iArr[i14] != 0) {
            return i14 == 34 ? findName(i13, 4) : parseName(i13, i14, 4);
        }
        this._quad1 = i13;
        return parseMediumName(i14);
    }

    public JsonToken _parseUnsignedNumber(int i) {
        int i2;
        int i3;
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        if (i == 48) {
            i = _verifyNoLeadingZeroes();
        }
        cArrEmptyAndGetCurrentSegment[0] = (char) i;
        int iMin = Math.min(this._inputEnd, (this._inputPtr + cArrEmptyAndGetCurrentSegment.length) - 1);
        int i4 = 1;
        int i5 = 1;
        while (true) {
            i2 = this._inputPtr;
            if (i2 >= iMin) {
                return _parseNumber2(cArrEmptyAndGetCurrentSegment, i4, false, i5);
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i2 + 1;
            i3 = bArr[i2] & 255;
            if (i3 < 48 || i3 > 57) {
                break;
            }
            i5++;
            cArrEmptyAndGetCurrentSegment[i4] = (char) i3;
            i4++;
        }
        if (i3 == 46 || (i3 | 32) == 101) {
            return _parseFloat(cArrEmptyAndGetCurrentSegment, i4, i3, false, i5);
        }
        this._inputPtr = i2;
        this._textBuffer.setCurrentLength(i4);
        if (this._parsingContext.inRoot()) {
            _verifyRootSpace(i3);
        }
        return resetInt(false, i5);
    }

    public int _readBinary(Base64Variant base64Variant, OutputStream outputStream, byte[] bArr) throws IOException {
        int length = bArr.length - 3;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr2 = this._inputBuffer;
            int i3 = this._inputPtr;
            this._inputPtr = i3 + 1;
            int i4 = bArr2[i3] & 255;
            if (i4 > 32) {
                int iDecodeBase64Char = base64Variant.decodeBase64Char(i4);
                if (iDecodeBase64Char < 0) {
                    if (i4 == 34) {
                        break;
                    }
                    iDecodeBase64Char = _decodeBase64Escape(base64Variant, i4, 0);
                    if (iDecodeBase64Char < 0) {
                        continue;
                    }
                }
                if (i > length) {
                    i2 += i;
                    outputStream.write(bArr, 0, i);
                    i = 0;
                }
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr3 = this._inputBuffer;
                int i5 = this._inputPtr;
                this._inputPtr = i5 + 1;
                int i6 = bArr3[i5] & 255;
                int iDecodeBase64Char2 = base64Variant.decodeBase64Char(i6);
                if (iDecodeBase64Char2 < 0) {
                    iDecodeBase64Char2 = _decodeBase64Escape(base64Variant, i6, 1);
                }
                int i7 = (iDecodeBase64Char << 6) | iDecodeBase64Char2;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr4 = this._inputBuffer;
                int i8 = this._inputPtr;
                this._inputPtr = i8 + 1;
                int i9 = bArr4[i8] & 255;
                int iDecodeBase64Char3 = base64Variant.decodeBase64Char(i9);
                if (iDecodeBase64Char3 < 0) {
                    if (iDecodeBase64Char3 != -2) {
                        if (i9 == 34) {
                            int i10 = i + 1;
                            bArr[i] = (byte) (i7 >> 4);
                            if (base64Variant.requiresPaddingOnRead()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            i = i10;
                        } else {
                            iDecodeBase64Char3 = _decodeBase64Escape(base64Variant, i9, 2);
                        }
                    }
                    if (iDecodeBase64Char3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        byte[] bArr5 = this._inputBuffer;
                        int i11 = this._inputPtr;
                        this._inputPtr = i11 + 1;
                        int i12 = bArr5[i11] & 255;
                        if (!base64Variant.usesPaddingChar(i12) && _decodeBase64Escape(base64Variant, i12, 3) != -2) {
                            throw reportInvalidBase64Char(base64Variant, i12, 3, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                        }
                        bArr[i] = (byte) (i7 >> 4);
                        i++;
                    }
                }
                int i13 = (i7 << 6) | iDecodeBase64Char3;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr6 = this._inputBuffer;
                int i14 = this._inputPtr;
                this._inputPtr = i14 + 1;
                int i15 = bArr6[i14] & 255;
                int iDecodeBase64Char4 = base64Variant.decodeBase64Char(i15);
                if (iDecodeBase64Char4 < 0) {
                    if (iDecodeBase64Char4 != -2) {
                        if (i15 == 34) {
                            int i16 = i + 1;
                            bArr[i] = (byte) (i13 >> 10);
                            i += 2;
                            bArr[i16] = (byte) (i13 >> 2);
                            if (base64Variant.requiresPaddingOnRead()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                        } else {
                            iDecodeBase64Char4 = _decodeBase64Escape(base64Variant, i15, 3);
                        }
                    }
                    if (iDecodeBase64Char4 == -2) {
                        int i17 = i + 1;
                        bArr[i] = (byte) (i13 >> 10);
                        i += 2;
                        bArr[i17] = (byte) (i13 >> 2);
                    }
                }
                int i18 = (i13 << 6) | iDecodeBase64Char4;
                bArr[i] = (byte) (i18 >> 16);
                int i19 = i + 2;
                bArr[i + 1] = (byte) (i18 >> 8);
                i += 3;
                bArr[i19] = (byte) i18;
            }
        }
        this._tokenIncomplete = false;
        if (i <= 0) {
            return i2;
        }
        int i20 = i2 + i;
        outputStream.write(bArr, 0, i);
        return i20;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _releaseBuffers() {
        byte[] bArr;
        byte[] bArr2;
        super._releaseBuffers();
        this._symbols.release();
        if (!this._bufferRecyclable || (bArr = this._inputBuffer) == null || bArr == (bArr2 = ParserMinimalBase.NO_BYTES)) {
            return;
        }
        this._inputBuffer = bArr2;
        this._ioContext.releaseReadIOBuffer(bArr);
    }

    public void _reportInvalidChar(int i) {
        if (i < 32) {
            _throwInvalidSpace(i);
        }
        _reportInvalidInitial(i);
    }

    public void _reportInvalidInitial(int i) {
        _reportError("Invalid UTF-8 start byte 0x" + Integer.toHexString(i));
    }

    public void _reportInvalidOther(int i) {
        _reportError("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i));
    }

    public void _reportInvalidToken(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                break;
            }
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            char c_decodeCharForError = (char) _decodeCharForError(bArr[i]);
            if (!Character.isJavaIdentifierPart(c_decodeCharForError)) {
                break;
            }
            sb.append(c_decodeCharForError);
            if (sb.length() >= this._ioContext.errorReportConfiguration().getMaxErrorTokenLength()) {
                sb.append("...");
                break;
            }
        }
        _reportError("Unrecognized token '%s': was expecting %s", sb, str2);
    }

    public final void _skipCR() {
        if (this._inputPtr < this._inputEnd || _loadMore()) {
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            if (bArr[i] == 10) {
                this._inputPtr = i + 1;
            }
        }
        this._currInputRow++;
        this._currInputRowStart = this._inputPtr;
    }

    public void _skipString() {
        this._tokenIncomplete = false;
        int[] iArr = JsonParserBase.INPUT_CODES_UTF8;
        byte[] bArr = this._inputBuffer;
        while (true) {
            int i = this._inputPtr;
            int i2 = this._inputEnd;
            if (i >= i2) {
                _loadMoreGuaranteed();
                i = this._inputPtr;
                i2 = this._inputEnd;
            }
            while (true) {
                if (i >= i2) {
                    this._inputPtr = i;
                    break;
                }
                int i3 = i + 1;
                int i4 = bArr[i] & 255;
                int i5 = iArr[i4];
                if (i5 != 0) {
                    this._inputPtr = i3;
                    if (i4 == 34) {
                        return;
                    }
                    if (i5 == 1) {
                        _decodeEscaped();
                    } else if (i5 == 2) {
                        _skipUtf8_2();
                    } else if (i5 == 3) {
                        _skipUtf8_3();
                    } else if (i5 == 4) {
                        _skipUtf8_4(i4);
                    } else if (i4 < 32) {
                        _throwUnquotedSpace(i4, "string value");
                    } else {
                        _reportInvalidChar(i4);
                    }
                } else {
                    i = i3;
                }
            }
        }
    }

    @Override // com.fasterxml.jackson.core.json.JsonParserBase, com.fasterxml.jackson.core.JsonParser
    public JsonLocation currentLocation() {
        return new JsonLocation(_contentReference(), this._currInputProcessed + ((long) this._inputPtr), -1L, this._currInputRow, (this._inputPtr - this._currInputRowStart) + 1);
    }

    @Override // com.fasterxml.jackson.core.json.JsonParserBase, com.fasterxml.jackson.core.JsonParser
    public JsonLocation currentTokenLocation() {
        if (this._currToken != JsonToken.FIELD_NAME) {
            return new JsonLocation(_contentReference(), this._tokenInputTotal - 1, -1L, this._tokenInputRow, this._tokenInputCol);
        }
        return new JsonLocation(_contentReference(), this._currInputProcessed + ((long) (this._nameStartOffset - 1)), -1L, this._nameStartRow, this._nameStartCol);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public byte[] getBinaryValue(Base64Variant base64Variant) throws JsonParseException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_STRING && (jsonToken != JsonToken.VALUE_EMBEDDED_OBJECT || this._binaryValue == null)) {
            _reportError("Current token (" + this._currToken + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (this._tokenIncomplete) {
            try {
                this._binaryValue = _decodeBase64(base64Variant);
                this._tokenIncomplete = false;
            } catch (IllegalArgumentException e) {
                throw _constructError("Failed to decode VALUE_STRING as base64 (" + base64Variant + "): " + e.getMessage());
            }
        } else if (this._binaryValue == null) {
            ByteArrayBuilder byteArrayBuilder_getByteArrayBuilder = _getByteArrayBuilder();
            _decodeBase64(getText(), byteArrayBuilder_getByteArrayBuilder, base64Variant);
            this._binaryValue = byteArrayBuilder_getByteArrayBuilder.toByteArray();
        }
        return this._binaryValue;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public String getText() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return _getText2(jsonToken);
        }
        if (!this._tokenIncomplete) {
            return this._textBuffer.contentsAsString();
        }
        this._tokenIncomplete = false;
        return _finishAndReturnString();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public char[] getTextCharacters() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return null;
        }
        int iId = jsonToken.id();
        if (iId != 5) {
            if (iId != 6) {
                if (iId != 7 && iId != 8) {
                    return this._currToken.asCharArray();
                }
            } else if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.getTextBuffer();
        }
        if (!this._nameCopied) {
            String currentName = this._parsingContext.getCurrentName();
            int length = currentName.length();
            char[] cArr = this._nameCopyBuffer;
            if (cArr == null) {
                this._nameCopyBuffer = this._ioContext.allocNameCopyBuffer(length);
            } else if (cArr.length < length) {
                this._nameCopyBuffer = new char[length];
            }
            currentName.getChars(0, length, this._nameCopyBuffer, 0);
            this._nameCopied = true;
        }
        return this._nameCopyBuffer;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getTextLength() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return 0;
        }
        int iId = jsonToken.id();
        if (iId == 5) {
            return this._parsingContext.getCurrentName().length();
        }
        if (iId != 6) {
            if (iId != 7 && iId != 8) {
                return this._currToken.asCharArray().length;
            }
        } else if (this._tokenIncomplete) {
            this._tokenIncomplete = false;
            _finishString();
        }
        return this._textBuffer.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0011, code lost:
    
        if (r0 != 8) goto L16;
     */
    @Override // com.fasterxml.jackson.core.JsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int getTextOffset() {
        /*
            r3 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r3._currToken
            r1 = 0
            if (r0 == 0) goto L24
            int r0 = r0.id()
            r2 = 6
            if (r0 == r2) goto L14
            r2 = 7
            if (r0 == r2) goto L1d
            r2 = 8
            if (r0 == r2) goto L1d
            goto L24
        L14:
            boolean r0 = r3._tokenIncomplete
            if (r0 == 0) goto L1d
            r3._tokenIncomplete = r1
            r3._finishString()
        L1d:
            com.fasterxml.jackson.core.util.TextBuffer r3 = r3._textBuffer
            int r3 = r3.getTextOffset()
            return r3
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getTextOffset():int");
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public int getValueAsInt() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT && jsonToken != JsonToken.VALUE_NUMBER_FLOAT) {
            return super.getValueAsInt(0);
        }
        int i = this._numTypesValid;
        if ((i & 1) == 0) {
            if (i == 0) {
                return _parseIntValue();
            }
            if ((i & 1) == 0) {
                convertNumberToInt();
            }
        }
        return this._numberInt;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public String getValueAsString() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return jsonToken == JsonToken.FIELD_NAME ? currentName() : super.getValueAsString(null);
        }
        if (!this._tokenIncomplete) {
            return this._textBuffer.contentsAsString();
        }
        this._tokenIncomplete = false;
        return _finishAndReturnString();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String nextFieldName() throws JsonParseException {
        JsonToken jsonToken_parseSignedNumber;
        this._numTypesValid = 0;
        JsonToken jsonToken = this._currToken;
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            _nextAfterName();
            return null;
        }
        if (this._tokenIncomplete) {
            _skipString();
        }
        int i_skipWSOrEnd = _skipWSOrEnd();
        if (i_skipWSOrEnd < 0) {
            close();
            this._currToken = null;
            return null;
        }
        this._binaryValue = null;
        if (i_skipWSOrEnd == 93) {
            _closeArrayScope();
            this._currToken = JsonToken.END_ARRAY;
            return null;
        }
        if (i_skipWSOrEnd == 125) {
            _closeObjectScope();
            this._currToken = JsonToken.END_OBJECT;
            return null;
        }
        if (this._parsingContext.expectComma()) {
            if (i_skipWSOrEnd != 44) {
                _reportUnexpectedChar(i_skipWSOrEnd, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
            }
            i_skipWSOrEnd = _skipWS();
            if ((this._features & JsonParserBase.FEAT_MASK_TRAILING_COMMA) != 0 && (i_skipWSOrEnd == 93 || i_skipWSOrEnd == 125)) {
                _closeScope(i_skipWSOrEnd);
                return null;
            }
        }
        if (!this._parsingContext.inObject()) {
            _updateLocation();
            _nextTokenNotInObject(i_skipWSOrEnd);
            return null;
        }
        _updateNameLocation();
        String str_parseName = _parseName(i_skipWSOrEnd);
        this._parsingContext.setCurrentName(str_parseName);
        this._currToken = jsonToken2;
        int i_skipColon = _skipColon();
        _updateLocation();
        if (i_skipColon == 34) {
            this._tokenIncomplete = true;
            this._nextToken = JsonToken.VALUE_STRING;
            return str_parseName;
        }
        if (i_skipColon == 43) {
            jsonToken_parseSignedNumber = isEnabled(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature()) ? _parseSignedNumber(false) : _handleUnexpectedValue(i_skipColon);
        } else if (i_skipColon == 91) {
            jsonToken_parseSignedNumber = JsonToken.START_ARRAY;
        } else if (i_skipColon == 102) {
            _matchFalse();
            jsonToken_parseSignedNumber = JsonToken.VALUE_FALSE;
        } else if (i_skipColon == 110) {
            _matchNull();
            jsonToken_parseSignedNumber = JsonToken.VALUE_NULL;
        } else if (i_skipColon == 116) {
            _matchTrue();
            jsonToken_parseSignedNumber = JsonToken.VALUE_TRUE;
        } else if (i_skipColon == 123) {
            jsonToken_parseSignedNumber = JsonToken.START_OBJECT;
        } else if (i_skipColon == 45) {
            jsonToken_parseSignedNumber = _parseSignedNumber(true);
        } else if (i_skipColon != 46) {
            switch (i_skipColon) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case RumViewScope.SLOW_RENDERED_THRESHOLD_FPS /* 55 */:
                case 56:
                case 57:
                    jsonToken_parseSignedNumber = _parseUnsignedNumber(i_skipColon);
                    break;
                default:
                    jsonToken_parseSignedNumber = _handleUnexpectedValue(i_skipColon);
                    break;
            }
        } else {
            jsonToken_parseSignedNumber = _parseFloatThatStartsWithPeriod(false, false);
        }
        this._nextToken = jsonToken_parseSignedNumber;
        return str_parseName;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String nextTextValue() {
        if (this._currToken != JsonToken.FIELD_NAME) {
            if (nextToken() == JsonToken.VALUE_STRING) {
                return getText();
            }
            return null;
        }
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        this._currToken = jsonToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (!this._tokenIncomplete) {
                return this._textBuffer.contentsAsString();
            }
            this._tokenIncomplete = false;
            return _finishAndReturnString();
        }
        if (jsonToken == JsonToken.START_ARRAY) {
            createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public JsonToken nextToken() throws JsonParseException {
        JsonToken jsonToken_parseSignedNumber;
        JsonToken jsonToken = this._currToken;
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            return _nextAfterName();
        }
        this._numTypesValid = 0;
        if (this._tokenIncomplete) {
            _skipString();
        }
        int i_skipWSOrEnd = _skipWSOrEnd();
        if (i_skipWSOrEnd < 0) {
            close();
            this._currToken = null;
            return null;
        }
        this._binaryValue = null;
        if (i_skipWSOrEnd == 93) {
            _closeArrayScope();
            JsonToken jsonToken3 = JsonToken.END_ARRAY;
            this._currToken = jsonToken3;
            return jsonToken3;
        }
        if (i_skipWSOrEnd == 125) {
            _closeObjectScope();
            JsonToken jsonToken4 = JsonToken.END_OBJECT;
            this._currToken = jsonToken4;
            return jsonToken4;
        }
        if (this._parsingContext.expectComma()) {
            if (i_skipWSOrEnd != 44) {
                _reportUnexpectedChar(i_skipWSOrEnd, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
            }
            i_skipWSOrEnd = _skipWS();
            if ((this._features & JsonParserBase.FEAT_MASK_TRAILING_COMMA) != 0 && (i_skipWSOrEnd == 93 || i_skipWSOrEnd == 125)) {
                return _closeScope(i_skipWSOrEnd);
            }
        }
        if (!this._parsingContext.inObject()) {
            _updateLocation();
            return _nextTokenNotInObject(i_skipWSOrEnd);
        }
        _updateNameLocation();
        this._parsingContext.setCurrentName(_parseName(i_skipWSOrEnd));
        this._currToken = jsonToken2;
        int i_skipColon = _skipColon();
        _updateLocation();
        if (i_skipColon == 34) {
            this._tokenIncomplete = true;
            this._nextToken = JsonToken.VALUE_STRING;
            return this._currToken;
        }
        if (i_skipColon == 43) {
            jsonToken_parseSignedNumber = isEnabled(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature()) ? _parseSignedNumber(false) : _handleUnexpectedValue(i_skipColon);
        } else if (i_skipColon == 91) {
            jsonToken_parseSignedNumber = JsonToken.START_ARRAY;
        } else if (i_skipColon == 102) {
            _matchFalse();
            jsonToken_parseSignedNumber = JsonToken.VALUE_FALSE;
        } else if (i_skipColon == 110) {
            _matchNull();
            jsonToken_parseSignedNumber = JsonToken.VALUE_NULL;
        } else if (i_skipColon == 116) {
            _matchTrue();
            jsonToken_parseSignedNumber = JsonToken.VALUE_TRUE;
        } else if (i_skipColon == 123) {
            jsonToken_parseSignedNumber = JsonToken.START_OBJECT;
        } else if (i_skipColon == 45) {
            jsonToken_parseSignedNumber = _parseSignedNumber(true);
        } else if (i_skipColon != 46) {
            switch (i_skipColon) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case RumViewScope.SLOW_RENDERED_THRESHOLD_FPS /* 55 */:
                case 56:
                case 57:
                    jsonToken_parseSignedNumber = _parseUnsignedNumber(i_skipColon);
                    break;
                default:
                    jsonToken_parseSignedNumber = _handleUnexpectedValue(i_skipColon);
                    break;
            }
        } else {
            jsonToken_parseSignedNumber = _parseFloatThatStartsWithPeriod(false, false);
        }
        this._nextToken = jsonToken_parseSignedNumber;
        return this._currToken;
    }

    public final String parseEscapedName(int[] iArr, int i, int i2, int i3, int i4) throws StreamConstraintsException {
        int[] iArr2 = JsonParserBase.INPUT_CODES_LATIN1;
        while (true) {
            if (iArr2[i3] != 0) {
                if (i3 == 34) {
                    break;
                }
                if (i3 != 92) {
                    _throwUnquotedSpace(i3, "name");
                } else {
                    i3 = _decodeEscaped();
                }
                if (i3 > 127) {
                    int i5 = 0;
                    if (i4 >= 4) {
                        if (i >= iArr.length) {
                            iArr = _growNameDecodeBuffer(iArr, iArr.length);
                            this._quadBuffer = iArr;
                        }
                        iArr[i] = i2;
                        i++;
                        i2 = 0;
                        i4 = 0;
                    }
                    if (i3 < 2048) {
                        i2 = (i2 << 8) | (i3 >> 6) | 192;
                        i4++;
                    } else {
                        int i6 = (i2 << 8) | (i3 >> 12) | 224;
                        int i7 = i4 + 1;
                        if (i7 >= 4) {
                            if (i >= iArr.length) {
                                iArr = _growNameDecodeBuffer(iArr, iArr.length);
                                this._quadBuffer = iArr;
                            }
                            iArr[i] = i6;
                            i++;
                            i7 = 0;
                        } else {
                            i5 = i6;
                        }
                        i2 = (i5 << 8) | ((i3 >> 6) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        i4 = i7 + 1;
                    }
                    i3 = (i3 & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                }
            }
            if (i4 < 4) {
                i4++;
                i2 = (i2 << 8) | i3;
            } else {
                if (i >= iArr.length) {
                    iArr = _growNameDecodeBuffer(iArr, iArr.length);
                    this._quadBuffer = iArr;
                }
                iArr[i] = i2;
                i2 = i3;
                i++;
                i4 = 1;
            }
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
            }
            byte[] bArr = this._inputBuffer;
            int i8 = this._inputPtr;
            this._inputPtr = i8 + 1;
            i3 = bArr[i8] & 255;
        }
        if (i4 > 0) {
            if (i >= iArr.length) {
                iArr = _growNameDecodeBuffer(iArr, iArr.length);
                this._quadBuffer = iArr;
            }
            iArr[i] = _padLastQuad(i2, i4);
            i++;
        }
        String strFindName = this._symbols.findName(iArr, i);
        return strFindName == null ? addName(iArr, i, i4) : strFindName;
    }

    public final String parseLongName(int i, int i2, int i3) {
        int[] iArr = this._quadBuffer;
        iArr[0] = this._quad1;
        int i4 = 1;
        iArr[1] = i2;
        iArr[2] = i3;
        byte[] bArr = this._inputBuffer;
        int[] iArr2 = JsonParserBase.INPUT_CODES_LATIN1;
        int i5 = i;
        int i6 = 3;
        while (true) {
            int i7 = this._inputPtr;
            if (i7 + 4 > this._inputEnd) {
                return parseEscapedName(this._quadBuffer, i6, 0, i5, 0);
            }
            int i8 = i7 + 1;
            this._inputPtr = i8;
            int i9 = bArr[i7] & 255;
            if (iArr2[i9] != 0) {
                int[] iArr3 = this._quadBuffer;
                if (i9 == 34) {
                    return findName(iArr3, i6, i5, i4);
                }
                return parseEscapedName(iArr3, i6, i5, i9, 1);
            }
            int i10 = i4;
            int i11 = i6;
            int i12 = i5;
            int[] iArr4 = iArr2;
            int i13 = (i12 << 8) | i9;
            int i14 = i7 + 2;
            this._inputPtr = i14;
            int i15 = bArr[i8] & 255;
            if (iArr4[i15] != 0) {
                int[] iArr5 = this._quadBuffer;
                return i15 == 34 ? findName(iArr5, i11, i13, 2) : parseEscapedName(iArr5, i11, i13, i15, 2);
            }
            int i16 = (i13 << 8) | i15;
            int i17 = i7 + 3;
            this._inputPtr = i17;
            int i18 = bArr[i14] & 255;
            if (iArr4[i18] != 0) {
                int[] iArr6 = this._quadBuffer;
                return i18 == 34 ? findName(iArr6, i11, i16, 3) : parseEscapedName(iArr6, i11, i16, i18, 3);
            }
            int i19 = (i16 << 8) | i18;
            this._inputPtr = i7 + 4;
            int i20 = bArr[i17] & 255;
            if (iArr4[i20] != 0) {
                int[] iArr7 = this._quadBuffer;
                return i20 == 34 ? findName(iArr7, i11, i19, 4) : parseEscapedName(iArr7, i11, i19, i20, 4);
            }
            int[] iArr8 = this._quadBuffer;
            if (i11 >= iArr8.length) {
                this._quadBuffer = _growNameDecodeBuffer(iArr8, i11);
            }
            this._quadBuffer[i11] = i19;
            i5 = i20;
            iArr2 = iArr4;
            i6 = i11 + 1;
            i4 = i10;
        }
    }

    public final String parseMediumName(int i) {
        byte[] bArr = this._inputBuffer;
        int[] iArr = JsonParserBase.INPUT_CODES_LATIN1;
        int i2 = this._inputPtr;
        int i3 = i2 + 1;
        this._inputPtr = i3;
        int i4 = bArr[i2] & 255;
        if (iArr[i4] != 0) {
            int i5 = this._quad1;
            return i4 == 34 ? findName(i5, i, 1) : parseName(i5, i, i4, 1);
        }
        int i6 = (i << 8) | i4;
        int i7 = i2 + 2;
        this._inputPtr = i7;
        int i8 = bArr[i3] & 255;
        if (iArr[i8] != 0) {
            int i9 = this._quad1;
            return i8 == 34 ? findName(i9, i6, 2) : parseName(i9, i6, i8, 2);
        }
        int i10 = (i6 << 8) | i8;
        int i11 = i2 + 3;
        this._inputPtr = i11;
        int i12 = bArr[i7] & 255;
        if (iArr[i12] != 0) {
            int i13 = this._quad1;
            return i12 == 34 ? findName(i13, i10, 3) : parseName(i13, i10, i12, 3);
        }
        int i14 = (i10 << 8) | i12;
        this._inputPtr = i2 + 4;
        int i15 = bArr[i11] & 255;
        if (iArr[i15] == 0) {
            return parseMediumName2(i15, i14);
        }
        int i16 = this._quad1;
        return i15 == 34 ? findName(i16, i14, 4) : parseName(i16, i14, i15, 4);
    }

    public final String parseMediumName2(int i, int i2) {
        byte[] bArr = this._inputBuffer;
        int[] iArr = JsonParserBase.INPUT_CODES_LATIN1;
        int i3 = this._inputPtr;
        int i4 = i3 + 1;
        this._inputPtr = i4;
        int i5 = bArr[i3] & 255;
        if (iArr[i5] != 0) {
            int i6 = this._quad1;
            return i5 == 34 ? findName(i6, i2, i, 1) : parseName(i6, i2, i, i5, 1);
        }
        int i7 = (i << 8) | i5;
        int i8 = i3 + 2;
        this._inputPtr = i8;
        int i9 = bArr[i4] & 255;
        if (iArr[i9] != 0) {
            int i10 = this._quad1;
            return i9 == 34 ? findName(i10, i2, i7, 2) : parseName(i10, i2, i7, i9, 2);
        }
        int i11 = (i7 << 8) | i9;
        int i12 = i3 + 3;
        this._inputPtr = i12;
        int i13 = bArr[i8] & 255;
        if (iArr[i13] != 0) {
            int i14 = this._quad1;
            return i13 == 34 ? findName(i14, i2, i11, 3) : parseName(i14, i2, i11, i13, 3);
        }
        int i15 = (i11 << 8) | i13;
        this._inputPtr = i3 + 4;
        int i16 = bArr[i12] & 255;
        if (iArr[i16] == 0) {
            return parseLongName(i16, i2, i15);
        }
        int i17 = this._quad1;
        return i16 == 34 ? findName(i17, i2, i15, 4) : parseName(i17, i2, i15, i16, 4);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        if (!this._tokenIncomplete || this._currToken != JsonToken.VALUE_STRING) {
            byte[] binaryValue = getBinaryValue(base64Variant);
            outputStream.write(binaryValue);
            return binaryValue.length;
        }
        byte[] bArrAllocBase64Buffer = this._ioContext.allocBase64Buffer();
        try {
            return _readBinary(base64Variant, outputStream, bArrAllocBase64Buffer);
        } finally {
            this._ioContext.releaseBase64Buffer(bArrAllocBase64Buffer);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int releaseBuffered(OutputStream outputStream) throws IOException {
        int i = this._inputEnd;
        int i2 = this._inputPtr;
        int i3 = i - i2;
        if (i3 < 1) {
            return 0;
        }
        this._inputPtr = i2 + i3;
        outputStream.write(this._inputBuffer, i2, i3);
        return i3;
    }

    public String slowParseName() {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(": was expecting closing '\"' for name", JsonToken.FIELD_NAME);
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        int i2 = bArr[i] & 255;
        return i2 == 34 ? "" : parseEscapedName(this._quadBuffer, 0, 0, i2, 0);
    }

    private final String parseName(int i, int i2, int i3) {
        return parseEscapedName(this._quadBuffer, 0, i, i2, i3);
    }

    private final String parseName(int i, int i2, int i3, int i4, int i5) {
        int[] iArr = this._quadBuffer;
        iArr[0] = i;
        iArr[1] = i2;
        return parseEscapedName(iArr, 2, i3, i4, i5);
    }

    public void _reportInvalidOther(int i, int i2) {
        this._inputPtr = i2;
        _reportInvalidOther(i);
    }

    private final String findName(int i, int i2, int i3) {
        int i_padLastQuad = _padLastQuad(i2, i3);
        String strFindName = this._symbols.findName(i, i_padLastQuad);
        if (strFindName != null) {
            return strFindName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i;
        iArr[1] = i_padLastQuad;
        return addName(iArr, 2, i3);
    }

    private final String findName(int i, int i2) {
        int i_padLastQuad = _padLastQuad(i, i2);
        String strFindName = this._symbols.findName(i_padLastQuad);
        if (strFindName != null) {
            return strFindName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i_padLastQuad;
        return addName(iArr, 1, i2);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public int getValueAsInt(int i) {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT && jsonToken != JsonToken.VALUE_NUMBER_FLOAT) {
            return super.getValueAsInt(i);
        }
        int i2 = this._numTypesValid;
        if ((i2 & 1) == 0) {
            if (i2 == 0) {
                return _parseIntValue();
            }
            if ((i2 & 1) == 0) {
                convertNumberToInt();
            }
        }
        return this._numberInt;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public String getValueAsString(String str) {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                return _finishAndReturnString();
            }
            return this._textBuffer.contentsAsString();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return currentName();
        }
        return super.getValueAsString(str);
    }

    private final String findName(int[] iArr, int i, int i2, int i3) throws StreamConstraintsException {
        if (i >= iArr.length) {
            iArr = _growNameDecodeBuffer(iArr, iArr.length);
            this._quadBuffer = iArr;
        }
        int i4 = i + 1;
        iArr[i] = _padLastQuad(i2, i3);
        String strFindName = this._symbols.findName(iArr, i4);
        return strFindName == null ? addName(iArr, i4, i3) : strFindName;
    }

    public void _reportInvalidToken(String str) {
        _reportInvalidToken(str, _validJsonTokenList());
    }
}

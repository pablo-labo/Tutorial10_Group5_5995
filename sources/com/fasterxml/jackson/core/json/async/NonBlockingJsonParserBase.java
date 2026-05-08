package com.fasterxml.jackson.core.json.async;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.json.JsonParserBase;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NonBlockingJsonParserBase extends JsonParserBase {
    protected static final String[] NON_STD_TOKENS = {"NaN", "Infinity", "+Infinity", "-Infinity"};
    protected static final double[] NON_STD_TOKEN_VALUES = {Double.NaN, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY};
    protected int _currBufferStart;
    protected int _currInputRowAlt;
    protected boolean _endOfInput;
    protected int _majorState;
    protected int _majorStateAfterValue;
    protected int _minorState;
    protected int _minorStateAfterSplit;
    protected int _nonStdTokenType;
    protected int _pending32;
    protected int _pendingBytes;
    protected int _quad1;
    protected int[] _quadBuffer;
    protected int _quadLength;
    protected int _quoted32;
    protected int _quotedDigits;
    protected final ByteQuadsCanonicalizer _symbols;

    public NonBlockingJsonParserBase(IOContext iOContext, int i, ByteQuadsCanonicalizer byteQuadsCanonicalizer) {
        super(iOContext, i, null);
        this._quadBuffer = new int[8];
        this._endOfInput = false;
        this._currBufferStart = 0;
        this._currInputRowAlt = 1;
        this._symbols = byteQuadsCanonicalizer;
        this._currToken = null;
        this._majorState = 0;
        this._majorStateAfterValue = 1;
    }

    public static final int _padLastQuad(int i, int i2) {
        return i2 == 4 ? i : i | ((-1) << (i2 << 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String _addName(int[] r18, int r19, int r20) throws com.fasterxml.jackson.core.exc.StreamConstraintsException {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.async.NonBlockingJsonParserBase._addName(int[], int, int):java.lang.String");
    }

    public final JsonToken _closeArrayScope() {
        if (!this._parsingContext.inArray()) {
            _reportMismatchedEndMarker(93, '}');
        }
        JsonReadContext parent = this._parsingContext.getParent();
        this._parsingContext = parent;
        int i = parent.inObject() ? 3 : parent.inArray() ? 6 : 1;
        this._majorState = i;
        this._majorStateAfterValue = i;
        JsonToken jsonToken = JsonToken.END_ARRAY;
        this._currToken = jsonToken;
        return jsonToken;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _closeInput() {
        this._currBufferStart = 0;
        this._inputEnd = 0;
    }

    public final JsonToken _closeObjectScope() {
        if (!this._parsingContext.inObject()) {
            _reportMismatchedEndMarker(125, ']');
        }
        JsonReadContext parent = this._parsingContext.getParent();
        this._parsingContext = parent;
        int i = parent.inObject() ? 3 : parent.inArray() ? 6 : 1;
        this._majorState = i;
        this._majorStateAfterValue = i;
        JsonToken jsonToken = JsonToken.END_OBJECT;
        this._currToken = jsonToken;
        return jsonToken;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase
    public JsonLocation _currentLocationMinusOne() {
        int i = this._inputPtr - 1;
        return new JsonLocation(_contentReference(), ((long) (i - this._currBufferStart)) + this._currInputProcessed, -1L, Math.max(this._currInputRow, this._currInputRowAlt), (i - this._currInputRowStart) + 1);
    }

    public final JsonToken _eofAsNextToken() {
        this._majorState = 7;
        if (!this._parsingContext.inRoot()) {
            _handleEOF();
        }
        close();
        this._currToken = null;
        return null;
    }

    public final JsonToken _fieldComplete(String str) throws JsonParseException {
        this._majorState = 4;
        this._parsingContext.setCurrentName(str);
        JsonToken jsonToken = JsonToken.FIELD_NAME;
        this._currToken = jsonToken;
        return jsonToken;
    }

    public final String _findName(int i, int i2, int i3, int i4) {
        int i_padLastQuad = _padLastQuad(i3, i4);
        String strFindName = this._symbols.findName(i, i2, i_padLastQuad);
        if (strFindName != null) {
            return strFindName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = _padLastQuad(i_padLastQuad, i4);
        return _addName(iArr, 3, i4);
    }

    public final String _getText2(JsonToken jsonToken) {
        int iId;
        if (jsonToken == null || (iId = jsonToken.id()) == -1) {
            return null;
        }
        return iId != 5 ? (iId == 6 || iId == 7 || iId == 8) ? this._textBuffer.contentsAsString() : jsonToken.asString() : this._parsingContext.getCurrentName();
    }

    public final String _nonStdToken(int i) {
        return NON_STD_TOKENS[i];
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _releaseBuffers() {
        super._releaseBuffers();
        this._symbols.release();
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

    public final JsonToken _startArrayScope() {
        createChildArrayContext(-1, -1);
        this._majorState = 5;
        this._majorStateAfterValue = 6;
        JsonToken jsonToken = JsonToken.START_ARRAY;
        this._currToken = jsonToken;
        return jsonToken;
    }

    public final JsonToken _startObjectScope() {
        createChildObjectContext(-1, -1);
        this._majorState = 2;
        this._majorStateAfterValue = 3;
        JsonToken jsonToken = JsonToken.START_OBJECT;
        this._currToken = jsonToken;
        return jsonToken;
    }

    public final void _updateTokenLocation() {
        this._tokenInputRow = Math.max(this._currInputRow, this._currInputRowAlt);
        int i = this._inputPtr;
        this._tokenInputCol = i - this._currInputRowStart;
        this._tokenInputTotal = this._currInputProcessed + ((long) (i - this._currBufferStart));
    }

    public final JsonToken _valueComplete(JsonToken jsonToken) {
        this._majorState = this._majorStateAfterValue;
        this._currToken = jsonToken;
        return jsonToken;
    }

    public final JsonToken _valueCompleteInt(int i, String str) {
        this._textBuffer.resetWithString(str);
        this._intLength = str.length();
        this._numTypesValid = 1;
        this._numberInt = i;
        this._majorState = this._majorStateAfterValue;
        JsonToken jsonToken = JsonToken.VALUE_NUMBER_INT;
        this._currToken = jsonToken;
        return jsonToken;
    }

    public final JsonToken _valueNonStdNumberComplete(int i) throws JsonParseException {
        String str = NON_STD_TOKENS[i];
        this._textBuffer.resetWithString(str);
        if (!isEnabled(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS)) {
            _reportError("Non-standard token '%s': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow", str);
        }
        this._intLength = 0;
        this._numTypesValid = 8;
        this._numberDouble = NON_STD_TOKEN_VALUES[i];
        this._majorState = this._majorStateAfterValue;
        JsonToken jsonToken = JsonToken.VALUE_NUMBER_FLOAT;
        this._currToken = jsonToken;
        return jsonToken;
    }

    @Override // com.fasterxml.jackson.core.json.JsonParserBase, com.fasterxml.jackson.core.JsonParser
    public JsonLocation currentLocation() {
        int i = (this._inputPtr - this._currInputRowStart) + 1;
        return new JsonLocation(_contentReference(), this._currInputProcessed + ((long) (this._inputPtr - this._currBufferStart)), -1L, Math.max(this._currInputRow, this._currInputRowAlt), i);
    }

    @Override // com.fasterxml.jackson.core.json.JsonParserBase, com.fasterxml.jackson.core.JsonParser
    public JsonLocation currentTokenLocation() {
        return new JsonLocation(_contentReference(), this._tokenInputTotal, -1L, this._tokenInputRow, this._tokenInputCol);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public byte[] getBinaryValue(Base64Variant base64Variant) throws JsonParseException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_STRING) {
            _reportError("Current token (%s) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary", jsonToken);
        }
        if (this._binaryValue == null) {
            ByteArrayBuilder byteArrayBuilder_getByteArrayBuilder = _getByteArrayBuilder();
            _decodeBase64(getText(), byteArrayBuilder_getByteArrayBuilder, base64Variant);
            this._binaryValue = byteArrayBuilder_getByteArrayBuilder.toByteArray();
        }
        return this._binaryValue;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object getEmbeddedObject() {
        if (this._currToken == JsonToken.VALUE_EMBEDDED_OBJECT) {
            return this._binaryValue;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public String getText() {
        JsonToken jsonToken = this._currToken;
        return jsonToken == JsonToken.VALUE_STRING ? this._textBuffer.contentsAsString() : _getText2(jsonToken);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public char[] getTextCharacters() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return null;
        }
        int iId = jsonToken.id();
        if (iId != 5) {
            return (iId == 6 || iId == 7 || iId == 8) ? this._textBuffer.getTextBuffer() : this._currToken.asCharArray();
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
        return iId != 5 ? (iId == 6 || iId == 7 || iId == 8) ? this._textBuffer.size() : this._currToken.asCharArray().length : this._parsingContext.getCurrentName().length();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getTextOffset() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return 0;
        }
        int iId = jsonToken.id();
        if (iId == 6 || iId == 7 || iId == 8) {
            return this._textBuffer.getTextOffset();
        }
        return 0;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public String getValueAsString() {
        JsonToken jsonToken = this._currToken;
        return jsonToken == JsonToken.VALUE_STRING ? this._textBuffer.contentsAsString() : jsonToken == JsonToken.FIELD_NAME ? currentName() : super.getValueAsString(null);
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.JsonParser
    public boolean hasTextCharacters() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return this._textBuffer.hasTextAsCharacters();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return this._nameCopied;
        }
        return false;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        byte[] binaryValue = getBinaryValue(base64Variant);
        outputStream.write(binaryValue);
        return binaryValue.length;
    }

    public void _reportInvalidOther(int i, int i2) {
        this._inputPtr = i2;
        _reportInvalidOther(i);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public String getValueAsString(String str) {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return this._textBuffer.contentsAsString();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return currentName();
        }
        return super.getValueAsString(str);
    }

    public final String _findName(int i, int i2, int i3) {
        int i_padLastQuad = _padLastQuad(i2, i3);
        String strFindName = this._symbols.findName(i, i_padLastQuad);
        if (strFindName != null) {
            return strFindName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i;
        iArr[1] = i_padLastQuad;
        return _addName(iArr, 2, i3);
    }

    public final String _findName(int i, int i2) {
        int i_padLastQuad = _padLastQuad(i, i2);
        String strFindName = this._symbols.findName(i_padLastQuad);
        if (strFindName != null) {
            return strFindName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i_padLastQuad;
        return _addName(iArr, 1, i2);
    }
}

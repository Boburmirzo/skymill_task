/**
 *
 */

package com.interview.skymill.io;

/**
 * Auxiliary class for converting simple numeric types to little endian format.
 * @author bumurzokov
 *
 */
public class Convert {
  public static int bytesToInt(final byte[] bytes) {
    int accum = 0;
    for (int i = 0; i < bytes.length; i++) {
      accum <<= 8;
      accum |= (bytes[i] & 0xFF);
    }
    return accum;
  }

  public static int bytesToIntEndian(final byte[] bytes) {
    int accum = 0;
    for (int i = bytes.length - 1; i >= 0; i--) {
      accum <<= 8;
      accum |= (bytes[i] & 0xFF);
    }
    return accum;
  }

  public static byte[] intToBytes(int value) {
    final byte[] bytes = new byte[4];
    for (int i = 3; i >= 0; i--) {
      bytes[i] = (byte) (value & 0xff);
      value >>= 8;
    }
    return bytes;
  }

  public static byte[] intToBytesEndian(final int value) {
    final byte[] bytes = new byte[4];
    for (int i = 0; i < 4; i++) {
      bytes[i] = (byte) ((value >> i * 8) & 0xFF);
    }
    return bytes;
  }

  public static int intEndian(final int value) {
    int accum = 0;
    for (int i = 0; i < 4; i++) {
      accum <<= 8;
      accum |= ((value >> i * 8) & 0xFF);
    }
    return accum;
  }
}

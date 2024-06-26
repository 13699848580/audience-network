/*
 * Copyright (c) 2004-present, Facebook, Inc. All rights reserved.
 *
 * You are hereby granted a non-exclusive, worldwide, royalty-free license to use,
 * copy, modify, and distribute this software in source code or binary form for use
 * in connection with the web services and APIs provided by Facebook.
 *
 * As with any software that integrates with the Facebook platform, your use of
 * this software is subject to the Facebook Developer Principles and Policies
 * [http://developers.facebook.com/policy/]. This copyright notice shall be
 * included in all copies or substantial portions of the software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.facebook.samples.adunitssamplekotlin

enum class AdUnitsSampleType(val sampleType: String) {
  BANNER("Banner"),
  RECTANGLE("Rectangle"),
  INTERSTITIAL("Interstitial"),
  REWARDED_VIDEO("Rewarded Video"),
  REWARDED_INTERSTITIAL("Rewarded Interstitial"),
  NATIVE("Native Ad"),
  NATIVE_BANNER("Native Banner Ad"),
  RECYCLERVIEW("Native Ad in RecyclerView"),
  HSCROLL("Native Ad in H-Scroll"),
  TEMPLATE("Native Ad Template"),
  BANNER_TEMPLATE("Native Banner Ad Template");

  companion object {
    fun getSampleTypeFromName(name: String): AdUnitsSampleType? {
      for (type in values()) {
        if (type.sampleType.contentEquals(name)) {
          return type
        }
      }

      return null
    }
  }
}

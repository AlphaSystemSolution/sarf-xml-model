//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.01 at 04:51:01 PM EDT 
//

package com.alphasystem.sarfengine.xml.model;

import com.alphasystem.arabic.model.*;

import javax.xml.bind.annotation.*;

import static java.lang.String.format;

/**
 * <p>
 * Java class for RootWordType complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <pre>
 * &lt;complexType name="RootWordType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="buckWalterEncoding" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="baseBuckWalterEncoding" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firstRadicalIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="secondRadicalIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="thirdRadicalIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fourthRadicalIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sarfTermType" type="{http://www.alphasystem.com/sarfengine/xml/model}SarfTermType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="implementationClass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RootWordType", propOrder = {"rootWord", "baseWord",
        "firstRadicalIndex", "secondRadicalIndex", "thirdRadicalIndex",
        "fourthRadicalIndex", "sarfTermType"})
@XmlRootElement
public class RootWord implements ArabicSupport {

    @XmlElement(defaultValue = "0")
    protected int firstRadicalIndex = 0;
    @XmlElement(defaultValue = "1")
    protected int secondRadicalIndex = 1;
    @XmlElement(defaultValue = "2")
    protected int thirdRadicalIndex = 2;
    @XmlElement(defaultValue = "-1")
    protected int fourthRadicalIndex = -1;
    @XmlElement(required = true)
    protected SarfTermType sarfTermType;
    @XmlElement(required = true)
    private ArabicWord rootWord;
    @XmlTransient
    private ArabicLetter firstRadical;
    @XmlTransient
    private ArabicLetter secondRadical;
    @XmlTransient
    private ArabicLetter thirdRadical;
    @XmlTransient
    private ArabicLetter fourthRadical;
    @XmlTransient
    private SarfMemberType memberType;
    @XmlElement(required = true)
    private ArabicWord baseWord;

    /**
     *
     */
    public RootWord() {
        this(null);
    }

    /**
     * @param firstRadical
     * @param secondRadical
     * @param thirdRadical
     */
    public RootWord(ArabicLetterType firstRadical,
                    ArabicLetterType secondRadical, ArabicLetterType thirdRadical) {
        this(firstRadical, secondRadical, thirdRadical, null);
    }

    /**
     * @param firstRadical
     * @param secondRadical
     * @param thirdRadical
     * @param fourthRadical
     */
    public RootWord(ArabicLetterType firstRadical,
                    ArabicLetterType secondRadical, ArabicLetterType thirdRadical,
                    ArabicLetterType fourthRadical) {
        this(null, firstRadical, secondRadical, thirdRadical, fourthRadical);
    }

    /**
     * @param src
     */
    public RootWord(RootWord src) {
        this(src, null, null, null);
    }

    /**
     * @param src
     * @param firstRadical
     * @param secondRadical
     * @param thirdRadical
     */
    public RootWord(RootWord src, ArabicLetterType firstRadical,
                    ArabicLetterType secondRadical, ArabicLetterType thirdRadical) {
        this(src, firstRadical, secondRadical, thirdRadical, null);
    }

    /**
     * @param src
     * @param firstRadical
     * @param secondRadical
     * @param thirdRadical
     * @param fourthRadical
     */
    public RootWord(RootWord src, ArabicLetterType firstRadical,
                    ArabicLetterType secondRadical, ArabicLetterType thirdRadical,
                    ArabicLetterType fourthRadical) {
        if (src != null) {
            setRootWord(new ArabicWord(src.getRootWord()));
            setBaseWord(new ArabicWord(src.getBaseWord()));
            setFirstRadicalIndex(src.getFirstRadicalIndex());
            setSecondRadicalIndex(src.getSecondRadicalIndex());
            setThirdRadicalIndex(src.getThirdRadicalIndex());
            setFourthRadicalIndex(src.getFourthRadicalIndex());
            setSarfTermType(src.getSarfTermType());
            setMemberType(src.getMemberType());
        }
        if (firstRadical != null && secondRadical != null
                && thirdRadical != null) {
            setRootWord(replaceLetters(getRootWord(), firstRadical,
                    firstRadicalIndex, secondRadical, secondRadicalIndex,
                    thirdRadical, thirdRadicalIndex, fourthRadical,
                    fourthRadicalIndex));
            setBaseWord(replaceLetters(getBaseWord(), firstRadical,
                    firstRadicalIndex, secondRadical, secondRadicalIndex,
                    thirdRadical, thirdRadicalIndex, fourthRadical,
                    fourthRadicalIndex));
        }
    }

    public static ArabicWord replaceLetters(ArabicWord src,
                                            ArabicLetterType firstRadical, int firstRadicalIndex,
                                            ArabicLetterType secondRadical, int secondRadicalIndex,
                                            ArabicLetterType thirdRadical, int thirdRadicalIndex,
                                            ArabicLetterType fourthRadical, int fourthRadicalIndex) {
        if (src == null) {
            return null;
        }
        ArabicWord arabicWord = new ArabicWord(src)
                .replaceLetter(firstRadicalIndex, firstRadical)
                .replaceLetter(secondRadicalIndex, secondRadical)
                .replaceLetter(thirdRadicalIndex, thirdRadical);
        if (fourthRadicalIndex > -1 && fourthRadical != null) {
            arabicWord = arabicWord.replaceLetter(fourthRadicalIndex,
                    fourthRadical);
        }
        return arabicWord;
    }

    private boolean compare(ArabicLetter l1, ArabicLetter l2) {
        boolean result = false;
        if (l1 == null && l2 == null) {
            result = true;
        } else if (l1 != null && l2 != null) {
            result = l1.equals(l2);
        }
        return result;
    }

    private boolean compare(Integer l1, Integer l2) {
        boolean result = false;
        if (l1 == null && l2 == null) {
            result = true;
        } else if (l1 != null && l2 != null) {
            result = l1.equals(l2);
        }
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = super.equals(obj);
        if (obj != null && RootWord.class.isAssignableFrom(obj.getClass())) {
            RootWord o = (RootWord) obj;
            result = compare(getFirstRadical(), o.getFirstRadical())
                    && compare(getFirstRadicalIndex(), o.getFirstRadicalIndex())
                    && compare(getSecondRadical(), o.getSecondRadical())
                    && compare(getSecondRadicalIndex(),
                    o.getSecondRadicalIndex())
                    && compare(getThirdRadical(), o.getThirdRadical())
                    && compare(getThirdRadicalIndex(), o.getThirdRadicalIndex())
                    && compare(getFourthRadical(), o.getFourthRadical())
                    && compare(getFourthRadicalIndex(),
                    o.getFourthRadicalIndex());
        }
        return result;
    }

    public ArabicWord getBaseWord() {
        return baseWord;
    }

    public void setBaseWord(ArabicWord baseWord) {
        this.baseWord = baseWord;
    }

    public ArabicLetter getFirstRadical() {
        if (firstRadical == null) {
            firstRadical = getLetter(firstRadicalIndex);
        }
        return firstRadical;
    }

    public void setFirstRadical(ArabicLetter firstRadical) {
        this.firstRadical = firstRadical;
    }

    /**
     * Gets the value of the firstRadicalIndex property.
     */
    public int getFirstRadicalIndex() {
        return firstRadicalIndex;
    }

    /**
     * Sets the value of the firstRadicalIndex property.
     */
    public void setFirstRadicalIndex(int value) {
        this.firstRadicalIndex = value;
        setFirstRadical(null);
    }

    public ArabicLetter getFourthRadical() {
        if (fourthRadicalIndex > -1 && fourthRadical == null) {
            fourthRadical = getLetter(fourthRadicalIndex);
        }
        return fourthRadical;
    }

    public void setFourthRadical(ArabicLetter fourthRadical) {
        this.fourthRadical = fourthRadical;
    }

    /**
     * Gets the value of the fourthRadicalIndex property.
     */
    public int getFourthRadicalIndex() {
        return fourthRadicalIndex;
    }

    /**
     * Sets the value of the fourthRadicalIndex property.
     */
    public void setFourthRadicalIndex(int value) {
        this.fourthRadicalIndex = value;
        setFourthRadical(null);
    }

    private ArabicLetter getLetter(int index) {
        ArabicWord rootWord = getRootWord();
        if (index < 0 || index >= rootWord.getLength()) {
            return null;
        }
        return rootWord.getLetter(index);
    }

    public SarfMemberType getMemberType() {
        return memberType;
    }

    public void setMemberType(SarfMemberType memberType) {
        this.memberType = memberType;
    }

    public ArabicWord getRootWord() {
        return rootWord;
    }

    public void setRootWord(ArabicWord rootWord) {
        this.rootWord = rootWord;
    }

    /**
     * Gets the value of the sarfTermType property.
     *
     * @return possible object is {@link SarfTermType }
     */
    public SarfTermType getSarfTermType() {
        return sarfTermType;
    }

    /**
     * Sets the value of the sarfTermType property.
     *
     * @param value allowed object is {@link SarfTermType }
     */
    public void setSarfTermType(SarfTermType value) {
        this.sarfTermType = value;
    }

    public ArabicLetter getSecondRadical() {
        if (secondRadical == null) {
            secondRadical = getLetter(secondRadicalIndex);
        }
        return secondRadical;
    }

    public void setSecondRadical(ArabicLetter secondRadical) {
        this.secondRadical = secondRadical;
    }

    /**
     * Gets the value of the secondRadicalIndex property.
     */
    public int getSecondRadicalIndex() {
        return secondRadicalIndex;
    }

    /**
     * Sets the value of the secondRadicalIndex property.
     */
    public void setSecondRadicalIndex(int value) {
        this.secondRadicalIndex = value;
        setSecondRadical(null);
    }

    public ArabicLetter getThirdRadical() {
        if (thirdRadical == null) {
            thirdRadical = getLetter(thirdRadicalIndex);
        }
        return thirdRadical;
    }

    public void setThirdRadical(ArabicLetter thirdRadical) {
        this.thirdRadical = thirdRadical;
    }

    /**
     * Gets the value of the thirdRadicalIndex property.
     */
    public int getThirdRadicalIndex() {
        return thirdRadicalIndex;
    }

    /**
     * Sets the value of the thirdRadicalIndex property.
     */
    public void setThirdRadicalIndex(int value) {
        this.thirdRadicalIndex = value;
        setThirdRadical(thirdRadical);
    }

    public boolean isTriLiteral() {
        return fourthRadical == null;
    }

    @Override
    public ArabicWord getLabel() {
        return getRootWord();
    }

    @Override
    public String toString() {
        return format("%s - {%s}", sarfTermType, rootWord.toBuckWalter());
    }

    public RootWord withBaseWord(ArabicWord arabicWord) {
        setBaseWord(arabicWord);
        return this;
    }

    public RootWord withFirstRadicalIndex(int value) {
        setFirstRadicalIndex(value);
        return this;
    }

    public RootWord withFourthRadicalIndex(int value) {
        setFourthRadicalIndex(value);
        return this;
    }

    public RootWord withMemberType(SarfMemberType memberType) {
        setMemberType(memberType);
        return this;
    }

    public RootWord withRootWord(ArabicWord rootWord) {
        setRootWord(rootWord);
        return this;
    }

    public RootWord withSarfTermType(SarfTermType value) {
        setSarfTermType(value);
        return this;
    }

    public RootWord withSecondRadicalIndex(int value) {
        setSecondRadicalIndex(value);
        return this;
    }

    public RootWord withThirdRadicalIndex(int value) {
        setThirdRadicalIndex(value);
        return this;
    }

}

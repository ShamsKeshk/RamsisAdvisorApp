package com.udicity.shams.tourinsuez.AboutSuez;

/**
 * Created by shams on 27/06/17.
 */

public class AboutSuezCategory {
    private final String NO_TEXT_PROVIDED = "null";
    private final int NO_IMAGE_PROVIDED = -1;
    private String mTopicHeader;
    private String mTopicExplainPartOne = NO_TEXT_PROVIDED;
    private int mTopicImageResourcePartOne = NO_IMAGE_PROVIDED;
    private String mTopicExplainPartTwo = NO_TEXT_PROVIDED;
    private int mTopicImageResourcePartTwo = NO_IMAGE_PROVIDED;

    public AboutSuezCategory(String topicHeader, String topicExplainPartOne) {
        mTopicHeader = topicHeader;
        mTopicExplainPartOne = topicExplainPartOne;
    }

    public AboutSuezCategory(String topicHeader, String topicExplainPartOne, int topicImageResourcePartOne) {
        mTopicHeader = topicHeader;
        mTopicExplainPartOne = topicExplainPartOne;
        mTopicImageResourcePartOne = topicImageResourcePartOne;
    }

    public AboutSuezCategory(String topicHeader, String topicExplainPartOne, int topicImageResourcePartOne, String topicExplainPartTwo) {
        mTopicHeader = topicHeader;
        mTopicExplainPartOne = topicExplainPartOne;
        mTopicImageResourcePartOne = topicImageResourcePartOne;
        mTopicExplainPartTwo = topicExplainPartTwo;
    }

    public AboutSuezCategory(String topicHeader, String topicExplainPartOne, int topicImageResourcePartOne, String topicExplainPartTwo, int topicImageResourcePartTwo) {
        mTopicHeader = topicHeader;
        mTopicExplainPartOne = topicExplainPartOne;
        mTopicImageResourcePartOne = topicImageResourcePartOne;
        mTopicExplainPartTwo = topicExplainPartTwo;
        mTopicImageResourcePartTwo = topicImageResourcePartTwo;
    }

    public AboutSuezCategory(String topicHeader, int topicImageResourcePartOne, String topicExplainPartTwo, int topicImageResourcePartTwo) {
        mTopicHeader = topicHeader;
        mTopicImageResourcePartOne = topicImageResourcePartOne;
        mTopicExplainPartTwo = topicExplainPartTwo;
        mTopicImageResourcePartTwo = topicImageResourcePartTwo;
    }

    public String getmTopicHeader() {
        return mTopicHeader;
    }

    public void setmTopicHeader(String topicHeader) {
        mTopicHeader = topicHeader;
    }

    public String getmTopicExplainPartOne() {
        return mTopicExplainPartOne;
    }

    public void setmTopicExplainPartOne(String topicExplainPartOne) {
        mTopicExplainPartOne = topicExplainPartOne;
    }

    public int getmTopicImageResourcePartOne() {
        return mTopicImageResourcePartOne;
    }

    public void setmTopicImageResourcePartOne(int imageResourcePartOne) {
        mTopicImageResourcePartOne = imageResourcePartOne;
    }

    public String getmTopicExplainPartTwo() {
        return mTopicExplainPartTwo;
    }

    public void setmTopicExplainPartTwo(String topicExplainPartTwo) {
        mTopicExplainPartTwo = topicExplainPartTwo;
    }

    public int getmTopicImageResourcePartTwo() {
        return mTopicImageResourcePartTwo;
    }

    public void setmTopicImageResourcePartTwo(int imageResourcePartTwo) {
        mTopicImageResourcePartTwo = imageResourcePartTwo;
    }

    public boolean hasTextOne() {
        return !mTopicExplainPartOne.matches(NO_TEXT_PROVIDED);

    }

    public boolean hasTextTwo() {
        return !mTopicExplainPartTwo.matches(NO_TEXT_PROVIDED);

    }

    public boolean hasImageOne() {
        return mTopicImageResourcePartOne != NO_IMAGE_PROVIDED;

    }

    public boolean hasImageTwo() {
        return mTopicImageResourcePartTwo != NO_IMAGE_PROVIDED;

    }
}
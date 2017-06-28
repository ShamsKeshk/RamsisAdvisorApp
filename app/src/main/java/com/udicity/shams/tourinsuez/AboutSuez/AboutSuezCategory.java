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



    public AboutSuezCategory(String topicHeader,String topicExplainPartOne)
    {
        mTopicHeader = topicHeader;
        mTopicExplainPartOne = topicExplainPartOne;
    }
    public AboutSuezCategory(String topicHeader,String topicExplainPartOne,int topicImageResourcePartOne)
    {
        mTopicHeader = topicHeader;
        mTopicExplainPartOne = topicExplainPartOne;
        mTopicImageResourcePartOne = topicImageResourcePartOne;
    }
    public AboutSuezCategory(String topicHeader,String topicExplainPartOne,int topicImageResourcePartOne,String topicExplainPartTwo)
    {
        mTopicHeader = topicHeader;
        mTopicExplainPartOne = topicExplainPartOne;
        mTopicImageResourcePartOne = topicImageResourcePartOne;
        mTopicExplainPartTwo = topicExplainPartTwo;
    }
    public AboutSuezCategory(String topicHeader,String topicExplainPartOne,int topicImageResourcePartOne,String topicExplainPartTwo,int topicImageResourcePartTwo)
    {
        mTopicHeader = topicHeader;
        mTopicExplainPartOne = topicExplainPartOne;
        mTopicImageResourcePartOne = topicImageResourcePartOne;
        mTopicExplainPartTwo = topicExplainPartTwo;
        mTopicImageResourcePartTwo = topicImageResourcePartTwo;
    }
    public void setmTopicHeader(String topicHeader)
    {
        mTopicHeader = topicHeader;
    }
    public String getmTopicHeader()
    {
        return mTopicHeader;
    }
    public void setmTopicExplainPartOne(String topicExplainPartOne)
    {
        mTopicExplainPartOne = topicExplainPartOne;
    }
    public String getmTopicExplainPartOne()
    {
        return mTopicExplainPartOne;
    }
    public void setmTopicImageResourcePartOne(int imageResourcePartOne)
    {
        mTopicImageResourcePartOne = imageResourcePartOne;
    }
    public int getmTopicImageResourcePartOne()
    {
        return mTopicImageResourcePartOne;
    }
    public void setmTopicExplainPartTwo(String topicExplainPartTwo)
    {
        mTopicExplainPartTwo = topicExplainPartTwo;
    }
    public String getmTopicExplainPartTwo()
    {
        return mTopicExplainPartTwo;
    }
    public void setmTopicImageResourcePartTwo(int imageResourcePartTwo)
    {
        mTopicImageResourcePartTwo = imageResourcePartTwo;
    }
    public int getmTopicImageResourcePartTwo()
    {
        return mTopicImageResourcePartTwo;
    }
    public boolean hasTextOne()
    {
        if (mTopicExplainPartOne.matches(NO_TEXT_PROVIDED))
        {
            return false;
        }else {
            return true;
        }

    }
    public boolean hasTextTwo()
    {
        if (mTopicExplainPartTwo.matches(NO_TEXT_PROVIDED))
        {
            return false;
        }else {
            return true;
        }

    }
    public boolean hasImageOne()
    {
        if (mTopicImageResourcePartOne == NO_IMAGE_PROVIDED)
        {
            return false;
        }else {
            return true;
        }

    }
    public boolean hasImageTwo()
    {
        if (mTopicImageResourcePartTwo == NO_IMAGE_PROVIDED)
        {
            return false;
        }else {
            return true;
        }

    }
}

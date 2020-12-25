using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace LAB9_OOP
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {
            Func();
        }
  
        private void textBox2_TextChanged(object sender, EventArgs e)
        {
            Func();
        }

        private void textBox4_TextChanged(object sender, EventArgs e)
        {
            Func();
        }

        private void textBox3_TextChanged(object sender, EventArgs e)
        {
            Func();
        }

        void Func()
        {
            if (textBox1.Text == string.Empty)
                return;
            if (textBox2.Text == string.Empty)
                return;
            double res = 0;
            int N = Convert.ToInt32(textBox1.Text);
            int K = Convert.ToInt32(textBox2.Text);
            double y = Convert.ToDouble(textBox3.Text);
            double p = Convert.ToDouble(textBox4.Text);

            for (int i = 1; i <= N; i++)
            {
                for (int j = 1; j <= K; j++)
                {
                    res += Math.Pow(p - 1, i) * Math.Pow(y, i) / (i * j);
                }
            }

            label9.Text = Convert.ToString(Convert.ToInt32(res), 8);
            label10.Text = Convert.ToString(Convert.ToInt32(res), 16);
            label11.Text = Convert.ToString(res);

        }
    }
}
